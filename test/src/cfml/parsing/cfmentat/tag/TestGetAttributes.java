package cfml.parsing.cfmentat.tag;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

import net.htmlparser.jericho.Element;
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
	private static final String sourceUrlString = "file:test/data/tag/attribute/simpleTests.xml";
	private Source fSource;
	private GenericStartTagTypeCf fGenericStartTag;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fGenericStartTag = new GenericStartTagTypeCf("CFML if tag", "<cfsavecontent", ">", EndTagType.NORMAL, false,
				false, false);
		fSource = new Source(new URL(sourceUrlString));
	}
	
	/**
	 * Test method for {@link cfml.parsing.cfmentat.tag.GenericStartTagTypeCf#getAttributes(java.lang.String)} .
	 */
	@Test
	public void testGetAttributes() {
		Iterator<Element> tests = fSource.getFirstElement().getChildElements().iterator();
		String attributes, numattributes, testname;
		int i = 0;
		while (tests.hasNext()) {
			Element type = (Element) tests.next();
			attributes = type.getTextExtractor().toString();
			numattributes = type.getAttributeValue("numattributes");
			testname = type.getAttributeValue("name");
			assertEquals(testname + " (" + i + ") failed - getAttributes", Integer.parseInt(numattributes),
					fGenericStartTag.getAttributes(attributes).size());
			assertEquals(testname + " (" + i + ") failed - parseAttr", Integer.parseInt(numattributes),
					fGenericStartTag.parseAttr(attributes).size());
			System.out.println(type.getTextExtractor().toString());
			System.out.println(type.getAttributeValue("numattributes"));
			i++;
		}
		
	}
	
}
