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

grammar CFML;
options {
	output=AST;
	ASTLabelType=CommonTree;
	backtrack=true;
	memoize=true;
}

// imaginary tokens
tokens {
  DOESNOTCONTAIN; // 'does not contain' operator
  VARLOCAL; // local assignment
  FUNCTIONCALL; // function call
  JAVAMETHODCALL; // java method call
  EMPTYARGS; // empty list of arguments
  
  FUNCDECL; // function declaration
  POSTMINUSMINUS; // '--' post-expression
  POSTPLUSPLUS; // '++' post-expression
}

@parser::header { package cfml.parsing.cfmentat.antlr; }
@lexer::header { package cfml.parsing.cfmentat.antlr; }

@members { public boolean scriptMode = true; 

protected void mismatch( IntStream input, int ttype, BitSet follow ) throws RecognitionException {
  throw new MismatchedTokenException(ttype, input);
}
	
public Object recoverFromMismatchedSet( IntStream input, RecognitionException e, BitSet follow ) throws RecognitionException{
  throw e;
}
}

@lexer::members {
  public Token nextToken() {
    
    if ( state.token != null && state.token.getType() == SCRIPTCLOSE ){
      return Token.EOF_TOKEN;
    }
    
    while (true) {
      state.token = null;
      state.channel = Token.DEFAULT_CHANNEL;
      state.tokenStartCharIndex = input.index();
      state.tokenStartCharPositionInLine = input.getCharPositionInLine();
      state.tokenStartLine = input.getLine();
      state.text = null;
      if ( input.LA(1)==CharStream.EOF ) {
        return Token.EOF_TOKEN;
      }
      try {
        mTokens();
        if ( state.token==null ) {
          emit();
        }
        else if ( state.token==Token.SKIP_TOKEN ) {
          continue;
        }
        return state.token;
      }
      catch (RecognitionException re) {
        //reportError(re);
        return Token.EOF_TOKEN;
        //throw new RuntimeException("Bailing out!"); // or throw Error
      }
    }
  } 
  
}

// Alter code generation so catch-clauses get replace with
// this action.
@rulecatch {
catch (RecognitionException e) {
  throw e;
}
}


//Note: need case insensitive stream: http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782

WS	:	(' ' | '\t' | '\n' | '\r' | '\f' )+ {$channel=HIDDEN;};

LINE_COMMENT :
            '//'
            ( ~('\n'|'\r') )*
            ( '\n'|'\r'('\n')? )?
      { $channel=HIDDEN; } ;

ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;

BOOLEAN_LITERAL
	:	'TRUE'
	|	'FALSE' 
	;

STRING_LITERAL
	: '"' DoubleStringCharacter* '"'
	| '\'' SingleStringCharacter* '\''
	;
 
fragment DoubleStringCharacter
	: ~('"')
	| '""'	
	;

fragment SingleStringCharacter
	: ~('\'')
	| '\'\''	
	;

fragment LETTER	
	: '\u0024'
	| '\u0041'..'\u005a'
	| '\u005f'
	| '\u0061'..'\u007a'
	| '\u00c0'..'\u00d6'
	| '\u00d8'..'\u00f6'
	| '\u00f8'..'\u00ff'
	| '\u0100'..'\u1fff'
	| '\u3040'..'\u318f'
	| '\u3300'..'\u337f'
	| '\u3400'..'\u3d2d'
	| '\u4e00'..'\u9fff'
	| '\uf900'..'\ufaff';


fragment DIGIT 	
	: '\u0030'..'\u0039'
	| '\u0660'..'\u0669'
	| '\u06f0'..'\u06f9'
	| '\u0966'..'\u096f'
	| '\u09e6'..'\u09ef'
	| '\u0a66'..'\u0a6f'
	| '\u0ae6'..'\u0aef'
	| '\u0b66'..'\u0b6f'
	| '\u0be7'..'\u0bef'
	| '\u0c66'..'\u0c6f'
	| '\u0ce6'..'\u0cef'
	| '\u0d66'..'\u0d6f'
	| '\u0e50'..'\u0e59'
	| '\u0ed0'..'\u0ed9'
	| '\u1040'..'\u1049';

// define all the operators/reserved words before the identifier

NULL: 'NULL';

