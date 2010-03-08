package cfml.parsing;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.Element;

import org.junit.Before;
import org.junit.Test;

public class TestCFMLParser {
	
	private CFMLParser fCfmlParser;
	private static final String sourceUrlFile = "file:test/data/cfml/test1.cfm";
	
	@Before
	public void setUp() throws Exception {
		fCfmlParser = new CFMLParser();
	}
	
	@Test
	public void testGetCFMLTags() {
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
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetAllTags() {
		fail("Not yet implemented");
	}
	
}
