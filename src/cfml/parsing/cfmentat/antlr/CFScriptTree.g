/* 
 *  Copyright (C) 2000 - 2010 TagServlet Ltd
 *
 *  This file is part of Open BlueDragon (OpenBD) CFML Server Engine.
 *  
 *  OpenBD is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  Free Software Foundation,version 3.
 *  
 *  OpenBD is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with OpenBD.  If not, see http://www.gnu.org/licenses/
 *  
 *  Additional permission under GNU GPL version 3 section 7
 *  
 *  If you modify this Program, or any covered work, by linking or combining 
 *  it with any of the JARS listed in the README.txt (or a modified version of 
 *  (that library), containing parts covered by the terms of that JAR, the 
 *  licensors of this Program grant you additional permission to convey the 
 *  resulting work. 
 *  README.txt @ http://www.openbluedragon.org/license/README.txt
 *  
 *  http://www.openbluedragon.org/
 */

tree grammar CFScriptTree;
 
options {
  tokenVocab=CFML;
  ASTLabelType=CommonTree;
  backtrack=true;
}


@header {
  package cfml.parsing.cfmentat.antlr;

	import java.util.ArrayList;
	import java.util.Vector;
  import cfml.parsing.cfmentat.antlr.script.*;
}

@members { public boolean scriptMode = true;

public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
  // Override this method so errors aren't written to Standard Error
}

protected void mismatch( IntStream input, int ttype, BitSet follow ) throws RecognitionException {
  throw new MismatchedTokenException(ttype, input);
}
  
public Object recoverFromMismatchedSet( IntStream input, RecognitionException e, BitSet follow ) throws RecognitionException{
  throw e;
}
}

// Alter code generation so catch-clauses get replace with
// this action.
@rulecatch {
catch (RecognitionException re) {
  throw re;
}
}

//--- cfscript grammar rules
 
scriptBlock returns [CFScriptStatement s] throws ParseException
@init{ s = new CFCompoundStatement(); }
  : ( e=element { if ( e instanceof CFFuncDeclStatement ) ( (CFCompoundStatement) s).addFunction( e ); else ( (CFCompoundStatement) s).add( e ); } )* 
    ( SCRIPTCLOSE | EOF )
  ; 
  
element returns [CFScriptStatement s] throws ParseException
  : ^( f=FUNCDECL i=identifier p=parameterList body=compoundStatement ){ 
          s = new CFFuncDeclStatement( f.getToken(), i.getToken(), p, body ); 
        }
  | st=statement { s = st; } 
  ;  

compoundStatement returns [CFScriptStatement s]
@init{ s = new CFCompoundStatement(); }
  : ^( LEFTCURLYBRACKET ( statmt = statement { ( (CFCompoundStatement) s ).add( statmt ); } )* RIGHTCURLYBRACKET ) 
  ;
  
statement returns [CFScriptStatement s] throws ParseException
  : ^( t=IF c=expression s1=statement ( t=ELSE s2=statement )? { s = new CFIfStatement( t.getToken(), c, s1, s2 ); } )
  | t=BREAK { s = new CFBreakStatement( t.getToken() ); }
  | t=CONTINUE { s= new CFContinueStatement( t.getToken() ); }
  | s1=returnStatement { s = s1; }
  | ( e1=expression ){ s = new CFExpressionStatement( e1 ); }
  | ^( t=WHILE c=expression s1=statement ){ s = new CFWhileStatement( t.getToken(), c, s1 ); } 
  | ^( t=DO s1=statement WHILE c=expression SEMICOLON ){ s = new CFDoWhileStatement( t.getToken(), c, s1 ); }
  | s1=forStatement { s = s1; } 
  | s1=switchStatement { s = s1; }
  | s1=tryStatement { s = s1; }
  | s2=compoundStatement { s = s2; }
  ;

returnStatement returns [CFScriptStatement s ] throws ParseException
  : t=RETURN ( c=expression )? { s = new CFReturnStatement( t.getToken(), c ); }
  ;

tryStatement returns [CFScriptStatement s] throws ParseException
@init{
  ArrayList catchStatements = new ArrayList();
}
  : ^(t1=TRY s1=statement 
    ( c=catchStatement { catchStatements.add( c ); } )* )
    {
      return new CFTryCatchStatement( t1.getToken(), s1, catchStatements );
    }
  ;
  
catchStatement returns [CFCatchStatement c]
  : ^(t1=CATCH e1=exceptionType e2=identifier s1=compoundStatement ){
    c = new CFCatchStatement( e1, e2.getName(), s1 );;
  }
  ;


