package cfml.parsing.cfmentat.tag;

import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.OutputDocument;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.SourceFormatter;
import net.htmlparser.jericho.StartTagType;

public class CFSource {
	
	private static Source fSource;
	
	public CFSource(String contents) {
		fSource = new Source(contents);
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
	
}
