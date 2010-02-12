package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

final class StartTagTypeCfContent extends GenericStartTagTypeCf {
	protected static final StartTagTypeCfContent INSTANCE = new StartTagTypeCfContent();

	private StartTagTypeCfContent() {
		super("CFML mail tag", "<cfcontent", ">", EndTagType.NORMAL, false, true, false);
	}

}
