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

import java.util.List;

import org.antlr.runtime.Token;

import cfml.parsing.cfmentat.antlr.CFContext;
import cfml.parsing.cfmentat.antlr.ParseException;

public class CFFuncDeclStatement extends CFParsedStatement {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private List<String> formals; // Vector of String's
	private CFScriptStatement body;
	
	public CFFuncDeclStatement(Token _t, Token _name, List<String> _formals, CFScriptStatement _body) {
		super(_t);
		name = _name.getText();
		formals = _formals;
		body = _body;
		
		// if (
		// com.naryx.tagfusion.expression.compile.expressionEngine.isFunction(
		// name ) )
		if (false)
			throw new ParseException(_name, "Invalid function name. The name \"" + name
					+ "\" is the name of a predefined function.");
		
	}
	
	public void checkIndirectAssignments(String[] scriptSource) {
		body.checkIndirectAssignments(scriptSource);
	}
	
	public userDefinedFunction getUDF() {
		return new userDefinedFunction(name, formals, body);
	}
	
	public CFStatementResult Exec(CFContext context) {
		return null;
	}
	
	public String Decompile(int indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(Indent(indent));
		sb.append("function ");
		sb.append(name);
		sb.append("(");
		for (int i = 0; i < formals.size(); i++) {
			sb.append(formals.get(i));
			if (i != formals.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append(") {\n");
		sb.append(body.Decompile(indent + 2));
		sb.append("\n");
		sb.append(Indent(indent));
		sb.append("}");
		
		return sb.toString();
	}
}
