lexer grammar XMLLexer;

options {
	filter	= true;
}

@lexer::header {
package cfml.parsing.cfml.antlr;
}

@lexer::members {
boolean tagMode = false;
boolean internalTagMode = false;
}

CF_TAG :  TAG_START_OPEN ATTR* TAG_END_OPEN;

TAG_START_OPEN : ('<' name=CFTAG_ID { tagMode = true; }) 
{ System.out.println("PCDATA:"+$name.text+ " type:"+$name.type); };
ATTR : (at=GENERIC_ID ATTR_EQ av=ATTR_VALUE)
{ System.out.println("PCDATA:"+$at.text+" "+$av.text+" type:" + $av.type); };
ATTR_EQ : { tagMode }?=> '=' ;  
ATTR_VALUE : { tagMode }?=>
        ( '"' (~'"')* '"'
        | '\'' (~'\'')* '\''
        )
                { System.out.println("PCDATA: attr"); }
    ;
TAG_END_OPEN : ('</' CFTAG_ID { tagMode = true; } );
TAG_CLOSE : { tagMode }?=> '>' { tagMode = false; } ;
TAG_EMPTY_CLOSE : { tagMode }?=> '/>' { tagMode = false; } ;

fragment PCDATA : { !tagMode }?=> (~'<')+ ;

fragment CFTAG_ID
    : 
      ('c'|'C') ('f'|'F') ID
    ;

fragment
ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;


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
    : ('a'..'z'|'A'..'Z')
    ;

WS  :  { tagMode }?=>
       (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=99;}
    ;
