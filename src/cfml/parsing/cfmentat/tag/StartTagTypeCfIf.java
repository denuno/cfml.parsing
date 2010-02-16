package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;

final class StartTagTypeCfIf extends GenericStartTagTypeCf {
	protected static final StartTagTypeCfIf INSTANCE = new StartTagTypeCfIf();
	
	private StartTagTypeCfIf() {
		super("CFML if tag", "<cfif", ">", EndTagType.NORMAL, false, false, false);
	}
	
}