// Operators
CONTAINS:	'CONTAINS';
CONTAIN: 'CONTAIN';
DOES: 'DOES';
IS:	'IS';
GT: 'GT';
GE: 'GE';
GTE: 'GTE';
LTE: 'LTE';
LT: 'LT';
LE: 'LE';
EQ: 'EQ';
EQUAL: 'EQUAL';
EQUALS: 'EQUALS';
NEQ: 'NEQ';
LESS: 'LESS';
THAN: 'THAN';
GREATER: 'GREATER';
OR: 'OR';
TO: 'TO';
IMP: 'IMP';
EQV: 'EQV';
XOR: 'XOR';
AND: 'AND';
NOT: 'NOT';
MOD: 'MOD';
VAR: 'VAR';

// cfscript
IF: 'IF';
ELSE: 'ELSE';
BREAK: 'BREAK';
CONTINUE: 'CONTINUE';
FUNCTION: 'FUNCTION';
RETURN: 'RETURN';
WHILE: 'WHILE';
DO: 'DO';
FOR: 'FOR';
IN: 'IN';
TRY: 'TRY';
CATCH: 'CATCH';
SWITCH: 'SWITCH';
CASE: 'CASE';
DEFAULT: 'DEFAULT';

SCRIPTCLOSE: '</CFSCRIPT>'; 

// operators
DOT: '.';
STAR: '*';
SLASH: '/';
BSLASH: '\\';
POWER: '^';
PLUS: '+';
PLUSPLUS: '++';
MINUS: '-';
MINUSMINUS: '--';
MODOPERATOR: '%';
CONCAT: '&';
EQUALSEQUALSOP: '==';
EQUALSOP: '=';
PLUSEQUALS: '+=';
MINUSEQUALS: '-=';
STAREQUALS: '*=';
SLASHEQUALS: '/=';
MODEQUALS: '%=';
CONCATEQUALS: '&=';
COLON: ':';
NOTOP: '!'; 
SEMICOLON: ';';
OROPERATOR: '||';
ANDOPERATOR: '&&';
LEFTBRACKET: '[';
RIGHTBRACKET: ']';
LEFTPAREN: '(';
RIGHTPAREN: ')';
LEFTCURLYBRACKET: '{';
RIGHTCURLYBRACKET: '}';

IDENTIFIER 
	:	LETTER (LETTER|DIGIT)*;
	
	
INTEGER_LITERAL
  : DecimalDigit+
  ;

fragment DecimalDigit
  : ('0'..'9')
  ;

FLOATING_POINT_LITERAL
  : DecimalDigit+ '.' DecimalDigit* ExponentPart?
  | '.' DecimalDigit+ ExponentPart?
  | DecimalDigit+ ExponentPart?
  ;

fragment ExponentPart
  : ('e'|'E') ('+'|'-')? DecimalDigit+
  ;

//--- cfscript grammar rules

scriptBlock
  : ( element )* endOfScriptBlock
  ;

endOfScriptBlock
  : SCRIPTCLOSE 
  | EOF
  ;
  
element
  : FUNCTION identifier LEFTPAREN (parameterList)? RIGHTPAREN compoundStatement -> ^( FUNCDECL identifier (parameterList)? compoundStatement )
  | statement
  ;

parameterList
  : identifier ( ','! identifier )*
  | 
  ;
  
compoundStatement
  : LEFTCURLYBRACKET^ ( statement )* RIGHTCURLYBRACKET
  ;
  
  
statement
  :   tryCatchStatement
  |   ifStatement
  |   whileStatement
  |   doWhileStatement
  |   forStatement
  |   switchStatement
  |   CONTINUE SEMICOLON!
  |   BREAK SEMICOLON!
  |   returnStatement
  |   compoundStatement 
  |   localAssignmentExpression SEMICOLON!
  |   SEMICOLON! // empty statement
  ;
   
condition
  : LEFTPAREN! localAssignmentExpression RIGHTPAREN!
  ;
  
returnStatement
  : RETURN SEMICOLON!
  | RETURN assignmentExpression SEMICOLON!
  ;
  
ifStatement
  : IF^ condition statement ( ELSE statement )?
  ;

whileStatement
  : WHILE^ condition statement
  ;
 
doWhileStatement
  : DO^ statement WHILE condition SEMICOLON
  ;
  
