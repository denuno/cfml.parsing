grammar XML;

options {       output=AST;
  ASTLabelType=CommonTree;
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
    : START_TAG
            {$ElementScope::currentElementName = $START_TAG.text; }
        -> ^(START_TAG)
    ;

attribute : ATTRIBUTE-> ^(ATTRIBUTE) ;

endTag!
    : { $ElementScope::currentElementName.equals(input.LT(2).getText()) }?
      END_TAG
    ;

emptyElement : EMPTY_ELEMENT
        -> ^(EMPTY_ELEMENT)
    ;

DOCUMENT
    :  XMLDECL? DOCTYPE? ELEMENT+
    ;

fragment STRING_LITERAL
  : '"' DOUBLESTRINGCHARACTER* '"'
  | '\'' SINGLESTRINGCHARACTER* '\''
  ;
 
fragment DOUBLESTRINGCHARACTER
  : ~('"')
  | '""'  
  ;

fragment SINGLESTRINGCHARACTER
  : ~('\'')
  | '\'\''  
  ;

fragment DOCTYPE
    :
        '<!DOCTYPE' WS rootElementName=GENERIC_ID 
        { System.out.println("ROOTELEMENT: "+rootElementName.getText()); }   
        WS
        ( 
            ( 'SYSTEM' WS sys1=VALUE
                { System.out.println("SYSTEM: "+sys1.getText()); }   
                
            | 'PUBLIC' WS pub=VALUE WS sys2=VALUE
                { System.out.println("PUBLIC: "+pub.getText()); }   
                { System.out.println("SYSTEM: "+sys2.getText()); }   
            )
            ( WS )?
        )?
        ( dtd=INTERNAL_DTD
            { System.out.println("INTERNAL DTD: "+dtd.getText()); }   
        )?
		'>'
	;

fragment INTERNAL_DTD : '[' (options {greedy=false;} : .)* ']' ;

fragment PI :
        '<?' target=GENERIC_ID WS? 
          { System.out.println("PI: "+target.getText()); }
        ( ATTRIBUTE WS? )*  '?>'
	;

fragment XMLDECL :
        '<?' ('x'|'X') ('m'|'M') ('l'|'L') WS? 
          { System.out.println("XML declaration"); }
        ( ATTRIBUTE WS? )*  '?>'
	;


fragment ELEMENT
    : ( START_TAG
            (ELEMENT
            | t=PCDATA
                { System.out.println("PCDATA: \""+$t.getText()+"\""); }
            | t=CDATA
                { System.out.println("CDATA: \""+$t.getText()+"\""); }
            | t=COMMENT
                { System.out.println("Comment: \""+$t.getText()+"\""); }
            | pi=PI
            )*
            END_TAG
        | EMPTY_ELEMENT
        ) WS?
    ;

fragment START_TAG 
    : '<' WS? name=TAG_NAME WS?
          { System.out.println("Start Tag: "+name.getText()); }
        ( ATTRIBUTE WS? )* '>'
    ;

fragment EMPTY_ELEMENT 
    : '<' WS? name=TAG_NAME WS?
          { System.out.println("Empty Element: "+name.getText()); }
        ( ATTRIBUTE WS? )* '/>'
    ;

fragment ATTRIBUTE 
    : name=GENERIC_ID WS? '=' WS? value=VALUE
        { System.out.println("Attr: "+name.getText()+"="+value.getText()); }
    ;

fragment END_TAG 
    : '</' WS? name=GENERIC_ID WS? '>'
        { System.out.println("End Tag: "+name.getText()); }
    ;

fragment COMMENT
	:	'<!--' (options {greedy=false;} : .)* '-->'
	;

fragment CDATA
	:	'<![CDATA[' (options {greedy=false;} : .)* ']]>'
	;

fragment PCDATA : (~'<')+ ; 

fragment IDENTIFIER 
  : LETTER (options {greedy=true;} : LETTER|DIGIT)*;

fragment OBJECT
  : IDENTIFIER '.' (IDENTIFIER '.'?)*;

fragment VALUE : 
        ( OBJECT| IDENTIFIER| DIGIT |
        '\"' (~'\"')* '\"'
        | '\'' (~'\'')* '\''
        )
	;

fragment TAG_NAME 
    : IDENTIFIER
  ;

fragment GENERIC_ID 
    : ( LETTER | '_' | ':') 
        ( options {greedy=true;} : LETTER | '0'..'9' | '.' | '-' | '_' | ':' )*
	;

fragment LETTER
	: 'a'..'z' 
	| 'A'..'Z'
	;


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

fragment WS  : (' ' | '\t' | '\n' | '\r' | '\f' )+;
