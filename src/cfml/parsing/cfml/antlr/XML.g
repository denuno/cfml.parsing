grammar XML;

options {       
  output=AST;
  ASTLabelType=CommonTree;
}

tokens {
TAG;
 ASSIGN;
 ELEMENT;
 ATTRIBUTE;
 CFMLTAG;
 TAGNAME;
 ATTRIBUTENAME;
}

scope ElementScope {
  String currentElementName;
  int closerLine;
  int closerPosInLine;
}

@parser::header {
package cfml.parsing.cfml.antlr;

import java.util.LinkedList;
}

@parser::members {
  protected boolean isColdFusionTag(String name)
  {   
    boolean isColdfusion = name.toLowerCase().startsWith("cf");
    System.out.println("isColdFusion: " + name + " : " + isColdfusion);
    return isColdfusion;
  }

  protected boolean isAssignmentTag(String name)
  {   
    boolean isSingle = name.toLowerCase().startsWith("cfset");
    System.out.println("isColdFusion: " + name + " : " + isSingle);
    return isSingle;
  }

  protected boolean isSingleTag(String name)
  {   
    boolean isSingle = name.toLowerCase().startsWith("cf");
    System.out.println("isColdFusion: " + name + " : " + isSingle);
    return isSingle;
  }


}

@lexer::header {
package cfml.parsing.cfml.antlr;
}

@lexer::members {
    boolean tagMode = false;
    boolean internalTagMode = false;
}

compilationUnit : tag;

tag: element*;


internalElement
scope ElementScope;
    : ( internalStartTag^
            (internalElement
            | PCDATA
            )*
            internalEndTag
        )
    ;

element
scope ElementScope;
    : ( startTag^
            (element
            | PCDATA
            )*
            endTag
        | emptyElement
        )
    ;

internalStartTag: internalStartTagStart^ internalStartTagEnd;

startTag: startTagStart^ internalElement* startTagEnd;


internalStartTagStart
    : el=INTERNAL_TAG_START_OPEN tname=GENERIC_ID
            {$ElementScope::currentElementName = $GENERIC_ID.text;}
        -> {isAssignmentTag($tname.text)}? ^(ASSIGN[$el] TAGNAME[$tname])
        -> {isColdFusionTag($tname.text)}? ^(CFMLTAG[$el] TAGNAME[$tname])
        -> ^(ELEMENT[$el] TAGNAME[$tname])
    ; 

startTagStart
    : el=TAG_START_OPEN tname=GENERIC_ID
            {$ElementScope::currentElementName = $GENERIC_ID.text;}
        -> {isAssignmentTag($tname.text)}? ^(ASSIGN[$el] TAGNAME[$tname])
        -> {isColdFusionTag($tname.text)}? ^(CFMLTAG[$el] TAGNAME[$tname])
        -> ^(ELEMENT[$el] TAGNAME[$tname])
    ; 

internalStartTagEnd
    : attribute* INTERNAL_TAG_CLOSE
    ; 

startTagEnd
    : attribute* TAG_CLOSE
    ; 

attribute : aname=GENERIC_ID ATTR_EQ ATTR_VALUE -> ^(ATTRIBUTE[$aname] ATTRIBUTENAME[$aname] ATTR_VALUE) ;

internalEndTag!
    : { $ElementScope::currentElementName.equals(input.LT(2).getText()) }?
      INTERNAL_TAG_END_OPEN GENERIC_ID INTERNAL_TAG_CLOSE
    ;
catch [FailedPredicateException fpe] {
    String hdr = getErrorHeader(fpe);
    String msg = "end tag (" + input.LT(2).getText() +
                 ") does not match start tag (" +
                 $ElementScope::currentElementName +
                 ") currently open, closing it anyway";
    emitErrorMessage(hdr+" "+msg);
    consumeUntil(input, INTERNAL_TAG_CLOSE);
    input.consume();
}


endTag!
    : { $ElementScope::currentElementName.equals(input.LT(2).getText()) }?
      TAG_END_OPEN GENERIC_ID TAG_CLOSE
    ;
catch [FailedPredicateException fpe] {
    String hdr = getErrorHeader(fpe);
    String msg = "end tag (" + input.LT(2).getText() +
                 ") does not match start tag (" +
                 $ElementScope::currentElementName +
                 ") currently open, closing it anyway";
    emitErrorMessage(hdr+" "+msg);
    consumeUntil(input, TAG_CLOSE);
    input.consume();
}

emptyElement : el=TAG_START_OPEN tname=GENERIC_ID attribute* TAG_EMPTY_CLOSE
        -> ^(ELEMENT[$el] GENERIC_ID[$tname] attribute*)
    ;
    
    
INTERNAL_TAG_START_OPEN : { tagMode }?=> '<' { internalTagMode = true; System.out.println("internal-open:");} ;
INTERNAL_TAG_END_OPEN : { tagMode }?=> '</' { internalTagMode = true; System.out.println("internal-end");} ;
INTERNAL_TAG_CLOSE : { internalTagMode }?=> '>' { internalTagMode = false; System.out.println("internal-close");} ;

TAG_START_OPEN : { !internalTagMode }?=> '<' { tagMode = true; } ;
TAG_END_OPEN : { !internalTagMode }?=>'</' { tagMode = true; } ;
TAG_CLOSE : { tagMode && !internalTagMode}?=> '>' { tagMode = false; } ;

TAG_EMPTY_CLOSE : { tagMode && !internalTagMode }?=> '/>' { tagMode = false; } ;

ATTR_EQ : { tagMode }?=> '=' ;

ATTR_VALUE : { tagMode }?=>
        ( '"' (~'"')* '"'
        | '\'' (~'\'')* '\''
        )
    ;


PCDATA : { !tagMode && !internalTagMode}?=> (~'<')+ ;

GENERIC_ID
    : { tagMode }?=>
      ( LETTER | '_' | ':') (NAMECHAR)*
    ;

fragment CFSET
    :    'cfset'
    ;

fragment ASSIGNEXPR : (~'>')+ ;


fragment NAMECHAR
    : LETTER | DIGIT | '.' | '-' | '_' | ':'
    ;

fragment DIGIT
    :    '0'..'9'
    ;

fragment LETTER
    : 'a'..'z'
    | 'A'..'Z'
    ;

WS  :  { tagMode}?=>
       (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=99;}
    ;
