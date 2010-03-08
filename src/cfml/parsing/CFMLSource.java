package cfml.parsing;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.OutputDocument;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.SourceFormatter;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagType;
import cfml.parsing.cfmentat.tag.CFMLTags;

public class CFMLSource {
	
	private static Source fSource;
	
	public CFMLSource(String contents) {
		fSource = new Source(contents);
		fSource.ignoreWhenParsing(fSource.getAllElements(CFMLTags.CFML_CONTENT));
		CFMLTags.register();
	}
	
	public CFMLSource(URL url) throws IOException {
		fSource = new Source(url);
		fSource.ignoreWhenParsing(fSource.getAllElements(CFMLTags.CFML_CONTENT));
		CFMLTags.register();
	}
	
	public List<Element> getAllElements(StartTagType startTagType) {
		return fSource.getAllElements(startTagType);
	}
	
	public void ignoreWhenParsing(List allElements) {
		fSource.ignoreWhenParsing(allElements);
	}
	
	public String getCacheDebugInfo() {
		return fSource.getCacheDebugInfo();
	}
	
	public List<Element> getAllElements() {
		return fSource.getAllElements();
	}
	
	public SourceFormatter getSourceFormatter() {
		return fSource.getSourceFormatter();
	}
	
	public List getAllStartTags() {
		return fSource.getAllStartTags();
	}
	
	public OutputDocument getOutputDocument() {
		return new OutputDocument(fSource);
	}
	
	public int getRow(int begin) {
		return fSource.getRow(begin);
	}
	
	public List<StartTag> getAllCFMLTags() {
		return fSource.getAllStartTags("cf");
	}
	
}
