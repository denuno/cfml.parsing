// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g 2010-02-11 02:57:35
package cfml.parsing.cfmentat.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CFMLLexer extends Lexer {
	public static final int MINUS = 71;
	public static final int DecimalDigit = 95;
	public static final int CONCATEQUALS = 82;
	public static final int LEFTPAREN = 90;
	public static final int BOOLEAN_LITERAL = 15;
	public static final int MODEQUALS = 81;
	public static final int PLUSPLUS = 70;
	public static final int PLUSEQUALS = 77;
	public static final int CONTINUE = 51;
	public static final int DOT = 64;
	public static final int EMPTYARGS = 8;
	public static final int TO = 40;
	public static final int AND = 44;
	public static final int FUNCTION = 52;
	public static final int GTE = 28;
	public static final int CONCAT = 74;
	public static final int LEFTBRACKET = 88;
	public static final int STRING_LITERAL = 18;
	public static final int LE = 31;
	public static final int SingleStringCharacter = 17;
	public static final int PLUS = 69;
	public static final int RIGHTPAREN = 91;
	public static final int STAREQUALS = 79;
	public static final int VARLOCAL = 5;
	public static final int INTEGER_LITERAL = 96;
	public static final int POSTMINUSMINUS = 10;
	public static final int DOES = 24;
	public static final int FUNCDECL = 9;
	public static final int POSTPLUSPLUS = 11;
	public static final int OROPERATOR = 86;
	public static final int WS = 12;
	public static final int EQUALSOP = 76;
	public static final int EQ = 32;
	public static final int LT = 30;
	public static final int LINE_COMMENT = 13;
	public static final int FLOATING_POINT_LITERAL = 98;
	public static final int CATCH = 59;
	public static final int CASE = 61;
	public static final int GE = 27;
	public static final int EQUALS = 34;
	public static final int ExponentPart = 97;
	public static final int EQUAL = 33;
	public static final int ELSE = 49;
	public static final int SEMICOLON = 85;
	public static final int JAVAMETHODCALL = 7;
	public static final int BSLASH = 67;
	public static final int BREAK = 50;
	public static final int MODOPERATOR = 73;
	public static final int NULL = 21;
	public static final int XOR = 43;
	public static final int COLON = 83;
	public static final int IDENTIFIER = 94;
	public static final int DoubleStringCharacter = 16;
	public static final int MINUSMINUS = 72;
	public static final int T__100 = 100;
	public static final int ANDOPERATOR = 87;
	public static final int EQV = 42;
	public static final int NOTOP = 84;
	public static final int T__101 = 101;
	public static final int MOD = 46;
	public static final int T__104 = 104;
	public static final int OR = 39;
	public static final int T__106 = 106;
	public static final int LESS = 36;
	public static final int CONTAIN = 23;
	public static final int EQUALSEQUALSOP = 75;
	public static final int CONTAINS = 22;
	public static final int GREATER = 38;
	public static final int DIGIT = 20;
	public static final int ML_COMMENT = 14;
	public static final int NEQ = 35;
	public static final int LETTER = 19;
	public static final int DO = 55;
	public static final int LEFTCURLYBRACKET = 92;
	public static final int SLASH = 66;
	public static final int WHILE = 54;
	public static final int SWITCH = 60;
	public static final int POWER = 68;
	public static final int FUNCTIONCALL = 6;
	public static final int IS = 25;
	public static final int GT = 26;
	public static final int T__99 = 99;
	public static final int DOESNOTCONTAIN = 4;
	public static final int IN = 57;
	public static final int T__103 = 103;
	public static final int LTE = 29;
	public static final int VAR = 47;
	public static final int RIGHTBRACKET = 89;
	public static final int RETURN = 53;
	public static final int THAN = 37;
	public static final int SCRIPTCLOSE = 63;
	public static final int T__105 = 105;
	public static final int IF = 48;
	public static final int SLASHEQUALS = 80;
	public static final int IMP = 41;
	public static final int EOF = -1;
	public static final int FOR = 56;
	public static final int DEFAULT = 62;
	public static final int STAR = 65;
	public static final int TRY = 58;
	public static final int NOT = 45;
	public static final int RIGHTCURLYBRACKET = 93;
	public static final int MINUSEQUALS = 78;
	public static final int T__102 = 102;
	
	public Token nextToken() {
		
		if (state.token != null && state.token.getType() == SCRIPTCLOSE) {
			return Token.EOF_TOKEN;
		}
		
		while (true) {
			state.token = null;
			state.channel = Token.DEFAULT_CHANNEL;
			state.tokenStartCharIndex = input.index();
			state.tokenStartCharPositionInLine = input.getCharPositionInLine();
			state.tokenStartLine = input.getLine();
			state.text = null;
			if (input.LA(1) == CharStream.EOF) {
				return Token.EOF_TOKEN;
			}
			try {
				mTokens();
				if (state.token == null) {
					emit();
				} else if (state.token == Token.SKIP_TOKEN) {
					continue;
				}
				return state.token;
			} catch (RecognitionException re) {
				// reportError(re);
				return Token.EOF_TOKEN;
				// throw new RuntimeException("Bailing out!"); // or throw Error
			}
		}
	}
	
	// delegates
	// delegators
	
	public CFMLLexer() {
		;
	}
	
	public CFMLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	
	public CFMLLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
		
	}
	
	public String getGrammarFileName() {
		return "/Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g";
	}
	
	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:41:7:
			// ( ',' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:41:9:
			// ','
			{
				match(',');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__99"
	
	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:42:8:
			// ( 'DOT' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:42:10:
			// 'DOT'
			{
				match("DOT");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__100"
	
	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:43:8:
			// ( '<' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:43:10:
			// '<'
			{
				match('<');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__101"
	
	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:44:8:
			// ( '<=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:44:10:
			// '<='
			{
				match("<=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__102"
	
	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:45:8:
			// ( '>' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:45:10:
			// '>'
			{
				match('>');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__103"
	
	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:46:8:
			// ( '>=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:46:10:
			// '>='
			{
				match(">=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__104"
	
	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:47:8:
			// ( '!=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:47:10:
			// '!='
			{
				match("!=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__105"
	
	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:48:8:
			// ( '#' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:48:10:
			// '#'
			{
				match('#');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "T__106"
	
	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:113:4:
			// ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:113:6:
			// ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:113:6:
				// ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
				int cnt1 = 0;
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					
					if (((LA1_0 >= '\t' && LA1_0 <= '\n') || (LA1_0 >= '\f' && LA1_0 <= '\r') || LA1_0 == ' ')) {
						alt1 = 1;
					}
					
					switch (alt1) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:
					{
						if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
								|| (input.LA(1) >= '\f' && input.LA(1) <= '\r') || input.LA(1) == ' ') {
							input.consume();
							
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
						
					}
						break;
					
					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1, input);
						throw eee;
					}
					cnt1++;
				} while (true);
				
				_channel = HIDDEN;
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "WS"
	
	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:115:14:
			// ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:116:13:
			// '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
			{
				match("//");
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:117:13:
				// (~ ( '\\n' | '\\r' ) )*
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					
					if (((LA2_0 >= '\u0000' && LA2_0 <= '\t') || (LA2_0 >= '\u000B' && LA2_0 <= '\f') || (LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF'))) {
						alt2 = 1;
					}
					
					switch (alt2) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:117:15:
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
						break loop2;
					}
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:118:13:
				// ( '\\n' | '\\r' ( '\\n' )? )?
				int alt4 = 3;
				int LA4_0 = input.LA(1);
				
				if ((LA4_0 == '\n')) {
					alt4 = 1;
				} else if ((LA4_0 == '\r')) {
					alt4 = 2;
				}
				switch (alt4) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:118:15:
					// '\\n'
				{
					match('\n');
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:118:20:
					// '\\r' ( '\\n' )?
				{
					match('\r');
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:118:24:
					// ( '\\n' )?
					int alt3 = 2;
					int LA3_0 = input.LA(1);
					
					if ((LA3_0 == '\n')) {
						alt3 = 1;
					}
					switch (alt3) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:118:25:
						// '\\n'
					{
						match('\n');
						
					}
						break;
					
					}
					
				}
					break;
				
				}
				
				_channel = HIDDEN;
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LINE_COMMENT"
	
	// $ANTLR start "ML_COMMENT"
	public final void mML_COMMENT() throws RecognitionException {
		try {
			int _type = ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:122:5:
			// ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:122:9:
			// '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:122:14:
				// ( options {greedy=false; } : . )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);
					
					if ((LA5_0 == '*')) {
						int LA5_1 = input.LA(2);
						
						if ((LA5_1 == '/')) {
							alt5 = 2;
						} else if (((LA5_1 >= '\u0000' && LA5_1 <= '.') || (LA5_1 >= '0' && LA5_1 <= '\uFFFF'))) {
							alt5 = 1;
						}
						
					} else if (((LA5_0 >= '\u0000' && LA5_0 <= ')') || (LA5_0 >= '+' && LA5_0 <= '\uFFFF'))) {
						alt5 = 1;
					}
					
					switch (alt5) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:122:41:
						// .
					{
						matchAny();
						
					}
						break;
					
					default:
						break loop5;
					}
				} while (true);
				
				match("*/");
				
				_channel = HIDDEN;
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "ML_COMMENT"
	
	// $ANTLR start "BOOLEAN_LITERAL"
	public final void mBOOLEAN_LITERAL() throws RecognitionException {
		try {
			int _type = BOOLEAN_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:126:2:
			// ( 'TRUE' | 'FALSE' )
			int alt6 = 2;
			int LA6_0 = input.LA(1);
			
			if ((LA6_0 == 'T')) {
				alt6 = 1;
			} else if ((LA6_0 == 'F')) {
				alt6 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 6, 0, input);
				
				throw nvae;
			}
			switch (alt6) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:126:4:
				// 'TRUE'
			{
				match("TRUE");
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:127:4:
				// 'FALSE'
			{
				match("FALSE");
				
			}
				break;
			
			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "BOOLEAN_LITERAL"
	
	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:131:2:
			// ( '\"' ( DoubleStringCharacter )* '\"' | '\\'' (
			// SingleStringCharacter )* '\\'' )
			int alt9 = 2;
			int LA9_0 = input.LA(1);
			
			if ((LA9_0 == '\"')) {
				alt9 = 1;
			} else if ((LA9_0 == '\'')) {
				alt9 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 9, 0, input);
				
				throw nvae;
			}
			switch (alt9) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:131:4:
				// '\"' ( DoubleStringCharacter )* '\"'
			{
				match('\"');
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:131:8:
				// ( DoubleStringCharacter )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);
					
					if ((LA7_0 == '\"')) {
						int LA7_1 = input.LA(2);
						
						if ((LA7_1 == '\"')) {
							alt7 = 1;
						}
						
					} else if (((LA7_0 >= '\u0000' && LA7_0 <= '!') || (LA7_0 >= '#' && LA7_0 <= '\uFFFF'))) {
						alt7 = 1;
					}
					
					switch (alt7) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:131:8:
						// DoubleStringCharacter
					{
						mDoubleStringCharacter();
						
					}
						break;
					
					default:
						break loop7;
					}
				} while (true);
				
				match('\"');
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:132:4:
				// '\\'' ( SingleStringCharacter )* '\\''
			{
				match('\'');
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:132:9:
				// ( SingleStringCharacter )*
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);
					
					if ((LA8_0 == '\'')) {
						int LA8_1 = input.LA(2);
						
						if ((LA8_1 == '\'')) {
							alt8 = 1;
						}
						
					} else if (((LA8_0 >= '\u0000' && LA8_0 <= '&') || (LA8_0 >= '(' && LA8_0 <= '\uFFFF'))) {
						alt8 = 1;
					}
					
					switch (alt8) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:132:9:
						// SingleStringCharacter
					{
						mSingleStringCharacter();
						
					}
						break;
					
					default:
						break loop8;
					}
				} while (true);
				
				match('\'');
				
			}
				break;
			
			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "STRING_LITERAL"
	
	// $ANTLR start "DoubleStringCharacter"
	public final void mDoubleStringCharacter() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:136:2:
			// (~ ( '\"' ) | '\"\"' )
			int alt10 = 2;
			int LA10_0 = input.LA(1);
			
			if (((LA10_0 >= '\u0000' && LA10_0 <= '!') || (LA10_0 >= '#' && LA10_0 <= '\uFFFF'))) {
				alt10 = 1;
			} else if ((LA10_0 == '\"')) {
				alt10 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 10, 0, input);
				
				throw nvae;
			}
			switch (alt10) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:136:4:
				// ~ ( '\"' )
			{
				if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '\uFFFF')) {
					input.consume();
					
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:137:4:
				// '\"\"'
			{
				match("\"\"");
				
			}
				break;
			
			}
		} finally {
		}
	}
	
	// $ANTLR end "DoubleStringCharacter"
	
	// $ANTLR start "SingleStringCharacter"
	public final void mSingleStringCharacter() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:141:2:
			// (~ ( '\\'' ) | '\\'\\'' )
			int alt11 = 2;
			int LA11_0 = input.LA(1);
			
			if (((LA11_0 >= '\u0000' && LA11_0 <= '&') || (LA11_0 >= '(' && LA11_0 <= '\uFFFF'))) {
				alt11 = 1;
			} else if ((LA11_0 == '\'')) {
				alt11 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 11, 0, input);
				
				throw nvae;
			}
			switch (alt11) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:141:4:
				// ~ ( '\\'' )
			{
				if ((input.LA(1) >= '\u0000' && input.LA(1) <= '&') || (input.LA(1) >= '(' && input.LA(1) <= '\uFFFF')) {
					input.consume();
					
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:142:4:
				// '\\'\\''
			{
				match("''");
				
			}
				break;
			
			}
		} finally {
		}
	}
	
	// $ANTLR end "SingleStringCharacter"
	
	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:146:2:
			// ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' ..
			// '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' |
			// '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' ..
			// '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' |
			// '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:
			{
				if (input.LA(1) == '$' || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')
						|| (input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')
						|| (input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')
						|| (input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')
						|| (input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')
						|| (input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')
						|| (input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')
						|| (input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')
						|| (input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF')) {
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
	
	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:162:2:
			// ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' ..
			// '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' |
			// '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' ..
			// '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' |
			// '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' ..
			// '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:
			{
				if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')
						|| (input.LA(1) >= '\u06F0' && input.LA(1) <= '\u06F9')
						|| (input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')
						|| (input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09EF')
						|| (input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A6F')
						|| (input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')
						|| (input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')
						|| (input.LA(1) >= '\u0BE7' && input.LA(1) <= '\u0BEF')
						|| (input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')
						|| (input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')
						|| (input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')
						|| (input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')
						|| (input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')
						|| (input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049')) {
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
	
	// $ANTLR end "DIGIT"
	
	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:180:5:
			// ( 'NULL' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:180:7:
			// 'NULL'
			{
				match("NULL");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "NULL"
	
	// $ANTLR start "CONTAINS"
	public final void mCONTAINS() throws RecognitionException {
		try {
			int _type = CONTAINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:183:9:
			// ( 'CONTAINS' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:183:11:
			// 'CONTAINS'
			{
				match("CONTAINS");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CONTAINS"
	
	// $ANTLR start "CONTAIN"
	public final void mCONTAIN() throws RecognitionException {
		try {
			int _type = CONTAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:184:8:
			// ( 'CONTAIN' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:184:10:
			// 'CONTAIN'
			{
				match("CONTAIN");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CONTAIN"
	
	// $ANTLR start "DOES"
	public final void mDOES() throws RecognitionException {
		try {
			int _type = DOES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:185:5:
			// ( 'DOES' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:185:7:
			// 'DOES'
			{
				match("DOES");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "DOES"
	
	// $ANTLR start "IS"
	public final void mIS() throws RecognitionException {
		try {
			int _type = IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:186:3:
			// ( 'IS' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:186:5:
			// 'IS'
			{
				match("IS");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "IS"
	
	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:187:3:
			// ( 'GT' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:187:5:
			// 'GT'
			{
				match("GT");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "GT"
	
	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:188:3:
			// ( 'GE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:188:5:
			// 'GE'
			{
				match("GE");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "GE"
	
	// $ANTLR start "GTE"
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:189:4:
			// ( 'GTE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:189:6:
			// 'GTE'
			{
				match("GTE");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "GTE"
	
	// $ANTLR start "LTE"
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:190:4:
			// ( 'LTE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:190:6:
			// 'LTE'
			{
				match("LTE");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LTE"
	
	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:191:3:
			// ( 'LT' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:191:5:
			// 'LT'
			{
				match("LT");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LT"
	
	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:192:3:
			// ( 'LE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:192:5:
			// 'LE'
			{
				match("LE");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LE"
	
	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:193:3:
			// ( 'EQ' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:193:5:
			// 'EQ'
			{
				match("EQ");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "EQ"
	
	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:194:6:
			// ( 'EQUAL' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:194:8:
			// 'EQUAL'
			{
				match("EQUAL");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "EQUAL"
	
	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:195:7:
			// ( 'EQUALS' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:195:9:
			// 'EQUALS'
			{
				match("EQUALS");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "EQUALS"
	
	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:196:4:
			// ( 'NEQ' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:196:6:
			// 'NEQ'
			{
				match("NEQ");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "NEQ"
	
	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:197:5:
			// ( 'LESS' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:197:7:
			// 'LESS'
			{
				match("LESS");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LESS"
	
	// $ANTLR start "THAN"
	public final void mTHAN() throws RecognitionException {
		try {
			int _type = THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:198:5:
			// ( 'THAN' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:198:7:
			// 'THAN'
			{
				match("THAN");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "THAN"
	
	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:199:8:
			// ( 'GREATER' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:199:10:
			// 'GREATER'
			{
				match("GREATER");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "GREATER"
	
	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:200:3:
			// ( 'OR' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:200:5:
			// 'OR'
			{
				match("OR");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "OR"
	
	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:201:3:
			// ( 'TO' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:201:5:
			// 'TO'
			{
				match("TO");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "TO"
	
	// $ANTLR start "IMP"
	public final void mIMP() throws RecognitionException {
		try {
			int _type = IMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:202:4:
			// ( 'IMP' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:202:6:
			// 'IMP'
			{
				match("IMP");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "IMP"
	
	// $ANTLR start "EQV"
	public final void mEQV() throws RecognitionException {
		try {
			int _type = EQV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:203:4:
			// ( 'EQV' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:203:6:
			// 'EQV'
			{
				match("EQV");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "EQV"
	
	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:204:4:
			// ( 'XOR' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:204:6:
			// 'XOR'
			{
				match("XOR");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "XOR"
	
	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:205:4:
			// ( 'AND' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:205:6:
			// 'AND'
			{
				match("AND");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "AND"
	
	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:206:4:
			// ( 'NOT' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:206:6:
			// 'NOT'
			{
				match("NOT");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "NOT"
	
	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:207:4:
			// ( 'MOD' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:207:6:
			// 'MOD'
			{
				match("MOD");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "MOD"
	
	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:208:4:
			// ( 'VAR' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:208:6:
			// 'VAR'
			{
				match("VAR");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "VAR"
	
	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:211:3:
			// ( 'IF' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:211:5:
			// 'IF'
			{
				match("IF");
				
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
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:212:5:
			// ( 'ELSE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:212:7:
			// 'ELSE'
			{
				match("ELSE");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "ELSE"
	
	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:213:6:
			// ( 'BREAK' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:213:8:
			// 'BREAK'
			{
				match("BREAK");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "BREAK"
	
	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:214:9:
			// ( 'CONTINUE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:214:11:
			// 'CONTINUE'
			{
				match("CONTINUE");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CONTINUE"
	
	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:215:9:
			// ( 'FUNCTION' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:215:11:
			// 'FUNCTION'
			{
				match("FUNCTION");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "FUNCTION"
	
	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:216:7:
			// ( 'RETURN' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:216:9:
			// 'RETURN'
			{
				match("RETURN");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "RETURN"
	
	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:217:6:
			// ( 'WHILE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:217:8:
			// 'WHILE'
			{
				match("WHILE");
				
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
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:218:3:
			// ( 'DO' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:218:5:
			// 'DO'
			{
				match("DO");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "DO"
	
	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:219:4:
			// ( 'FOR' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:219:6:
			// 'FOR'
			{
				match("FOR");
				
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
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:220:3:
			// ( 'IN' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:220:5:
			// 'IN'
			{
				match("IN");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "IN"
	
	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:221:4:
			// ( 'TRY' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:221:6:
			// 'TRY'
			{
				match("TRY");
				
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
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:222:6:
			// ( 'CATCH' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:222:8:
			// 'CATCH'
			{
				match("CATCH");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CATCH"
	
	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:223:7:
			// ( 'SWITCH' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:223:9:
			// 'SWITCH'
			{
				match("SWITCH");
				
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
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:224:5:
			// ( 'CASE' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:224:7:
			// 'CASE'
			{
				match("CASE");
				
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
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:225:8:
			// ( 'DEFAULT' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:225:10:
			// 'DEFAULT'
			{
				match("DEFAULT");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "DEFAULT"
	
	// $ANTLR start "SCRIPTCLOSE"
	public final void mSCRIPTCLOSE() throws RecognitionException {
		try {
			int _type = SCRIPTCLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:227:12:
			// ( '</CFSCRIPT>' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:227:14:
			// '</CFSCRIPT>'
			{
				match("</CFSCRIPT>");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "SCRIPTCLOSE"
	
	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:230:4:
			// ( '.' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:230:6:
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
	
	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:231:5:
			// ( '*' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:231:7:
			// '*'
			{
				match('*');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "STAR"
	
	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:232:6:
			// ( '/' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:232:8:
			// '/'
			{
				match('/');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "SLASH"
	
	// $ANTLR start "BSLASH"
	public final void mBSLASH() throws RecognitionException {
		try {
			int _type = BSLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:233:7:
			// ( '\\\\' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:233:9:
			// '\\\\'
			{
				match('\\');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "BSLASH"
	
	// $ANTLR start "POWER"
	public final void mPOWER() throws RecognitionException {
		try {
			int _type = POWER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:234:6:
			// ( '^' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:234:8:
			// '^'
			{
				match('^');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "POWER"
	
	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:235:5:
			// ( '+' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:235:7:
			// '+'
			{
				match('+');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "PLUS"
	
	// $ANTLR start "PLUSPLUS"
	public final void mPLUSPLUS() throws RecognitionException {
		try {
			int _type = PLUSPLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:236:9:
			// ( '++' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:236:11:
			// '++'
			{
				match("++");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "PLUSPLUS"
	
	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:237:6:
			// ( '-' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:237:8:
			// '-'
			{
				match('-');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "MINUS"
	
	// $ANTLR start "MINUSMINUS"
	public final void mMINUSMINUS() throws RecognitionException {
		try {
			int _type = MINUSMINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:238:11:
			// ( '--' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:238:13:
			// '--'
			{
				match("--");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "MINUSMINUS"
	
	// $ANTLR start "MODOPERATOR"
	public final void mMODOPERATOR() throws RecognitionException {
		try {
			int _type = MODOPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:239:12:
			// ( '%' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:239:14:
			// '%'
			{
				match('%');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "MODOPERATOR"
	
	// $ANTLR start "CONCAT"
	public final void mCONCAT() throws RecognitionException {
		try {
			int _type = CONCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:240:7:
			// ( '&' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:240:9:
			// '&'
			{
				match('&');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CONCAT"
	
	// $ANTLR start "EQUALSEQUALSOP"
	public final void mEQUALSEQUALSOP() throws RecognitionException {
		try {
			int _type = EQUALSEQUALSOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:241:15:
			// ( '==' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:241:17:
			// '=='
			{
				match("==");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "EQUALSEQUALSOP"
	
	// $ANTLR start "EQUALSOP"
	public final void mEQUALSOP() throws RecognitionException {
		try {
			int _type = EQUALSOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:242:9:
			// ( '=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:242:11:
			// '='
			{
				match('=');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "EQUALSOP"
	
	// $ANTLR start "PLUSEQUALS"
	public final void mPLUSEQUALS() throws RecognitionException {
		try {
			int _type = PLUSEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:243:11:
			// ( '+=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:243:13:
			// '+='
			{
				match("+=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "PLUSEQUALS"
	
	// $ANTLR start "MINUSEQUALS"
	public final void mMINUSEQUALS() throws RecognitionException {
		try {
			int _type = MINUSEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:244:12:
			// ( '-=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:244:14:
			// '-='
			{
				match("-=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "MINUSEQUALS"
	
	// $ANTLR start "STAREQUALS"
	public final void mSTAREQUALS() throws RecognitionException {
		try {
			int _type = STAREQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:245:11:
			// ( '*=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:245:13:
			// '*='
			{
				match("*=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "STAREQUALS"
	
	// $ANTLR start "SLASHEQUALS"
	public final void mSLASHEQUALS() throws RecognitionException {
		try {
			int _type = SLASHEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:246:12:
			// ( '/=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:246:14:
			// '/='
			{
				match("/=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "SLASHEQUALS"
	
	// $ANTLR start "MODEQUALS"
	public final void mMODEQUALS() throws RecognitionException {
		try {
			int _type = MODEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:247:10:
			// ( '%=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:247:12:
			// '%='
			{
				match("%=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "MODEQUALS"
	
	// $ANTLR start "CONCATEQUALS"
	public final void mCONCATEQUALS() throws RecognitionException {
		try {
			int _type = CONCATEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:248:13:
			// ( '&=' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:248:15:
			// '&='
			{
				match("&=");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "CONCATEQUALS"
	
	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:249:6:
			// ( ':' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:249:8:
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
	
	// $ANTLR start "NOTOP"
	public final void mNOTOP() throws RecognitionException {
		try {
			int _type = NOTOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:250:6:
			// ( '!' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:250:8:
			// '!'
			{
				match('!');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "NOTOP"
	
	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:251:10:
			// ( ';' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:251:12:
			// ';'
			{
				match(';');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "SEMICOLON"
	
	// $ANTLR start "OROPERATOR"
	public final void mOROPERATOR() throws RecognitionException {
		try {
			int _type = OROPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:252:11:
			// ( '||' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:252:13:
			// '||'
			{
				match("||");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "OROPERATOR"
	
	// $ANTLR start "ANDOPERATOR"
	public final void mANDOPERATOR() throws RecognitionException {
		try {
			int _type = ANDOPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:253:12:
			// ( '&&' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:253:14:
			// '&&'
			{
				match("&&");
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "ANDOPERATOR"
	
	// $ANTLR start "LEFTBRACKET"
	public final void mLEFTBRACKET() throws RecognitionException {
		try {
			int _type = LEFTBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:254:12:
			// ( '[' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:254:14:
			// '['
			{
				match('[');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LEFTBRACKET"
	
	// $ANTLR start "RIGHTBRACKET"
	public final void mRIGHTBRACKET() throws RecognitionException {
		try {
			int _type = RIGHTBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:255:13:
			// ( ']' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:255:15:
			// ']'
			{
				match(']');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "RIGHTBRACKET"
	
	// $ANTLR start "LEFTPAREN"
	public final void mLEFTPAREN() throws RecognitionException {
		try {
			int _type = LEFTPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:256:10:
			// ( '(' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:256:12:
			// '('
			{
				match('(');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LEFTPAREN"
	
	// $ANTLR start "RIGHTPAREN"
	public final void mRIGHTPAREN() throws RecognitionException {
		try {
			int _type = RIGHTPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:257:11:
			// ( ')' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:257:13:
			// ')'
			{
				match(')');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "RIGHTPAREN"
	
	// $ANTLR start "LEFTCURLYBRACKET"
	public final void mLEFTCURLYBRACKET() throws RecognitionException {
		try {
			int _type = LEFTCURLYBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:258:17:
			// ( '{' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:258:19:
			// '{'
			{
				match('{');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "LEFTCURLYBRACKET"
	
	// $ANTLR start "RIGHTCURLYBRACKET"
	public final void mRIGHTCURLYBRACKET() throws RecognitionException {
		try {
			int _type = RIGHTCURLYBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:259:18:
			// ( '}' )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:259:20:
			// '}'
			{
				match('}');
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "RIGHTCURLYBRACKET"
	
	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:262:2:
			// ( LETTER ( LETTER | DIGIT )* )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:262:4:
			// LETTER ( LETTER | DIGIT )*
			{
				mLETTER();
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:262:11:
				// ( LETTER | DIGIT )*
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);
					
					if ((LA12_0 == '$' || (LA12_0 >= '0' && LA12_0 <= '9') || (LA12_0 >= 'A' && LA12_0 <= 'Z')
							|| LA12_0 == '_' || (LA12_0 >= 'a' && LA12_0 <= 'z')
							|| (LA12_0 >= '\u00C0' && LA12_0 <= '\u00D6') || (LA12_0 >= '\u00D8' && LA12_0 <= '\u00F6')
							|| (LA12_0 >= '\u00F8' && LA12_0 <= '\u1FFF') || (LA12_0 >= '\u3040' && LA12_0 <= '\u318F')
							|| (LA12_0 >= '\u3300' && LA12_0 <= '\u337F') || (LA12_0 >= '\u3400' && LA12_0 <= '\u3D2D')
							|| (LA12_0 >= '\u4E00' && LA12_0 <= '\u9FFF') || (LA12_0 >= '\uF900' && LA12_0 <= '\uFAFF'))) {
						alt12 = 1;
					}
					
					switch (alt12) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:
					{
						if (input.LA(1) == '$' || (input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')
								|| (input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')
								|| (input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')
								|| (input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')
								|| (input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')
								|| (input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')
								|| (input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')
								|| (input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')
								|| (input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF')) {
							input.consume();
							
						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}
						
					}
						break;
					
					default:
						break loop12;
					}
				} while (true);
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "IDENTIFIER"
	
	// $ANTLR start "INTEGER_LITERAL"
	public final void mINTEGER_LITERAL() throws RecognitionException {
		try {
			int _type = INTEGER_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:266:3:
			// ( ( DecimalDigit )+ )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:266:5:
			// ( DecimalDigit )+
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:266:5:
				// ( DecimalDigit )+
				int cnt13 = 0;
				loop13: do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);
					
					if (((LA13_0 >= '0' && LA13_0 <= '9'))) {
						alt13 = 1;
					}
					
					switch (alt13) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:266:5:
						// DecimalDigit
					{
						mDecimalDigit();
						
					}
						break;
					
					default:
						if (cnt13 >= 1)
							break loop13;
						EarlyExitException eee = new EarlyExitException(13, input);
						throw eee;
					}
					cnt13++;
				} while (true);
				
			}
			
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "INTEGER_LITERAL"
	
	// $ANTLR start "DecimalDigit"
	public final void mDecimalDigit() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:270:3:
			// ( ( '0' .. '9' ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:270:5:
			// ( '0' .. '9' )
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:270:5:
				// ( '0' .. '9' )
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:270:6:
				// '0' .. '9'
				{
					matchRange('0', '9');
					
				}
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "DecimalDigit"
	
	// $ANTLR start "FLOATING_POINT_LITERAL"
	public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
		try {
			int _type = FLOATING_POINT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:3:
			// ( ( DecimalDigit )+ '.' ( DecimalDigit )* ( ExponentPart )? | '.'
			// ( DecimalDigit )+ ( ExponentPart )? | ( DecimalDigit )+ (
			// ExponentPart )? )
			int alt21 = 3;
			alt21 = dfa21.predict(input);
			switch (alt21) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:5:
				// ( DecimalDigit )+ '.' ( DecimalDigit )* ( ExponentPart )?
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:5:
				// ( DecimalDigit )+
				int cnt14 = 0;
				loop14: do {
					int alt14 = 2;
					int LA14_0 = input.LA(1);
					
					if (((LA14_0 >= '0' && LA14_0 <= '9'))) {
						alt14 = 1;
					}
					
					switch (alt14) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:5:
						// DecimalDigit
					{
						mDecimalDigit();
						
					}
						break;
					
					default:
						if (cnt14 >= 1)
							break loop14;
						EarlyExitException eee = new EarlyExitException(14, input);
						throw eee;
					}
					cnt14++;
				} while (true);
				
				match('.');
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:23:
				// ( DecimalDigit )*
				loop15: do {
					int alt15 = 2;
					int LA15_0 = input.LA(1);
					
					if (((LA15_0 >= '0' && LA15_0 <= '9'))) {
						alt15 = 1;
					}
					
					switch (alt15) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:23:
						// DecimalDigit
					{
						mDecimalDigit();
						
					}
						break;
					
					default:
						break loop15;
					}
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:37:
				// ( ExponentPart )?
				int alt16 = 2;
				int LA16_0 = input.LA(1);
				
				if ((LA16_0 == 'E' || LA16_0 == 'e')) {
					alt16 = 1;
				}
				switch (alt16) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:274:37:
					// ExponentPart
				{
					mExponentPart();
					
				}
					break;
				
				}
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:275:5:
				// '.' ( DecimalDigit )+ ( ExponentPart )?
			{
				match('.');
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:275:9:
				// ( DecimalDigit )+
				int cnt17 = 0;
				loop17: do {
					int alt17 = 2;
					int LA17_0 = input.LA(1);
					
					if (((LA17_0 >= '0' && LA17_0 <= '9'))) {
						alt17 = 1;
					}
					
					switch (alt17) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:275:9:
						// DecimalDigit
					{
						mDecimalDigit();
						
					}
						break;
					
					default:
						if (cnt17 >= 1)
							break loop17;
						EarlyExitException eee = new EarlyExitException(17, input);
						throw eee;
					}
					cnt17++;
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:275:23:
				// ( ExponentPart )?
				int alt18 = 2;
				int LA18_0 = input.LA(1);
				
				if ((LA18_0 == 'E' || LA18_0 == 'e')) {
					alt18 = 1;
				}
				switch (alt18) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:275:23:
					// ExponentPart
				{
					mExponentPart();
					
				}
					break;
				
				}
				
			}
				break;
			case 3:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:276:5:
				// ( DecimalDigit )+ ( ExponentPart )?
			{
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:276:5:
				// ( DecimalDigit )+
				int cnt19 = 0;
				loop19: do {
					int alt19 = 2;
					int LA19_0 = input.LA(1);
					
					if (((LA19_0 >= '0' && LA19_0 <= '9'))) {
						alt19 = 1;
					}
					
					switch (alt19) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:276:5:
						// DecimalDigit
					{
						mDecimalDigit();
						
					}
						break;
					
					default:
						if (cnt19 >= 1)
							break loop19;
						EarlyExitException eee = new EarlyExitException(19, input);
						throw eee;
					}
					cnt19++;
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:276:19:
				// ( ExponentPart )?
				int alt20 = 2;
				int LA20_0 = input.LA(1);
				
				if ((LA20_0 == 'E' || LA20_0 == 'e')) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:276:19:
					// ExponentPart
				{
					mExponentPart();
					
				}
					break;
				
				}
				
			}
				break;
			
			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}
	
	// $ANTLR end "FLOATING_POINT_LITERAL"
	
	// $ANTLR start "ExponentPart"
	public final void mExponentPart() throws RecognitionException {
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:280:3:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+ )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:280:5:
			// ( 'e' | 'E' ) ( '+' | '-' )? ( DecimalDigit )+
			{
				if (input.LA(1) == 'E' || input.LA(1) == 'e') {
					input.consume();
					
				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:280:15:
				// ( '+' | '-' )?
				int alt22 = 2;
				int LA22_0 = input.LA(1);
				
				if ((LA22_0 == '+' || LA22_0 == '-')) {
					alt22 = 1;
				}
				switch (alt22) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:
				{
					if (input.LA(1) == '+' || input.LA(1) == '-') {
						input.consume();
						
					} else {
						MismatchedSetException mse = new MismatchedSetException(null, input);
						recover(mse);
						throw mse;
					}
					
				}
					break;
				
				}
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:280:26:
				// ( DecimalDigit )+
				int cnt23 = 0;
				loop23: do {
					int alt23 = 2;
					int LA23_0 = input.LA(1);
					
					if (((LA23_0 >= '0' && LA23_0 <= '9'))) {
						alt23 = 1;
					}
					
					switch (alt23) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:280:26:
						// DecimalDigit
					{
						mDecimalDigit();
						
					}
						break;
					
					default:
						if (cnt23 >= 1)
							break loop23;
						EarlyExitException eee = new EarlyExitException(23, input);
						throw eee;
					}
					cnt23++;
				} while (true);
				
			}
			
		} finally {
		}
	}
	
	// $ANTLR end "ExponentPart"
	
	public void mTokens() throws RecognitionException {
		// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:8:
		// ( T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 |
		// T__106 | WS | LINE_COMMENT | ML_COMMENT | BOOLEAN_LITERAL |
		// STRING_LITERAL | NULL | CONTAINS | CONTAIN | DOES | IS | GT | GE |
		// GTE | LTE | LT | LE | EQ | EQUAL | EQUALS | NEQ | LESS | THAN |
		// GREATER | OR | TO | IMP | EQV | XOR | AND | NOT | MOD | VAR | IF |
		// ELSE | BREAK | CONTINUE | FUNCTION | RETURN | WHILE | DO | FOR | IN |
		// TRY | CATCH | SWITCH | CASE | DEFAULT | SCRIPTCLOSE | DOT | STAR |
		// SLASH | BSLASH | POWER | PLUS | PLUSPLUS | MINUS | MINUSMINUS |
		// MODOPERATOR | CONCAT | EQUALSEQUALSOP | EQUALSOP | PLUSEQUALS |
		// MINUSEQUALS | STAREQUALS | SLASHEQUALS | MODEQUALS | CONCATEQUALS |
		// COLON | NOTOP | SEMICOLON | OROPERATOR | ANDOPERATOR | LEFTBRACKET |
		// RIGHTBRACKET | LEFTPAREN | RIGHTPAREN | LEFTCURLYBRACKET |
		// RIGHTCURLYBRACKET | IDENTIFIER | INTEGER_LITERAL |
		// FLOATING_POINT_LITERAL )
		int alt24 = 89;
		alt24 = dfa24.predict(input);
		switch (alt24) {
		case 1:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:10:
			// T__99
		{
			mT__99();
			
		}
			break;
		case 2:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:16:
			// T__100
		{
			mT__100();
			
		}
			break;
		case 3:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:23:
			// T__101
		{
			mT__101();
			
		}
			break;
		case 4:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:30:
			// T__102
		{
			mT__102();
			
		}
			break;
		case 5:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:37:
			// T__103
		{
			mT__103();
			
		}
			break;
		case 6:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:44:
			// T__104
		{
			mT__104();
			
		}
			break;
		case 7:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:51:
			// T__105
		{
			mT__105();
			
		}
			break;
		case 8:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:58:
			// T__106
		{
			mT__106();
			
		}
			break;
		case 9:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:65:
			// WS
		{
			mWS();
			
		}
			break;
		case 10:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:68:
			// LINE_COMMENT
		{
			mLINE_COMMENT();
			
		}
			break;
		case 11:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:81:
			// ML_COMMENT
		{
			mML_COMMENT();
			
		}
			break;
		case 12:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:92:
			// BOOLEAN_LITERAL
		{
			mBOOLEAN_LITERAL();
			
		}
			break;
		case 13:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:108:
			// STRING_LITERAL
		{
			mSTRING_LITERAL();
			
		}
			break;
		case 14:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:123:
			// NULL
		{
			mNULL();
			
		}
			break;
		case 15:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:128:
			// CONTAINS
		{
			mCONTAINS();
			
		}
			break;
		case 16:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:137:
			// CONTAIN
		{
			mCONTAIN();
			
		}
			break;
		case 17:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:145:
			// DOES
		{
			mDOES();
			
		}
			break;
		case 18:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:150:
			// IS
		{
			mIS();
			
		}
			break;
		case 19:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:153:
			// GT
		{
			mGT();
			
		}
			break;
		case 20:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:156:
			// GE
		{
			mGE();
			
		}
			break;
		case 21:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:159:
			// GTE
		{
			mGTE();
			
		}
			break;
		case 22:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:163:
			// LTE
		{
			mLTE();
			
		}
			break;
		case 23:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:167:
			// LT
		{
			mLT();
			
		}
			break;
		case 24:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:170:
			// LE
		{
			mLE();
			
		}
			break;
		case 25:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:173:
			// EQ
		{
			mEQ();
			
		}
			break;
		case 26:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:176:
			// EQUAL
		{
			mEQUAL();
			
		}
			break;
		case 27:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:182:
			// EQUALS
		{
			mEQUALS();
			
		}
			break;
		case 28:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:189:
			// NEQ
		{
			mNEQ();
			
		}
			break;
		case 29:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:193:
			// LESS
		{
			mLESS();
			
		}
			break;
		case 30:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:198:
			// THAN
		{
			mTHAN();
			
		}
			break;
		case 31:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:203:
			// GREATER
		{
			mGREATER();
			
		}
			break;
		case 32:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:211:
			// OR
		{
			mOR();
			
		}
			break;
		case 33:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:214:
			// TO
		{
			mTO();
			
		}
			break;
		case 34:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:217:
			// IMP
		{
			mIMP();
			
		}
			break;
		case 35:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:221:
			// EQV
		{
			mEQV();
			
		}
			break;
		case 36:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:225:
			// XOR
		{
			mXOR();
			
		}
			break;
		case 37:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:229:
			// AND
		{
			mAND();
			
		}
			break;
		case 38:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:233:
			// NOT
		{
			mNOT();
			
		}
			break;
		case 39:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:237:
			// MOD
		{
			mMOD();
			
		}
			break;
		case 40:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:241:
			// VAR
		{
			mVAR();
			
		}
			break;
		case 41:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:245:
			// IF
		{
			mIF();
			
		}
			break;
		case 42:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:248:
			// ELSE
		{
			mELSE();
			
		}
			break;
		case 43:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:253:
			// BREAK
		{
			mBREAK();
			
		}
			break;
		case 44:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:259:
			// CONTINUE
		{
			mCONTINUE();
			
		}
			break;
		case 45:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:268:
			// FUNCTION
		{
			mFUNCTION();
			
		}
			break;
		case 46:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:277:
			// RETURN
		{
			mRETURN();
			
		}
			break;
		case 47:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:284:
			// WHILE
		{
			mWHILE();
			
		}
			break;
		case 48:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:290:
			// DO
		{
			mDO();
			
		}
			break;
		case 49:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:293:
			// FOR
		{
			mFOR();
			
		}
			break;
		case 50:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:297:
			// IN
		{
			mIN();
			
		}
			break;
		case 51:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:300:
			// TRY
		{
			mTRY();
			
		}
			break;
		case 52:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:304:
			// CATCH
		{
			mCATCH();
			
		}
			break;
		case 53:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:310:
			// SWITCH
		{
			mSWITCH();
			
		}
			break;
		case 54:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:317:
			// CASE
		{
			mCASE();
			
		}
			break;
		case 55:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:322:
			// DEFAULT
		{
			mDEFAULT();
			
		}
			break;
		case 56:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:330:
			// SCRIPTCLOSE
		{
			mSCRIPTCLOSE();
			
		}
			break;
		case 57:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:342:
			// DOT
		{
			mDOT();
			
		}
			break;
		case 58:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:346:
			// STAR
		{
			mSTAR();
			
		}
			break;
		case 59:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:351:
			// SLASH
		{
			mSLASH();
			
		}
			break;
		case 60:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:357:
			// BSLASH
		{
			mBSLASH();
			
		}
			break;
		case 61:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:364:
			// POWER
		{
			mPOWER();
			
		}
			break;
		case 62:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:370:
			// PLUS
		{
			mPLUS();
			
		}
			break;
		case 63:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:375:
			// PLUSPLUS
		{
			mPLUSPLUS();
			
		}
			break;
		case 64:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:384:
			// MINUS
		{
			mMINUS();
			
		}
			break;
		case 65:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:390:
			// MINUSMINUS
		{
			mMINUSMINUS();
			
		}
			break;
		case 66:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:401:
			// MODOPERATOR
		{
			mMODOPERATOR();
			
		}
			break;
		case 67:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:413:
			// CONCAT
		{
			mCONCAT();
			
		}
			break;
		case 68:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:420:
			// EQUALSEQUALSOP
		{
			mEQUALSEQUALSOP();
			
		}
			break;
		case 69:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:435:
			// EQUALSOP
		{
			mEQUALSOP();
			
		}
			break;
		case 70:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:444:
			// PLUSEQUALS
		{
			mPLUSEQUALS();
			
		}
			break;
		case 71:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:455:
			// MINUSEQUALS
		{
			mMINUSEQUALS();
			
		}
			break;
		case 72:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:467:
			// STAREQUALS
		{
			mSTAREQUALS();
			
		}
			break;
		case 73:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:478:
			// SLASHEQUALS
		{
			mSLASHEQUALS();
			
		}
			break;
		case 74:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:490:
			// MODEQUALS
		{
			mMODEQUALS();
			
		}
			break;
		case 75:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:500:
			// CONCATEQUALS
		{
			mCONCATEQUALS();
			
		}
			break;
		case 76:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:513:
			// COLON
		{
			mCOLON();
			
		}
			break;
		case 77:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:519:
			// NOTOP
		{
			mNOTOP();
			
		}
			break;
		case 78:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:525:
			// SEMICOLON
		{
			mSEMICOLON();
			
		}
			break;
		case 79:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:535:
			// OROPERATOR
		{
			mOROPERATOR();
			
		}
			break;
		case 80:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:546:
			// ANDOPERATOR
		{
			mANDOPERATOR();
			
		}
			break;
		case 81:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:558:
			// LEFTBRACKET
		{
			mLEFTBRACKET();
			
		}
			break;
		case 82:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:570:
			// RIGHTBRACKET
		{
			mRIGHTBRACKET();
			
		}
			break;
		case 83:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:583:
			// LEFTPAREN
		{
			mLEFTPAREN();
			
		}
			break;
		case 84:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:593:
			// RIGHTPAREN
		{
			mRIGHTPAREN();
			
		}
			break;
		case 85:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:604:
			// LEFTCURLYBRACKET
		{
			mLEFTCURLYBRACKET();
			
		}
			break;
		case 86:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:621:
			// RIGHTCURLYBRACKET
		{
			mRIGHTCURLYBRACKET();
			
		}
			break;
		case 87:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:639:
			// IDENTIFIER
		{
			mIDENTIFIER();
			
		}
			break;
		case 88:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:650:
			// INTEGER_LITERAL
		{
			mINTEGER_LITERAL();
			
		}
			break;
		case 89:
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFML.g:1:666:
			// FLOATING_POINT_LITERAL
		{
			mFLOATING_POINT_LITERAL();
			
		}
			break;
		
		}
		
	}
	
	protected DFA21 dfa21 = new DFA21(this);
	protected DFA24 dfa24 = new DFA24(this);
	static final String DFA21_eotS = "\1\uffff\1\3\3\uffff";
	static final String DFA21_eofS = "\5\uffff";
	static final String DFA21_minS = "\2\56\3\uffff";
	static final String DFA21_maxS = "\2\71\3\uffff";
	static final String DFA21_acceptS = "\2\uffff\1\2\1\3\1\1";
	static final String DFA21_specialS = "\5\uffff}>";
	static final String[] DFA21_transitionS = { "\1\2\1\uffff\12\1", "\1\4\1\uffff\12\1", "", "", "" };
	
	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;
	
	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}
	
	class DFA21 extends DFA {
		
		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		
		public String getDescription() {
			return "273:1: FLOATING_POINT_LITERAL : ( ( DecimalDigit )+ '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | ( DecimalDigit )+ ( ExponentPart )? );";
		}
	}
	
	static final String DFA24_eotS = "\2\uffff\1\55\1\63\1\65\1\67\2\uffff\1\73\2\55\1\uffff\17\55\1\133"
			+ "\1\136\2\uffff\1\141\1\144\1\146\1\151\1\153\12\uffff\1\154\1\157"
			+ "\1\55\13\uffff\2\55\1\164\10\55\1\176\1\55\1\u0080\1\u0081\1\u0083"
			+ "\1\u0084\1\55\1\u0087\1\u0089\1\u008c\1\55\1\u008e\10\55\22\uffff"
			+ "\1\u0097\1\55\1\uffff\2\55\1\u009b\1\55\1\uffff\2\55\1\u009f\1\55"
			+ "\1\u00a1\1\u00a2\3\55\1\uffff\1\u00a6\2\uffff\1\u00a7\2\uffff\1"
			+ "\55\1\u00a9\1\uffff\1\55\1\uffff\1\55\1\u00ac\1\uffff\1\55\1\uffff"
			+ "\1\u00ae\1\u00af\1\u00b0\1\u00b1\4\55\1\uffff\1\u00b6\1\55\1\u00b8"
			+ "\1\uffff\1\u00b9\2\55\1\uffff\1\u00bc\2\uffff\2\55\1\u00c0\2\uffff"
			+ "\1\55\1\uffff\1\u00c2\1\55\1\uffff\1\u00c4\4\uffff\4\55\1\uffff"
			+ "\1\55\2\uffff\1\u00b8\1\55\1\uffff\2\55\1\u00cd\1\uffff\1\55\1\uffff"
			+ "\1\u00d0\1\uffff\1\u00d1\1\55\1\u00d3\5\55\1\uffff\1\55\1\u00da"
			+ "\2\uffff\1\u00db\1\uffff\1\u00dc\1\u00dd\1\55\1\u00e0\1\55\1\u00e2"
			+ "\4\uffff\1\u00e3\1\u00e4\1\uffff\1\u00e5\4\uffff";
	static final String DFA24_eofS = "\u00e6\uffff";
	static final String DFA24_minS = "\1\11\1\uffff\1\105\1\57\2\75\2\uffff\1\52\1\110\1\101\1\uffff\1"
			+ "\105\1\101\1\106\2\105\1\114\1\122\1\117\1\116\1\117\1\101\1\122"
			+ "\1\105\1\110\1\127\1\60\1\75\2\uffff\1\53\1\55\1\75\1\46\1\75\12"
			+ "\uffff\1\56\1\44\1\106\13\uffff\1\125\1\101\1\44\1\114\1\116\1\122"
			+ "\1\114\1\121\1\124\1\116\1\123\1\44\1\120\4\44\1\105\3\44\1\123"
			+ "\1\44\1\122\2\104\1\122\1\105\1\124\2\111\22\uffff\1\44\1\123\1"
			+ "\uffff\1\101\1\105\1\44\1\116\1\uffff\1\123\1\103\1\44\1\114\2\44"
			+ "\1\124\1\103\1\105\1\uffff\1\44\2\uffff\1\44\2\uffff\1\101\1\44"
			+ "\1\uffff\1\123\1\uffff\1\101\1\44\1\uffff\1\105\1\uffff\4\44\1\101"
			+ "\1\125\1\114\1\124\1\uffff\1\44\1\125\1\44\1\uffff\1\44\1\105\1"
			+ "\124\1\uffff\1\44\2\uffff\1\101\1\110\1\44\2\uffff\1\124\1\uffff"
			+ "\1\44\1\114\1\uffff\1\44\4\uffff\1\113\1\122\1\105\1\103\1\uffff"
			+ "\1\114\2\uffff\1\44\1\111\1\uffff\1\111\1\116\1\44\1\uffff\1\105"
			+ "\1\uffff\1\44\1\uffff\1\44\1\116\1\44\1\110\1\124\1\117\1\116\1"
			+ "\125\1\uffff\1\122\1\44\2\uffff\1\44\1\uffff\2\44\1\116\1\44\1\105"
			+ "\1\44\4\uffff\2\44\1\uffff\1\44\4\uffff";
	static final String DFA24_maxS = "\1\ufaff\1\uffff\1\117\3\75\2\uffff\1\75\1\122\1\125\1\uffff\1\125"
			+ "\1\117\1\123\2\124\1\121\1\122\1\117\1\116\1\117\1\101\1\122\1\105"
			+ "\1\110\1\127\1\71\1\75\2\uffff\5\75\12\uffff\1\145\1\ufaff\1\106"
			+ "\13\uffff\1\131\1\101\1\ufaff\1\114\1\116\1\122\1\114\1\121\1\124"
			+ "\1\116\1\124\1\ufaff\1\120\4\ufaff\1\105\3\ufaff\1\123\1\ufaff\1"
			+ "\122\2\104\1\122\1\105\1\124\2\111\22\uffff\1\ufaff\1\123\1\uffff"
			+ "\1\101\1\105\1\ufaff\1\116\1\uffff\1\123\1\103\1\ufaff\1\114\2\ufaff"
			+ "\1\124\1\103\1\105\1\uffff\1\ufaff\2\uffff\1\ufaff\2\uffff\1\101"
			+ "\1\ufaff\1\uffff\1\123\1\uffff\1\101\1\ufaff\1\uffff\1\105\1\uffff"
			+ "\4\ufaff\1\101\1\125\1\114\1\124\1\uffff\1\ufaff\1\125\1\ufaff\1"
			+ "\uffff\1\ufaff\1\105\1\124\1\uffff\1\ufaff\2\uffff\1\111\1\110\1"
			+ "\ufaff\2\uffff\1\124\1\uffff\1\ufaff\1\114\1\uffff\1\ufaff\4\uffff"
			+ "\1\113\1\122\1\105\1\103\1\uffff\1\114\2\uffff\1\ufaff\1\111\1\uffff"
			+ "\1\111\1\116\1\ufaff\1\uffff\1\105\1\uffff\1\ufaff\1\uffff\1\ufaff"
			+ "\1\116\1\ufaff\1\110\1\124\1\117\1\116\1\125\1\uffff\1\122\1\ufaff"
			+ "\2\uffff\1\ufaff\1\uffff\2\ufaff\1\116\1\ufaff\1\105\1\ufaff\4\uffff"
			+ "\2\ufaff\1\uffff\1\ufaff\4\uffff";
	static final String DFA24_acceptS = "\1\uffff\1\1\4\uffff\1\10\1\11\3\uffff\1\15\21\uffff\1\74\1\75\5"
			+ "\uffff\1\114\1\116\1\117\1\121\1\122\1\123\1\124\1\125\1\126\1\127"
			+ "\3\uffff\1\4\1\70\1\3\1\6\1\5\1\7\1\115\1\12\1\13\1\111\1\73\37"
			+ "\uffff\1\71\1\131\1\110\1\72\1\77\1\106\1\76\1\101\1\107\1\100\1"
			+ "\112\1\102\1\113\1\120\1\103\1\104\1\105\1\130\2\uffff\1\60\4\uffff"
			+ "\1\41\11\uffff\1\22\1\uffff\1\51\1\62\1\uffff\1\23\1\24\2\uffff"
			+ "\1\27\1\uffff\1\30\2\uffff\1\31\1\uffff\1\40\10\uffff\1\2\3\uffff"
			+ "\1\63\3\uffff\1\61\1\uffff\1\34\1\46\3\uffff\1\42\1\25\1\uffff\1"
			+ "\26\2\uffff\1\43\1\uffff\1\44\1\45\1\47\1\50\4\uffff\1\21\1\uffff"
			+ "\1\14\1\36\2\uffff\1\16\3\uffff\1\66\1\uffff\1\35\1\uffff\1\52\10"
			+ "\uffff\1\64\2\uffff\1\32\1\53\1\uffff\1\57\6\uffff\1\33\1\56\1\65"
			+ "\1\67\2\uffff\1\20\1\uffff\1\37\1\55\1\17\1\54";
	static final String DFA24_specialS = "\u00e6\uffff}>";
	static final String[] DFA24_transitionS = {
			"\2\7\1\uffff\2\7\22\uffff\1\7\1\5\1\13\1\6\1\55\1\41\1\42\1"
					+ "\13\1\51\1\52\1\34\1\37\1\1\1\40\1\33\1\10\12\56\1\44\1\45\1"
					+ "\3\1\43\1\4\2\uffff\1\24\1\27\1\15\1\2\1\21\1\12\1\17\1\55\1"
					+ "\16\2\55\1\20\1\25\1\14\1\22\2\55\1\30\1\32\1\11\1\55\1\26\1"
					+ "\31\1\23\2\55\1\47\1\35\1\50\1\36\1\55\1\uffff\32\55\1\53\1"
					+ "\46\1\54\102\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040"
					+ "\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2"
					+ "\uffff\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\60\11\uffff\1\57",
			"\1\62\15\uffff\1\61",
			"\1\64",
			"\1\66",
			"",
			"",
			"\1\71\4\uffff\1\70\15\uffff\1\72",
			"\1\75\6\uffff\1\76\2\uffff\1\74",
			"\1\77\15\uffff\1\101\5\uffff\1\100",
			"",
			"\1\103\11\uffff\1\104\5\uffff\1\102",
			"\1\106\15\uffff\1\105",
			"\1\111\6\uffff\1\110\1\112\4\uffff\1\107",
			"\1\114\14\uffff\1\115\1\uffff\1\113",
			"\1\117\16\uffff\1\116",
			"\1\121\4\uffff\1\120",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\12\134",
			"\1\135",
			"",
			"",
			"\1\137\21\uffff\1\140",
			"\1\142\17\uffff\1\143",
			"\1\145",
			"\1\150\26\uffff\1\147",
			"\1\152",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\134\1\uffff\12\56\13\uffff\1\134\37\uffff\1\134",
			"\1\55\13\uffff\12\55\7\uffff\4\55\1\156\16\55\1\155\6\55\4"
					+ "\uffff\1\55\1\uffff\32\55\105\uffff\27\55\1\uffff\37\55\1\uffff"
					+ "\u1f08\55\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff"
					+ "\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"\1\160",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\161\3\uffff\1\162",
			"\1\163",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\175\1\174",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\177",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\4\55\1\u0082\25\55\4\uffff\1\55"
					+ "\1\uffff\32\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55"
					+ "\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"
					+ "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u0085",
			"\1\55\13\uffff\12\55\7\uffff\4\55\1\u0086\25\55\4\uffff\1\55"
					+ "\1\uffff\32\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55"
					+ "\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"
					+ "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\22\55\1\u0088\7\55\4\uffff\1\55"
					+ "\1\uffff\32\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55"
					+ "\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"
					+ "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\24\55\1\u008a\1\u008b\4\55\4\uffff"
					+ "\1\55\1\uffff\32\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08"
					+ "\55\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"
					+ "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"\1\u008d",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u0098",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u009c",
			"",
			"\1\u009d",
			"\1\u009e",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00a0",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"",
			"\1\u00a8",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\u00aa",
			"",
			"\1\u00ab",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\u00ad",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00b7",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00ba",
			"\1\u00bb",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"",
			"\1\u00bd\7\uffff\1\u00be",
			"\1\u00bf",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"",
			"\1\u00c1",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00c3",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"",
			"",
			"",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"",
			"\1\u00c9",
			"",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00ca",
			"",
			"\1\u00cb",
			"\1\u00cc",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\u00ce",
			"",
			"\1\55\13\uffff\12\55\7\uffff\22\55\1\u00cf\7\55\4\uffff\1\55"
					+ "\1\uffff\32\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55"
					+ "\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"
					+ "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00d2",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"",
			"\1\u00d9",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\u00de",
			"\1\55\13\uffff\12\55\7\uffff\22\55\1\u00df\7\55\4\uffff\1\55"
					+ "\1\uffff\32\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55"
					+ "\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"
					+ "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"\1\u00e1",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"",
			"",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"
					+ "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"
					+ "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"
					+ "\u5200\55\u5900\uffff\u0200\55", "", "", "", "" };
	
	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;
	
	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}
	
	class DFA24 extends DFA {
		
		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		
		public String getDescription() {
			return "1:1: Tokens : ( T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | WS | LINE_COMMENT | ML_COMMENT | BOOLEAN_LITERAL | STRING_LITERAL | NULL | CONTAINS | CONTAIN | DOES | IS | GT | GE | GTE | LTE | LT | LE | EQ | EQUAL | EQUALS | NEQ | LESS | THAN | GREATER | OR | TO | IMP | EQV | XOR | AND | NOT | MOD | VAR | IF | ELSE | BREAK | CONTINUE | FUNCTION | RETURN | WHILE | DO | FOR | IN | TRY | CATCH | SWITCH | CASE | DEFAULT | SCRIPTCLOSE | DOT | STAR | SLASH | BSLASH | POWER | PLUS | PLUSPLUS | MINUS | MINUSMINUS | MODOPERATOR | CONCAT | EQUALSEQUALSOP | EQUALSOP | PLUSEQUALS | MINUSEQUALS | STAREQUALS | SLASHEQUALS | MODEQUALS | CONCATEQUALS | COLON | NOTOP | SEMICOLON | OROPERATOR | ANDOPERATOR | LEFTBRACKET | RIGHTBRACKET | LEFTPAREN | RIGHTPAREN | LEFTCURLYBRACKET | RIGHTCURLYBRACKET | IDENTIFIER | INTEGER_LITERAL | FLOATING_POINT_LITERAL );";
		}
	}
	
}