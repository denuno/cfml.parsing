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
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

public class GenericStartTagTypeCf extends StartTagTypeGenericImplementation {
	public class ParseItemMatch {

	}


	public class AttributeItem {

		public AttributeItem(int linePos, int i, int inputPos, String attrName, String attrValue) {
			// TODO Auto-generated constructor stub
		}

	}


	static protected final String REG_ATTRIBUTES = "(\\w+)[\\s=]+(((\\x22|\\x27|#)((?!\\4).|\\4{2})*\\4))";
	private static GenericStartTagTypeCf INSTANCE = null;

	protected GenericStartTagTypeCf(final String description, final String startDelimiter, final String closingDelimiter, final EndTagType correspondingEndTagType, final boolean isServerTag) {
		super(description,startDelimiter,closingDelimiter,correspondingEndTagType,isServerTag,false,false);
		INSTANCE = this;
	}


	protected GenericStartTagTypeCf(final String description, final String startDelimiter, final String closingDelimiter, final EndTagType correspondingEndTagType, final boolean isServerTag, final boolean hasAttributes, final boolean isNameAfterPrefixRequired) {
		super(description,startDelimiter,closingDelimiter,correspondingEndTagType,isServerTag,hasAttributes,isNameAfterPrefixRequired);
		INSTANCE = this;
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
					if (x > 2 && text.subSequence(x - 3, x).equals("---")) {
						//do nothing, this is a comment
					} else {
						return x+1;
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
		}
		if (endStartTagEnd >= pos) {
			return endStartTagEnd + 1;
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

//  BEGIN PETER FUNC
	
	/* DEBUGGING FUNCS: */
	protected void msg(String Msg)
		{System.out.println(Msg);}
	protected void msg(String Msg,String Text)
		{System.out.println(Msg+":"+Text);}
	protected void msg(String Msg,int TokenPos,int InputPos)
		{msg(Msg,TokenPos,InputPos,"");}
	protected void msg(String Msg,int TokenPos,int InputPos,String Extra)
	{
		System.out.println(Msg + "\t\t(TokenPos="+String.valueOf(TokenPos)+") (InputPos="+String.valueOf(InputPos)+")");
		if (Extra.length()>0)System.out.println("\t"+Extra);
	}
/* /debug */

// TODO: These two funcs probably belong in a utility object somewhere.

protected int countNewlines(String Text)
{
	return Text.replaceAll("[^\n]","").length();
}

protected boolean isWhitespace(String Text)
{
	return (Text.replaceAll("\\s","").length() == 0);
}


// Parses a series of name=value attributes and returns an array of name,value pairs.
protected ArrayList parseAttr( String Input , int StartLine , int StartPos )
{
	ArrayList Attributes = new ArrayList();
	String[] Tokens = Input.trim().split("\\b|\\B(?=\\W)");
	int InputPos = 0;
	int InputMax = Input.length();
	int TokenPos = 0;
	int TokenMax = Tokens.length;
	int LinePos  = StartLine;

/*
	System.out.println("");
	System.out.println("PARSING ATTRIBUTES:"+Input);
	System.out.println("\\\\Tokens:");
	for (int i=0;i<TokenMax;i++)
	{
		System.out.println(i+":"+Tokens[i]);
	}
	System.out.println("//tokens;");
	System.out.println("");
*/
	// Outer loop, runs once per Attribute in the string.
	while ( InputPos < InputMax && TokenPos < TokenMax )
	{
		String AttrName  = "";
		String AttrValue = "";
		int StartInputPos = InputPos;

		// DEBUG: msg("Start New Attr",TokenPos,InputPos);

		// Skip past any whitespace tokens before the name.
		while ( InputPos < InputMax && TokenPos < TokenMax && isWhitespace(Tokens[TokenPos]) )
		{
			LinePos += countNewlines(Tokens[TokenPos]);
			InputPos += Tokens[TokenPos].length();
			TokenPos++;
		}

		if ( InputPos < InputMax && TokenPos < TokenMax )
		{
			// Grabs the name - assumes names only contain word-characters (alnum+underscore).
			// TODO: FIX: This doesn't accept the prefix:name format which custom tags support.
			AttrName = Tokens[TokenPos];
			LinePos += countNewlines(Tokens[TokenPos]);
			InputPos += Tokens[TokenPos].length();
			TokenPos++;

			// DEBUG: msg("grabbed name",TokenPos,InputPos,"NAME:"+AttrName);

			// Skip past any whitespace tokens after the name.
			while ( InputPos < InputMax && TokenPos < TokenMax && isWhitespace(Tokens[TokenPos]) )
			{
				LinePos += countNewlines(Tokens[TokenPos]);
				InputPos += Tokens[TokenPos].length();
				TokenPos++;
			}

			// If there's an equal sign, we've got name=value, consume and continue...
			if ( InputPos < InputMax && TokenPos < TokenMax && Tokens[TokenPos].equals("=") )
			{
				LinePos += countNewlines(Tokens[TokenPos]);
				InputPos++;
				TokenPos++;
			}
			// else we've just got name so value is set true
			else
			{
				// DEBUG: msg("No Value,Set True",TokenPos,InputPos,AttrName);
				AttrValue = "true";
			}

			// Skip past any whitespace tokens
			// TODO: CHECK: Can this go inside either of the IFs above/below (not needed for name-only attrs?)
			while ( InputPos < InputMax && TokenPos < TokenMax && isWhitespace(Tokens[TokenPos]) )
			{
				LinePos += countNewlines(Tokens[TokenPos]);
				InputPos += Tokens[TokenPos].length();
				TokenPos++;
			}

			// If we don't know what the value is (i.e. not a name-only) and hasn't hit the end, keep going.
			if ( InputPos < InputMax && TokenPos < TokenMax && AttrValue == "" )
			{
				Stack<String> ModeStack = new Stack<String>();
				boolean FirstLoop = true;
				String CurMode;

				// Start by determining mode, if there is one.
				if (Tokens[TokenPos].equals("\"")) {ModeStack.push("DOUBLE");TokenPos++;InputPos++;}
				if (Tokens[TokenPos].equals("'"))  {ModeStack.push("SINGLE");TokenPos++;InputPos++;}
				if (Tokens[TokenPos].equals("#"))  {ModeStack.push("HASH");TokenPos++;InputPos++;}
				if (Tokens[TokenPos].equals("("))  {ModeStack.push("PAREN");TokenPos++;InputPos++;}
				if (Tokens[TokenPos].equals("{"))  {ModeStack.push("BRACE");TokenPos++;InputPos++;}
				if (Tokens[TokenPos].equals("["))  {ModeStack.push("BRACKET");TokenPos++;InputPos++;}
				// DEBUG: msg(">>ModeStack",ModeStack.toString());

				// No mode, must be unquoted/unhashed/unbracketed, so value stops at first whitespace (or the end).
				if (ModeStack.isEmpty())
				{
					while ( InputPos < InputMax && TokenPos < TokenMax && ! isWhitespace(Tokens[TokenPos]) )
					{
						AttrValue += Tokens[TokenPos];
						LinePos += countNewlines(Tokens[TokenPos]);
						InputPos += Tokens[TokenPos].length();
						TokenPos++;
					}
				}
				else
				{
					// Until the modestack is empty (or we reach the end), keep eating tokens building the value.
					while ( InputPos < InputMax && TokenPos < TokenMax && (!ModeStack.isEmpty()) )
					{
						CurMode = ModeStack.peek();

						// Since we checked the mode before we started, don't repeat it for the first iteration.
						if ( FirstLoop )
						{
							FirstLoop = false;
						}
						else
						{
							// Jump into next mode, if necessary.
							if (!CurMode.equals("DOUBLE") && !CurMode.equals("SINGLE") && Tokens[TokenPos].equals("\"")) {ModeStack.push("DOUBLE");TokenPos++;InputPos++;}
							if (!CurMode.equals("SINGLE") && !CurMode.equals("DOUBLE") && Tokens[TokenPos].equals("'"))  {ModeStack.push("SINGLE");TokenPos++;InputPos++;}
							if (!CurMode.equals("HASH") && Tokens[TokenPos].equals("#") )  {ModeStack.push("HASH");TokenPos++;InputPos++;}
							if (Tokens[TokenPos].equals("("))  {ModeStack.push("PAREN");TokenPos++;InputPos++;}
							if (Tokens[TokenPos].equals("{"))  {ModeStack.push("BRACE");TokenPos++;InputPos++;}
							if (Tokens[TokenPos].equals("["))  {ModeStack.push("BRACKET");TokenPos++;InputPos++;}
							// DEBUG: msg(">>stack:",ModeStack.toString());
						}
						// Mode might have changed, so look again.
						CurMode = ModeStack.peek();

						// If we're currently inside "double quotes"...
						if (CurMode.equals("DOUBLE"))
						{
							// All the while we haven't found a " or # we can just keep eating tokens...
							while ( TokenPos < TokenMax && !Tokens[TokenPos].equals("\"") && !Tokens[TokenPos].equals("#") )
							{
								// DEBUG: msg("running double",TokenPos,InputPos);

								AttrValue += Tokens[TokenPos];
								LinePos += countNewlines(Tokens[TokenPos]);
								InputPos += Tokens[TokenPos].length();
								TokenPos++;

								// This ugly bit handles escaped quotes...
								// (I think it's only needed for attr="val""ue" - nested ones will be ok)
								while ( TokenPos+1 < TokenMax && Tokens[TokenPos].equals("\"") && Tokens[TokenPos+1].equals("\"") )
								{
									AttrValue += Tokens[TokenPos];
									LinePos += countNewlines(Tokens[TokenPos]);
									InputPos += Tokens[TokenPos].length();
									TokenPos++;
									AttrValue += Tokens[TokenPos];
									LinePos += countNewlines(Tokens[TokenPos]);
									InputPos += Tokens[TokenPos].length();
									TokenPos++;
								}
							}
						}
						// If we're currently inside 'single quotes'...
						else if (CurMode.equals("SINGLE"))
						{
							// All the while we haven't found a ' or # we can just keep eating tokens...
							while ( TokenPos < TokenMax && !Tokens[TokenPos].equals("'") && !Tokens[TokenPos].equals("#"))
							{
								// DEBUG: msg("running single",TokenPos,InputPos);

								AttrValue += Tokens[TokenPos];
								LinePos += countNewlines(Tokens[TokenPos]);
								InputPos += Tokens[TokenPos].length();
								TokenPos++;

								// This ugly bit handles escaped quotes...
								// Again, probably only needed for attr='val''ue' because of the empty stack check.
								while ( TokenPos+1 < TokenMax && Tokens[TokenPos].equals("'") && Tokens[TokenPos+1].equals("'") )
								{
									AttrValue += Tokens[TokenPos];
									LinePos += countNewlines(Tokens[TokenPos]);
									InputPos += Tokens[TokenPos].length();
									TokenPos++;
									AttrValue += Tokens[TokenPos];
									LinePos += countNewlines(Tokens[TokenPos]);
									InputPos += Tokens[TokenPos].length();
									TokenPos++;
								}
							}
						}
						// For anything not a string, we just keep going until we find a 'special' character.
						else // any mode
						{
							while ( TokenPos < TokenMax
								&& !Tokens[TokenPos].equals("\"")
								&& !Tokens[TokenPos].equals("'")
								&& !Tokens[TokenPos].equals("#")
								&& !Tokens[TokenPos].equals("(")
								&& !Tokens[TokenPos].equals("{")
								&& !Tokens[TokenPos].equals("[")
								&& !Tokens[TokenPos].equals(")")
								&& !Tokens[TokenPos].equals("}")
								&& !Tokens[TokenPos].equals("]")
								)
							{
								// DEBUG: msg("running multi/"+CurMode,TokenPos,InputPos,"val="+AttrValue);

								AttrValue += Tokens[TokenPos];
								LinePos += countNewlines(Tokens[TokenPos]);
								InputPos += Tokens[TokenPos].length();
								TokenPos++;

							}
						}

						// DEBUG: msg("grabbed value",TokenPos,InputPos,"VAL:"+AttrValue);

						// If we hit a closing character, pop the mode off the stack.
						if (CurMode.equals("DOUBLE")  && Tokens[TokenPos].equals("\"")) {ModeStack.pop();TokenPos++;InputPos++;}
						if (CurMode.equals("SINGLE")  && Tokens[TokenPos].equals("'"))  {ModeStack.pop();TokenPos++;InputPos++;}
						if (CurMode.equals("HASH")    && Tokens[TokenPos].equals("#"))  {ModeStack.pop();TokenPos++;InputPos++;}
						if (CurMode.equals("PAREN")   && Tokens[TokenPos].equals(")"))  {ModeStack.pop();TokenPos++;InputPos++;}
						if (CurMode.equals("BRACE")   && Tokens[TokenPos].equals("}"))  {ModeStack.pop();TokenPos++;InputPos++;}
						if (CurMode.equals("BRACKET") && Tokens[TokenPos].equals("]"))  {ModeStack.pop();TokenPos++;InputPos++;}
						// DEBUG: msg(">>stack:",ModeStack.toString());

					}// while stack not empty
				}

			}//if not name-only

		}//if not at end

		System.out.println("+++ ADDING("+LinePos+"):"+AttrName+"/"+AttrValue+"/");

		// We got an attribute, hooray!
		Attributes.add( new AttributeItem( LinePos , StartPos+StartInputPos , InputPos , AttrName, AttrValue ) );

	} // while not at end, (next attribute)


	return Attributes;
}


// Parses any tag containing an expression instead of name=value pairs. In particular, cfset and cfif.
protected ArrayList parseExpr( String Input , int StartLine , int StartPos )
{
	ArrayList Attributes = new ArrayList();
	int LinePos  = StartLine;

	// For now, we're just shoving the whole input into a single attribute.
	// TODO: May need to change this for variable completion stuff?
	Attributes.add( new AttributeItem( LinePos , StartPos , Input.trim().length() , "" , Input.trim() ) );

	return Attributes;
}


/**
 * <code>stripAttributes</code> - Strips the attributes from some data and puts them into a hash map
 * @param inData - the string data to get the attributes out of
 * @param match
 * @return array list of the attributes found. May contain duplicates
 */
protected ArrayList stripAttributes(String inData, int lineNum, int offset, ParseItemMatch match , String tagName)
{
	// TODO: Check if this is a complete list, or anything missing?
	boolean isExpressionTag =
		( tagName.contains("cfset")
		|| tagName.contains("cfif")
		|| tagName.contains("cfelseif")
		|| tagName.contains("cfreturn")
		|| tagName.contains("cfwhile")
		);


	if ( isExpressionTag )
	{
		return parseExpr(inData,lineNum,offset);
	}
	else
	{
		return parseAttr(inData,lineNum,offset);
	}

}


public ArrayList parseAttr(String attributes) {
	// TODO Auto-generated method stub
	return parseAttr(attributes,0,0);
}
	
	
}
