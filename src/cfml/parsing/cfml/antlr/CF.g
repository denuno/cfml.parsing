grammar CF;

options {
  output=AST;
  ASTLabelType=CommonTree;
}
tokens {
TAG;
TRY;
CFSETTAG;
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


@parser::header 
{
package cfml.parsing.cfml.antlr;

/*
Copyright (c) 2007 Mark Mandel, Mark Drew

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.
d
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE. 
*/  

import java.util.LinkedList;

}

@lexer::header
{
package cfml.parsing.cfml.antlr;

/*
Copyright (c) 2007 Mark Mandel, Mark Drew

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE. 
*/
}



@lexer::members {
  private static final int TEXT_CHANNEL = 89;
boolean tagMode = false;
boolean internalTagMode = false;
  private static int NONE_MODE = 0;
  private static int ENDTAG_MODE = 1;
  private static int STARTTAG_MODE = 2;
  private static int DOUBLE_QUOTE_STRING_MODE = 3;
  private static int SINGLE_QUOTE_STRING_MODE = 4;
  private static int HASH_CFML_MODE = 5;

  private int mode;
  
  private int getMode()
  {
    return mode;
  }
  
  private void setMode(int mode)
  {
    this.mode = mode;
  }
}


TAG_START_OPEN : ('<' name=CFTAG_ID { tagMode = true; }) 
{ System.out.println("PCDATA:"+$name.text+ " type:"+$name.type); };

ATTR_EQ : { tagMode }?=> '=' ;  
fragment ATTR_VALUE : { tagMode }?=>
        STRING_LITERAL
                { System.out.println("PCDATA: string"); }
    ;

TAG_EMPTY_CLOSE : { tagMode }?=> '/>' { tagMode = false; } ;
TAG_CLOSE : { tagMode }?=> '>' { tagMode = false; } ;
TAG_END_OPEN : ('</' CFTAG_ID { tagMode = true; } );

GENERIC_ID
    : { tagMode }?=>
      ( LETTER | '_' | ':') (NAMECHAR)*
    ;


STRING_LITERAL
  :{ tagMode }?=> ( '"' DoubleStringCharacter* '"'
  | '\'' SingleStringCharacter* '\'')
  ;
 
fragment DoubleStringCharacter
  : ~('"')
  | '""'  
  ;

fragment SingleStringCharacter
  : ~('\'')
  | '\'\''  
  ;


PCDATA : { !tagMode }?=> (~'<')+ ;
fragment CFSETDATA : { tagMode }?=> (~'>')+ ;

fragment CFTAG_ID
    : 
      ('c'|'C') ('f'|'F')
    ;

fragment
ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;
fragment
TRY :  'try'
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
OTHER
  :
  { !tagMode }?=>
  (options {greedy=false;} : . )
  {
    $channel=TEXT_CHANNEL; //test is on a seperate channel, in case you want it
  } 
  ;


compilationUnit : tag;

tag: element*;

element
scope ElementScope;
    :  ( (startTag^)
            (element
            | PCDATA
            )*
            endTag!
        | emptyElement
        | cfsetStart PCDATA*
        )
    ;

startTag
    : 
    (el=TAG_START_OPEN name=GENERIC_ID attribute* TAG_CLOSE
            {if (!$name.text.equals("set")) {
	            $ElementScope::currentElementName = $name.text;
	            System.out.println("current Tag:"+$name.text);
            } else {
            	System.out.println("Non closer:"+$name.text);            
            }
            System.out.println("current Tag:"+$name.text);
            }
        -> ^(ELEMENT[$name] attribute*)
)
    ; 

cfsetStart 
	: el=TAG_START_OPEN 'set ' attribute* TAG_CLOSE;

stringLiteral 
	:	 STRING_LITERAL;

attribute : aname=GENERIC_ID ATTR_EQ stringLiteral -> ^(ATTRIBUTE[$aname] ATTRIBUTENAME[$aname] stringLiteral) ;

endTag!
      
    : {
    System.out.println(input.LT(1).getText() + input.LT(1).getType());
    System.out.println(input.LT(2).getText()+ input.LT(2).getType());
    System.out.println(input.LT(3).getText()+ input.LT(3).getType());} 
      { $ElementScope::currentElementName.equals(input.LT(2).getText())}?
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

emptyElement : el=TAG_START_OPEN GENERIC_ID attribute* TAG_EMPTY_CLOSE
        -> ^(ELEMENT[$el] attribute*)
    ;

