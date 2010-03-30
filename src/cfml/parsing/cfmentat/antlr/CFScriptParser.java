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

import org.antlr.runtime.BitSet;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

public class CFScriptParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION_CALL",
			"FUNCTION_DECLARATION", "STRUCT_KEY", "ELSEIF", "STRING_CFML", "STRING", "SEMI_COLON", "VAR", "EQUALS",
			"OPEN_PAREN", "CLOSE_PAREN", "RETURN", "OPERATOR", "NOT", "NUMBER", "HASH", "DOT", "DOUBLE_QUOTE",
			"ESCAPE_DOUBLE_QUOTE", "SINGLE_QUOTE", "ESCAPE_SINGLE_QUOTE", "IDENTIFIER", "OPEN_SQUARE", "CLOSE_SQUARE",
			"COMMA", "FUNCTION", "IF", "ELSE", "TRY", "CATCH", "FOR", "IN", "WHILE", "DO", "OPEN_CURLY", "CLOSE_CURLY",
			"SWITCH", "CASE", "COLON", "DEFAULT", "BREAK", "MATH_OPERATOR", "STRING_OPERATOR", "CONDITION_OPERATOR",
			"BOOLEAN_OPERATOR", "DIGIT", "LETTER", "UNDERSCORE", "WS", "COMMENT", "LINE_COMMENT", "OTHER" };
	public static final int COMMA = 28;
	public static final int HASH = 19;
	public static final int ELSEIF = 7;
	public static final int NUMBER = 18;
	public static final int OPEN_CURLY = 38;
	public static final int DOT = 20;
	public static final int FUNCTION = 29;
	public static final int STRING_OPERATOR = 46;
	public static final int STRUCT_KEY = 6;
	public static final int SEMI_COLON = 10;
	public static final int MATH_OPERATOR = 45;
	public static final int FUNCTION_DECLARATION = 5;
	public static final int DIGIT = 49;
	public static final int SINGLE_QUOTE = 23;
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
	public static final int COLON = 42;
	public static final int DEFAULT = 43;
	public static final int IDENTIFIER = 25;
	public static final int NOT = 17;
	public static final int TRY = 32;
	public static final int UNDERSCORE = 51;
	
	// delegates
	// delegators
	
	public CFScriptParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	
	public CFScriptParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		
	}
	
	protected TreeAdaptor adaptor = new CommonTreeAdaptor();
	
	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	
	public String[] getTokenNames() {
		return CFScriptParser.tokenNames;
	}
	
	public String getGrammarFileName() {
		return "/Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g";
	}
	
	public static class script_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "script"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:117:1: script
	// : ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement |
	// switchStatement | functionDeclaration ) )* ;
	public final CFScriptParser.script_return script() throws RecognitionException {
		CFScriptParser.script_return retval = new CFScriptParser.script_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		CFScriptParser.nonBlockStatement_return nonBlockStatement1 = null;
		
		CFScriptParser.ifStatement_return ifStatement2 = null;
		
		CFScriptParser.tryStatement_return tryStatement3 = null;
		
		CFScriptParser.forStatement_return forStatement4 = null;
		
		CFScriptParser.whileStatement_return whileStatement5 = null;
		
		CFScriptParser.doWhileStatement_return doWhileStatement6 = null;
		
		CFScriptParser.switchStatement_return switchStatement7 = null;
		
		CFScriptParser.functionDeclaration_return functionDeclaration8 = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:118:2:
			// ( ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement |
			// switchStatement | functionDeclaration ) )* )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:119:2:
			// ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement |
			// switchStatement | functionDeclaration ) )*
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:119:2:
				// ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement
				// | switchStatement | functionDeclaration ) )*
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					
					if ((LA2_0 == VAR || LA2_0 == OPEN_PAREN || LA2_0 == RETURN || (LA2_0 >= NOT && LA2_0 <= HASH)
							|| LA2_0 == DOUBLE_QUOTE || LA2_0 == SINGLE_QUOTE || LA2_0 == IDENTIFIER
							|| (LA2_0 >= FUNCTION && LA2_0 <= IF) || LA2_0 == TRY || LA2_0 == FOR
							|| (LA2_0 >= WHILE && LA2_0 <= DO) || LA2_0 == SWITCH || LA2_0 == BREAK)) {
						alt2 = 1;
					}
					
					switch (alt2) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:120:3:
						// ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement |
						// doWhileStatement | switchStatement | functionDeclaration )
					{
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:120:3:
						// ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement |
						// doWhileStatement | switchStatement | functionDeclaration )
						int alt1 = 8;
						switch (input.LA(1)) {
						case VAR:
						case OPEN_PAREN:
						case RETURN:
						case NOT:
						case NUMBER:
						case HASH:
						case DOUBLE_QUOTE:
						case SINGLE_QUOTE:
						case IDENTIFIER:
						case BREAK: {
							alt1 = 1;
						}
							break;
						case IF: {
							alt1 = 2;
						}
							break;
						case TRY: {
							alt1 = 3;
						}
							break;
						case FOR: {
							alt1 = 4;
						}
							break;
						case WHILE: {
							alt1 = 5;
						}
							break;
						case DO: {
							alt1 = 6;
						}
							break;
						case SWITCH: {
							alt1 = 7;
						}
							break;
						case FUNCTION: {
							alt1 = 8;
						}
							break;
						default:
							NoViableAltException nvae = new NoViableAltException("", 1, 0, input);
							
							throw nvae;
						}
						
						switch (alt1) {
						case 1:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:121:4:
							// nonBlockStatement
						{
							pushFollow(FOLLOW_nonBlockStatement_in_script96);
							nonBlockStatement1 = nonBlockStatement();
							
							state._fsp--;
							
							adaptor.addChild(root_0, nonBlockStatement1.getTree());
							
						}
							break;
						case 2:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:123:4:
							// ifStatement
						{
							pushFollow(FOLLOW_ifStatement_in_script107);
							ifStatement2 = ifStatement();
							
							state._fsp--;
							
							adaptor.addChild(root_0, ifStatement2.getTree());
							
						}
							break;
						case 3:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:125:4:
							// tryStatement
						{
							pushFollow(FOLLOW_tryStatement_in_script117);
							tryStatement3 = tryStatement();
							
							state._fsp--;
							
							adaptor.addChild(root_0, tryStatement3.getTree());
							
						}
							break;
						case 4:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:127:4:
							// forStatement
						{
							pushFollow(FOLLOW_forStatement_in_script127);
							forStatement4 = forStatement();
							
							state._fsp--;
							
							adaptor.addChild(root_0, forStatement4.getTree());
							
						}
							break;
						case 5:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:129:4:
							// whileStatement
						{
							pushFollow(FOLLOW_whileStatement_in_script137);
							whileStatement5 = whileStatement();
							
							state._fsp--;
							
							adaptor.addChild(root_0, whileStatement5.getTree());
							
						}
							break;
						case 6:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:131:4:
							// doWhileStatement
						{
							pushFollow(FOLLOW_doWhileStatement_in_script147);
							doWhileStatement6 = doWhileStatement();
							
							state._fsp--;
							
							adaptor.addChild(root_0, doWhileStatement6.getTree());
							
						}
							break;
						case 7:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:133:4:
							// switchStatement
						{
							pushFollow(FOLLOW_switchStatement_in_script157);
							switchStatement7 = switchStatement();
							
							state._fsp--;
							
							adaptor.addChild(root_0, switchStatement7.getTree());
							
						}
							break;
						case 8:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:135:4:
							// functionDeclaration
						{
							pushFollow(FOLLOW_functionDeclaration_in_script167);
							functionDeclaration8 = functionDeclaration();
							
							state._fsp--;
							
							adaptor.addChild(root_0, functionDeclaration8.getTree());
							
						}
							break;
						
						}
						
					}
						break;
					
					default:
						break loop2;
					}
				} while (true);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "script"
	
	public static class nonBlockStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "nonBlockStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:140:1:
	// nonBlockStatement : ( setStatement | returnStatement | breakStatement ) SEMI_COLON ;
	public final CFScriptParser.nonBlockStatement_return nonBlockStatement() throws RecognitionException {
		CFScriptParser.nonBlockStatement_return retval = new CFScriptParser.nonBlockStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token SEMI_COLON12 = null;
		CFScriptParser.setStatement_return setStatement9 = null;
		
		CFScriptParser.returnStatement_return returnStatement10 = null;
		
		CFScriptParser.breakStatement_return breakStatement11 = null;
		
		Object SEMI_COLON12_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:141:2:
			// ( ( setStatement | returnStatement | breakStatement ) SEMI_COLON )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:142:2:
			// ( setStatement | returnStatement | breakStatement ) SEMI_COLON
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:142:2:
				// ( setStatement | returnStatement | breakStatement )
				int alt3 = 3;
				switch (input.LA(1)) {
				case VAR:
				case OPEN_PAREN:
				case NOT:
				case NUMBER:
				case HASH:
				case DOUBLE_QUOTE:
				case SINGLE_QUOTE:
				case IDENTIFIER: {
					alt3 = 1;
				}
					break;
				case RETURN: {
					alt3 = 2;
				}
					break;
				case BREAK: {
					alt3 = 3;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 3, 0, input);
					
					throw nvae;
				}
				
				switch (alt3) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:143:3:
					// setStatement
				{
					pushFollow(FOLLOW_setStatement_in_nonBlockStatement192);
					setStatement9 = setStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, setStatement9.getTree());
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:145:3:
					// returnStatement
				{
					pushFollow(FOLLOW_returnStatement_in_nonBlockStatement200);
					returnStatement10 = returnStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, returnStatement10.getTree());
					
				}
					break;
				case 3:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:147:3:
					// breakStatement
				{
					pushFollow(FOLLOW_breakStatement_in_nonBlockStatement208);
					breakStatement11 = breakStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, breakStatement11.getTree());
					
				}
					break;
				
				}
				
				SEMI_COLON12 = (Token) match(input, SEMI_COLON, FOLLOW_SEMI_COLON_in_nonBlockStatement215);
				SEMI_COLON12_tree = (Object) adaptor.create(SEMI_COLON12);
				adaptor.addChild(root_0, SEMI_COLON12_tree);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "nonBlockStatement"
	
	public static class setStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "setStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:152:1:
	// setStatement : ( VAR )? codeStatement ( EQUALS codeStatement )? ;
	public final CFScriptParser.setStatement_return setStatement() throws RecognitionException {
		CFScriptParser.setStatement_return retval = new CFScriptParser.setStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token VAR13 = null;
		Token EQUALS15 = null;
		CFScriptParser.codeStatement_return codeStatement14 = null;
		
		CFScriptParser.codeStatement_return codeStatement16 = null;
		
		Object VAR13_tree = null;
		Object EQUALS15_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:153:2:
			// ( ( VAR )? codeStatement ( EQUALS codeStatement )? )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:162:2:
			// ( VAR )? codeStatement ( EQUALS codeStatement )?
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:162:2:
				// ( VAR )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);
				
				if ((LA4_0 == VAR)) {
					alt4 = 1;
				}
				switch (alt4) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:162:3:
					// VAR
				{
					VAR13 = (Token) match(input, VAR, FOLLOW_VAR_in_setStatement232);
					VAR13_tree = (Object) adaptor.create(VAR13);
					adaptor.addChild(root_0, VAR13_tree);
					
				}
					break;
				
				}
				
				pushFollow(FOLLOW_codeStatement_in_setStatement236);
				codeStatement14 = codeStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, codeStatement14.getTree());
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:162:23:
				// ( EQUALS codeStatement )?
				int alt5 = 2;
				int LA5_0 = input.LA(1);
				
				if ((LA5_0 == EQUALS)) {
					alt5 = 1;
				}
				switch (alt5) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:162:24:
					// EQUALS codeStatement
				{
					EQUALS15 = (Token) match(input, EQUALS, FOLLOW_EQUALS_in_setStatement239);
					EQUALS15_tree = (Object) adaptor.create(EQUALS15);
					adaptor.addChild(root_0, EQUALS15_tree);
					
					pushFollow(FOLLOW_codeStatement_in_setStatement241);
					codeStatement16 = codeStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, codeStatement16.getTree());
					
				}
					break;
				
				}
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "setStatement"
	
	public static class codeStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "codeStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:165:1:
	// codeStatement : ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement ) ;
	public final CFScriptParser.codeStatement_return codeStatement() throws RecognitionException {
		CFScriptParser.codeStatement_return retval = new CFScriptParser.codeStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token OPEN_PAREN17 = null;
		Token CLOSE_PAREN19 = null;
		CFScriptParser.codeStatement_return codeStatement18 = null;
		
		CFScriptParser.cfmlBasicStatement_return cfmlBasicStatement20 = null;
		
		Object OPEN_PAREN17_tree = null;
		Object CLOSE_PAREN19_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:166:2:
			// ( ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:167:2:
			// ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement )
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:167:2:
				// ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement )
				int alt6 = 2;
				int LA6_0 = input.LA(1);
				
				if ((LA6_0 == OPEN_PAREN)) {
					alt6 = 1;
				} else if (((LA6_0 >= NOT && LA6_0 <= HASH) || LA6_0 == DOUBLE_QUOTE || LA6_0 == SINGLE_QUOTE || LA6_0 == IDENTIFIER)) {
					alt6 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 6, 0, input);
					
					throw nvae;
				}
				switch (alt6) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:168:3:
					// OPEN_PAREN codeStatement CLOSE_PAREN
				{
					OPEN_PAREN17 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_codeStatement259);
					OPEN_PAREN17_tree = (Object) adaptor.create(OPEN_PAREN17);
					adaptor.addChild(root_0, OPEN_PAREN17_tree);
					
					pushFollow(FOLLOW_codeStatement_in_codeStatement261);
					codeStatement18 = codeStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, codeStatement18.getTree());
					CLOSE_PAREN19 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_codeStatement263);
					CLOSE_PAREN19_tree = (Object) adaptor.create(CLOSE_PAREN19);
					adaptor.addChild(root_0, CLOSE_PAREN19_tree);
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:170:3:
					// cfmlBasicStatement
				{
					pushFollow(FOLLOW_cfmlBasicStatement_in_codeStatement271);
					cfmlBasicStatement20 = cfmlBasicStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, cfmlBasicStatement20.getTree());
					
				}
					break;
				
				}
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "codeStatement"
	
	public static class returnStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "returnStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:174:1:
	// returnStatement : RETURN ( codeStatement )? ;
	public final CFScriptParser.returnStatement_return returnStatement() throws RecognitionException {
		CFScriptParser.returnStatement_return retval = new CFScriptParser.returnStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token RETURN21 = null;
		CFScriptParser.codeStatement_return codeStatement22 = null;
		
		Object RETURN21_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:175:2:
			// ( RETURN ( codeStatement )? )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:176:2:
			// RETURN ( codeStatement )?
			{
				root_0 = (Object) adaptor.nil();
				
				RETURN21 = (Token) match(input, RETURN, FOLLOW_RETURN_in_returnStatement287);
				RETURN21_tree = (Object) adaptor.create(RETURN21);
				root_0 = (Object) adaptor.becomeRoot(RETURN21_tree, root_0);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:176:10:
				// ( codeStatement )?
				int alt7 = 2;
				int LA7_0 = input.LA(1);
				
				if ((LA7_0 == OPEN_PAREN || (LA7_0 >= NOT && LA7_0 <= HASH) || LA7_0 == DOUBLE_QUOTE
						|| LA7_0 == SINGLE_QUOTE || LA7_0 == IDENTIFIER)) {
					alt7 = 1;
				}
				switch (alt7) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:176:11:
					// codeStatement
				{
					pushFollow(FOLLOW_codeStatement_in_returnStatement291);
					codeStatement22 = codeStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, codeStatement22.getTree());
					
				}
					break;
				
				}
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "returnStatement"
	
	public static class cfmlBasicStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "cfmlBasicStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:179:1:
	// cfmlBasicStatement : cfmlValueStatement ( OPERATOR codeStatement )? ;
	public final CFScriptParser.cfmlBasicStatement_return cfmlBasicStatement() throws RecognitionException {
		CFScriptParser.cfmlBasicStatement_return retval = new CFScriptParser.cfmlBasicStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token OPERATOR24 = null;
		CFScriptParser.cfmlValueStatement_return cfmlValueStatement23 = null;
		
		CFScriptParser.codeStatement_return codeStatement25 = null;
		
		Object OPERATOR24_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:180:2:
			// ( cfmlValueStatement ( OPERATOR codeStatement )? )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:181:2:
			// cfmlValueStatement ( OPERATOR codeStatement )?
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_cfmlValueStatement_in_cfmlBasicStatement305);
				cfmlValueStatement23 = cfmlValueStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, cfmlValueStatement23.getTree());
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:181:21:
				// ( OPERATOR codeStatement )?
				int alt8 = 2;
				int LA8_0 = input.LA(1);
				
				if ((LA8_0 == OPERATOR)) {
					alt8 = 1;
				}
				switch (alt8) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:181:22:
					// OPERATOR codeStatement
				{
					OPERATOR24 = (Token) match(input, OPERATOR, FOLLOW_OPERATOR_in_cfmlBasicStatement308);
					OPERATOR24_tree = (Object) adaptor.create(OPERATOR24);
					adaptor.addChild(root_0, OPERATOR24_tree);
					
					pushFollow(FOLLOW_codeStatement_in_cfmlBasicStatement310);
					codeStatement25 = codeStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, codeStatement25.getTree());
					
				}
					break;
				
				}
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "cfmlBasicStatement"
	
	public static class cfmlValueStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "cfmlValueStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:185:1:
	// cfmlValueStatement : ( NOT )? cfmlValue ;
	public final CFScriptParser.cfmlValueStatement_return cfmlValueStatement() throws RecognitionException {
		CFScriptParser.cfmlValueStatement_return retval = new CFScriptParser.cfmlValueStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token NOT26 = null;
		CFScriptParser.cfmlValue_return cfmlValue27 = null;
		
		Object NOT26_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:186:2:
			// ( ( NOT )? cfmlValue )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:187:2:
			// ( NOT )? cfmlValue
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:187:2:
				// ( NOT )?
				int alt9 = 2;
				int LA9_0 = input.LA(1);
				
				if ((LA9_0 == NOT)) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:187:3:
					// NOT
				{
					NOT26 = (Token) match(input, NOT, FOLLOW_NOT_in_cfmlValueStatement327);
					NOT26_tree = (Object) adaptor.create(NOT26);
					adaptor.addChild(root_0, NOT26_tree);
					
				}
					break;
				
				}
				
				pushFollow(FOLLOW_cfmlValue_in_cfmlValueStatement331);
				cfmlValue27 = cfmlValue();
				
				state._fsp--;
				
				adaptor.addChild(root_0, cfmlValue27.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "cfmlValueStatement"
	
	public static class cfmlValue_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "cfmlValue"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:190:1:
	// cfmlValue : ( NUMBER | stringLiteral | cfmlLinking ) ;
	public final CFScriptParser.cfmlValue_return cfmlValue() throws RecognitionException {
		CFScriptParser.cfmlValue_return retval = new CFScriptParser.cfmlValue_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token NUMBER28 = null;
		CFScriptParser.stringLiteral_return stringLiteral29 = null;
		
		CFScriptParser.cfmlLinking_return cfmlLinking30 = null;
		
		Object NUMBER28_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:191:2:
			// ( ( NUMBER | stringLiteral | cfmlLinking ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:192:2:
			// ( NUMBER | stringLiteral | cfmlLinking )
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:192:2:
				// ( NUMBER | stringLiteral | cfmlLinking )
				int alt10 = 3;
				switch (input.LA(1)) {
				case NUMBER: {
					alt10 = 1;
				}
					break;
				case DOUBLE_QUOTE:
				case SINGLE_QUOTE: {
					alt10 = 2;
				}
					break;
				case HASH:
				case IDENTIFIER: {
					alt10 = 3;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 10, 0, input);
					
					throw nvae;
				}
				
				switch (alt10) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:192:3:
					// NUMBER
				{
					NUMBER28 = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_cfmlValue344);
					NUMBER28_tree = (Object) adaptor.create(NUMBER28);
					adaptor.addChild(root_0, NUMBER28_tree);
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:192:12:
					// stringLiteral
				{
					pushFollow(FOLLOW_stringLiteral_in_cfmlValue348);
					stringLiteral29 = stringLiteral();
					
					state._fsp--;
					
					adaptor.addChild(root_0, stringLiteral29.getTree());
					
				}
					break;
				case 3:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:192:28:
					// cfmlLinking
				{
					pushFollow(FOLLOW_cfmlLinking_in_cfmlValue352);
					cfmlLinking30 = cfmlLinking();
					
					state._fsp--;
					
					adaptor.addChild(root_0, cfmlLinking30.getTree());
					
				}
					break;
				
				}
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "cfmlValue"
	
	public static class cfmlLinking_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "cfmlLinking"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:195:1:
	// cfmlLinking : ( hashCfmlLinking | cfmlBasicLinking );
	public final CFScriptParser.cfmlLinking_return cfmlLinking() throws RecognitionException {
		CFScriptParser.cfmlLinking_return retval = new CFScriptParser.cfmlLinking_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		CFScriptParser.hashCfmlLinking_return hashCfmlLinking31 = null;
		
		CFScriptParser.cfmlBasicLinking_return cfmlBasicLinking32 = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:196:2:
			// ( hashCfmlLinking | cfmlBasicLinking )
			int alt11 = 2;
			int LA11_0 = input.LA(1);
			
			if ((LA11_0 == HASH)) {
				alt11 = 1;
			} else if ((LA11_0 == IDENTIFIER)) {
				alt11 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 11, 0, input);
				
				throw nvae;
			}
			switch (alt11) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:197:2:
				// hashCfmlLinking
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_hashCfmlLinking_in_cfmlLinking365);
				hashCfmlLinking31 = hashCfmlLinking();
				
				state._fsp--;
				
				adaptor.addChild(root_0, hashCfmlLinking31.getTree());
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:199:2:
				// cfmlBasicLinking
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_cfmlBasicLinking_in_cfmlLinking371);
				cfmlBasicLinking32 = cfmlBasicLinking();
				
				state._fsp--;
				
				adaptor.addChild(root_0, cfmlBasicLinking32.getTree());
				
			}
				break;
			
			}
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "cfmlLinking"
	
	public static class hashCfmlLinking_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "hashCfmlLinking"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:202:1:
	// hashCfmlLinking : HASH cfmlBasicLinking HASH ;
	public final CFScriptParser.hashCfmlLinking_return hashCfmlLinking() throws RecognitionException {
		CFScriptParser.hashCfmlLinking_return retval = new CFScriptParser.hashCfmlLinking_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token HASH33 = null;
		Token HASH35 = null;
		CFScriptParser.cfmlBasicLinking_return cfmlBasicLinking34 = null;
		
		Object HASH33_tree = null;
		Object HASH35_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:203:2:
			// ( HASH cfmlBasicLinking HASH )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:204:2:
			// HASH cfmlBasicLinking HASH
			{
				root_0 = (Object) adaptor.nil();
				
				HASH33 = (Token) match(input, HASH, FOLLOW_HASH_in_hashCfmlLinking384);
				HASH33_tree = (Object) adaptor.create(HASH33);
				adaptor.addChild(root_0, HASH33_tree);
				
				pushFollow(FOLLOW_cfmlBasicLinking_in_hashCfmlLinking386);
				cfmlBasicLinking34 = cfmlBasicLinking();
				
				state._fsp--;
				
				adaptor.addChild(root_0, cfmlBasicLinking34.getTree());
				HASH35 = (Token) match(input, HASH, FOLLOW_HASH_in_hashCfmlLinking388);
				HASH35_tree = (Object) adaptor.create(HASH35);
				adaptor.addChild(root_0, HASH35_tree);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "hashCfmlLinking"
	
	public static class cfmlBasicLinking_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "cfmlBasicLinking"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:207:1:
	// cfmlBasicLinking : cfmlBasic ( DOT cfmlBasic )* ;
	public final CFScriptParser.cfmlBasicLinking_return cfmlBasicLinking() throws RecognitionException {
		CFScriptParser.cfmlBasicLinking_return retval = new CFScriptParser.cfmlBasicLinking_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token DOT37 = null;
		CFScriptParser.cfmlBasic_return cfmlBasic36 = null;
		
		CFScriptParser.cfmlBasic_return cfmlBasic38 = null;
		
		Object DOT37_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:208:2:
			// ( cfmlBasic ( DOT cfmlBasic )* )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:209:2:
			// cfmlBasic ( DOT cfmlBasic )*
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_cfmlBasic_in_cfmlBasicLinking400);
				cfmlBasic36 = cfmlBasic();
				
				state._fsp--;
				
				adaptor.addChild(root_0, cfmlBasic36.getTree());
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:209:12:
				// ( DOT cfmlBasic )*
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);
					
					if ((LA12_0 == DOT)) {
						alt12 = 1;
					}
					
					switch (alt12) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:209:13:
						// DOT cfmlBasic
					{
						DOT37 = (Token) match(input, DOT, FOLLOW_DOT_in_cfmlBasicLinking403);
						DOT37_tree = (Object) adaptor.create(DOT37);
						adaptor.addChild(root_0, DOT37_tree);
						
						pushFollow(FOLLOW_cfmlBasic_in_cfmlBasicLinking405);
						cfmlBasic38 = cfmlBasic();
						
						state._fsp--;
						
						adaptor.addChild(root_0, cfmlBasic38.getTree());
						
					}
						break;
					
					default:
						break loop12;
					}
				} while (true);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "cfmlBasicLinking"
	
	public static class cfmlBasic_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "cfmlBasic"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:212:1:
	// cfmlBasic : ( identifier | function );
	public final CFScriptParser.cfmlBasic_return cfmlBasic() throws RecognitionException {
		CFScriptParser.cfmlBasic_return retval = new CFScriptParser.cfmlBasic_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		CFScriptParser.identifier_return identifier39 = null;
		
		CFScriptParser.function_return function40 = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:213:2:
			// ( identifier | function )
			int alt13 = 2;
			int LA13_0 = input.LA(1);
			
			if ((LA13_0 == IDENTIFIER)) {
				int LA13_1 = input.LA(2);
				
				if ((LA13_1 == OPEN_PAREN)) {
					alt13 = 2;
				} else if ((LA13_1 == EOF || LA13_1 == SEMI_COLON || LA13_1 == EQUALS || LA13_1 == CLOSE_PAREN
						|| LA13_1 == OPERATOR || (LA13_1 >= HASH && LA13_1 <= DOT) || (LA13_1 >= OPEN_SQUARE && LA13_1 <= COMMA))) {
					alt13 = 1;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 13, 1, input);
					
					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 13, 0, input);
				
				throw nvae;
			}
			switch (alt13) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:214:2:
				// identifier
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_identifier_in_cfmlBasic419);
				identifier39 = identifier();
				
				state._fsp--;
				
				adaptor.addChild(root_0, identifier39.getTree());
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:214:15:
				// function
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_function_in_cfmlBasic423);
				function40 = function();
				
				state._fsp--;
				
				adaptor.addChild(root_0, function40.getTree());
				
			}
				break;
			
			}
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "cfmlBasic"
	
	public static class innerStringCFML_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "innerStringCFML"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:217:1:
	// innerStringCFML : hashCfmlLinking ;
	public final CFScriptParser.innerStringCFML_return innerStringCFML() throws RecognitionException {
		CFScriptParser.innerStringCFML_return retval = new CFScriptParser.innerStringCFML_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		CFScriptParser.hashCfmlLinking_return hashCfmlLinking41 = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:218:2:
			// ( hashCfmlLinking )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:219:2:
			// hashCfmlLinking
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_hashCfmlLinking_in_innerStringCFML435);
				hashCfmlLinking41 = hashCfmlLinking();
				
				state._fsp--;
				
				adaptor.addChild(root_0, hashCfmlLinking41.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "innerStringCFML"
	
	public static class stringLiteral_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "stringLiteral"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:222:1:
	// stringLiteral : ( ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE
	// | HASH ) )* DOUBLE_QUOTE ) | ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE |
	// ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE ) );
	public final CFScriptParser.stringLiteral_return stringLiteral() throws RecognitionException {
		CFScriptParser.stringLiteral_return retval = new CFScriptParser.stringLiteral_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token DOUBLE_QUOTE42 = null;
		Token ESCAPE_DOUBLE_QUOTE43 = null;
		Token set45 = null;
		Token DOUBLE_QUOTE46 = null;
		Token SINGLE_QUOTE47 = null;
		Token ESCAPE_SINGLE_QUOTE48 = null;
		Token set50 = null;
		Token SINGLE_QUOTE51 = null;
		CFScriptParser.innerStringCFML_return innerStringCFML44 = null;
		
		CFScriptParser.innerStringCFML_return innerStringCFML49 = null;
		
		Object DOUBLE_QUOTE42_tree = null;
		Object ESCAPE_DOUBLE_QUOTE43_tree = null;
		Object set45_tree = null;
		Object DOUBLE_QUOTE46_tree = null;
		Object SINGLE_QUOTE47_tree = null;
		Object ESCAPE_SINGLE_QUOTE48_tree = null;
		Object set50_tree = null;
		Object SINGLE_QUOTE51_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:223:2:
			// ( ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH
			// ) )* DOUBLE_QUOTE ) | ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE |
			// ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE ) )
			int alt16 = 2;
			int LA16_0 = input.LA(1);
			
			if ((LA16_0 == DOUBLE_QUOTE)) {
				alt16 = 1;
			} else if ((LA16_0 == SINGLE_QUOTE)) {
				alt16 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 16, 0, input);
				
				throw nvae;
			}
			switch (alt16) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:224:2:
				// ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE |
				// HASH ) )* DOUBLE_QUOTE )
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:224:2:
				// ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE |
				// HASH ) )* DOUBLE_QUOTE )
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:225:3:
				// DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH
				// ) )* DOUBLE_QUOTE
				{
					DOUBLE_QUOTE42 = (Token) match(input, DOUBLE_QUOTE, FOLLOW_DOUBLE_QUOTE_in_stringLiteral451);
					DOUBLE_QUOTE42_tree = (Object) adaptor.create(DOUBLE_QUOTE42);
					root_0 = (Object) adaptor.becomeRoot(DOUBLE_QUOTE42_tree, root_0);
					
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:225:17:
					// ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )*
					loop14: do {
						int alt14 = 4;
						switch (input.LA(1)) {
						case ESCAPE_DOUBLE_QUOTE: {
							alt14 = 1;
						}
							break;
						case HASH: {
							alt14 = 2;
						}
							break;
						case FUNCTION_CALL:
						case FUNCTION_DECLARATION:
						case STRUCT_KEY:
						case ELSEIF:
						case STRING_CFML:
						case STRING:
						case SEMI_COLON:
						case VAR:
						case EQUALS:
						case OPEN_PAREN:
						case CLOSE_PAREN:
						case RETURN:
						case OPERATOR:
						case NOT:
						case NUMBER:
						case DOT:
						case SINGLE_QUOTE:
						case ESCAPE_SINGLE_QUOTE:
						case IDENTIFIER:
						case OPEN_SQUARE:
						case CLOSE_SQUARE:
						case COMMA:
						case FUNCTION:
						case IF:
						case ELSE:
						case TRY:
						case CATCH:
						case FOR:
						case IN:
						case WHILE:
						case DO:
						case OPEN_CURLY:
						case CLOSE_CURLY:
						case SWITCH:
						case CASE:
						case COLON:
						case DEFAULT:
						case BREAK:
						case MATH_OPERATOR:
						case STRING_OPERATOR:
						case CONDITION_OPERATOR:
						case BOOLEAN_OPERATOR:
						case DIGIT:
						case LETTER:
						case UNDERSCORE:
						case WS:
						case COMMENT:
						case LINE_COMMENT:
						case OTHER: {
							alt14 = 3;
						}
							break;
						
						}
						
						switch (alt14) {
						case 1:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:225:19:
							// ESCAPE_DOUBLE_QUOTE
						{
							ESCAPE_DOUBLE_QUOTE43 = (Token) match(input, ESCAPE_DOUBLE_QUOTE,
									FOLLOW_ESCAPE_DOUBLE_QUOTE_in_stringLiteral456);
							ESCAPE_DOUBLE_QUOTE43_tree = (Object) adaptor.create(ESCAPE_DOUBLE_QUOTE43);
							adaptor.addChild(root_0, ESCAPE_DOUBLE_QUOTE43_tree);
							
						}
							break;
						case 2:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:225:41:
							// innerStringCFML
						{
							pushFollow(FOLLOW_innerStringCFML_in_stringLiteral460);
							innerStringCFML44 = innerStringCFML();
							
							state._fsp--;
							
							adaptor.addChild(root_0, innerStringCFML44.getTree());
							
						}
							break;
						case 3:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:225:59:
							// ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH )
						{
							set45 = (Token) input.LT(1);
							if ((input.LA(1) >= FUNCTION_CALL && input.LA(1) <= NUMBER) || input.LA(1) == DOT
									|| (input.LA(1) >= SINGLE_QUOTE && input.LA(1) <= OTHER)) {
								input.consume();
								adaptor.addChild(root_0, (Object) adaptor.create(set45));
								state.errorRecovery = false;
							} else {
								MismatchedSetException mse = new MismatchedSetException(null, input);
								throw mse;
							}
							
						}
							break;
						
						default:
							break loop14;
						}
					} while (true);
					
					DOUBLE_QUOTE46 = (Token) match(input, DOUBLE_QUOTE, FOLLOW_DOUBLE_QUOTE_in_stringLiteral480);
					DOUBLE_QUOTE46_tree = (Object) adaptor.create(DOUBLE_QUOTE46);
					adaptor.addChild(root_0, DOUBLE_QUOTE46_tree);
					
				}
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:228:2:
				// ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE |
				// HASH ) )* SINGLE_QUOTE )
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:228:2:
				// ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE |
				// HASH ) )* SINGLE_QUOTE )
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:229:3:
				// SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH
				// ) )* SINGLE_QUOTE
				{
					SINGLE_QUOTE47 = (Token) match(input, SINGLE_QUOTE, FOLLOW_SINGLE_QUOTE_in_stringLiteral493);
					SINGLE_QUOTE47_tree = (Object) adaptor.create(SINGLE_QUOTE47);
					root_0 = (Object) adaptor.becomeRoot(SINGLE_QUOTE47_tree, root_0);
					
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:229:17:
					// ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )*
					loop15: do {
						int alt15 = 4;
						switch (input.LA(1)) {
						case ESCAPE_SINGLE_QUOTE: {
							alt15 = 1;
						}
							break;
						case HASH: {
							alt15 = 2;
						}
							break;
						case FUNCTION_CALL:
						case FUNCTION_DECLARATION:
						case STRUCT_KEY:
						case ELSEIF:
						case STRING_CFML:
						case STRING:
						case SEMI_COLON:
						case VAR:
						case EQUALS:
						case OPEN_PAREN:
						case CLOSE_PAREN:
						case RETURN:
						case OPERATOR:
						case NOT:
						case NUMBER:
						case DOT:
						case DOUBLE_QUOTE:
						case ESCAPE_DOUBLE_QUOTE:
						case IDENTIFIER:
						case OPEN_SQUARE:
						case CLOSE_SQUARE:
						case COMMA:
						case FUNCTION:
						case IF:
						case ELSE:
						case TRY:
						case CATCH:
						case FOR:
						case IN:
						case WHILE:
						case DO:
						case OPEN_CURLY:
						case CLOSE_CURLY:
						case SWITCH:
						case CASE:
						case COLON:
						case DEFAULT:
						case BREAK:
						case MATH_OPERATOR:
						case STRING_OPERATOR:
						case CONDITION_OPERATOR:
						case BOOLEAN_OPERATOR:
						case DIGIT:
						case LETTER:
						case UNDERSCORE:
						case WS:
						case COMMENT:
						case LINE_COMMENT:
						case OTHER: {
							alt15 = 3;
						}
							break;
						
						}
						
						switch (alt15) {
						case 1:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:229:19:
							// ESCAPE_SINGLE_QUOTE
						{
							ESCAPE_SINGLE_QUOTE48 = (Token) match(input, ESCAPE_SINGLE_QUOTE,
									FOLLOW_ESCAPE_SINGLE_QUOTE_in_stringLiteral498);
							ESCAPE_SINGLE_QUOTE48_tree = (Object) adaptor.create(ESCAPE_SINGLE_QUOTE48);
							adaptor.addChild(root_0, ESCAPE_SINGLE_QUOTE48_tree);
							
						}
							break;
						case 2:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:229:41:
							// innerStringCFML
						{
							pushFollow(FOLLOW_innerStringCFML_in_stringLiteral502);
							innerStringCFML49 = innerStringCFML();
							
							state._fsp--;
							
							adaptor.addChild(root_0, innerStringCFML49.getTree());
							
						}
							break;
						case 3:
							// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:229:59:
							// ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH )
						{
							set50 = (Token) input.LT(1);
							if ((input.LA(1) >= FUNCTION_CALL && input.LA(1) <= NUMBER)
									|| (input.LA(1) >= DOT && input.LA(1) <= ESCAPE_DOUBLE_QUOTE)
									|| (input.LA(1) >= IDENTIFIER && input.LA(1) <= OTHER)) {
								input.consume();
								adaptor.addChild(root_0, (Object) adaptor.create(set50));
								state.errorRecovery = false;
							} else {
								MismatchedSetException mse = new MismatchedSetException(null, input);
								throw mse;
							}
							
						}
							break;
						
						default:
							break loop15;
						}
					} while (true);
					
					SINGLE_QUOTE51 = (Token) match(input, SINGLE_QUOTE, FOLLOW_SINGLE_QUOTE_in_stringLiteral522);
					SINGLE_QUOTE51_tree = (Object) adaptor.create(SINGLE_QUOTE51);
					adaptor.addChild(root_0, SINGLE_QUOTE51_tree);
					
				}
				
			}
				break;
			
			}
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "stringLiteral"
	
	public static class identifier_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "identifier"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:233:1:
	// identifier : IDENTIFIER ( struct )? ( EOF )? ;
	public final CFScriptParser.identifier_return identifier() throws RecognitionException {
		CFScriptParser.identifier_return retval = new CFScriptParser.identifier_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token IDENTIFIER52 = null;
		Token EOF54 = null;
		CFScriptParser.struct_return struct53 = null;
		
		Object IDENTIFIER52_tree = null;
		Object EOF54_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:234:2:
			// ( IDENTIFIER ( struct )? ( EOF )? )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:235:2:
			// IDENTIFIER ( struct )? ( EOF )?
			{
				root_0 = (Object) adaptor.nil();
				
				IDENTIFIER52 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_identifier537);
				IDENTIFIER52_tree = (Object) adaptor.create(IDENTIFIER52);
				adaptor.addChild(root_0, IDENTIFIER52_tree);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:235:13:
				// ( struct )?
				int alt17 = 2;
				int LA17_0 = input.LA(1);
				
				if ((LA17_0 == OPEN_SQUARE)) {
					alt17 = 1;
				}
				switch (alt17) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:235:14:
					// struct
				{
					pushFollow(FOLLOW_struct_in_identifier540);
					struct53 = struct();
					
					state._fsp--;
					
					adaptor.addChild(root_0, struct53.getTree());
					
				}
					break;
				
				}
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:235:23:
				// ( EOF )?
				int alt18 = 2;
				int LA18_0 = input.LA(1);
				
				if ((LA18_0 == EOF)) {
					alt18 = 1;
				}
				switch (alt18) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:235:24:
					// EOF
				{
					EOF54 = (Token) match(input, EOF, FOLLOW_EOF_in_identifier545);
					
				}
					break;
				
				}
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "identifier"
	
	public static class struct_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "struct"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:238:1: struct
	// : OPEN_SQUARE codeStatement CLOSE_SQUARE ;
	public final CFScriptParser.struct_return struct() throws RecognitionException {
		CFScriptParser.struct_return retval = new CFScriptParser.struct_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token OPEN_SQUARE55 = null;
		Token CLOSE_SQUARE57 = null;
		CFScriptParser.codeStatement_return codeStatement56 = null;
		
		Object OPEN_SQUARE55_tree = null;
		Object CLOSE_SQUARE57_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:239:2:
			// ( OPEN_SQUARE codeStatement CLOSE_SQUARE )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:240:2:
			// OPEN_SQUARE codeStatement CLOSE_SQUARE
			{
				root_0 = (Object) adaptor.nil();
				
				OPEN_SQUARE55 = (Token) match(input, OPEN_SQUARE, FOLLOW_OPEN_SQUARE_in_struct561);
				OPEN_SQUARE55_tree = (Object) adaptor.create(OPEN_SQUARE55);
				adaptor.addChild(root_0, OPEN_SQUARE55_tree);
				
				pushFollow(FOLLOW_codeStatement_in_struct563);
				codeStatement56 = codeStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, codeStatement56.getTree());
				CLOSE_SQUARE57 = (Token) match(input, CLOSE_SQUARE, FOLLOW_CLOSE_SQUARE_in_struct565);
				CLOSE_SQUARE57_tree = (Object) adaptor.create(CLOSE_SQUARE57);
				adaptor.addChild(root_0, CLOSE_SQUARE57_tree);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "struct"
	
	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "function"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:243:1:
	// function : id= IDENTIFIER OPEN_PAREN ( argumentStatement )? CLOSE_PAREN -> ^( FUNCTION_CALL[$id] OPEN_PAREN (
	// argumentStatement )? CLOSE_PAREN ) ;
	public final CFScriptParser.function_return function() throws RecognitionException {
		CFScriptParser.function_return retval = new CFScriptParser.function_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token id = null;
		Token OPEN_PAREN58 = null;
		Token CLOSE_PAREN60 = null;
		CFScriptParser.argumentStatement_return argumentStatement59 = null;
		
		Object id_tree = null;
		Object OPEN_PAREN58_tree = null;
		Object CLOSE_PAREN60_tree = null;
		RewriteRuleTokenStream stream_OPEN_PAREN = new RewriteRuleTokenStream(adaptor, "token OPEN_PAREN");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_CLOSE_PAREN = new RewriteRuleTokenStream(adaptor, "token CLOSE_PAREN");
		RewriteRuleSubtreeStream stream_argumentStatement = new RewriteRuleSubtreeStream(adaptor,
				"rule argumentStatement");
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:244:2:
			// (id= IDENTIFIER OPEN_PAREN ( argumentStatement )? CLOSE_PAREN -> ^( FUNCTION_CALL[$id] OPEN_PAREN (
			// argumentStatement )? CLOSE_PAREN ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:245:2:
			// id= IDENTIFIER OPEN_PAREN ( argumentStatement )? CLOSE_PAREN
			{
				id = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_function580);
				stream_IDENTIFIER.add(id);
				
				OPEN_PAREN58 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_function582);
				stream_OPEN_PAREN.add(OPEN_PAREN58);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:245:27:
				// ( argumentStatement )?
				int alt19 = 2;
				int LA19_0 = input.LA(1);
				
				if ((LA19_0 == OPEN_PAREN || (LA19_0 >= NOT && LA19_0 <= HASH) || LA19_0 == DOUBLE_QUOTE
						|| LA19_0 == SINGLE_QUOTE || LA19_0 == IDENTIFIER)) {
					alt19 = 1;
				}
				switch (alt19) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:245:28:
					// argumentStatement
				{
					pushFollow(FOLLOW_argumentStatement_in_function585);
					argumentStatement59 = argumentStatement();
					
					state._fsp--;
					
					stream_argumentStatement.add(argumentStatement59.getTree());
					
				}
					break;
				
				}
				
				CLOSE_PAREN60 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_function589);
				stream_CLOSE_PAREN.add(CLOSE_PAREN60);
				
				// AST REWRITE
				// elements: argumentStatement, CLOSE_PAREN, OPEN_PAREN
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
						retval != null ? retval.tree : null);
				
				root_0 = (Object) adaptor.nil();
				// 246:2: -> ^( FUNCTION_CALL[$id] OPEN_PAREN ( argumentStatement )? CLOSE_PAREN )
				{
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:246:5:
					// ^( FUNCTION_CALL[$id] OPEN_PAREN ( argumentStatement )? CLOSE_PAREN )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(FUNCTION_CALL, id), root_1);
						
						adaptor.addChild(root_1, stream_OPEN_PAREN.nextNode());
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:246:37:
						// ( argumentStatement )?
						if (stream_argumentStatement.hasNext()) {
							adaptor.addChild(root_1, stream_argumentStatement.nextTree());
							
						}
						stream_argumentStatement.reset();
						adaptor.addChild(root_1, stream_CLOSE_PAREN.nextNode());
						
						adaptor.addChild(root_0, root_1);
					}
					
				}
				
				retval.tree = root_0;
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "function"
	
	public static class argumentStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "argumentStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:249:1:
	// argumentStatement : codeStatement ( COMMA codeStatement )* ;
	public final CFScriptParser.argumentStatement_return argumentStatement() throws RecognitionException {
		CFScriptParser.argumentStatement_return retval = new CFScriptParser.argumentStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token COMMA62 = null;
		CFScriptParser.codeStatement_return codeStatement61 = null;
		
		CFScriptParser.codeStatement_return codeStatement63 = null;
		
		Object COMMA62_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:250:2:
			// ( codeStatement ( COMMA codeStatement )* )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:251:2:
			// codeStatement ( COMMA codeStatement )*
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_codeStatement_in_argumentStatement619);
				codeStatement61 = codeStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, codeStatement61.getTree());
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:251:16:
				// ( COMMA codeStatement )*
				loop20: do {
					int alt20 = 2;
					int LA20_0 = input.LA(1);
					
					if ((LA20_0 == COMMA)) {
						alt20 = 1;
					}
					
					switch (alt20) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:251:17:
						// COMMA codeStatement
					{
						COMMA62 = (Token) match(input, COMMA, FOLLOW_COMMA_in_argumentStatement622);
						COMMA62_tree = (Object) adaptor.create(COMMA62);
						adaptor.addChild(root_0, COMMA62_tree);
						
						pushFollow(FOLLOW_codeStatement_in_argumentStatement624);
						codeStatement63 = codeStatement();
						
						state._fsp--;
						
						adaptor.addChild(root_0, codeStatement63.getTree());
						
					}
						break;
					
					default:
						break loop20;
					}
				} while (true);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "argumentStatement"
	
	public static class functionDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "functionDeclaration"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:254:1:
	// functionDeclaration : FUNCTION id= IDENTIFIER OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block -> ^(
	// FUNCTION FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block ) ;
	public final CFScriptParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		CFScriptParser.functionDeclaration_return retval = new CFScriptParser.functionDeclaration_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token id = null;
		Token FUNCTION64 = null;
		Token OPEN_PAREN65 = null;
		Token CLOSE_PAREN67 = null;
		CFScriptParser.argumentDeclaration_return argumentDeclaration66 = null;
		
		CFScriptParser.block_return block68 = null;
		
		Object id_tree = null;
		Object FUNCTION64_tree = null;
		Object OPEN_PAREN65_tree = null;
		Object CLOSE_PAREN67_tree = null;
		RewriteRuleTokenStream stream_OPEN_PAREN = new RewriteRuleTokenStream(adaptor, "token OPEN_PAREN");
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_CLOSE_PAREN = new RewriteRuleTokenStream(adaptor, "token CLOSE_PAREN");
		RewriteRuleSubtreeStream stream_argumentDeclaration = new RewriteRuleSubtreeStream(adaptor,
				"rule argumentDeclaration");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(adaptor, "rule block");
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:255:2:
			// ( FUNCTION id= IDENTIFIER OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block -> ^( FUNCTION
			// FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:256:2:
			// FUNCTION id= IDENTIFIER OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block
			{
				FUNCTION64 = (Token) match(input, FUNCTION, FOLLOW_FUNCTION_in_functionDeclaration638);
				stream_FUNCTION.add(FUNCTION64);
				
				id = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_functionDeclaration642);
				stream_IDENTIFIER.add(id);
				
				OPEN_PAREN65 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_functionDeclaration644);
				stream_OPEN_PAREN.add(OPEN_PAREN65);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:256:36:
				// ( argumentDeclaration )?
				int alt21 = 2;
				int LA21_0 = input.LA(1);
				
				if ((LA21_0 == IDENTIFIER)) {
					alt21 = 1;
				}
				switch (alt21) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:256:37:
					// argumentDeclaration
				{
					pushFollow(FOLLOW_argumentDeclaration_in_functionDeclaration647);
					argumentDeclaration66 = argumentDeclaration();
					
					state._fsp--;
					
					stream_argumentDeclaration.add(argumentDeclaration66.getTree());
					
				}
					break;
				
				}
				
				CLOSE_PAREN67 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_functionDeclaration651);
				stream_CLOSE_PAREN.add(CLOSE_PAREN67);
				
				pushFollow(FOLLOW_block_in_functionDeclaration654);
				block68 = block();
				
				state._fsp--;
				
				stream_block.add(block68.getTree());
				
				// AST REWRITE
				// elements: argumentDeclaration, CLOSE_PAREN, OPEN_PAREN, block, FUNCTION
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
						retval != null ? retval.tree : null);
				
				root_0 = (Object) adaptor.nil();
				// 258:2: -> ^( FUNCTION FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block
				// )
				{
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:258:5:
					// ^( FUNCTION FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
						
						adaptor.addChild(root_1, (Object) adaptor.create(FUNCTION_DECLARATION, id));
						adaptor.addChild(root_1, stream_OPEN_PAREN.nextNode());
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:258:53:
						// ( argumentDeclaration )?
						if (stream_argumentDeclaration.hasNext()) {
							adaptor.addChild(root_1, stream_argumentDeclaration.nextTree());
							
						}
						stream_argumentDeclaration.reset();
						adaptor.addChild(root_1, stream_CLOSE_PAREN.nextNode());
						adaptor.addChild(root_1, stream_block.nextTree());
						
						adaptor.addChild(root_0, root_1);
					}
					
				}
				
				retval.tree = root_0;
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "functionDeclaration"
	
	public static class argumentDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "argumentDeclaration"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:261:1:
	// argumentDeclaration : IDENTIFIER ( COMMA IDENTIFIER )* ;
	public final CFScriptParser.argumentDeclaration_return argumentDeclaration() throws RecognitionException {
		CFScriptParser.argumentDeclaration_return retval = new CFScriptParser.argumentDeclaration_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token IDENTIFIER69 = null;
		Token COMMA70 = null;
		Token IDENTIFIER71 = null;
		
		Object IDENTIFIER69_tree = null;
		Object COMMA70_tree = null;
		Object IDENTIFIER71_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:262:2:
			// ( IDENTIFIER ( COMMA IDENTIFIER )* )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:263:2:
			// IDENTIFIER ( COMMA IDENTIFIER )*
			{
				root_0 = (Object) adaptor.nil();
				
				IDENTIFIER69 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_argumentDeclaration688);
				IDENTIFIER69_tree = (Object) adaptor.create(IDENTIFIER69);
				adaptor.addChild(root_0, IDENTIFIER69_tree);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:263:13:
				// ( COMMA IDENTIFIER )*
				loop22: do {
					int alt22 = 2;
					int LA22_0 = input.LA(1);
					
					if ((LA22_0 == COMMA)) {
						alt22 = 1;
					}
					
					switch (alt22) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:263:14:
						// COMMA IDENTIFIER
					{
						COMMA70 = (Token) match(input, COMMA, FOLLOW_COMMA_in_argumentDeclaration691);
						COMMA70_tree = (Object) adaptor.create(COMMA70);
						adaptor.addChild(root_0, COMMA70_tree);
						
						IDENTIFIER71 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_argumentDeclaration693);
						IDENTIFIER71_tree = (Object) adaptor.create(IDENTIFIER71);
						adaptor.addChild(root_0, IDENTIFIER71_tree);
						
					}
						break;
					
					default:
						break loop22;
					}
				} while (true);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "argumentDeclaration"
	
	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "ifStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:266:1:
	// ifStatement : IF OPEN_PAREN codeStatement CLOSE_PAREN block ( elseifStatement )* ( elseStatement )? ;
	public final CFScriptParser.ifStatement_return ifStatement() throws RecognitionException {
		CFScriptParser.ifStatement_return retval = new CFScriptParser.ifStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token IF72 = null;
		Token OPEN_PAREN73 = null;
		Token CLOSE_PAREN75 = null;
		CFScriptParser.codeStatement_return codeStatement74 = null;
		
		CFScriptParser.block_return block76 = null;
		
		CFScriptParser.elseifStatement_return elseifStatement77 = null;
		
		CFScriptParser.elseStatement_return elseStatement78 = null;
		
		Object IF72_tree = null;
		Object OPEN_PAREN73_tree = null;
		Object CLOSE_PAREN75_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:267:2:
			// ( IF OPEN_PAREN codeStatement CLOSE_PAREN block ( elseifStatement )* ( elseStatement )? )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:268:2:
			// IF OPEN_PAREN codeStatement CLOSE_PAREN block ( elseifStatement )* ( elseStatement )?
			{
				root_0 = (Object) adaptor.nil();
				
				IF72 = (Token) match(input, IF, FOLLOW_IF_in_ifStatement707);
				IF72_tree = (Object) adaptor.create(IF72);
				root_0 = (Object) adaptor.becomeRoot(IF72_tree, root_0);
				
				OPEN_PAREN73 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_ifStatement710);
				OPEN_PAREN73_tree = (Object) adaptor.create(OPEN_PAREN73);
				adaptor.addChild(root_0, OPEN_PAREN73_tree);
				
				pushFollow(FOLLOW_codeStatement_in_ifStatement712);
				codeStatement74 = codeStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, codeStatement74.getTree());
				CLOSE_PAREN75 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_ifStatement714);
				CLOSE_PAREN75_tree = (Object) adaptor.create(CLOSE_PAREN75);
				adaptor.addChild(root_0, CLOSE_PAREN75_tree);
				
				pushFollow(FOLLOW_block_in_ifStatement717);
				block76 = block();
				
				state._fsp--;
				
				adaptor.addChild(root_0, block76.getTree());
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:270:2:
				// ( elseifStatement )*
				loop23: do {
					int alt23 = 2;
					int LA23_0 = input.LA(1);
					
					if ((LA23_0 == ELSE)) {
						int LA23_1 = input.LA(2);
						
						if ((LA23_1 == IF)) {
							alt23 = 1;
						}
						
					}
					
					switch (alt23) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:270:3:
						// elseifStatement
					{
						pushFollow(FOLLOW_elseifStatement_in_ifStatement721);
						elseifStatement77 = elseifStatement();
						
						state._fsp--;
						
						adaptor.addChild(root_0, elseifStatement77.getTree());
						
					}
						break;
					
					default:
						break loop23;
					}
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:271:2:
				// ( elseStatement )?
				int alt24 = 2;
				int LA24_0 = input.LA(1);
				
				if ((LA24_0 == ELSE)) {
					alt24 = 1;
				}
				switch (alt24) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:271:3:
					// elseStatement
				{
					pushFollow(FOLLOW_elseStatement_in_ifStatement727);
					elseStatement78 = elseStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, elseStatement78.getTree());
					
				}
					break;
				
				}
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "ifStatement"
	
	public static class elseifStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "elseifStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:274:1:
	// elseifStatement : ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block -> ^( ELSEIF ELSE IF OPEN_PAREN
	// codeStatement CLOSE_PAREN block ) ;
	public final CFScriptParser.elseifStatement_return elseifStatement() throws RecognitionException {
		CFScriptParser.elseifStatement_return retval = new CFScriptParser.elseifStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token ELSE79 = null;
		Token IF80 = null;
		Token OPEN_PAREN81 = null;
		Token CLOSE_PAREN83 = null;
		CFScriptParser.codeStatement_return codeStatement82 = null;
		
		CFScriptParser.block_return block84 = null;
		
		Object ELSE79_tree = null;
		Object IF80_tree = null;
		Object OPEN_PAREN81_tree = null;
		Object CLOSE_PAREN83_tree = null;
		RewriteRuleTokenStream stream_OPEN_PAREN = new RewriteRuleTokenStream(adaptor, "token OPEN_PAREN");
		RewriteRuleTokenStream stream_ELSE = new RewriteRuleTokenStream(adaptor, "token ELSE");
		RewriteRuleTokenStream stream_CLOSE_PAREN = new RewriteRuleTokenStream(adaptor, "token CLOSE_PAREN");
		RewriteRuleTokenStream stream_IF = new RewriteRuleTokenStream(adaptor, "token IF");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(adaptor, "rule block");
		RewriteRuleSubtreeStream stream_codeStatement = new RewriteRuleSubtreeStream(adaptor, "rule codeStatement");
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:275:2:
			// ( ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block -> ^( ELSEIF ELSE IF OPEN_PAREN codeStatement
			// CLOSE_PAREN block ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:276:2:
			// ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block
			{
				ELSE79 = (Token) match(input, ELSE, FOLLOW_ELSE_in_elseifStatement742);
				stream_ELSE.add(ELSE79);
				
				IF80 = (Token) match(input, IF, FOLLOW_IF_in_elseifStatement744);
				stream_IF.add(IF80);
				
				OPEN_PAREN81 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_elseifStatement746);
				stream_OPEN_PAREN.add(OPEN_PAREN81);
				
				pushFollow(FOLLOW_codeStatement_in_elseifStatement748);
				codeStatement82 = codeStatement();
				
				state._fsp--;
				
				stream_codeStatement.add(codeStatement82.getTree());
				CLOSE_PAREN83 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_elseifStatement750);
				stream_CLOSE_PAREN.add(CLOSE_PAREN83);
				
				pushFollow(FOLLOW_block_in_elseifStatement754);
				block84 = block();
				
				state._fsp--;
				
				stream_block.add(block84.getTree());
				
				// AST REWRITE
				// elements: CLOSE_PAREN, block, OPEN_PAREN, codeStatement, IF, ELSE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
						retval != null ? retval.tree : null);
				
				root_0 = (Object) adaptor.nil();
				// 278:2: -> ^( ELSEIF ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block )
				{
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:278:5:
					// ^( ELSEIF ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(ELSEIF, "ELSEIF"), root_1);
						
						adaptor.addChild(root_1, stream_ELSE.nextNode());
						adaptor.addChild(root_1, stream_IF.nextNode());
						adaptor.addChild(root_1, stream_OPEN_PAREN.nextNode());
						adaptor.addChild(root_1, stream_codeStatement.nextTree());
						adaptor.addChild(root_1, stream_CLOSE_PAREN.nextNode());
						adaptor.addChild(root_1, stream_block.nextTree());
						
						adaptor.addChild(root_0, root_1);
					}
					
				}
				
				retval.tree = root_0;
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "elseifStatement"
	
	public static class elseStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "elseStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:284:1:
	// elseStatement : ELSE block ;
	public final CFScriptParser.elseStatement_return elseStatement() throws RecognitionException {
		CFScriptParser.elseStatement_return retval = new CFScriptParser.elseStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token ELSE85 = null;
		CFScriptParser.block_return block86 = null;
		
		Object ELSE85_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:285:2:
			// ( ELSE block )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:286:2:
			// ELSE block
			{
				root_0 = (Object) adaptor.nil();
				
				ELSE85 = (Token) match(input, ELSE, FOLLOW_ELSE_in_elseStatement798);
				ELSE85_tree = (Object) adaptor.create(ELSE85);
				root_0 = (Object) adaptor.becomeRoot(ELSE85_tree, root_0);
				
				pushFollow(FOLLOW_block_in_elseStatement802);
				block86 = block();
				
				state._fsp--;
				
				adaptor.addChild(root_0, block86.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "elseStatement"
	
	public static class tryStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "tryStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:290:1:
	// tryStatement : TRY block catchStatement ;
	public final CFScriptParser.tryStatement_return tryStatement() throws RecognitionException {
		CFScriptParser.tryStatement_return retval = new CFScriptParser.tryStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token TRY87 = null;
		CFScriptParser.block_return block88 = null;
		
		CFScriptParser.catchStatement_return catchStatement89 = null;
		
		Object TRY87_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:291:2:
			// ( TRY block catchStatement )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:292:2:
			// TRY block catchStatement
			{
				root_0 = (Object) adaptor.nil();
				
				TRY87 = (Token) match(input, TRY, FOLLOW_TRY_in_tryStatement814);
				TRY87_tree = (Object) adaptor.create(TRY87);
				root_0 = (Object) adaptor.becomeRoot(TRY87_tree, root_0);
				
				pushFollow(FOLLOW_block_in_tryStatement818);
				block88 = block();
				
				state._fsp--;
				
				adaptor.addChild(root_0, block88.getTree());
				pushFollow(FOLLOW_catchStatement_in_tryStatement821);
				catchStatement89 = catchStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, catchStatement89.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "tryStatement"
	
	public static class catchClass_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "catchClass"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:298:1:
	// catchClass : IDENTIFIER ( DOT IDENTIFIER )* ;
	public final CFScriptParser.catchClass_return catchClass() throws RecognitionException {
		CFScriptParser.catchClass_return retval = new CFScriptParser.catchClass_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token IDENTIFIER90 = null;
		Token DOT91 = null;
		Token IDENTIFIER92 = null;
		
		Object IDENTIFIER90_tree = null;
		Object DOT91_tree = null;
		Object IDENTIFIER92_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:299:2:
			// ( IDENTIFIER ( DOT IDENTIFIER )* )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:300:2:
			// IDENTIFIER ( DOT IDENTIFIER )*
			{
				root_0 = (Object) adaptor.nil();
				
				IDENTIFIER90 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_catchClass835);
				IDENTIFIER90_tree = (Object) adaptor.create(IDENTIFIER90);
				adaptor.addChild(root_0, IDENTIFIER90_tree);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:300:12:
				// ( DOT IDENTIFIER )*
				loop25: do {
					int alt25 = 2;
					int LA25_0 = input.LA(1);
					
					if ((LA25_0 == DOT)) {
						alt25 = 1;
					}
					
					switch (alt25) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:300:13:
						// DOT IDENTIFIER
					{
						DOT91 = (Token) match(input, DOT, FOLLOW_DOT_in_catchClass837);
						DOT91_tree = (Object) adaptor.create(DOT91);
						adaptor.addChild(root_0, DOT91_tree);
						
						IDENTIFIER92 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_catchClass839);
						IDENTIFIER92_tree = (Object) adaptor.create(IDENTIFIER92);
						adaptor.addChild(root_0, IDENTIFIER92_tree);
						
					}
						break;
					
					default:
						break loop25;
					}
				} while (true);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "catchClass"
	
	public static class catchStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "catchStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:303:1:
	// catchStatement : CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block -> ^( CATCH OPEN_PAREN catchClass
	// IDENTIFIER CLOSE_PAREN block ) ;
	public final CFScriptParser.catchStatement_return catchStatement() throws RecognitionException {
		CFScriptParser.catchStatement_return retval = new CFScriptParser.catchStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token CATCH93 = null;
		Token OPEN_PAREN94 = null;
		Token IDENTIFIER96 = null;
		Token CLOSE_PAREN97 = null;
		CFScriptParser.catchClass_return catchClass95 = null;
		
		CFScriptParser.block_return block98 = null;
		
		Object CATCH93_tree = null;
		Object OPEN_PAREN94_tree = null;
		Object IDENTIFIER96_tree = null;
		Object CLOSE_PAREN97_tree = null;
		RewriteRuleTokenStream stream_CATCH = new RewriteRuleTokenStream(adaptor, "token CATCH");
		RewriteRuleTokenStream stream_OPEN_PAREN = new RewriteRuleTokenStream(adaptor, "token OPEN_PAREN");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_CLOSE_PAREN = new RewriteRuleTokenStream(adaptor, "token CLOSE_PAREN");
		RewriteRuleSubtreeStream stream_catchClass = new RewriteRuleSubtreeStream(adaptor, "rule catchClass");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(adaptor, "rule block");
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:304:2:
			// ( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block -> ^( CATCH OPEN_PAREN catchClass IDENTIFIER
			// CLOSE_PAREN block ) )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:305:2:
			// CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block
			{
				CATCH93 = (Token) match(input, CATCH, FOLLOW_CATCH_in_catchStatement854);
				stream_CATCH.add(CATCH93);
				
				OPEN_PAREN94 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_catchStatement856);
				stream_OPEN_PAREN.add(OPEN_PAREN94);
				
				pushFollow(FOLLOW_catchClass_in_catchStatement858);
				catchClass95 = catchClass();
				
				state._fsp--;
				
				stream_catchClass.add(catchClass95.getTree());
				IDENTIFIER96 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_catchStatement860);
				stream_IDENTIFIER.add(IDENTIFIER96);
				
				CLOSE_PAREN97 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_catchStatement862);
				stream_CLOSE_PAREN.add(CLOSE_PAREN97);
				
				pushFollow(FOLLOW_block_in_catchStatement865);
				block98 = block();
				
				state._fsp--;
				
				stream_block.add(block98.getTree());
				
				// AST REWRITE
				// elements: block, CLOSE_PAREN, CATCH, catchClass, OPEN_PAREN, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
						retval != null ? retval.tree : null);
				
				root_0 = (Object) adaptor.nil();
				// 307:2: -> ^( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block )
				{
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:307:5:
					// ^( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block )
					{
						Object root_1 = (Object) adaptor.nil();
						root_1 = (Object) adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);
						
						adaptor.addChild(root_1, stream_OPEN_PAREN.nextNode());
						adaptor.addChild(root_1, stream_catchClass.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_1, stream_CLOSE_PAREN.nextNode());
						adaptor.addChild(root_1, stream_block.nextTree());
						
						adaptor.addChild(root_0, root_1);
					}
					
				}
				
				retval.tree = root_0;
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "catchStatement"
	
	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "forStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:311:1:
	// forStatement : FOR OPEN_PAREN ( forConditions | forIn ) CLOSE_PAREN block ;
	public final CFScriptParser.forStatement_return forStatement() throws RecognitionException {
		CFScriptParser.forStatement_return retval = new CFScriptParser.forStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token FOR99 = null;
		Token OPEN_PAREN100 = null;
		Token CLOSE_PAREN103 = null;
		CFScriptParser.forConditions_return forConditions101 = null;
		
		CFScriptParser.forIn_return forIn102 = null;
		
		CFScriptParser.block_return block104 = null;
		
		Object FOR99_tree = null;
		Object OPEN_PAREN100_tree = null;
		Object CLOSE_PAREN103_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:312:2:
			// ( FOR OPEN_PAREN ( forConditions | forIn ) CLOSE_PAREN block )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:313:2:
			// FOR OPEN_PAREN ( forConditions | forIn ) CLOSE_PAREN block
			{
				root_0 = (Object) adaptor.nil();
				
				FOR99 = (Token) match(input, FOR, FOLLOW_FOR_in_forStatement897);
				FOR99_tree = (Object) adaptor.create(FOR99);
				root_0 = (Object) adaptor.becomeRoot(FOR99_tree, root_0);
				
				OPEN_PAREN100 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_forStatement900);
				OPEN_PAREN100_tree = (Object) adaptor.create(OPEN_PAREN100);
				adaptor.addChild(root_0, OPEN_PAREN100_tree);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:313:18:
				// ( forConditions | forIn )
				int alt26 = 2;
				int LA26_0 = input.LA(1);
				
				if ((LA26_0 == VAR || LA26_0 == OPEN_PAREN || (LA26_0 >= NOT && LA26_0 <= HASH)
						|| LA26_0 == DOUBLE_QUOTE || LA26_0 == SINGLE_QUOTE)) {
					alt26 = 1;
				} else if ((LA26_0 == IDENTIFIER)) {
					int LA26_2 = input.LA(2);
					
					if ((LA26_2 == EOF || LA26_2 == SEMI_COLON || (LA26_2 >= EQUALS && LA26_2 <= OPEN_PAREN)
							|| LA26_2 == OPERATOR || LA26_2 == DOT || LA26_2 == OPEN_SQUARE)) {
						alt26 = 1;
					} else if ((LA26_2 == IN)) {
						alt26 = 2;
					} else {
						NoViableAltException nvae = new NoViableAltException("", 26, 2, input);
						
						throw nvae;
					}
				} else {
					NoViableAltException nvae = new NoViableAltException("", 26, 0, input);
					
					throw nvae;
				}
				switch (alt26) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:313:19:
					// forConditions
				{
					pushFollow(FOLLOW_forConditions_in_forStatement903);
					forConditions101 = forConditions();
					
					state._fsp--;
					
					adaptor.addChild(root_0, forConditions101.getTree());
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:313:35:
					// forIn
				{
					pushFollow(FOLLOW_forIn_in_forStatement907);
					forIn102 = forIn();
					
					state._fsp--;
					
					adaptor.addChild(root_0, forIn102.getTree());
					
				}
					break;
				
				}
				
				CLOSE_PAREN103 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_forStatement910);
				CLOSE_PAREN103_tree = (Object) adaptor.create(CLOSE_PAREN103);
				adaptor.addChild(root_0, CLOSE_PAREN103_tree);
				
				pushFollow(FOLLOW_block_in_forStatement913);
				block104 = block();
				
				state._fsp--;
				
				adaptor.addChild(root_0, block104.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "forStatement"
	
	public static class forIn_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "forIn"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:316:1: forIn :
	// IDENTIFIER IN cfmlLinking ;
	public final CFScriptParser.forIn_return forIn() throws RecognitionException {
		CFScriptParser.forIn_return retval = new CFScriptParser.forIn_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token IDENTIFIER105 = null;
		Token IN106 = null;
		CFScriptParser.cfmlLinking_return cfmlLinking107 = null;
		
		Object IDENTIFIER105_tree = null;
		Object IN106_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:317:2:
			// ( IDENTIFIER IN cfmlLinking )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:318:2:
			// IDENTIFIER IN cfmlLinking
			{
				root_0 = (Object) adaptor.nil();
				
				IDENTIFIER105 = (Token) match(input, IDENTIFIER, FOLLOW_IDENTIFIER_in_forIn924);
				IDENTIFIER105_tree = (Object) adaptor.create(IDENTIFIER105);
				adaptor.addChild(root_0, IDENTIFIER105_tree);
				
				IN106 = (Token) match(input, IN, FOLLOW_IN_in_forIn926);
				IN106_tree = (Object) adaptor.create(IN106);
				adaptor.addChild(root_0, IN106_tree);
				
				pushFollow(FOLLOW_cfmlLinking_in_forIn928);
				cfmlLinking107 = cfmlLinking();
				
				state._fsp--;
				
				adaptor.addChild(root_0, cfmlLinking107.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "forIn"
	
	public static class forConditions_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "forConditions"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:321:1:
	// forConditions : setStatement SEMI_COLON setStatement SEMI_COLON setStatement ;
	public final CFScriptParser.forConditions_return forConditions() throws RecognitionException {
		CFScriptParser.forConditions_return retval = new CFScriptParser.forConditions_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token SEMI_COLON109 = null;
		Token SEMI_COLON111 = null;
		CFScriptParser.setStatement_return setStatement108 = null;
		
		CFScriptParser.setStatement_return setStatement110 = null;
		
		CFScriptParser.setStatement_return setStatement112 = null;
		
		Object SEMI_COLON109_tree = null;
		Object SEMI_COLON111_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:322:2:
			// ( setStatement SEMI_COLON setStatement SEMI_COLON setStatement )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:323:2:
			// setStatement SEMI_COLON setStatement SEMI_COLON setStatement
			{
				root_0 = (Object) adaptor.nil();
				
				pushFollow(FOLLOW_setStatement_in_forConditions940);
				setStatement108 = setStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, setStatement108.getTree());
				SEMI_COLON109 = (Token) match(input, SEMI_COLON, FOLLOW_SEMI_COLON_in_forConditions943);
				SEMI_COLON109_tree = (Object) adaptor.create(SEMI_COLON109);
				adaptor.addChild(root_0, SEMI_COLON109_tree);
				
				pushFollow(FOLLOW_setStatement_in_forConditions946);
				setStatement110 = setStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, setStatement110.getTree());
				SEMI_COLON111 = (Token) match(input, SEMI_COLON, FOLLOW_SEMI_COLON_in_forConditions949);
				SEMI_COLON111_tree = (Object) adaptor.create(SEMI_COLON111);
				adaptor.addChild(root_0, SEMI_COLON111_tree);
				
				pushFollow(FOLLOW_setStatement_in_forConditions952);
				setStatement112 = setStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, setStatement112.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "forConditions"
	
	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "whileStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:330:1:
	// whileStatement : WHILE OPEN_PAREN codeStatement CLOSE_PAREN block ;
	public final CFScriptParser.whileStatement_return whileStatement() throws RecognitionException {
		CFScriptParser.whileStatement_return retval = new CFScriptParser.whileStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token WHILE113 = null;
		Token OPEN_PAREN114 = null;
		Token CLOSE_PAREN116 = null;
		CFScriptParser.codeStatement_return codeStatement115 = null;
		
		CFScriptParser.block_return block117 = null;
		
		Object WHILE113_tree = null;
		Object OPEN_PAREN114_tree = null;
		Object CLOSE_PAREN116_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:331:2:
			// ( WHILE OPEN_PAREN codeStatement CLOSE_PAREN block )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:332:2:
			// WHILE OPEN_PAREN codeStatement CLOSE_PAREN block
			{
				root_0 = (Object) adaptor.nil();
				
				WHILE113 = (Token) match(input, WHILE, FOLLOW_WHILE_in_whileStatement964);
				WHILE113_tree = (Object) adaptor.create(WHILE113);
				root_0 = (Object) adaptor.becomeRoot(WHILE113_tree, root_0);
				
				OPEN_PAREN114 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_whileStatement967);
				OPEN_PAREN114_tree = (Object) adaptor.create(OPEN_PAREN114);
				adaptor.addChild(root_0, OPEN_PAREN114_tree);
				
				pushFollow(FOLLOW_codeStatement_in_whileStatement969);
				codeStatement115 = codeStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, codeStatement115.getTree());
				CLOSE_PAREN116 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_whileStatement971);
				CLOSE_PAREN116_tree = (Object) adaptor.create(CLOSE_PAREN116);
				adaptor.addChild(root_0, CLOSE_PAREN116_tree);
				
				pushFollow(FOLLOW_block_in_whileStatement974);
				block117 = block();
				
				state._fsp--;
				
				adaptor.addChild(root_0, block117.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "whileStatement"
	
	public static class doWhileStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "doWhileStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:336:1:
	// doWhileStatement : DO block WHILE OPEN_PAREN codeStatement CLOSE_PAREN ;
	public final CFScriptParser.doWhileStatement_return doWhileStatement() throws RecognitionException {
		CFScriptParser.doWhileStatement_return retval = new CFScriptParser.doWhileStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token DO118 = null;
		Token WHILE120 = null;
		Token OPEN_PAREN121 = null;
		Token CLOSE_PAREN123 = null;
		CFScriptParser.block_return block119 = null;
		
		CFScriptParser.codeStatement_return codeStatement122 = null;
		
		Object DO118_tree = null;
		Object WHILE120_tree = null;
		Object OPEN_PAREN121_tree = null;
		Object CLOSE_PAREN123_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:337:2:
			// ( DO block WHILE OPEN_PAREN codeStatement CLOSE_PAREN )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:338:2:
			// DO block WHILE OPEN_PAREN codeStatement CLOSE_PAREN
			{
				root_0 = (Object) adaptor.nil();
				
				DO118 = (Token) match(input, DO, FOLLOW_DO_in_doWhileStatement986);
				DO118_tree = (Object) adaptor.create(DO118);
				root_0 = (Object) adaptor.becomeRoot(DO118_tree, root_0);
				
				pushFollow(FOLLOW_block_in_doWhileStatement990);
				block119 = block();
				
				state._fsp--;
				
				adaptor.addChild(root_0, block119.getTree());
				WHILE120 = (Token) match(input, WHILE, FOLLOW_WHILE_in_doWhileStatement993);
				WHILE120_tree = (Object) adaptor.create(WHILE120);
				adaptor.addChild(root_0, WHILE120_tree);
				
				OPEN_PAREN121 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_doWhileStatement995);
				OPEN_PAREN121_tree = (Object) adaptor.create(OPEN_PAREN121);
				adaptor.addChild(root_0, OPEN_PAREN121_tree);
				
				pushFollow(FOLLOW_codeStatement_in_doWhileStatement997);
				codeStatement122 = codeStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, codeStatement122.getTree());
				CLOSE_PAREN123 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_doWhileStatement999);
				CLOSE_PAREN123_tree = (Object) adaptor.create(CLOSE_PAREN123);
				adaptor.addChild(root_0, CLOSE_PAREN123_tree);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "doWhileStatement"
	
	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "block"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:343:1: block :
	// ( ( OPEN_CURLY script CLOSE_CURLY ) ( SEMI_COLON )? | ( nonBlockStatement ) );
	public final CFScriptParser.block_return block() throws RecognitionException {
		CFScriptParser.block_return retval = new CFScriptParser.block_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token OPEN_CURLY124 = null;
		Token CLOSE_CURLY126 = null;
		Token SEMI_COLON127 = null;
		CFScriptParser.script_return script125 = null;
		
		CFScriptParser.nonBlockStatement_return nonBlockStatement128 = null;
		
		Object OPEN_CURLY124_tree = null;
		Object CLOSE_CURLY126_tree = null;
		Object SEMI_COLON127_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:344:2:
			// ( ( OPEN_CURLY script CLOSE_CURLY ) ( SEMI_COLON )? | ( nonBlockStatement ) )
			int alt28 = 2;
			int LA28_0 = input.LA(1);
			
			if ((LA28_0 == OPEN_CURLY)) {
				alt28 = 1;
			} else if ((LA28_0 == VAR || LA28_0 == OPEN_PAREN || LA28_0 == RETURN || (LA28_0 >= NOT && LA28_0 <= HASH)
					|| LA28_0 == DOUBLE_QUOTE || LA28_0 == SINGLE_QUOTE || LA28_0 == IDENTIFIER || LA28_0 == BREAK)) {
				alt28 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 28, 0, input);
				
				throw nvae;
			}
			switch (alt28) {
			case 1:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:345:2:
				// ( OPEN_CURLY script CLOSE_CURLY ) ( SEMI_COLON )?
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:345:2:
				// ( OPEN_CURLY script CLOSE_CURLY )
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:345:3:
				// OPEN_CURLY script CLOSE_CURLY
				{
					OPEN_CURLY124 = (Token) match(input, OPEN_CURLY, FOLLOW_OPEN_CURLY_in_block1012);
					OPEN_CURLY124_tree = (Object) adaptor.create(OPEN_CURLY124);
					adaptor.addChild(root_0, OPEN_CURLY124_tree);
					
					pushFollow(FOLLOW_script_in_block1014);
					script125 = script();
					
					state._fsp--;
					
					adaptor.addChild(root_0, script125.getTree());
					CLOSE_CURLY126 = (Token) match(input, CLOSE_CURLY, FOLLOW_CLOSE_CURLY_in_block1016);
					CLOSE_CURLY126_tree = (Object) adaptor.create(CLOSE_CURLY126);
					adaptor.addChild(root_0, CLOSE_CURLY126_tree);
					
				}
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:345:34:
				// ( SEMI_COLON )?
				int alt27 = 2;
				int LA27_0 = input.LA(1);
				
				if ((LA27_0 == SEMI_COLON)) {
					alt27 = 1;
				}
				switch (alt27) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:345:34:
					// SEMI_COLON
				{
					SEMI_COLON127 = (Token) match(input, SEMI_COLON, FOLLOW_SEMI_COLON_in_block1019);
					SEMI_COLON127_tree = (Object) adaptor.create(SEMI_COLON127);
					adaptor.addChild(root_0, SEMI_COLON127_tree);
					
				}
					break;
				
				}
				
			}
				break;
			case 2:
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:347:2:
				// ( nonBlockStatement )
			{
				root_0 = (Object) adaptor.nil();
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:347:2:
				// ( nonBlockStatement )
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:347:3:
				// nonBlockStatement
				{
					pushFollow(FOLLOW_nonBlockStatement_in_block1027);
					nonBlockStatement128 = nonBlockStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, nonBlockStatement128.getTree());
					
				}
				
			}
				break;
			
			}
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "block"
	
	public static class switchStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "switchStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:351:1:
	// switchStatement : SWITCH OPEN_PAREN codeStatement CLOSE_PAREN OPEN_CURLY ( caseStatement )* ( defaultStatement )?
	// CLOSE_CURLY ;
	public final CFScriptParser.switchStatement_return switchStatement() throws RecognitionException {
		CFScriptParser.switchStatement_return retval = new CFScriptParser.switchStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token SWITCH129 = null;
		Token OPEN_PAREN130 = null;
		Token CLOSE_PAREN132 = null;
		Token OPEN_CURLY133 = null;
		Token CLOSE_CURLY136 = null;
		CFScriptParser.codeStatement_return codeStatement131 = null;
		
		CFScriptParser.caseStatement_return caseStatement134 = null;
		
		CFScriptParser.defaultStatement_return defaultStatement135 = null;
		
		Object SWITCH129_tree = null;
		Object OPEN_PAREN130_tree = null;
		Object CLOSE_PAREN132_tree = null;
		Object OPEN_CURLY133_tree = null;
		Object CLOSE_CURLY136_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:352:2:
			// ( SWITCH OPEN_PAREN codeStatement CLOSE_PAREN OPEN_CURLY ( caseStatement )* ( defaultStatement )?
			// CLOSE_CURLY )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:353:2:
			// SWITCH OPEN_PAREN codeStatement CLOSE_PAREN OPEN_CURLY ( caseStatement )* ( defaultStatement )?
			// CLOSE_CURLY
			{
				root_0 = (Object) adaptor.nil();
				
				SWITCH129 = (Token) match(input, SWITCH, FOLLOW_SWITCH_in_switchStatement1041);
				SWITCH129_tree = (Object) adaptor.create(SWITCH129);
				root_0 = (Object) adaptor.becomeRoot(SWITCH129_tree, root_0);
				
				OPEN_PAREN130 = (Token) match(input, OPEN_PAREN, FOLLOW_OPEN_PAREN_in_switchStatement1044);
				OPEN_PAREN130_tree = (Object) adaptor.create(OPEN_PAREN130);
				adaptor.addChild(root_0, OPEN_PAREN130_tree);
				
				pushFollow(FOLLOW_codeStatement_in_switchStatement1046);
				codeStatement131 = codeStatement();
				
				state._fsp--;
				
				adaptor.addChild(root_0, codeStatement131.getTree());
				CLOSE_PAREN132 = (Token) match(input, CLOSE_PAREN, FOLLOW_CLOSE_PAREN_in_switchStatement1048);
				CLOSE_PAREN132_tree = (Object) adaptor.create(CLOSE_PAREN132);
				adaptor.addChild(root_0, CLOSE_PAREN132_tree);
				
				OPEN_CURLY133 = (Token) match(input, OPEN_CURLY, FOLLOW_OPEN_CURLY_in_switchStatement1051);
				OPEN_CURLY133_tree = (Object) adaptor.create(OPEN_CURLY133);
				adaptor.addChild(root_0, OPEN_CURLY133_tree);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:355:2:
				// ( caseStatement )*
				loop29: do {
					int alt29 = 2;
					int LA29_0 = input.LA(1);
					
					if ((LA29_0 == CASE)) {
						alt29 = 1;
					}
					
					switch (alt29) {
					case 1:
						// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:355:3:
						// caseStatement
					{
						pushFollow(FOLLOW_caseStatement_in_switchStatement1055);
						caseStatement134 = caseStatement();
						
						state._fsp--;
						
						adaptor.addChild(root_0, caseStatement134.getTree());
						
					}
						break;
					
					default:
						break loop29;
					}
				} while (true);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:356:2:
				// ( defaultStatement )?
				int alt30 = 2;
				int LA30_0 = input.LA(1);
				
				if ((LA30_0 == DEFAULT)) {
					alt30 = 1;
				}
				switch (alt30) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:356:3:
					// defaultStatement
				{
					pushFollow(FOLLOW_defaultStatement_in_switchStatement1061);
					defaultStatement135 = defaultStatement();
					
					state._fsp--;
					
					adaptor.addChild(root_0, defaultStatement135.getTree());
					
				}
					break;
				
				}
				
				CLOSE_CURLY136 = (Token) match(input, CLOSE_CURLY, FOLLOW_CLOSE_CURLY_in_switchStatement1066);
				CLOSE_CURLY136_tree = (Object) adaptor.create(CLOSE_CURLY136);
				adaptor.addChild(root_0, CLOSE_CURLY136_tree);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "switchStatement"
	
	public static class caseStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "caseStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:360:1:
	// caseStatement : CASE ( stringLiteral | NUMBER ) COLON script ;
	public final CFScriptParser.caseStatement_return caseStatement() throws RecognitionException {
		CFScriptParser.caseStatement_return retval = new CFScriptParser.caseStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token CASE137 = null;
		Token NUMBER139 = null;
		Token COLON140 = null;
		CFScriptParser.stringLiteral_return stringLiteral138 = null;
		
		CFScriptParser.script_return script141 = null;
		
		Object CASE137_tree = null;
		Object NUMBER139_tree = null;
		Object COLON140_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:361:2:
			// ( CASE ( stringLiteral | NUMBER ) COLON script )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:362:2:
			// CASE ( stringLiteral | NUMBER ) COLON script
			{
				root_0 = (Object) adaptor.nil();
				
				CASE137 = (Token) match(input, CASE, FOLLOW_CASE_in_caseStatement1079);
				CASE137_tree = (Object) adaptor.create(CASE137);
				root_0 = (Object) adaptor.becomeRoot(CASE137_tree, root_0);
				
				// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:362:8:
				// ( stringLiteral | NUMBER )
				int alt31 = 2;
				int LA31_0 = input.LA(1);
				
				if ((LA31_0 == DOUBLE_QUOTE || LA31_0 == SINGLE_QUOTE)) {
					alt31 = 1;
				} else if ((LA31_0 == NUMBER)) {
					alt31 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 31, 0, input);
					
					throw nvae;
				}
				switch (alt31) {
				case 1:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:362:9:
					// stringLiteral
				{
					pushFollow(FOLLOW_stringLiteral_in_caseStatement1083);
					stringLiteral138 = stringLiteral();
					
					state._fsp--;
					
					adaptor.addChild(root_0, stringLiteral138.getTree());
					
				}
					break;
				case 2:
					// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:362:25:
					// NUMBER
				{
					NUMBER139 = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_caseStatement1087);
					NUMBER139_tree = (Object) adaptor.create(NUMBER139);
					adaptor.addChild(root_0, NUMBER139_tree);
					
				}
					break;
				
				}
				
				COLON140 = (Token) match(input, COLON, FOLLOW_COLON_in_caseStatement1090);
				COLON140_tree = (Object) adaptor.create(COLON140);
				adaptor.addChild(root_0, COLON140_tree);
				
				pushFollow(FOLLOW_script_in_caseStatement1093);
				script141 = script();
				
				state._fsp--;
				
				adaptor.addChild(root_0, script141.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "caseStatement"
	
	public static class defaultStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "defaultStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:366:1:
	// defaultStatement : DEFAULT COLON script ;
	public final CFScriptParser.defaultStatement_return defaultStatement() throws RecognitionException {
		CFScriptParser.defaultStatement_return retval = new CFScriptParser.defaultStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token DEFAULT142 = null;
		Token COLON143 = null;
		CFScriptParser.script_return script144 = null;
		
		Object DEFAULT142_tree = null;
		Object COLON143_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:367:2:
			// ( DEFAULT COLON script )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:368:2:
			// DEFAULT COLON script
			{
				root_0 = (Object) adaptor.nil();
				
				DEFAULT142 = (Token) match(input, DEFAULT, FOLLOW_DEFAULT_in_defaultStatement1105);
				DEFAULT142_tree = (Object) adaptor.create(DEFAULT142);
				root_0 = (Object) adaptor.becomeRoot(DEFAULT142_tree, root_0);
				
				COLON143 = (Token) match(input, COLON, FOLLOW_COLON_in_defaultStatement1108);
				COLON143_tree = (Object) adaptor.create(COLON143);
				adaptor.addChild(root_0, COLON143_tree);
				
				pushFollow(FOLLOW_script_in_defaultStatement1111);
				script144 = script();
				
				state._fsp--;
				
				adaptor.addChild(root_0, script144.getTree());
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "defaultStatement"
	
	public static class breakStatement_return extends ParserRuleReturnScope {
		Object tree;
		
		public Object getTree() {
			return tree;
		}
	};
	
	// $ANTLR start "breakStatement"
	// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:373:1:
	// breakStatement : BREAK ;
	public final CFScriptParser.breakStatement_return breakStatement() throws RecognitionException {
		CFScriptParser.breakStatement_return retval = new CFScriptParser.breakStatement_return();
		retval.start = input.LT(1);
		
		Object root_0 = null;
		
		Token BREAK145 = null;
		
		Object BREAK145_tree = null;
		
		try {
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:374:2:
			// ( BREAK )
			// /Users/denny/Documents/workspace-cfe-trunk/cfml.parsing/src/cfml/parsing/cfmentat/antlr/CFScript.g:375:2:
			// BREAK
			{
				root_0 = (Object) adaptor.nil();
				
				BREAK145 = (Token) match(input, BREAK, FOLLOW_BREAK_in_breakStatement1124);
				BREAK145_tree = (Object) adaptor.create(BREAK145);
				adaptor.addChild(root_0, BREAK145_tree);
				
			}
			
			retval.stop = input.LT(-1);
			
			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
			
		} finally {
		}
		return retval;
	}
	
	// $ANTLR end "breakStatement"
	
	// Delegated rules
	
	public static final BitSet FOLLOW_nonBlockStatement_in_script96 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_ifStatement_in_script107 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_tryStatement_in_script117 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_forStatement_in_script127 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_whileStatement_in_script137 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_doWhileStatement_in_script147 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_switchStatement_in_script157 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_functionDeclaration_in_script167 = new BitSet(new long[] { 0x0000113562AEA802L });
	public static final BitSet FOLLOW_setStatement_in_nonBlockStatement192 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_returnStatement_in_nonBlockStatement200 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_breakStatement_in_nonBlockStatement208 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_COLON_in_nonBlockStatement215 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_VAR_in_setStatement232 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_setStatement236 = new BitSet(new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_EQUALS_in_setStatement239 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_setStatement241 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_codeStatement259 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_codeStatement261 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_codeStatement263 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cfmlBasicStatement_in_codeStatement271 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RETURN_in_returnStatement287 = new BitSet(new long[] { 0x0000000002AE2802L });
	public static final BitSet FOLLOW_codeStatement_in_returnStatement291 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cfmlValueStatement_in_cfmlBasicStatement305 = new BitSet(
			new long[] { 0x0000000000010002L });
	public static final BitSet FOLLOW_OPERATOR_in_cfmlBasicStatement308 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_cfmlBasicStatement310 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NOT_in_cfmlValueStatement327 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_cfmlValue_in_cfmlValueStatement331 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NUMBER_in_cfmlValue344 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_stringLiteral_in_cfmlValue348 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cfmlLinking_in_cfmlValue352 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_hashCfmlLinking_in_cfmlLinking365 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cfmlBasicLinking_in_cfmlLinking371 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_HASH_in_hashCfmlLinking384 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_cfmlBasicLinking_in_hashCfmlLinking386 = new BitSet(
			new long[] { 0x0000000000080000L });
	public static final BitSet FOLLOW_HASH_in_hashCfmlLinking388 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cfmlBasic_in_cfmlBasicLinking400 = new BitSet(new long[] { 0x0000000000100002L });
	public static final BitSet FOLLOW_DOT_in_cfmlBasicLinking403 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_cfmlBasic_in_cfmlBasicLinking405 = new BitSet(new long[] { 0x0000000000100002L });
	public static final BitSet FOLLOW_identifier_in_cfmlBasic419 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_function_in_cfmlBasic423 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_hashCfmlLinking_in_innerStringCFML435 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DOUBLE_QUOTE_in_stringLiteral451 = new BitSet(new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_ESCAPE_DOUBLE_QUOTE_in_stringLiteral456 = new BitSet(
			new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_innerStringCFML_in_stringLiteral460 = new BitSet(
			new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_set_in_stringLiteral464 = new BitSet(new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_DOUBLE_QUOTE_in_stringLiteral480 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SINGLE_QUOTE_in_stringLiteral493 = new BitSet(new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_ESCAPE_SINGLE_QUOTE_in_stringLiteral498 = new BitSet(
			new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_innerStringCFML_in_stringLiteral502 = new BitSet(
			new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_set_in_stringLiteral506 = new BitSet(new long[] { 0x00FFFFFFFFFFFFF0L });
	public static final BitSet FOLLOW_SINGLE_QUOTE_in_stringLiteral522 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier537 = new BitSet(new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_struct_in_identifier540 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EOF_in_identifier545 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_OPEN_SQUARE_in_struct561 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_struct563 = new BitSet(new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_CLOSE_SQUARE_in_struct565 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_function580 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_function582 = new BitSet(new long[] { 0x0000000002AE6800L });
	public static final BitSet FOLLOW_argumentStatement_in_function585 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_function589 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_codeStatement_in_argumentStatement619 = new BitSet(
			new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_COMMA_in_argumentStatement622 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_argumentStatement624 = new BitSet(
			new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration638 = new BitSet(
			new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_functionDeclaration642 = new BitSet(
			new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_functionDeclaration644 = new BitSet(
			new long[] { 0x0000000002004000L });
	public static final BitSet FOLLOW_argumentDeclaration_in_functionDeclaration647 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_functionDeclaration651 = new BitSet(
			new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_functionDeclaration654 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration688 = new BitSet(
			new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_COMMA_in_argumentDeclaration691 = new BitSet(new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration693 = new BitSet(
			new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_IF_in_ifStatement707 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_ifStatement710 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_ifStatement712 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_ifStatement714 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_ifStatement717 = new BitSet(new long[] { 0x0000000080000002L });
	public static final BitSet FOLLOW_elseifStatement_in_ifStatement721 = new BitSet(new long[] { 0x0000000080000002L });
	public static final BitSet FOLLOW_elseStatement_in_ifStatement727 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ELSE_in_elseifStatement742 = new BitSet(new long[] { 0x0000000040000000L });
	public static final BitSet FOLLOW_IF_in_elseifStatement744 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_elseifStatement746 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_elseifStatement748 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_elseifStatement750 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_elseifStatement754 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ELSE_in_elseStatement798 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_elseStatement802 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRY_in_tryStatement814 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_tryStatement818 = new BitSet(new long[] { 0x0000000200000000L });
	public static final BitSet FOLLOW_catchStatement_in_tryStatement821 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_catchClass835 = new BitSet(new long[] { 0x0000000000100002L });
	public static final BitSet FOLLOW_DOT_in_catchClass837 = new BitSet(new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_catchClass839 = new BitSet(new long[] { 0x0000000000100002L });
	public static final BitSet FOLLOW_CATCH_in_catchStatement854 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_catchStatement856 = new BitSet(new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_catchClass_in_catchStatement858 = new BitSet(new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_catchStatement860 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_catchStatement862 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_catchStatement865 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FOR_in_forStatement897 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_forStatement900 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_forConditions_in_forStatement903 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_forIn_in_forStatement907 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_forStatement910 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_forStatement913 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_forIn924 = new BitSet(new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_IN_in_forIn926 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_cfmlLinking_in_forIn928 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_setStatement_in_forConditions940 = new BitSet(new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_COLON_in_forConditions943 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_setStatement_in_forConditions946 = new BitSet(new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_SEMI_COLON_in_forConditions949 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_setStatement_in_forConditions952 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_WHILE_in_whileStatement964 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_whileStatement967 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_whileStatement969 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_whileStatement971 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_whileStatement974 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DO_in_doWhileStatement986 = new BitSet(new long[] { 0x0000104002AEA800L });
	public static final BitSet FOLLOW_block_in_doWhileStatement990 = new BitSet(new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_WHILE_in_doWhileStatement993 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_doWhileStatement995 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_doWhileStatement997 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_doWhileStatement999 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_OPEN_CURLY_in_block1012 = new BitSet(new long[] { 0x0000113562AEA800L });
	public static final BitSet FOLLOW_script_in_block1014 = new BitSet(new long[] { 0x0000008000000000L });
	public static final BitSet FOLLOW_CLOSE_CURLY_in_block1016 = new BitSet(new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_SEMI_COLON_in_block1019 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_nonBlockStatement_in_block1027 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SWITCH_in_switchStatement1041 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_OPEN_PAREN_in_switchStatement1044 = new BitSet(new long[] { 0x0000000002AE2800L });
	public static final BitSet FOLLOW_codeStatement_in_switchStatement1046 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CLOSE_PAREN_in_switchStatement1048 = new BitSet(
			new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_OPEN_CURLY_in_switchStatement1051 = new BitSet(new long[] { 0x00000A8000000000L });
	public static final BitSet FOLLOW_caseStatement_in_switchStatement1055 = new BitSet(
			new long[] { 0x00000A8000000000L });
	public static final BitSet FOLLOW_defaultStatement_in_switchStatement1061 = new BitSet(
			new long[] { 0x0000008000000000L });
	public static final BitSet FOLLOW_CLOSE_CURLY_in_switchStatement1066 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CASE_in_caseStatement1079 = new BitSet(new long[] { 0x0000000000A40000L });
	public static final BitSet FOLLOW_stringLiteral_in_caseStatement1083 = new BitSet(
			new long[] { 0x0000040000000000L });
	public static final BitSet FOLLOW_NUMBER_in_caseStatement1087 = new BitSet(new long[] { 0x0000040000000000L });
	public static final BitSet FOLLOW_COLON_in_caseStatement1090 = new BitSet(new long[] { 0x0000113562AEA800L });
	public static final BitSet FOLLOW_script_in_caseStatement1093 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DEFAULT_in_defaultStatement1105 = new BitSet(new long[] { 0x0000040000000000L });
	public static final BitSet FOLLOW_COLON_in_defaultStatement1108 = new BitSet(new long[] { 0x0000113562AEA800L });
	public static final BitSet FOLLOW_script_in_defaultStatement1111 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BREAK_in_breakStatement1124 = new BitSet(new long[] { 0x0000000000000002L });
	
}