package cfml.parsing.cfmentat.tag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

import net.htmlparser.jericho.Source;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Before;
import org.junit.Test;

import cfml.parsing.cfmentat.antlr.ANTLRNoCaseReaderStream;
import cfml.parsing.cfmentat.antlr.CFExpression;
import cfml.parsing.cfmentat.antlr.CFScriptLexer;
import cfml.parsing.cfmentat.antlr.CFScriptParser;
import cfml.parsing.cfmentat.antlr.CFScriptTree;
import cfml.parsing.cfmentat.antlr.poundSignFilterStream;
import cfml.parsing.cfmentat.antlr.poundSignFilterStreamException;
import cfml.parsing.cfmentat.antlr.sourceReader;
import cfml.parsing.cfmentat.antlr.script.CFScriptStatement;

/**
 * 
 */

/**
 * @author denny
 * 
 */
public class TestAntlrParser {
	private static final String sourceUrlString = "file:test/data/tag/attribute/simpleTests.xml";
	private Source fSource;
	private CFExpression cfexpression;
	private CFScriptStatement scriptstatement;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}
	
	/**
	 * Test method for {@link cfml.parsing.cfmentat.tag.CFMLStartTag#getEnd(net.htmlparser.jericho.Source, int)} .
	 */
	@Test
	public void testGetEndSourceInt() {
		fail("Not yet implemented");
	}
	
	/**
	 * Test method for {@link cfml.parsing.cfmentat.tag.CFMLStartTag#getAttributes(java.lang.String)} .
	 */
	@Test
	public void testGetAttributes() {
		assertEquals(1, cfexpression.getCFExpression("a=\"a\" & \"wee\""));
	}
	
	@Test
	public void testCFScriptStatement() {
		CFScriptStatement scriptStatement;
		String script = "var x = 1; y = 5; createObject('java','java.lang.String'); createObject('java','java.lang.String');";
		char[] scriptWithEndTag = script.toCharArray();
		
		try {
			poundSignFilterStream psfstream = new poundSignFilterStream(new CharArrayReader(scriptWithEndTag));
			ANTLRNoCaseReaderStream input = new ANTLRNoCaseReaderStream(psfstream); // +
			// "</CFSCRIPT>")
			// )
			// );
			
			CFScriptLexer lexer = new CFScriptLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CFScriptParser parser = new CFScriptParser(tokens);
			ParserRuleReturnScope r = parser.scriptBlock();
			CommonTree tree = (CommonTree) r.getTree();
			
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(tokens);
			CFScriptTree p2 = new CFScriptTree(nodes);
			scriptStatement = p2.scriptBlock();
			
			// find special cases of "#varName#"="value";
			sourceReader sr = new sourceReader(new BufferedReader(new CharArrayReader(script.toCharArray())));
			scriptStatement.checkIndirectAssignments(sr.getLines());
			
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (poundSignFilterStreamException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCFExpression() {
		assertEquals(1, cfexpression.getCFExpression("a=\"a\" & \"wee\""));
	}
	
}
