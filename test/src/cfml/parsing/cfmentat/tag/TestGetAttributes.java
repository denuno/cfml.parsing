package cfml.parsing.cfmentat.tag;
import static org.junit.Assert.*;

import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTagType;
import net.htmlparser.jericho.Tag;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author denny
 *
 */
public class TestGetAttributes {
	private static final String sourceUrlString="file:test/data/tag/attribute/simpleTests.xml";
	private Source fSource;
	private GenericStartTagTypeCf fGenericStartTag;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fGenericStartTag = new GenericStartTagTypeCf("CFML if tag", "<cfsavecontent", ">", EndTagType.NORMAL, false, false, false);
		fSource=new Source(new URL(sourceUrlString));
	}

	/**
	 * Test method for {@link cfml.parsing.cfmentat.tag.GenericStartTagTypeCf#getEnd(net.htmlparser.jericho.Source, int)}.
	 */
	@Test
	public void testGetEndSourceInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link cfml.parsing.cfmentat.tag.GenericStartTagTypeCf#getAttributes(java.lang.String)}.
	 */
	@Test
	public void testGetAttributes() {
		assertEquals(1,fGenericStartTag.getAttributes("this=\"a simple\"").size());		
		assertEquals(2,fGenericStartTag.getAttributes("this=\"a simple\" test=\"a simple\"").size());		
	}

}
