package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;

final class StartTagTypeCFMLStandard extends GenericStartTagTypeCf {
	protected static final StartTagTypeCFMLStandard INSTANCE=new StartTagTypeCFMLStandard();

	private StartTagTypeCFMLStandard() {
		super("cf standard tag","<cf",">",EndTagType.NORMAL,false,true,false);
	}
}

