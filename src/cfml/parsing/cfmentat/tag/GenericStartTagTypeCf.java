// Jericho HTML Parser - Java based library for analysing and manipulating HTML
// Version 3.1
// Copyright (C) 2004-2009 Martin Jericho
// http://jericho.htmlparser.net/
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of either one of the following licences:
//
// 1. The Eclipse Public License (EPL) version 1.0,
// included in this distribution in the file licence-epl-1.0.html
// or available at http://www.eclipse.org/legal/epl-v10.html
//
// 2. The GNU Lesser General Public License (LGPL) version 2.1 or later,
// included in this distribution in the file licence-lgpl-2.1.txt
// or available at http://www.gnu.org/licenses/lgpl.txt
//
// This library is distributed on an "AS IS" basis,
// WITHOUT WARRANTY OF ANY KIND, either express or implied.
// See the individual licence texts for more details.

package cfml.parsing.cfmentat.tag;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

public class GenericStartTagTypeCf extends StartTagTypeGenericImplementation {
	static protected final String REG_ATTRIBUTES = "(\\w+)[\\s=]+(((\\x22|\\x27|#)((?!\\4).|\\4{2})*\\4))";

	protected GenericStartTagTypeCf(final String description, final String startDelimiter, final String closingDelimiter, final EndTagType correspondingEndTagType, final boolean isServerTag) {
		super(description,startDelimiter,closingDelimiter,correspondingEndTagType,isServerTag,false,false);
	}


	protected GenericStartTagTypeCf(final String description, final String startDelimiter, final String closingDelimiter, final EndTagType correspondingEndTagType, final boolean isServerTag, final boolean hasAttributes, final boolean isNameAfterPrefixRequired) {
		super(description,startDelimiter,closingDelimiter,correspondingEndTagType,isServerTag,hasAttributes,isNameAfterPrefixRequired);
	}


	protected int getEnd(final Source source, final int pos) {
		final ParseText text = source.getParseText();
		int endStartTagEnd = pos;
		boolean isInQuotes = false;
		boolean isInApos = false;
		for (int x = pos; x < text.length(); x++) {
			char c = text.charAt(x);
			switch (c) {
			case '>':
				if (!isInQuotes && !isInApos) {
					if(!text.subSequence(x-3, x).equals("---")) {						
						endStartTagEnd = x;
					}
				}
				break;
			case '"':
				if(!isInApos) {
					isInQuotes = (!isInQuotes);
				}
				break;
			case '\'':
				if(!isInQuotes) {
					isInApos = (!isInApos);
				}
				break;

			default:
				break;
			}
			if (endStartTagEnd > pos) {
				return endStartTagEnd + 1;
			}
		}
		return endStartTagEnd;
	}

	protected ArrayList getAttributes(String inData)
	{
		ArrayList attributes = new ArrayList();
		Matcher matcher;
		Pattern pattern;
		String attributeName,attributeValue;
		pattern = Pattern.compile(REG_ATTRIBUTES,Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(inData);
		if(inData.trim().endsWith("&")){
			userMessage(0, 
					"stripAttributes", "Last attribute cannot be an ampersand", 
					"ERR", null);			
		}

		while(matcher.find())
		{
			
		    if (matcher.group(1) != null && matcher.group(2) != null) {
				String[] attribute = new String[2];
		    	
			    attributeName = matcher.group(1).trim();
			    attributeValue = matcher.group(2).trim();
			    attributeValue = attributeValue.substring(1,attributeValue.length()-1);
				attribute[0] = attributeName;
				attribute[1] = attributeValue;
				attributes.add(attribute);
			    //System.out.println(attributeName + " = " +attributeValue);
		    }
		    else {
		        System.out.println("CFParser::stripAttributes() - failed on |" + inData + "| with " + matcher.groupCount() + " matches");
//		        for (int i = 0; i<=matcher.groupCount(); i++) {
//		        	System.out.println("Match " + i + " : " + matcher.group(i));
//		        }
		    }
		}
		
		return attributes;
	}


	private void userMessage(int i, String string, String string2, String string3, Object object) {
		// TODO Auto-generated method stub
		System.out.println(string+string2);
	}

}
