package cfml.parsing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import cfml.parsing.cfscript.script.CFScriptStatement;

public class TestScriptParser {
	
	private CFMLParser fCfmlParser;
	
	@Before
	public void setUp() throws Exception {
		fCfmlParser = new CFMLParser();
	}
	
	@Test
	public void testParseScript() {
		String script = "var x = 1; y = 5; createObject('java','java.lang.String');";
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptMissingSemiColon() {
		String script = "var x = 1; y = 5 createObject('java','java.lang.String');";
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		System.out.println(fCfmlParser.printMessages());
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptMissingAssignment() {
		String script = "var x = 1; y =; createObject('java','java.lang.String');";
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() == 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testForIn() {
		String script = "for(widget in thingWithWidgets.getWidgets()) { writeOutput(widget) };";
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptBadLex() {
		String script = "string function fart(required kind, area='elavator') {"
				+ "var toot = 'se5ee6yye67tutuityit69t9imfuihki';"
				+ "var registry = createObject('java','org.eclipse.emf.ecore.EPackage$Registry').INSTANCE;"
				+ "var className = listLast(class,'/');" + "var packageName = '';" + "if(isObject(class)) {"
				+ "this._instance = class;" + "} else {" + "weee" + "}};";
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		System.out.println(scriptStatement.toString());
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptCfcGood() {
		String path = "";
		try {
			path = new URL("file:test/data/cfml/ScriptComponent.cfc").getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScriptFile(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		System.out.println(scriptStatement.toString());
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptCfcHarder() {
		String path = "";
		try {
			path = new URL("file:test/data/cfml/ScriptComponentHarder.cfc").getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScriptFile(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		
		System.out.println(scriptStatement.toString());
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptCfcWow() {
		String path = "";
		try {
			path = new URL("file:test/data/cfml/ScriptComponentWow.cfc").getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScriptFile(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		
		System.out.println(scriptStatement.toString());
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptCfcCrazy() {
		String path = "";
		try {
			path = new URL("file:test/data/cfml/ScriptComponentCrazy.cfc").getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScriptFile(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		
		System.out.println(scriptStatement.toString());
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseCFCWithColonMetadata() {
		String path = "";
		try {
			path = new URL("file:test/data/cfml/CFCWithColonMetadata.cfc").getPath();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScriptFile(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		
		System.out.println(scriptStatement.toString());
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptFunction() {
		String script = "function runFunction(functionName,argCol) { runFunk = this[functionName]; results = structNew(); results.result = runFunk(argumentCollection=argCol); results.debug = getDebugMessages(); return results; }";
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		
		assertNotNull(scriptStatement);
	}
	
	@Test
	public void testParseScriptTryCatch() {
		String script = "try { throw('funk'); } catch (Any e) { woot(); }";
		CFScriptStatement scriptStatement = null;
		try {
			scriptStatement = fCfmlParser.parseScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("whoops! " + e.getMessage());
		}
		if (fCfmlParser.getMessages().size() > 0) {
			fail("whoops! " + fCfmlParser.getMessages());
		}
		
		assertNotNull(scriptStatement);
	}
	
}
