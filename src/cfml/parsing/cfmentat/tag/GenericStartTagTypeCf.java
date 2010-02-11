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

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

public class GenericStartTagTypeCf extends StartTagTypeGenericImplementation {

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
					endStartTagEnd = x;
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

	protected ArrayList getAttributes(String inData) {
		ArrayList attributes = new ArrayList();
		boolean isStartedAttribute = false;
		boolean isDone = false;
		boolean isInQuotes = false;
		boolean isInApos = false;
		String attributeName = "";
		String attributeValue = "";
		int pos = 0;
		for (int x = pos; x < inData.length(); x++) {
			char c = inData.charAt(x);
			char nextChar;
			if(inData.length() > x+1) {
				nextChar = inData.charAt(x+1);
			} else {
				nextChar = '>';
			}
			switch (c) {
			case '>':
				if (!isInQuotes && !isInApos) {
					isDone = true;
				}
				break;
			case '"':
				if(!isInApos && nextChar !='"') {					
					isInQuotes = (!isInQuotes);
					if(!isInQuotes)
						isDone=true;
				} else if (!isInApos && nextChar == '"'){
					isDone=true;
				}
				break;
			case '\'':
				if(!isInQuotes  && nextChar !='\'') {
					isInApos = (!isInApos);
					if(!isInApos)
						isDone=true;
				} else if (!isInQuotes && nextChar == '\''){
					isDone=true;
				}
				break;
			case '=':
				if(!isInQuotes  && !isInApos) {
					isStartedAttribute = !isStartedAttribute;
					continue;
				}
				break;
			case ' ':
				if(!isInQuotes  && !isInApos) {
					continue;
				}
				break;

			case '&':
				if(!isInQuotes  && !isInApos) {
					isDone=false;
				}
				break;

			default:
				break;
			}
			if((nextChar == '&' || c == '&' && nextChar == ' ') && !isInApos && !isInQuotes && isDone) {
				isDone=false;
				isStartedAttribute = true;
			}
			if(isStartedAttribute) {
				attributeValue = attributeValue + c;
			} else {
				attributeName = attributeName + c;				
			}
			if(isDone) {
				String[] attribute = new String[2];
				attribute[0] = attributeName;
				attribute[1] = attributeValue;
				attributes.add(attribute);
				attributeValue = "";
				attributeName = "";
				isStartedAttribute = false;
				isDone = false;
			}
		}
		return attributes;
	}

}