exceptionType returns [String image]
@init{
  StringBuilder sb = new StringBuilder();
}
  : i1=identifier { sb.append( i1.getName() ); }
    ( DOT ( i2=identifier | i2=reservedWord ) { 
        sb.append( '.' );
        sb.append( i1.getName() ); 
      } 
    )* { image = sb.toString(); }
  | t=STRING_LITERAL { image = t.getToken().getText().substring( 1, t.getToken().getText().length() - 1 ); }
  ;
  
switchStatement returns [CFScriptStatement s ]
@init{ 
  ArrayList cases = new ArrayList(); 
}  
  : ^(t1=SWITCH c=expression LEFTCURLYBRACKET
  ( cs = caseStatement { cases.add( cs ); } )* RIGHTCURLYBRACKET 
  { s = new CFSwitchStatement( t1.getToken(), c, cases ); })
  ;
 
caseStatement returns [CFCase c]
@init{
  ArrayList block = new ArrayList();
}
  : ^(CASE e2=expression COLON ( s1=statement { block.add( s1 ); } )* ) { c = new CFCase( e2, block ); } 
  | 
    ^(DEFAULT COLON ( s1=statement { block.add( s1 ); } )* ) { c = new CFCase( block ); } 
  ;
    

forStatement returns [CFScriptStatement s]
  : ^(t=FOR (e1=expression)? SEMICOLON (e2=expression)? SEMICOLON (e3=expression)? s1=statement ){
      return new CFForStatement( t.getToken(), e1, e2, e3, s1 );
    } 
  | ^(t=FOR e=forInKey IN e1=expression s1=statement ){
      return new CFForInStatement( t.getToken(), e, e1, s1 );
    }
  ;
  
forInKey returns [CFExpression e]
  : t1=identifier { e = t1; }
    (
      DOT ( t2=identifier | t2=reservedWord ){
        if ( !( e instanceof cfFullVarExpression ) ){
          e = new cfFullVarExpression( t1.getToken(), e, e.Decompile(0) );
        }
        ( (cfFullVarExpression) e ).addDotOperation( t2 );
      }
    
    )*
  ;
    
 
parameterList returns [ArrayList v]
@init{ v = new ArrayList(); }
  : ( i=identifier { v.add( ( (CFIdentifier) i).getName() ); } )*
  ; 
  

//--- expression engine grammar rules (a subset of the cfscript rules) 
  
expression returns [CFExpression e]
  :  be=binaryExpression { e = be; } 
  | pe=memberExpression { e = pe; }
  ; 

localAssignmentExpression returns [CFExpression e]
  : ^( op=VARLOCAL e1=assignmentExpression ){ e1.setLocal( true ); e = e1; }
  ;

assignmentExpression returns [CFAssignmentExpression e]
  : ^( op=EQUALSOP e1=memberExpression e2=memberExpression ) { e = new CFAssignmentExpression( op.getToken(), false, e1, e2 ); }
  | ^( op=PLUSEQUALS e1=memberExpression e2=memberExpression ) { e = new CFAssignmentExpression( op.getToken(), false, e1, e2 ); }
  | ^( op=MINUSEQUALS e1=memberExpression e2=memberExpression ) { e = new CFAssignmentExpression( op.getToken(), false, e1, e2 ); }
  | ^( op=STAREQUALS e1=memberExpression e2=memberExpression ) { e = new CFAssignmentExpression( op.getToken(), false, e1, e2 ); }
  | ^( op=SLASHEQUALS e1=memberExpression e2=memberExpression ) { e = new CFAssignmentExpression( op.getToken(), false, e1, e2 ); }
  | ^( op=MODEQUALS e1=memberExpression e2=memberExpression ) { e = new CFAssignmentExpression( op.getToken(), false, e1, e2 ); }
  | ^( op=CONCATEQUALS e1=memberExpression e2=memberExpression ) { e = new CFAssignmentExpression( op.getToken(), false, e1, e2 ); }
  ;
     
