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

import org.junit.Before;
import org.junit.Test;

import cfml.parsing.cfmentat.antlr.script.CFScriptStatement;

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
	public void testGetDebugInfo() {
		String debugInfo = fCfmlParser.getDebuggingInfo();
		System.out.println(debugInfo);
		assertEquals(21, 21);
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
		ParserTag parserTag = fCfmlParser.getCFMLSource(path).getTagAt(350);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cffunction", parserTag.getName());
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
		ParserTag parserTag = fCfmlParser.getCFMLSource(path).getEnclosingTag(355);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cffunction", parserTag.getName());
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
		ParserTag parserTag = fCfmlParser.getCFMLSource(path).getNextTag(355);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cfargument", parserTag.getName());
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
		ParserTag parserTag = fCfmlParser.getCFMLSource(path).getPreviousTag(355);
		System.out.println(fCfmlParser.printMessages());
		assertEquals("cfquery", parserTag.getName());
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
	public void testParseScript() {
		String path = "";
		String script = "var x = 1; y = 5; createObject('java','java.lang.String');";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptMissingSemiColon() {
		String path = "";
		String script = "var x = 1; y = 5 createObject('java','java.lang.String');";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptMissingAssignment() {
		String path = "";
		String script = "var x = 1; y =; createObject('java','java.lang.String');";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptFunction() {
		String path = "";
		String script = "function runFunction(functionName,argCol) { runFunk = this[functionName]; results = structNew(); results.result = runFunk(argumentCollection=argCol); results.debug = getDebugMessages(); return results; }";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptTryCatch() {
		String path = "";
		String script = "try { throw('funk'); } catch (Any e) { woot(); }";
		try {
			path = new URL(sourceUrlFile).getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(scriptStatement);
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
