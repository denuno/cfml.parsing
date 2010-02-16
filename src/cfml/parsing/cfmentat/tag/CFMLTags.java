package cfml.parsing.cfmentat.tag;

import java.util.Set;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.StartTagType;
import net.htmlparser.jericho.TagType;

import cfml.dictionary.DictionaryManager;
import cfml.dictionary.SyntaxDictionary;
import cfml.dictionary.Tag;

public class CFMLTags {

	public static final StartTagType CFML_STANDARD = StartTagTypeCFMLStandard.INSTANCE;
	public static final StartTagType CFML_SCRIPT = StartTagTypeCFMLScript.INSTANCE;
	public static final StartTagType HTML_SCRIPT = StartTagTypeHTMLScript.INSTANCE;
	public static final StartTagType CFML_COMMENT = StartTagTypeCFMLComment.INSTANCE;
	public static final StartTagType CFML_SET = StartTagTypeCfSet.INSTANCE;
	public static final StartTagType CFML_IF = StartTagTypeCfIf.INSTANCE;
	public static final StartTagType CFML_ELSE = StartTagTypeCfElse.INSTANCE;
	public static final StartTagType CFML_ELSEIF = StartTagTypeCfElseIf.INSTANCE;
	public static final StartTagType CFML_ARGUMENT = StartTagTypeCfArgument.INSTANCE;
	public static final StartTagType CFML_FUNCTION = StartTagTypeCfFunction.INSTANCE;

	private static SyntaxDictionary cfdic;

	private CFMLTags() {
	}

	private static final TagType[] TAG_TYPES={
		CFML_STANDARD,
		CFML_COMMENT,
		CFML_SET,
		CFML_IF,
		CFML_ELSE,
		CFML_ELSEIF,
		CFML_FUNCTION,
		CFML_ARGUMENT,
		HTML_SCRIPT,
		CFML_SCRIPT
	};	

	public static void register() {
		DictionaryManager.initDictionaries();
		cfdic = DictionaryManager.getDictionary("CF_DICTIONARY");
		Set<Tag> cfTags = cfdic.getAllTags();
		for (Tag tag : cfTags) {
			GenericStartTagTypeCf cftag = new GenericStartTagTypeCf(tag.getHelp(), "<" + tag.getName(), ">",
					EndTagType.NORMAL, false, tag.hasParameters(), !tag.isSingle());
			cftag.register();
		}
		// we register these last so they override anything in the syntax dictionary
		for (TagType tagType : TAG_TYPES)
			tagType.register();

	}

}
