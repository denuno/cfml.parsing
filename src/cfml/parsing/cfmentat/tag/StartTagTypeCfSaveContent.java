package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

final class StartTagTypeCfSaveContent extends StartTagTypeGenericImplementation {
	protected static final StartTagTypeCfSaveContent INSTANCE = new StartTagTypeCfSaveContent();

	private StartTagTypeCfSaveContent() {
		super("CFML if tag", "<cfsavecontent", ">", EndTagType.NORMAL, false, false, false);
	}

}
