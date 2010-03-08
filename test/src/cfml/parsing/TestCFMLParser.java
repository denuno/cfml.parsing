package cfml.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.Tag;

import org.junit.Before;
import org.junit.Test;

public class TestCFMLParser {
	
	private CFMLParser fCfmlParser;
	private static final String sourceUrlFile = "file:test/data/cfml/test1.cfm";
	
	@Before
	public void setUp() throws Exception {
		fCfmlParser = new CFMLParser();
		try {
			fCfmlParser.addCFMLSource(new URL(sourceUrlFile));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fCfmlParser.parse();
	}
	
	@Test
	public void testGetCFMLTags() {
		ArrayList<StartTag> elementList = fCfmlParser.getCFMLTags();
		for (StartTag element : elementList) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println(element.getDebugInfo());
			if (element.getAttributes() != null) {
				System.out.println("XHTML StartTag:\n" + element.tidy(true));
				System.out.println("Attributes:\n" + element.getAttributes());
			}
			System.out.println("Source text with content:\n" + element);
		}
		System.out.println(fCfmlParser.printMessages());
		assertEquals(21, elementList.size());
	}
	
	@Test
	public void testGetTagAt() {
		String path = "";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tag tag = fCfmlParser.getCFMLSource(path).getTagAt(350);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cffunction", tag.getName());
	}
	
	@Test
	public void testGetEnclosingTag() {
		String path = "";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tag tag = fCfmlParser.getCFMLSource(path).getEnclosingTag(355);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cffunction", tag.getName());
	}
	
	@Test
	public void testGetNextTag() {
		String path = "";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tag tag = fCfmlParser.getCFMLSource(path).getNextTag(355);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cfargument", tag.getName());
	}
	
	@Test
	public void testGetPreviousTag() {
		String path = "";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tag tag = fCfmlParser.getCFMLSource(path).getPreviousTag(355);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cfquery", tag.getName());
	}
	
	@Test
	public void testGetCFMLSource() {
		String path = "";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFMLSource cfmlSource = fCfmlParser.getCFMLSource(path);
		assertNotNull(cfmlSource);
	}
	
	@Test
	public void testGetAllTags() {
		List<Element> elementList = fCfmlParser.getAllTags();
		for (Element element : elementList) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println(element.getDebugInfo());
			if (element.getAttributes() != null) {
				System.out.println("XHTML StartTag:\n" + element.getStartTag().tidy(true));
				System.out.println("Attributes:\n" + element.getAttributes());
			}
			System.out.println("Source text with content:\n" + element);
		}
		System.out.println(fCfmlParser.getCacheDebugInfo());
		System.out.println(fCfmlParser.printMessages());
		assertEquals(21, elementList.size());
	}
	
}