binaryExpression returns [CFExpression e]
  : e1=localAssignmentExpression { e = e1; }
  | e1=assignmentExpression { e = e1; }
  | ^( op=IMP e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=EQV e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=XOR e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=OR e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=OROPERATOR e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=AND e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=ANDOPERATOR e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=NOT e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); }
  | ^( op=NOTOP e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); } 
  | ^( op=EQ e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); } 
  | ^( op=NEQ e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=LT e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=LTE e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=GT e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=GTE e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=CONTAINS e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=DOESNOTCONTAIN e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=CONCAT e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=PLUS e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=MINUS e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=MOD e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=MODOPERATOR e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=BSLASH e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=STAR e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=SLASH e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | ^( op=POWER e1=memberExpression e2=memberExpression ) { e = new CFBinaryExpression( op.getToken(), e1, e2 ); }
  | e1 = unaryExpression { e = e1; }
  ;
 
unaryExpression returns [CFExpression e]
  : ^( op=PLUS e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); }
  | ^( op=MINUS e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); }
  | ^( op=PLUSPLUS e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); }
  | ^( op=MINUSMINUS e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); }
  | ^( op=POSTPLUSPLUS e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); }
  | ^( op=POSTMINUSMINUS e1=memberExpression ){ e = new CFUnaryExpression( op.getToken(), e1 ); }
  ;    
   
memberExpression returns [CFExpression e] throws ParseException
  : ^( op=DOT e1=memberExpression e2=primaryExpressionIRW ) { 
      if ( !( e1 instanceof cfFullVarExpression ) ){
        e = new cfFullVarExpression( op.getToken(), e1, e1.Decompile(0) );
      }else{
        e = e1;
      }
      ( (cfFullVarExpression) e ).addDotOperation( e2 );
	  }
  | ^( op=LEFTBRACKET e1=expression e2=memberExpression ) { 
      if ( !( e1 instanceof cfFullVarExpression ) ){
        e = new cfFullVarExpression( op.getToken(), e1, e1.Decompile(0) );
      }else{
        e = e1; 
      }
      ( (cfFullVarExpression) e ).addBracketOperation( e2 );
    }
  | ^( op=JAVAMETHODCALL e1=memberExpression e2=primaryExpressionIRW ( args=argumentList )? ){
      if( args == null) {
        args = new ArgumentsVector();
      }
  
      //prefixed = true;
      if ( !( e1 instanceof cfFullVarExpression ) ){
        e = new cfFullVarExpression( op.getToken(), e1, e1.Decompile(0) );
      }else{
        e = e1;
      }
      ( (cfFullVarExpression) e ).addDotOperation( new CFJavaMethodExpression( op.getToken(), e2, args ) );
      
      args = null; // reset the args for next iteration
  
    }
  | ^( op=FUNCTIONCALL e1=identifier args=argumentList ){
        if( args == null) {
            args = new ArgumentsVector();
        }
        e = new CFFunctionExpression( (CFIdentifier) e1, args );
        args = null; // reset the args for next iteration
      }
  | e1=primaryExpression { e = e1; }
  ;
  

primaryExpression returns [CFExpression e]
  : t=STRING_LITERAL          { e = new CFLiteral( t.getToken() ); }
  | t=BOOLEAN_LITERAL         { e = new CFLiteral( t.getToken() ); }
  | t=FLOATING_POINT_LITERAL  { e = new CFLiteral( t.getToken() ); }
  | t=INTEGER_LITERAL         { e = new CFLiteral( t.getToken() ); }
  | t=NULL                    { e = new CFLiteral( t.getToken() ); }
  | ie=implicitArray          { e = ie; }
  | is=implicitStruct         { e = is; }
  | i=identifier              { e = i; }
  | be=binaryExpression       { e = be; }
  
  ;
 
identifier returns [CFIdentifier e]
  : t=IDENTIFIER  { e = new CFIdentifier( t.getToken() ); }
  | t=DOES        { e = new CFIdentifier( t.getToken() ); }
  | t=CONTAIN     { e = new CFIdentifier( t.getToken() ); }
  | t=GREATER     { e = new CFIdentifier( t.getToken() ); }
  | t=THAN        { e = new CFIdentifier( t.getToken() ); }
  | t=LESS        { e = new CFIdentifier( t.getToken() ); }
  | t=VAR         { e = new CFIdentifier( t.getToken() ); }
  | t=DEFAULT     { e = new CFIdentifier( t.getToken() ); }
  | t=TO          { e = new CFIdentifier( t.getToken() ); }
  | {!scriptMode}?=> kw=cfscriptKeywords { e = kw; }
  ;

