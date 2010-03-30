// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g 2010-03-30 15:15:21

package cfml.parsing.cfmentat.antlr;

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

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class CFScriptLexer extends Lexer {
	public static final int COMMA = 28;
	public static final int HASH = 19;
	public static final int ELSEIF = 7;
	public static final int NUMBER = 18;
	public static final int OPEN_CURLY = 38;
	public static final int DOT = 20;
	public static final int FUNCTION = 29;
	public static final int STRUCT_KEY = 6;
	public static final int STRING_OPERATOR = 46;
	public static final int SEMI_COLON = 10;
	public static final int MATH_OPERATOR = 45;
	public static final int FUNCTION_DECLARATION = 5;
	public static final int SINGLE_QUOTE = 23;
	public static final int DIGIT = 49;
	public static final int OPERATOR = 16;
	public static final int BOOLEAN_OPERATOR = 48;
	public static final int LETTER = 50;
	public static final int CLOSE_SQUARE = 27;
	public static final int DO = 37;
	public static final int CLOSE_PAREN = 14;
	public static final int WHILE = 36;
	public static final int SWITCH = 40;
	public static final int WS = 52;
	public static final int STRING = 9;
	public static final int FUNCTION_CALL = 4;
	public static final int DOUBLE_QUOTE = 21;
	public static final int ESCAPE_SINGLE_QUOTE = 24;
	public static final int CLOSE_CURLY = 39;
	public static final int COMMENT = 53;
	public static final int LINE_COMMENT = 54;
	public static final int CONDITION_OPERATOR = 47;
	public static final int OTHER = 55;
	public static final int OPEN_SQUARE = 26;
	public static final int IN = 35;
	public static final int CATCH = 33;
	public static final int EQUALS = 12;
	public static final int VAR = 11;
	public static final int CASE = 41;
	public static final int ESCAPE_DOUBLE_QUOTE = 22;
	public static final int ELSE = 31;
	public static final int RETURN = 15;
	public static final int IF = 30;
	public static final int STRING_CFML = 8;
	public static final int EOF = -1;
	public static final int BREAK = 44;
	public static final int FOR = 34;
	public static final int OPEN_PAREN = 13;
	public static final int DEFAULT = 43;
	public static final int COLON = 42;
	public static final int IDENTIFIER = 25;
	public static final int TRY = 32;
	public static final int NOT = 17;
	public static final int UNDERSCORE = 51;
	
	public static final int COMMENT_CHANNEL = 90;
	
	private static final int CATCH_MODE = 1;
	private static final int NORMAL_MODE = 0;
	
	private int mode = NORMAL_MODE;
	
	private void setMode(int mode) {
		this.mode = mode;
	}
	
	private int getMode() {
		return this.mode;
	}
	
	// delegates
	// delegators
	
	public CFScriptLexer() {
		;
	}
	
	public CFScriptLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	
	public CFScriptLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
		
	}
	
	public String getGrammarFileName() {
		return "/Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g";
	}
	
	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:381:2:
			// ( 'function' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:382:2:
			// 'function'
			{
				match("function");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "FUNCTION"
	
	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:386:2:
			// ( 'if' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:387:2:
			// 'if'
			{
				match("if");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "IF"
	
	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:391:2:
			// ( 'else' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:392:2:
			// 'else'
			{
				match("else");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "ELSE"
	
	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:396:2:
			// ( 'try' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:397:2:
			// 'try'
			{
				match("try");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "TRY"
	
	// $ANTLR start "CATCH"
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:401:2:
			// ( 'catch' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:402:2:
			// 'catch'
			{
				match("catch");
				
				setMode(CATCH_MODE);
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CATCH"
	
	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:408:2:
			// ( 'return' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:409:2:
			// 'return'
			{
				match("return");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "RETURN"
	
	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:413:2:
			// ( 'for' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:414:2:
			// 'for'
			{
				match("for");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "FOR"
	
	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:418:2:
			// ( 'in' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:419:2:
			// 'in'
			{
				match("in");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "IN"
	
	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:423:2:
			// ( 'while' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:424:2:
			// 'while'
			{
				match("while");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "WHILE"
	
	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:428:2:
			// ( 'do' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:429:2:
			// 'do'
			{
				match("do");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "DO"
	
	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:432:5:
			// ( 'not' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:433:2:
			// 'not'
			{
				match("not");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "NOT"
	
	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:437:2:
			// ( '=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:438:2:
			// '='
			{
				match('=');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "EQUALS"
	
	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:442:2:
			// ( 'switch' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:443:2:
			// 'switch'
			{
				match("switch");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "SWITCH"
	
	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:447:2:
			// ( 'case' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:448:2:
			// 'case'
			{
				match("case");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CASE"
	
	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:452:2:
			// ( 'default' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:453:2:
			// 'default'
			{
				match("default");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "DEFAULT"
	
	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:457:2:
			// ( 'break' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:458:2:
			// 'break'
			{
				match("break");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "BREAK"
	
	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:461:7:
			// ( ':' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:462:2:
			// ':'
			{
				match(':');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "COLON"
	
	// $ANTLR start "OPERATOR"
	public final void mOPERATOR() throws RecognitionException {
		try {
			int _type = OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:466:2:
			// ( ( MATH_OPERATOR | STRING_OPERATOR | CONDITION_OPERATOR | BOOLEAN_OPERATOR ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:467:2:
			// ( MATH_OPERATOR | STRING_OPERATOR | CONDITION_OPERATOR | BOOLEAN_OPERATOR )
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:467:2:
				// ( MATH_OPERATOR | STRING_OPERATOR | CONDITION_OPERATOR | BOOLEAN_OPERATOR )
				int alt1 = 4;
				switch (input.LA(1)) {
				case '*':
				case '+':
				case '-':
				case '/':
				case '\\':
				case '^':
				case 'm': {
					alt1 = 1;
				}
					break;
				case '&': {
					alt1 = 2;
				}
					break;
				case 'e': {
					int LA1_3 = input.LA(2);
					
					if ((LA1_3 == 'q')) {
						int LA1_7 = input.LA(3);
						
						if ((LA1_7 == 'v')) {
							alt1 = 4;
						} else {
							alt1 = 3;
						}
					} else {
						NoViableAltException nvae = new NoViableAltException("", 1, 3, input);
						
						throw nvae;
					}
				}
					break;
				case 'g':
				case 'l':
				case 'n': {
					alt1 = 3;
				}
					break;
				case 'i': {
					int LA1_5 = input.LA(2);
					
					if ((LA1_5 == 's')) {
						alt1 = 3;
					} else if ((LA1_5 == 'm')) {
						alt1 = 4;
					} else {
						NoViableAltException nvae = new NoViableAltException("", 1, 5, input);
						
						throw nvae;
					}
				}
					break;
				case 'a':
				case 'o':
				case 'x': {
					alt1 = 4;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 1, 0, input);
					
					throw nvae;
				}
				
				switch (alt1) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:467:4:
					// MATH_OPERATOR
				{
					mMATH_OPERATOR();
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:467:20:
					// STRING_OPERATOR
				{
					mSTRING_OPERATOR();
					
				}
					break;
				case 3:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:467:38:
					// CONDITION_OPERATOR
				{
					mCONDITION_OPERATOR();
					
				}
					break;
				case 4:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:467:59:
					// BOOLEAN_OPERATOR
				{
					mBOOLEAN_OPERATOR();
					
				}
					break;
				
				}
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "OPERATOR"
	
	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:470:7:
			// ( ',' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:471:2:
			// ','
			{
				match(',');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "COMMA"
	
	// $ANTLR start "SEMI_COLON"
	public final void mSEMI_COLON() throws RecognitionException {
		try {
			int _type = SEMI_COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:475:2:
			// ( ';' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:476:2:
			// ';'
			{
				match(';');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "SEMI_COLON"
	
	// $ANTLR start "HASH"
	public final void mHASH() throws RecognitionException {
		try {
			int _type = HASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:479:6:
			// ( '#' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:480:2:
			// '#'
			{
				match('#');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "HASH"
	
	// $ANTLR start "OPEN_PAREN"
	public final void mOPEN_PAREN() throws RecognitionException {
		try {
			int _type = OPEN_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:484:2:
			// ( '(' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:485:2:
			// '('
			{
				match('(');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "OPEN_PAREN"
	
	// $ANTLR start "CLOSE_PAREN"
	public final void mCLOSE_PAREN() throws RecognitionException {
		try {
			int _type = CLOSE_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:489:2:
			// ( ')' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:490:2:
			// ')'
			{
				match(')');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CLOSE_PAREN"
	
	// $ANTLR start "OPEN_SQUARE"
	public final void mOPEN_SQUARE() throws RecognitionException {
		try {
			int _type = OPEN_SQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:494:2:
			// ( '[' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:495:2:
			// '['
			{
				match('[');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "OPEN_SQUARE"
	
	// $ANTLR start "CLOSE_SQUARE"
	public final void mCLOSE_SQUARE() throws RecognitionException {
		try {
			int _type = CLOSE_SQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:499:2:
			// ( ']' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:500:2:
			// ']'
			{
				match(']');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CLOSE_SQUARE"
	
	// $ANTLR start "OPEN_CURLY"
	public final void mOPEN_CURLY() throws RecognitionException {
		try {
			int _type = OPEN_CURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:504:2:
			// ( '{' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:505:2:
			// '{'
			{
				match('{');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "OPEN_CURLY"
	
	// $ANTLR start "CLOSE_CURLY"
	public final void mCLOSE_CURLY() throws RecognitionException {
		try {
			int _type = CLOSE_CURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:509:2:
			// ( '}' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:510:2:
			// '}'
			{
				match('}');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CLOSE_CURLY"
	
	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:514:2:
			// ( '.' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:515:2:
			// '.'
			{
				match('.');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "DOT"
	
	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:519:2:
			// ( 'var' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:520:2:
			// 'var'
			{
				match("var");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "VAR"
	
	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:524:2:
			// ( ( DIGIT )+ ( DOT ( DIGIT )+ )? )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:525:2:
			// ( DIGIT )+ ( DOT ( DIGIT )+ )?
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:525:2:
				// ( DIGIT )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					
					if (((LA2_0 >= '0' && LA2_0 <= '9'))) {
						alt2 = 1;
					}
					
					switch (alt2) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:525:2:
						// DIGIT
					{
						mDIGIT();
						
					}
						break;
					
					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2, input);
						throw eee;
					}
					cnt2++;
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:525:8:
				// ( DOT ( DIGIT )+ )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);
				
				if ((LA4_0 == '.')) {
					alt4 = 1;
				}
				switch (alt4) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:525:9:
					// DOT ( DIGIT )+
				{
					mDOT();
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:525:13:
					// ( DIGIT )+
					int cnt3 = 0;
					loop3: do {
						int alt3 = 2;
						int LA3_0 = input.LA(1);
						
						if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
							alt3 = 1;
						}
						
						switch (alt3) {
						case 1:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:525:13:
							// DIGIT
						{
							mDIGIT();
							
						}
							break;
						
						default:
							if (cnt3 >= 1)
								break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					} while (true);
					
				}
					break;
				
				}
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "NUMBER"
	
	// $ANTLR start "ESCAPE_DOUBLE_QUOTE"
	public final void mESCAPE_DOUBLE_QUOTE() throws RecognitionException {
		try {
			int _type = ESCAPE_DOUBLE_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:529:2:
			// ( '\"\"' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:530:2:
			// '\"\"'
			{
				match("\"\"");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "ESCAPE_DOUBLE_QUOTE"
	
	// $ANTLR start "ESCAPE_SINGLE_QUOTE"
	public final void mESCAPE_SINGLE_QUOTE() throws RecognitionException {
		try {
			int _type = ESCAPE_SINGLE_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:534:2:
			// ( '\\'\\'' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:535:2:
			// '\\'\\''
			{
				match("''");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "ESCAPE_SINGLE_QUOTE"
	
	// $ANTLR start "DOUBLE_QUOTE"
	public final void mDOUBLE_QUOTE() throws RecognitionException {
		try {
			int _type = DOUBLE_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:539:2:
			// ( '\"' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:540:2:
			// '\"'
			{
				match('\"');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "DOUBLE_QUOTE"
	
	// $ANTLR start "SINGLE_QUOTE"
	public final void mSINGLE_QUOTE() throws RecognitionException {
		try {
			int _type = SINGLE_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:543:2:
			// ( '\\'' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:544:2:
			// '\\''
			{
				match('\'');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "SINGLE_QUOTE"
	
	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:548:2:
			// ( ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE )* )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:549:2:
			// ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE )*
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
					
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:549:24:
				// ( LETTER | DIGIT | UNDERSCORE )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);
					
					if (((LA5_0 >= '0' && LA5_0 <= '9') || (LA5_0 >= 'A' && LA5_0 <= 'Z') || LA5_0 == '_' || (LA5_0 >= 'a' && LA5_0 <= 'z'))) {
						alt5 = 1;
					}
					
					switch (alt5) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();
							
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
						
					}
						break;
					
					default:
						break loop5;
					}
				} while (true);
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "IDENTIFIER"
	
	// $ANTLR start "MATH_OPERATOR"
	public final void mMATH_OPERATOR() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:565:2:
			// ( ( '+' | '*' | '\\/' | '\\\\' | '^' | 'mod' | '-' ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:2:
			// ( '+' | '*' | '\\/' | '\\\\' | '^' | 'mod' | '-' )
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:2:
				// ( '+' | '*' | '\\/' | '\\\\' | '^' | 'mod' | '-' )
				int alt6 = 7;
				switch (input.LA(1)) {
				case '+': {
					alt6 = 1;
				}
					break;
				case '*': {
					alt6 = 2;
				}
					break;
				case '/': {
					alt6 = 3;
				}
					break;
				case '\\': {
					alt6 = 4;
				}
					break;
				case '^': {
					alt6 = 5;
				}
					break;
				case 'm': {
					alt6 = 6;
				}
					break;
				case '-': {
					alt6 = 7;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 6, 0, input);
					
					throw nvae;
				}
				
				switch (alt6) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:3:
					// '+'
				{
					match('+');
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:9:
					// '*'
				{
					match('*');
					
				}
					break;
				case 3:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:15:
					// '\\/'
				{
					match('/');
					
				}
					break;
				case 4:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:22:
					// '\\\\'
				{
					match('\\');
					
				}
					break;
				case 5:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:29:
					// '^'
				{
					match('^');
					
				}
					break;
				case 6:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:35:
					// 'mod'
				{
					match("mod");
					
				}
					break;
				case 7:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:566:43:
					// '-'
				{
					match('-');
					
				}
					break;
				
				}
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "MATH_OPERATOR"
	
	// $ANTLR start "STRING_OPERATOR"
	public final void mSTRING_OPERATOR() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:569:2:
			// ( '&' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:570:2:
			// '&'
			{
				match('&');
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "STRING_OPERATOR"
	
	// $ANTLR start "CONDITION_OPERATOR"
	public final void mCONDITION_OPERATOR() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:573:2:
			// ( ( 'eq' | 'neq' | 'is' | 'gt' | 'lt' | 'lte' | 'gte' ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:2:
			// ( 'eq' | 'neq' | 'is' | 'gt' | 'lt' | 'lte' | 'gte' )
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:2:
				// ( 'eq' | 'neq' | 'is' | 'gt' | 'lt' | 'lte' | 'gte' )
				int alt7 = 7;
				alt7 = dfa7.predict(input);
				switch (alt7) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:3:
					// 'eq'
				{
					match("eq");
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:8:
					// 'neq'
				{
					match("neq");
					
				}
					break;
				case 3:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:14:
					// 'is'
				{
					match("is");
					
				}
					break;
				case 4:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:19:
					// 'gt'
				{
					match("gt");
					
				}
					break;
				case 5:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:24:
					// 'lt'
				{
					match("lt");
					
				}
					break;
				case 6:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:29:
					// 'lte'
				{
					match("lte");
					
				}
					break;
				case 7:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:574:35:
					// 'gte'
				{
					match("gte");
					
				}
					break;
				
				}
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "CONDITION_OPERATOR"
	
	// $ANTLR start "BOOLEAN_OPERATOR"
	public final void mBOOLEAN_OPERATOR() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:578:2:
			// ( ( 'or' | 'and' | 'xor' | 'eqv' | 'imp' ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:579:2:
			// ( 'or' | 'and' | 'xor' | 'eqv' | 'imp' )
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:579:2:
				// ( 'or' | 'and' | 'xor' | 'eqv' | 'imp' )
				int alt8 = 5;
				switch (input.LA(1)) {
				case 'o': {
					alt8 = 1;
				}
					break;
				case 'a': {
					alt8 = 2;
				}
					break;
				case 'x': {
					alt8 = 3;
				}
					break;
				case 'e': {
					alt8 = 4;
				}
					break;
				case 'i': {
					alt8 = 5;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 8, 0, input);
					
					throw nvae;
				}
				
				switch (alt8) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:579:3:
					// 'or'
				{
					match("or");
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:579:8:
					// 'and'
				{
					match("and");
					
				}
					break;
				case 3:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:579:14:
					// 'xor'
				{
					match("xor");
					
				}
					break;
				case 4:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:579:20:
					// 'eqv'
				{
					match("eqv");
					
				}
					break;
				case 5:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:579:26:
					// 'imp'
				{
					match("imp");
					
				}
					break;
				
				}
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "BOOLEAN_OPERATOR"
	
	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:583:2:
			// ( '_' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:584:2:
			// '_'
			{
				match('_');
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "UNDERSCORE"
	
	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:588:2:
			// ( '0' .. '9' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:589:2:
			// '0' .. '9'
			{
				matchRange('0', '9');
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "DIGIT"
	
	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:593:2:
			// ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
					
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "LETTER"
	
	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:600:2:
			// ( ( ' ' | '\\r' | '\\t' | '\ ' | '\\n' ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:601:2:
			// ( ' ' | '\\r' | '\\t' | '\ ' | '\\n' )
			{
				if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || (input.LA(1) >= '\f' && input.LA(1) <= '\r')
						|| input.LA(1) == ' ') {
					input.consume();
					
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				
				_channel = HIDDEN;
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "WS"
	
	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:608:2:
			// ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:609:2:
			// '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:609:7:
				// ( options {greedy=false; } : . )*
				loop9: do {
					int alt9 = 2;
					int LA9_0 = input.LA(1);
					
					if ((LA9_0 == '*')) {
						int LA9_1 = input.LA(2);
						
						if ((LA9_1 == '/')) {
							alt9 = 2;
						} else if (((LA9_1 >= '\u0000' && LA9_1 <= '.') || (LA9_1 >= '0' && LA9_1 <= '\uFFFF'))) {
							alt9 = 1;
						}
						
					} else if (((LA9_0 >= '\u0000' && LA9_0 <= ')') || (LA9_0 >= '+' && LA9_0 <= '\uFFFF'))) {
						alt9 = 1;
					}
					
					switch (alt9) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:609:35:
						// .
					{
						matchAny();
						
					}
						break;
					
					default:
						break loop9;
					}
				} while (true);
				
				match("*/");
				
				_channel = COMMENT_CHANNEL; // 90 is the comment channel
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "COMMENT"
	
	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:616:2:
			// ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:617:2:
			// '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
				match("//");
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:617:7:
				// (~ ( '\\n' | '\\r' ) )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);
					
					if (((LA10_0 >= '\u0000' && LA10_0 <= '\t') || (LA10_0 >= '\u000B' && LA10_0 <= '\f') || (LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF'))) {
						alt10 = 1;
					}
					
					switch (alt10) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:617:7:
						// ~ ( '\\n' | '\\r' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
							input.consume();
							
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
						
					}
						break;
					
					default:
						break loop10;
					}
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:617:21:
				// ( '\\r' )?
				int alt11 = 2;
				int LA11_0 = input.LA(1);
				
				if ((LA11_0 == '\r')) {
					alt11 = 1;
				}
				switch (alt11) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:617:21:
					// '\\r'
				{
					match('\r');
					
				}
					break;
				
				}
				
				match('\n');
				
				_channel = COMMENT_CHANNEL; // 90 is the comment channel
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LINE_COMMENT"
	
	// $ANTLR start "OTHER"
	public final void mOTHER() throws RecognitionException {
		try {
			int _type = OTHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:624:2:
			// ( ( options {greedy=false; } : . ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:625:2:
			// ( options {greedy=false; } : . )
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:625:2:
				// ( options {greedy=false; } : . )
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:625:29:
				// .
				{
					matchAny();
					
				}
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "OTHER"
	
	public void mTokens() throws RecognitionException {
		// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:8: (
		// FUNCTION | IF | ELSE | TRY | CATCH | RETURN | FOR | IN | WHILE | DO | NOT | EQUALS | SWITCH | CASE | DEFAULT
		// | BREAK | COLON | OPERATOR | COMMA | SEMI_COLON | HASH | OPEN_PAREN | CLOSE_PAREN | OPEN_SQUARE |
		// CLOSE_SQUARE | OPEN_CURLY | CLOSE_CURLY | DOT | VAR | NUMBER | ESCAPE_DOUBLE_QUOTE | ESCAPE_SINGLE_QUOTE |
		// DOUBLE_QUOTE | SINGLE_QUOTE | IDENTIFIER | WS | COMMENT | LINE_COMMENT | OTHER )
		int alt12 = 39;
		alt12 = dfa12.predict(input);
		switch (alt12) {
		case 1:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:10:
			// FUNCTION
		{
			mFUNCTION();
			
		}
			break;
		case 2:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:19:
			// IF
		{
			mIF();
			
		}
			break;
		case 3:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:22:
			// ELSE
		{
			mELSE();
			
		}
			break;
		case 4:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:27:
			// TRY
		{
			mTRY();
			
		}
			break;
		case 5:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:31:
			// CATCH
		{
			mCATCH();
			
		}
			break;
		case 6:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:37:
			// RETURN
		{
			mRETURN();
			
		}
			break;
		case 7:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:44:
			// FOR
		{
			mFOR();
			
		}
			break;
		case 8:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:48:
			// IN
		{
			mIN();
			
		}
			break;
		case 9:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:51:
			// WHILE
		{
			mWHILE();
			
		}
			break;
		case 10:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:57:
			// DO
		{
			mDO();
			
		}
			break;
		case 11:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:60:
			// NOT
		{
			mNOT();
			
		}
			break;
		case 12:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:64:
			// EQUALS
		{
			mEQUALS();
			
		}
			break;
		case 13:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:71:
			// SWITCH
		{
			mSWITCH();
			
		}
			break;
		case 14:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:78:
			// CASE
		{
			mCASE();
			
		}
			break;
		case 15:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:83:
			// DEFAULT
		{
			mDEFAULT();
			
		}
			break;
		case 16:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:91:
			// BREAK
		{
			mBREAK();
			
		}
			break;
		case 17:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:97:
			// COLON
		{
			mCOLON();
			
		}
			break;
		case 18:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:103:
			// OPERATOR
		{
			mOPERATOR();
			
		}
			break;
		case 19:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:112:
			// COMMA
		{
			mCOMMA();
			
		}
			break;
		case 20:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:118:
			// SEMI_COLON
		{
			mSEMI_COLON();
			
		}
			break;
		case 21:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:129:
			// HASH
		{
			mHASH();
			
		}
			break;
		case 22:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:134:
			// OPEN_PAREN
		{
			mOPEN_PAREN();
			
		}
			break;
		case 23:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:145:
			// CLOSE_PAREN
		{
			mCLOSE_PAREN();
			
		}
			break;
		case 24:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:157:
			// OPEN_SQUARE
		{
			mOPEN_SQUARE();
			
		}
			break;
		case 25:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:169:
			// CLOSE_SQUARE
		{
			mCLOSE_SQUARE();
			
		}
			break;
		case 26:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:182:
			// OPEN_CURLY
		{
			mOPEN_CURLY();
			
		}
			break;
		case 27:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:193:
			// CLOSE_CURLY
		{
			mCLOSE_CURLY();
			
		}
			break;
		case 28:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:205:
			// DOT
		{
			mDOT();
			
		}
			break;
		case 29:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:209:
			// VAR
		{
			mVAR();
			
		}
			break;
		case 30:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:213:
			// NUMBER
		{
			mNUMBER();
			
		}
			break;
		case 31:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:220:
			// ESCAPE_DOUBLE_QUOTE
		{
			mESCAPE_DOUBLE_QUOTE();
			
		}
			break;
		case 32:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:240:
			// ESCAPE_SINGLE_QUOTE
		{
			mESCAPE_SINGLE_QUOTE();
			
		}
			break;
		case 33:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:260:
			// DOUBLE_QUOTE
		{
			mDOUBLE_QUOTE();
			
		}
			break;
		case 34:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:273:
			// SINGLE_QUOTE
		{
			mSINGLE_QUOTE();
			
		}
			break;
		case 35:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:286:
			// IDENTIFIER
		{
			mIDENTIFIER();
			
		}
			break;
		case 36:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:297:
			// WS
		{
			mWS();
			
		}
			break;
		case 37:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:300:
			// COMMENT
		{
			mCOMMENT();
			
		}
			break;
		case 38:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:308:
			// LINE_COMMENT
		{
			mLINE_COMMENT();
			
		}
			break;
		case 39:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:1:321:
			// OTHER
		{
			mOTHER();
			
		}
			break;
		
		}
		
	}
	
	protected DFA7 dfa7 = new DFA7(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA7_eotS = "\6\uffff\1\11\1\13\4\uffff";
	static final String DFA7_eofS = "\14\uffff";
	static final String DFA7_minS = "\1\145\3\uffff\2\164\2\145\4\uffff";
	static final String DFA7_maxS = "\1\156\3\uffff\2\164\2\145\4\uffff";
	static final String DFA7_acceptS = "\1\uffff\1\1\1\2\1\3\4\uffff\1\7\1\4\1\6\1\5";
	static final String DFA7_specialS = "\14\uffff}>";
	static final String[] DFA7_transitionS = { "\1\1\1\uffff\1\4\1\uffff\1\3\2\uffff\1\5\1\uffff\1\2", "", "", "",
			"\1\6", "\1\7", "\1\10", "\1\12", "", "", "", "" };
	
	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;
	
	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}
	
	class DFA7 extends DFA {
		
		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		
		public String getDescription() {
			return "574:2: ( 'eq' | 'neq' | 'is' | 'gt' | 'lt' | 'lte' | 'gte' )";
		}
	}
	
	static final String DFA12_eotS = "\1\uffff\11\56\1\uffff\2\56\3\uffff\1\101\2\uffff\1\56\2\uffff\5"
			+ "\56\12\uffff\1\56\1\uffff\1\127\1\131\3\uffff\2\56\1\uffff\1\135"
			+ "\1\136\1\101\2\56\1\101\4\56\1\147\3\56\1\uffff\2\56\4\uffff\1\56"
			+ "\3\101\2\56\12\uffff\1\56\6\uffff\1\56\1\164\2\uffff\1\101\1\56"
			+ "\1\101\1\166\4\56\1\uffff\1\56\1\174\1\101\2\56\5\101\1\177\1\56"
			+ "\1\uffff\1\u0081\1\uffff\1\56\1\u0083\3\56\1\uffff\2\56\1\uffff"
			+ "\1\56\1\uffff\1\u008a\1\uffff\1\56\1\u008c\2\56\1\u008f\1\56\1\uffff"
			+ "\1\u0091\1\uffff\1\56\1\u0093\1\uffff\1\56\1\uffff\1\u0095\1\uffff" + "\1\u0096\2\uffff";
	static final String DFA12_eofS = "\u0097\uffff";
	static final String DFA12_minS = "\1\0\1\157\1\146\1\154\1\162\1\141\1\145\1\150\2\145\1\uffff\1\167"
			+ "\1\162\3\uffff\1\52\2\uffff\1\157\2\uffff\2\164\1\162\1\156\1\157"
			+ "\12\uffff\1\141\1\uffff\1\42\1\47\3\uffff\1\156\1\162\1\uffff\3"
			+ "\60\1\160\1\163\1\60\1\171\1\163\1\164\1\151\1\60\1\146\1\164\1"
			+ "\161\1\uffff\1\151\1\145\4\uffff\1\144\3\60\1\144\1\162\12\uffff"
			+ "\1\162\6\uffff\1\143\1\60\2\uffff\1\60\1\145\2\60\1\143\1\145\1"
			+ "\165\1\154\1\uffff\1\141\2\60\1\164\1\141\6\60\1\164\1\uffff\1\60"
			+ "\1\uffff\1\150\1\60\1\162\1\145\1\165\1\uffff\1\143\1\153\1\uffff"
			+ "\1\151\1\uffff\1\60\1\uffff\1\156\1\60\1\154\1\150\1\60\1\157\1"
			+ "\uffff\1\60\1\uffff\1\164\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff" + "\1\60\2\uffff";
	static final String DFA12_maxS = "\1\uffff\1\165\1\163\1\161\1\162\1\141\1\145\1\150\2\157\1\uffff"
			+ "\1\167\1\162\3\uffff\1\57\2\uffff\1\157\2\uffff\2\164\1\162\1\156"
			+ "\1\157\12\uffff\1\141\1\uffff\1\42\1\47\3\uffff\1\156\1\162\1\uffff"
			+ "\3\172\1\160\1\163\1\172\1\171\2\164\1\151\1\172\1\146\1\164\1\161"
			+ "\1\uffff\1\151\1\145\4\uffff\1\144\3\172\1\144\1\162\12\uffff\1"
			+ "\162\6\uffff\1\143\1\172\2\uffff\1\172\1\145\2\172\1\143\1\145\1"
			+ "\165\1\154\1\uffff\1\141\2\172\1\164\1\141\6\172\1\164\1\uffff\1"
			+ "\172\1\uffff\1\150\1\172\1\162\1\145\1\165\1\uffff\1\143\1\153\1"
			+ "\uffff\1\151\1\uffff\1\172\1\uffff\1\156\1\172\1\154\1\150\1\172"
			+ "\1\157\1\uffff\1\172\1\uffff\1\164\1\172\1\uffff\1\156\1\uffff\1" + "\172\1\uffff\1\172\2\uffff";
	static final String DFA12_acceptS = "\12\uffff\1\14\2\uffff\1\21\2\22\1\uffff\2\22\1\uffff\2\22\5\uffff"
			+ "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\uffff\1\36"
			+ "\2\uffff\1\43\1\44\1\47\2\uffff\1\43\16\uffff\1\14\2\uffff\1\21"
			+ "\1\22\1\45\1\46\6\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"
			+ "\1\33\1\34\1\uffff\1\36\1\37\1\41\1\40\1\42\1\44\2\uffff\1\2\1\10"
			+ "\10\uffff\1\12\14\uffff\1\7\1\uffff\1\4\5\uffff\1\13\2\uffff\1\35"
			+ "\1\uffff\1\3\1\uffff\1\16\6\uffff\1\5\1\uffff\1\11\2\uffff\1\20"
			+ "\1\uffff\1\6\1\uffff\1\15\1\uffff\1\17\1\1";
	static final String DFA12_specialS = "\1\0\u0096\uffff}>";
	static final String[] DFA12_transitionS = {
			"\11\53\2\52\1\53\2\52\22\53\1\52\1\53\1\47\1\35\2\53\1\25\1"
					+ "\50\1\36\1\37\1\17\1\16\1\33\1\24\1\44\1\20\12\46\1\15\1\34"
					+ "\1\53\1\12\3\53\32\51\1\40\1\21\1\41\1\22\1\51\1\53\1\31\1\14"
					+ "\1\5\1\10\1\3\1\1\1\26\1\51\1\2\2\51\1\27\1\23\1\11\1\30\2\51"
					+ "\1\6\1\13\1\4\1\51\1\45\1\7\1\32\2\51\1\42\1\53\1\43\uff82\53", "\1\55\5\uffff\1\54",
			"\1\57\6\uffff\1\62\1\60\4\uffff\1\61", "\1\63\4\uffff\1\64", "\1\65", "\1\66", "\1\67", "\1\70",
			"\1\72\11\uffff\1\71", "\1\74\11\uffff\1\73", "", "\1\76", "\1\77", "", "", "", "\1\102\4\uffff\1\103", "",
			"", "\1\104", "", "", "\1\105", "\1\106", "\1\107", "\1\110", "\1\111", "", "", "", "", "", "", "", "", "",
			"", "\1\124", "", "\1\126", "\1\130", "", "", "", "\1\133", "\1\134", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\137", "\1\140",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\141\4\56", "\1\142", "\1\144\1\143", "\1\145", "\1\146",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\150", "\1\151", "\1\152", "", "\1\153", "\1\154",
			"", "", "", "", "\1\155", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\156\25\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\157\25\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\160", "\1\161", "", "", "", "", "", "", "", "", "",
			"", "\1\162", "", "", "", "", "", "", "\1\163", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\165",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\167", "\1\170", "\1\171", "\1\172", "", "\1\173", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\175", "\1\176",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0080", "", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "\1\u0082",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u0084", "\1\u0085", "\1\u0086", "", "\1\u0087",
			"\1\u0088", "", "\1\u0089", "", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "\1\u008b",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u008d", "\1\u008e",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u0090", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "\1\u0092",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "\1\u0094", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"", "" };
	
	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;
	
	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}
	
	class DFA12 extends DFA {
		
		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		
		public String getDescription() {
			return "1:1: Tokens : ( FUNCTION | IF | ELSE | TRY | CATCH | RETURN | FOR | IN | WHILE | DO | NOT | EQUALS | SWITCH | CASE | DEFAULT | BREAK | COLON | OPERATOR | COMMA | SEMI_COLON | HASH | OPEN_PAREN | CLOSE_PAREN | OPEN_SQUARE | CLOSE_SQUARE | OPEN_CURLY | CLOSE_CURLY | DOT | VAR | NUMBER | ESCAPE_DOUBLE_QUOTE | ESCAPE_SINGLE_QUOTE | DOUBLE_QUOTE | SINGLE_QUOTE | IDENTIFIER | WS | COMMENT | LINE_COMMENT | OTHER );";
		}
		
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA12_0 = input.LA(1);
				
				s = -1;
				if ((LA12_0 == 'f')) {
					s = 1;
				}

				else if ((LA12_0 == 'i')) {
					s = 2;
				}

				else if ((LA12_0 == 'e')) {
					s = 3;
				}

				else if ((LA12_0 == 't')) {
					s = 4;
				}

				else if ((LA12_0 == 'c')) {
					s = 5;
				}

				else if ((LA12_0 == 'r')) {
					s = 6;
				}

				else if ((LA12_0 == 'w')) {
					s = 7;
				}

				else if ((LA12_0 == 'd')) {
					s = 8;
				}

				else if ((LA12_0 == 'n')) {
					s = 9;
				}

				else if ((LA12_0 == '=')) {
					s = 10;
				}

				else if ((LA12_0 == 's')) {
					s = 11;
				}

				else if ((LA12_0 == 'b')) {
					s = 12;
				}

				else if ((LA12_0 == ':')) {
					s = 13;
				}

				else if ((LA12_0 == '+')) {
					s = 14;
				}

				else if ((LA12_0 == '*')) {
					s = 15;
				}

				else if ((LA12_0 == '/')) {
					s = 16;
				}

				else if ((LA12_0 == '\\')) {
					s = 17;
				}

				else if ((LA12_0 == '^')) {
					s = 18;
				}

				else if ((LA12_0 == 'm')) {
					s = 19;
				}

				else if ((LA12_0 == '-')) {
					s = 20;
				}

				else if ((LA12_0 == '&')) {
					s = 21;
				}

				else if ((LA12_0 == 'g')) {
					s = 22;
				}

				else if ((LA12_0 == 'l')) {
					s = 23;
				}

				else if ((LA12_0 == 'o')) {
					s = 24;
				}

				else if ((LA12_0 == 'a')) {
					s = 25;
				}

				else if ((LA12_0 == 'x')) {
					s = 26;
				}

				else if ((LA12_0 == ',')) {
					s = 27;
				}

				else if ((LA12_0 == ';')) {
					s = 28;
				}

				else if ((LA12_0 == '#')) {
					s = 29;
				}

				else if ((LA12_0 == '(')) {
					s = 30;
				}

				else if ((LA12_0 == ')')) {
					s = 31;
				}

				else if ((LA12_0 == '[')) {
					s = 32;
				}

				else if ((LA12_0 == ']')) {
					s = 33;
				}

				else if ((LA12_0 == '{')) {
					s = 34;
				}

				else if ((LA12_0 == '}')) {
					s = 35;
				}

				else if ((LA12_0 == '.')) {
					s = 36;
				}

				else if ((LA12_0 == 'v')) {
					s = 37;
				}

				else if (((LA12_0 >= '0' && LA12_0 <= '9'))) {
					s = 38;
				}

				else if ((LA12_0 == '\"')) {
					s = 39;
				}

				else if ((LA12_0 == '\'')) {
					s = 40;
				}

				else if (((LA12_0 >= 'A' && LA12_0 <= 'Z') || LA12_0 == '_' || LA12_0 == 'h'
						|| (LA12_0 >= 'j' && LA12_0 <= 'k') || (LA12_0 >= 'p' && LA12_0 <= 'q') || LA12_0 == 'u' || (LA12_0 >= 'y' && LA12_0 <= 'z'))) {
					s = 41;
				}

				else if (((LA12_0 >= '\t' && LA12_0 <= '\n') || (LA12_0 >= '\f' && LA12_0 <= '\r') || LA12_0 == ' ')) {
					s = 42;
				}

				else if (((LA12_0 >= '\u0000' && LA12_0 <= '\b') || LA12_0 == '\u000B'
						|| (LA12_0 >= '\u000E' && LA12_0 <= '\u001F') || LA12_0 == '!'
						|| (LA12_0 >= '$' && LA12_0 <= '%') || LA12_0 == '<' || (LA12_0 >= '>' && LA12_0 <= '@')
						|| LA12_0 == '`' || LA12_0 == '|' || (LA12_0 >= '~' && LA12_0 <= '\uFFFF'))) {
					s = 43;
				}
				
				if (s >= 0)
					return s;
				break;
			}
			NoViableAltException nvae = new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}
	
}