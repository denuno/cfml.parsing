package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

final class StartTagTypeCfMail extends StartTagTypeGenericImplementation {
	protected static final StartTagTypeCfMail INSTANCE = new StartTagTypeCfMail();

	private StartTagTypeCfMail() {
		super("CFML mail tag", "<cfmail", ">", EndTagType.NORMAL, false, true, false);
	}

}
