grammar XML;

options {       
  output=AST;
  ASTLabelType=CommonTree;
}

tokens {
 ELEMENT;
 ATTRIBUTE;
}

scope ElementScope {
  String currentElementName;
}

@parser::header {
package cfml.parsing.cfml.antlr;

import java.util.LinkedList;
}

@lexer::header {
package cfml.parsing.cfml.antlr;
}

@lexer::members {
    boolean tagMode = false;
}

document : element ;

element
scope ElementScope;
    : ( startTag^
            (element
            | PCDATA
            )*
            endTag!
        | emptyElement
        )
    ;

startTag
    : TAG_START_OPEN GENERIC_ID attribute* TAG_CLOSE
            {$ElementScope::currentElementName = $GENERIC_ID.text; }
        -> ^(ELEMENT GENERIC_ID attribute*)
    ; 

attribute : GENERIC_ID ATTR_EQ ATTR_VALUE -> ^(ATTRIBUTE GENERIC_ID ATTR_VALUE) ;

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
    System.out.println(msg);
    consumeUntil(input, TAG_CLOSE);
    input.consume();
}

emptyElement : TAG_START_OPEN GENERIC_ID attribute* TAG_EMPTY_CLOSE
        -> ^(ELEMENT GENERIC_ID attribute*)
    ;
    
    
TAG_START_OPEN : '<' { tagMode = true; } ;
TAG_END_OPEN : '</' { tagMode = true; } ;
TAG_CLOSE : { tagMode }?=> '>' { tagMode = false; } ;
TAG_EMPTY_CLOSE : { tagMode }?=> '/>' { tagMode = false; } ;

ATTR_EQ : { tagMode }?=> '=' ;

ATTR_VALUE : { tagMode }?=>
        ( '"' (~'"')* '"'
        | '\'' (~'\'')* '\''
        )
    ;

PCDATA : { !tagMode }?=> (~'<')+ ;

GENERIC_ID
    : { tagMode }?=>
      ( LETTER | '_' | ':') (NAMECHAR)*
    ;

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

WS  :  { tagMode }?=>
       (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=99;}
    ;