forStatement
  : FOR^ LEFTPAREN! ( assignmentExpression )? SEMICOLON ( assignmentExpression )? SEMICOLON  ( assignmentExpression )? RIGHTPAREN! statement
  | FOR^ LEFTPAREN! forInKey IN assignmentExpression RIGHTPAREN! statement
  ;
  
forInKey
  : identifier ( DOT ( identifier | reservedWord ) )*
  ;

tryCatchStatement
  : TRY^ statement ( catchCondition )*
  ;
  
catchCondition
  : CATCH^ LEFTPAREN! exceptionType identifier RIGHTPAREN! compoundStatement  
  ;
  
exceptionType
  : identifier ( 'DOT' ( identifier | reservedWord ) )*
  | STRING_LITERAL
  ;
  
constantExpression
  : LEFTPAREN constantExpression RIGHTPAREN
  | MINUS ( INTEGER_LITERAL | FLOATING_POINT_LITERAL  )
  | INTEGER_LITERAL
  | FLOATING_POINT_LITERAL
  | STRING_LITERAL
  | BOOLEAN_LITERAL
  | NULL
  ;
  
switchStatement
  : SWITCH^ condition LEFTCURLYBRACKET
    ( 
      caseStatement    
    )* 
    
    RIGHTCURLYBRACKET
  ;

caseStatement
  : ( CASE^ constantExpression COLON ( statement )* ) 
    | 
    ( DEFAULT^ COLON ( statement )* ) 
  ;



//--- expression engine grammar rules (a subset of the cfscript rules)
  
expression 
	: 	localAssignmentExpression EOF!
	;
	
localAssignmentExpression 
	:	VAR assignmentExpression -> ^( VARLOCAL assignmentExpression ) 
	|	assignmentExpression
	;

assignmentExpression 
  : impliesExpression ( ( EQUALSOP | PLUSEQUALS | MINUSEQUALS | STAREQUALS | SLASHEQUALS | MODEQUALS | CONCATEQUALS )^ impliesExpression )? 
  ;

impliesExpression
	:	equivalentExpression ( IMP^ equivalentExpression )*
	;

equivalentExpression
	:	xorExpression ( EQV^ xorExpression )*
	;

xorExpression
	:	orExpression ( XOR^ orExpression )*
	;
	
orExpression
	:	andExpression ( ( OR | OROPERATOR )^ andExpression )*
	;
	
andExpression
	:	notExpression ( ( AND | ANDOPERATOR )^ notExpression )*
	;
	
notExpression
	:	( NOT^ | NOTOP^ )? equalityExpression 
	;

equalityExpression
    : concatenationExpression
      ( ( equalityOperator5^ | equalityOperator3^ |  equalityOperator2^ | equalityOperator1^ ) concatenationExpression )* 
    ;

equalityOperator1
    : 	IS -> ^(EQ)
    |   {scriptMode}?=> EQUALSEQUALSOP -> ^(EQ)
    |   LT -> ^(LT)
    |   {scriptMode}?=> '<' -> ^(LT)
    |   LTE -> ^(LTE)
    |   {scriptMode}?=> '<=' -> ^(LTE)
    |   LE -> ^(LTE)
    |   GT -> ^(GT)
    |   {scriptMode}?=> '>' -> ^(GT)
    |   GTE -> ^(GTE)
    |   {scriptMode}?=> '>=' -> ^(GTE)
    |   GE -> ^(GTE)
    |   EQ -> ^(EQ)
    |   NEQ -> ^(NEQ)
    |   {scriptMode}?=> '!=' -> ^(NEQ)
    |   EQUAL -> ^(EQ)
    |   EQUALS -> ^(EQ)
    |   CONTAINS -> ^(CONTAINS)
    ;
    
equalityOperator2
    :   LESS THAN -> ^(LT)
    |   GREATER THAN -> ^(GT)
    |   NOT EQUAL  -> ^(NEQ)
    |   IS NOT -> ^(NEQ)
    ;

equalityOperator3
    :   DOES NOT CONTAIN -> ^(DOESNOTCONTAIN)
    ;

equalityOperator5
    :   LESS THAN OR EQUAL TO -> ^(LTE)
    |   GREATER THAN OR EQUAL TO -> ^(GTE)
    ;
    
concatenationExpression
	:	additiveExpression ( CONCAT^ additiveExpression )*
	;
	
additiveExpression
	:	modExpression ( (PLUS^|MINUS^) modExpression )*
	;