cfscriptKeywords returns [CFIdentifier e]
  : t=IF        { e = new CFIdentifier( t.getToken() ); }
  | t=ELSE      { e = new CFIdentifier( t.getToken() ); }
  | t=BREAK     { e = new CFIdentifier( t.getToken() ); }
  | t=CONTINUE  { e = new CFIdentifier( t.getToken() ); }
  | t=FUNCTION  { e = new CFIdentifier( t.getToken() ); }
  | t=RETURN    { e = new CFIdentifier( t.getToken() ); }
  | t=WHILE     { e = new CFIdentifier( t.getToken() ); }
  | t=DO        { e = new CFIdentifier( t.getToken() ); }
  | t=FOR       { e = new CFIdentifier( t.getToken() ); }
  | t=IN        { e = new CFIdentifier( t.getToken() ); }
  | t=TRY       { e = new CFIdentifier( t.getToken() ); }
  | t=CATCH     { e = new CFIdentifier( t.getToken() ); }
  | t=SWITCH    { e = new CFIdentifier( t.getToken() ); }
  | t=CASE      { e = new CFIdentifier( t.getToken() ); }
  | t=DEFAULT   { e = new CFIdentifier( t.getToken() ); }
  ;

primaryExpressionIRW returns [CFExpression e]
  : pe = primaryExpression  { e = pe; }
  | rw = reservedWord       { e = rw; }
  ;
  
reservedWord returns [CFIdentifier e]
  : t=CONTAINS  { e = new CFIdentifier( t.getToken() ); } 
  | t=IS        { e = new CFIdentifier( t.getToken() ); }
  | t=EQUAL     { e = new CFIdentifier( t.getToken() ); } 
  | t=EQ        { e = new CFIdentifier( t.getToken() ); }
  | t=NEQ       { e = new CFIdentifier( t.getToken() ); }
  | t=GT        { e = new CFIdentifier( t.getToken() ); }
  | t=LT        { e = new CFIdentifier( t.getToken() ); }
  | t=GTE       { e = new CFIdentifier( t.getToken() ); }
  | t=GE        { e = new CFIdentifier( t.getToken() ); }
  | t=LTE       { e = new CFIdentifier( t.getToken() ); }
  | t=LE        { e = new CFIdentifier( t.getToken() ); }
  | t=NOT       { e = new CFIdentifier( t.getToken() ); }
  | t=AND       { e = new CFIdentifier( t.getToken() ); }
  | t=OR        { e = new CFIdentifier( t.getToken() ); }
  | t=XOR       { e = new CFIdentifier( t.getToken() ); }
  | t=EQV       { e = new CFIdentifier( t.getToken() ); }
  | t=IMP       { e = new CFIdentifier( t.getToken() ); }
  | t=MOD       { e = new CFIdentifier( t.getToken() ); }
  | t=NULL      { e = new CFIdentifier( t.getToken() ); }
  | t=TO        { e = new CFIdentifier( t.getToken() ); }
  | t=EQUALS    { e = new CFIdentifier( t.getToken() ); }
  | e1=cfscriptKeywords { e = e1; } 
  ;

implicitArray returns [CFArrayExpression e]
  : ^(t=LEFTBRACKET {e = new CFArrayExpression(t.getToken());}
    ( e1 = primaryExpression { e.addElement( e1 ); } )* RIGHTBRACKET)
  ;
  
implicitStruct returns [CFStructExpression e]
  : ^(t=LEFTCURLYBRACKET { e = new CFStructExpression( t.getToken() ); } 
      ( 
	      e1=implicitStructExpression { e.addElement( e1 ); }
	      ( ( ',' | SEMICOLON ) e1=implicitStructExpression { e.addElement( e1 ); } )* 
      )? RIGHTCURLYBRACKET
    )
  ;


implicitStructExpression returns [CFStructElementExpression e]
  : ^( ( COLON | EQUALSOP ) e1=implicitStructKeyExpression e2=primaryExpression )
    { return new CFStructElementExpression( e1, e2 ); } 
  ;
  
implicitStructKeyExpression returns [ArrayList e]
  : t=identifier { e = new ArrayList(); e.add( t ); }
    ( DOT ( t=identifier | t=reservedWord ) { e.add( t ); } )*
  ; 

argumentList returns [Vector<CFExpression> v]
@init{ v = null; }
  : ( ve=argument[v] { v = ve; } )*
  | EMPTYARGS { v = new Vector<CFExpression>(); }
  ;

argument[Vector<CFExpression> v] returns [Vector<CFExpression> vl]
  : ^( COLON t1=identifier e=expression ){
    if ( v == null ){ 
      v = new ArgumentsVector();
    } 
    ( (ArgumentsVector) v).putNamedArg( ( (CFIdentifier) t1).getName(), e );
    vl = v;
    }
  | e=expression { 
    if ( v == null ){
      v = new Vector<CFExpression>();
    } 
    v.add(e);
    vl = v; 
  }
  ;




  

