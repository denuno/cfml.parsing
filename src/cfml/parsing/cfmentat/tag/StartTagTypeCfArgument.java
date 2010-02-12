package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;

 // note this has the same startdelimiter as processing instruction, so overrides it if registered
 final class StartTagTypeCfArgument extends GenericStartTagTypeCf {
	protected static final StartTagTypeCfArgument INSTANCE=new StartTagTypeCfArgument();

	private StartTagTypeCfArgument() {
		//super("CFSET","<cfset",">",null,true,false,false);
		super("CFML short tag","<cfargument",">",null,true,true,true);
	}
}

