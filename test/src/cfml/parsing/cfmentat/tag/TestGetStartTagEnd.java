package cfml.parsing.cfmentat.tag;
import static org.junit.Assert.*;

import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
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
public class TestGetStartTagEnd {
	private static final String sourceUrlString="file:test/data/tag/attribute/simpleTests.xml";
	private Source fSource;
	private GenericStartTagTypeCf fGenericStartTag;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		CFMLTagTypes.register();
		fSource=new Source(new URL(sourceUrlString));
	}


	/**
	 * Test method for {@link cfml.parsing.cfmentat.tag.GenericStartTagTypeCf#getAttributes(java.lang.String)}.
	 */
	@Test
	public void testGetAttributes() {
		String tagSrc;
		Source source;
		List<StartTag> els;
		StartTag cfset;
		
		tagSrc = "<cfset blah='foo'/>";
		cfset = new Source(tagSrc).getAllStartTags(StartTagTypeCfSet.INSTANCE).get(0);
		assertEquals(tagSrc.length(),cfset.getEnd());

		tagSrc = "<cfset blah='foo>'/>";
		cfset = new Source(tagSrc).getAllStartTags(StartTagTypeCfSet.INSTANCE).get(0);
		assertEquals(tagSrc.length(),cfset.getEnd());

		tagSrc = "<cfset <!--- fun='eeep' ---> blah='foo>'/>";
		cfset = new Source(tagSrc).getAllStartTags(StartTagTypeCfSet.INSTANCE).get(0);
		assertEquals(tagSrc.length(),cfset.getEnd());
		
		tagSrc = "<cfset blah='foo>'/><more blah='wee'>";
		cfset = new Source(tagSrc).getAllStartTags(StartTagTypeCfSet.INSTANCE).get(0);
		assertEquals(tagSrc.length()-17,cfset.getEnd());

		tagSrc = "<cfset blah=\"foo\">";
		cfset = new Source(tagSrc).getAllStartTags(StartTagTypeCfSet.INSTANCE).get(0);
		assertEquals(tagSrc.length(),cfset.getEnd());
		
		
	}

}