modExpression
	:	intDivisionExpression  ( (MOD|MODOPERATOR)^ intDivisionExpression )* 
	;
	
intDivisionExpression
	:	multiplicativeExpression ( BSLASH^ multiplicativeExpression )*
	;

multiplicativeExpression
	:	powerOfExpression ( (STAR^|SLASH^) powerOfExpression )*
	;
	
powerOfExpression
	:	unaryExpression ( POWER^ unaryExpression )*
	;
	
unaryExpression
	: MINUS memberExpression -> ^(MINUS memberExpression)
	| PLUS memberExpression -> ^(PLUS memberExpression)
	| MINUSMINUS memberExpression -> ^(MINUSMINUS memberExpression) 
	| PLUSPLUS memberExpression -> ^(PLUSPLUS memberExpression)
  | memberExpression MINUSMINUS -> ^(POSTMINUSMINUS memberExpression)
  | memberExpression PLUSPLUS -> ^(POSTPLUSPLUS memberExpression)
  | memberExpression 
	;
	
memberExpression
	:	'#'! memberExpressionB '#'!
	| memberExpressionB
	;
	
memberExpressionB
  : ( primaryExpression -> primaryExpression ) // set return tree to just primary
  ( 
  : DOT p=primaryExpressionIRW LEFTPAREN args=argumentList ')' -> ^(JAVAMETHODCALL $memberExpressionB $p $args )
    |  LEFTPAREN args=argumentList RIGHTPAREN -> ^(FUNCTIONCALL $memberExpressionB $args)
    | LEFTBRACKET ie=impliesExpression RIGHTBRACKET -> ^(LEFTBRACKET $memberExpressionB $ie)
    | DOT p=primaryExpressionIRW -> ^(DOT $memberExpressionB $p)
  )*
  ;
  


memberExpressionSuffix
  : indexSuffix
  | propertyReferenceSuffix
  ;

propertyReferenceSuffix
  : DOT LT!* identifier
  ;

indexSuffix
  : LEFTBRACKET  LT!* primaryExpression  LT!* ']'! 
  ; 
  
primaryExpressionIRW
	:	primaryExpression
	| reservedWord
	;
	
	
reservedWord
  : CONTAINS | IS | EQUAL 
  | EQ | NEQ | GT | LT | GTE
  | GE | LTE | LE | NOT | AND
  | OR | XOR | EQV | IMP | MOD
  | NULL | EQUALS
  | cfscriptKeywords 
  ;

argumentList
  : argument (','! argument)*
  | -> ^(EMPTYARGS)
  ;

argument
  : ( identifier COLON impliesExpression -> ^( COLON identifier impliesExpression ) )
  | ( identifier EQUALSOP impliesExpression -> ^( COLON identifier impliesExpression ) )
  | impliesExpression 
  ;

identifier
	:	IDENTIFIER
  | DOES 
  | CONTAIN
  | GREATER 
  | THAN 
  | LESS 
  | VAR
  | TO
  | DEFAULT // default is a cfscript keyword that's always allowed as a var name
  | {!scriptMode}?=> cfscriptKeywords 
	;

cfscriptKeywords
  : IF
  | ELSE
  | BREAK
  | CONTINUE
  | FUNCTION
  | RETURN
  | WHILE
  | DO
  | FOR
  | IN
  | TRY
  | CATCH
  | SWITCH
  | CASE
  | DEFAULT
  ;
  
primaryExpression
	:	STRING_LITERAL
	|	BOOLEAN_LITERAL
	| FLOATING_POINT_LITERAL
	|	INTEGER_LITERAL
	| implicitArray
	| implicitStruct
	|	NULL
	| '('! LT!* assignmentExpression LT!* ')'!
	|	identifier
	;

implicitArray
  : LEFTBRACKET^ ( primaryExpression ( ','! primaryExpression )* )? RIGHTBRACKET
  ;
  
implicitStruct
  : LEFTCURLYBRACKET^ ( implicitStructExpression ( ( ',' | SEMICOLON ) implicitStructExpression )* )? RIGHTCURLYBRACKET
  ;


implicitStructExpression
  : implicitStructKeyExpression ( COLON | EQUALSOP )^ primaryExpression 
  ;
  
implicitStructKeyExpression
  : identifier ( DOT ( identifier | reservedWord ) )*
  ;
