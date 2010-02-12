package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;

 // note this has the same startdelimiter as processing instruction, so overrides it if registered
 final class StartTagTypeCfInput extends GenericStartTagTypeCf {
	protected static final StartTagTypeCfInput INSTANCE=new StartTagTypeCfInput();

	private StartTagTypeCfInput() {
		//super("CFSET","<cfset",">",null,true,false,false);
		super("CFML include tag","<cfinput",">",EndTagType.NORMAL,false);
	}
}

