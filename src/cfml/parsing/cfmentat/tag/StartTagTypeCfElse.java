package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;

 // note this has the same startdelimiter as processing instruction, so overrides it if registered
 final class StartTagTypeCfElse extends GenericStartTagTypeCf {
	protected static final StartTagTypeCfElse INSTANCE=new StartTagTypeCfElse();

	private StartTagTypeCfElse() {
		//super("CFSET","<cfset",">",null,true,false,false);
		super("CFML short tag","<cfelse",">",null,false);
	}
}

