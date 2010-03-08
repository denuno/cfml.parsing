package cfml.parsing.cfmentat.tag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import net.htmlparser.jericho.Source;

import org.junit.Before;
import org.junit.Test;

import cfml.parsing.cfmentat.antlr.CFExpression;

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
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}
	
	/**
	 * Test method for
	 * {@link cfml.parsing.cfmentat.tag.CFMLStartTag#getEnd(net.htmlparser.jericho.Source, int)} .
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
	
}
