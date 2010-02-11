/* 
 *  Copyright (C) 2000 - 2010 TagServlet Ltd
 *
 *  This file is part of Open BlueDragon (OpenBD) CFML Server Engine.
 *  
 *  OpenBD is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  Free Software Foundation,version 3.
 *  
 *  OpenBD is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with OpenBD.  If not, see http://www.gnu.org/licenses/
 *  
 *  Additional permission under GNU GPL version 3 section 7
 *  
 *  If you modify this Program, or any covered work, by linking or combining 
 *  it with any of the JARS listed in the README.txt (or a modified version of 
 *  (that library), containing parts covered by the terms of that JAR, the 
 *  licensors of this Program grant you additional permission to convey the 
 *  resulting work. 
 *  README.txt @ http://www.openbluedragon.org/license/README.txt
 *  
 *  http://www.openbluedragon.org/
 */

package cfml.parsing.cfmentat.antlr.script;

import org.antlr.runtime.Token;

import com.naryx.tagfusion.cfm.engine.*;
import cfml.parsing.cfmentat.antlr.CFContext;
import cfml.parsing.cfmentat.antlr.CFException;
import cfml.parsing.cfmentat.antlr.CFExpression;
import cfml.parsing.cfmentat.antlr.cfLData;

public class CFForInStatement extends CFParsedStatement implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private CFExpression variable;
	private CFExpression structure;
	private CFScriptStatement body;

	public CFForInStatement( Token _t, CFExpression _key,
	    CFExpression _structure, CFScriptStatement _body ) {
		super(_t);
		variable = _key;
		structure = _structure; // should be a cfstruct
		body = _body;
	}

	public void checkIndirectAssignments( String[] scriptSource ) {
		body.checkIndirectAssignments(scriptSource);
	}

	public CFStatementResult Exec( CFContext context ) throws cfmRunTimeException {
		cfStructData struct;

		setLineCol(context);

		cfData temp = structure.Eval(context);
		if ( temp.getDataType() == cfData.CFLDATA ) {
			temp = ((cfLData) temp).Get(context);
		}

		if ( temp == null || !temp.isStruct() ) {
			throw new CFException("Only structs may be used in a for...in.", context);
		} else {
			struct = (cfStructData) temp;
		}

		cfData temp2 = variable.Eval(context);
		cfLData var = (cfLData) temp2;

		Object[] keys = struct.keys();
		for (int i = 0; i < keys.length; i++) {
			String nextStr = (String) keys[i];
			var.Set(new cfStringData(nextStr), context);

			CFStatementResult result = body.Exec(context);
			if ( result != null ) {
				if ( result.isBreak() ) {
					break;
				} else if ( result.isContinue() ) {
					continue;
				}
				return result;
			}
		}
		return null;
	}

	public String Decompile( int indent ) {
		StringBuilder sb = new StringBuilder();
		sb.append(Indent(indent));
		sb.append("for( ");
		sb.append(variable);
		sb.append(" in ");
		sb.append(structure.Decompile(indent));
		sb.append(" ) ");
		sb.append(body.Decompile(indent + 2));
		return sb.toString();
	}

}
