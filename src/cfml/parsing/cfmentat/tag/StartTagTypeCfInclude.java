package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.StartTagTypeGenericImplementation;

// note this has the same startdelimiter as processing instruction, so overrides it if registered
final class StartTagTypeCfInclude extends StartTagTypeGenericImplementation {
	protected static final StartTagTypeCfInclude INSTANCE = new StartTagTypeCfInclude();
	
	private StartTagTypeCfInclude() {
		// super("CFSET","<cfset",">",null,true,false,false);
		super("CFML include tag", "<cfinclude", ">", null, false);
	}
}
