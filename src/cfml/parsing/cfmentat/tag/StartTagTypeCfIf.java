package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

final class StartTagTypeCfIf extends GenericStartTagTypeCf {
	protected static final StartTagTypeCfIf INSTANCE = new StartTagTypeCfIf();

	private StartTagTypeCfIf() {
		super("CFML if tag", "<cfif", ">", EndTagType.NORMAL, false, false, false);
	}

}
