package cfml.parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.StartTag;
import cfml.dictionary.DictionaryManager;
import cfml.dictionary.Parameter;
import cfml.dictionary.SyntaxDictionary;

public class CFMLParser {
	
	private ArrayList<CFMLSource> fCfmlSources = new ArrayList<CFMLSource>();
	protected ArrayList<ParseMessage> messages = new ArrayList<ParseMessage>();
	private boolean hadFatal;
	private int errCount = 0;
	/** Syntax dictionary for working out important things for the parser. */
	protected cfml.dictionary.SyntaxDictionary syntax = null;
	private SyntaxDictionary cfdic;
	
	private static String readFileAsString(String filePath) throws java.io.IOException {
		StringBuffer fileData = new StringBuffer(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}
	
	public CFMLParser() {
		DictionaryManager.initDictionaries();
		syntax = DictionaryManager.getDictionary("CF_DICTIONARY");
	}
	
	public CFMLParser(String dictionary) {
		DictionaryManager.initDictionaries();
		syntax = DictionaryManager.getDictionary(dictionary);
	}
	
	/**
	 * Initialises the dictionary
	 * 
	 * @param newDict
	 *            the dictionary to init with
	 */
	public void setDictionary(SyntaxDictionary newDict) {
		syntax = newDict;
	}
	
	public void addDictionary(String dictionary) {
	}
	
	public void addCFMLSource(File cfmlsource) throws IOException {
		CFMLSource source = new CFMLSource(readFileAsString(cfmlsource.getPath()));
		fCfmlSources.add(source);
	}
	
	public void addCFMLSource(String cfmlsource) {
		CFMLSource source = new CFMLSource(cfmlsource);
		fCfmlSources.add(source);
	}
	
	public void addCFMLSource(URL url) throws IOException {
		CFMLSource source = new CFMLSource(url);
		fCfmlSources.add(source);
	}
	
	public ArrayList<StartTag> getCFMLTags() {
		ArrayList<StartTag> cfmlTags = new ArrayList<StartTag>();
		for (CFMLSource cfmlSource : fCfmlSources) {
			cfmlTags.addAll(cfmlSource.getAllCFMLTags());
		}
		return cfmlTags;
	}
	
	public ArrayList getAllTags() {
		ArrayList<Element> allTags = new ArrayList<Element>();
		for (CFMLSource cfmlSource : fCfmlSources) {
			allTags.addAll(cfmlSource.getAllElements());
		}
		return allTags;
	}
	
	public String getCacheDebugInfo() {
		String info = "";
		for (CFMLSource cfmlSource : fCfmlSources) {
			info = info.concat(cfmlSource.getCacheDebugInfo());
		}
		return info;
	}
	
	/**
	 * Returns whether this parse has experienced a fatal error or not.
	 * 
	 * @return True - a fatal error has occured, false - lets go onwards!
	 */
	public boolean hadFatal() {
		return hadFatal;
	}
	
	/**
	 * Adds a message to the parser state.
	 * 
	 * @param newMsg
	 *            The message to report to the user post-parse.
	 */
	public void addMessage(ParseMessage newMsg) {
		if (newMsg instanceof ParseError) {
			if (((ParseError) newMsg).isFatal())
				hadFatal = true;
			
			errCount++;
		}
		
		messages.add(newMsg);
	}
	
	/**
	 * Adds a whole bunch of messages to the message list.
	 * 
	 * @param newMessages
	 *            ArrayList of ParseMessage's
	 */
	public void addMessages(ArrayList newMessages) {
		Iterator msgIter = newMessages.iterator();
		ParseMessage currMsg = null;
		while (msgIter.hasNext()) {
			currMsg = (ParseMessage) msgIter.next();
			if (currMsg instanceof ParseError) {
				if (((ParseError) currMsg).isFatal())
					hadFatal = true;
				
				errCount++;
			}
			messages.add(currMsg);
		}
	}
	
	public ArrayList getMessages() {
		return messages;
	}
	
	public String printMessages() {
		String messagesText = "";
		for (ParseMessage message : messages) {
			messagesText = messagesText + message.toString() + "\n";
		}
		return messagesText;
	}
	
	public void parseElements(CFMLSource cfmlSource) {
		for (Element element : cfmlSource.getAllElements()) {
			HashMap suggestedAttributes = new HashMap();
			String attributesFound = "";
			
			Set dictAttributes = syntax.getElementAttributes(element.getName());
			
			if (dictAttributes == null) {
				continue;
			}
			
			Object[] params = dictAttributes.toArray();
			
			Map itemAttributes = new HashMap();
			element.getAttributes().populateMap(itemAttributes, true);
			
			if (itemAttributes.size() > 0) {
				attributesFound = " (Found: " + itemAttributes.toString() + ")";
			}
			int lineNumber = cfmlSource.getRow(element.getBegin());
			int startPosition = element.getBegin();
			int endPosition = element.getEnd();
			String name = element.getName();
			String itemData = element.getTextExtractor().toString();
			
			for (int i = 0; i < params.length; i++) {
				Parameter currParam = (Parameter) params[i];
				if (currParam.isRequired() && !(itemAttributes.containsKey(currParam.getName().toLowerCase()))) {
					addMessage(new ParseError(lineNumber, startPosition, endPosition, itemData, "The attribute \'"
							+ currParam.getName() + "\' is compulsory for the <" + name + "> tag." + attributesFound));
				}
				
				if (!currParam.getTriggers().isEmpty() && currParam.isRequired(suggestedAttributes) == 3
						&& !itemAttributes.containsKey(currParam.getName())) {
					addMessage(new ParseError(lineNumber, startPosition, endPosition, itemData, "The attribute \'"
							+ currParam.getName() + "\' is required for the <" + name + "> tag." + attributesFound));
				} else if (!currParam.getTriggers().isEmpty() && currParam.isTriggered(suggestedAttributes) == 0
						&& itemAttributes.containsKey(currParam.getName())) {
					addMessage(new ParseError(lineNumber, startPosition, endPosition, itemData, "The attribute \'"
							+ currParam.getName() + "\' is not valid for the <" + name + "> tag." + attributesFound));
				}
			}
		}
		
	}
	
	public void parse() {
		for (CFMLSource cfmlSource : fCfmlSources) {
			parseElements(cfmlSource);
		}
	}
	
}
