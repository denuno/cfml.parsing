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
 
import com.naryx.tagfusion.expression.function.functionBase;
import com.naryx.tagfusion.cfm.engine.*;

import java.io.*;
import java.util.List;

import cfml.parsing.cfmentat.antlr.CFCall;
import cfml.parsing.cfmentat.antlr.CFContext;
import cfml.parsing.cfmentat.antlr.CFUndefinedValue;
import cfml.parsing.cfmentat.antlr.cfLData;
import cfml.parsing.cfmentat.antlr.indirectReferenceData;
import com.naryx.tagfusion.cfm.tag.*;

public class userDefinedFunction extends functionBase implements java.io.Serializable
{
	private static final long serialVersionUID = 1;

	public static final int ACCESS_PRIVATE = 0;
	public static final int ACCESS_PACKAGE = 1;
	public static final int ACCESS_PUBLIC = 2;
	public static final int ACCESS_REMOTE = 3;
	
	protected String name;
	protected cfStructData metaData;
	protected int access = -1;
	
	// the following attribute is only used for CFFUNCTION-based UDFs
	protected cfFUNCTION parentFunction;
	
	// the following two attributes are only used for CFSCRIPT-based UDFs
	private CFScriptStatement body;
	protected List<String> formals; // a list of argument names in Strings
	
	// for UDFs within a CFC; needs to be per-CFC instance
	protected cfComponentData superScope;
	
	// for creating CFSCRIPT-based UDFs
	public userDefinedFunction( String _name, List<String> _formals, CFScriptStatement _body ) {
		name = _name;
		formals = _formals;
		body = _body;
	}
	
	// for creating CFFUNCTION-based UDFs
	public userDefinedFunction( String _name, cfFUNCTION _parent ) {
		name = _name;
		parentFunction = _parent;
	}
	
	public userDefinedFunction( userDefinedFunction udf, cfComponentData _superScope ) {
		name = udf.name;
		metaData = udf.metaData;
		access = udf.access;
		parentFunction = udf.parentFunction;
		body = udf.body;
		formals = udf.formals;
		
		superScope = _superScope;
	}
	
	/*
	 * This allows for the JavascriptDefinedFunction to properly handle the inheritance stack
	 */
	public userDefinedFunction	duplicateAndInherit( cfComponentData _superScope ){
		return new userDefinedFunction( this, _superScope );
	}
	
	public cfData duplicate() {
		// once constructed, the UDF attributes never change, so no need to create a
		// duplicate, which just would be exactly the same as the original
		return this;
	}
	
	public byte getDataType() { 
		return cfData.CFUDFDATA; 
	}
	
	public String getTypeString() { 
		return "UDF"; 
	}
	
	// for CFFUNCTION-based UDFs only
	public List<cfStructData> getFormalArguments() {
		if ( parentFunction != null ) {
			return parentFunction.getFormalArguments();
		}
		return null;
	}
	
	public List<String> getFormals() {
		return formals;
	}
	
	public String getName() {
		return name;
	}
	
	public String getString() {
		return name;
	}
	
	public cfFUNCTION getParentFunction() {
		return parentFunction;
	}
	
	public String getParentComponentName() {
		String parentComponentName = null;
		if ( parentFunction != null ) {
			parentComponentName = parentFunction.getParentComponentName();
		}
		return ( parentComponentName != null ? parentComponentName : "" );
	}
	
	public boolean isAbstract() {
		if ( parentFunction != null ) {
			return parentFunction.isAbstract();
		}
		return false;
	}
	
	public int getAccessType() {
		if ( access < 0 ) {
			access = ACCESS_PUBLIC; // default access type
			cfData accessData = getMetaData().getData( cfFUNCTION.ACCESS );
			if ( accessData != null ) {
				String accessString = accessData.toString();
				if ( accessString.equalsIgnoreCase( "PRIVATE" ) ){
					access = ACCESS_PRIVATE;
				} else if ( accessString.equalsIgnoreCase( "PACKAGE" ) ) {
					access = ACCESS_PACKAGE;
				} else if ( accessString.equalsIgnoreCase( "REMOTE" ) ) {
					access = ACCESS_REMOTE;
				}
			}
		}
		return access;
	}
	
	// metadata is needed by CFC function calls, also by GetMetaData()
	public cfStructData getMetaData() {
		if ( parentFunction != null ) {
			return parentFunction.getMetaData();
		}
		if ( metaData == null ) {
			initMetaData();
		}
		return metaData;
	}

	private synchronized void initMetaData() {
		metaData = new cfStructData();
		metaData.setData( "NAME", new cfStringData( name ) );
		
		cfArrayData argArray = cfArrayData.createArray( 1 );
		
		for ( int i = 0; i < formals.size(); i++ ) {
			cfStructData argStruct = new cfStructData();
			argStruct.setData( "NAME", new cfStringData( formals.get( i ).toString().toUpperCase() ) );
			argStruct.setData( "REQUIRED", new cfStringData( "true" ) );
			try {
				argArray.addElement( argStruct );
			} catch ( cfmRunTimeException ignore ) {
				// will never happen
			}
		}
		
		metaData.setData( "PARAMETERS", argArray );
	}

	public cfData execute( cfSession _session, List<cfData> _actuals ) throws cfmRunTimeException {
		return execute( _session, _actuals, true );
	}

	public cfData execute( cfSession _session, List<cfData> _actuals, boolean _isLocalExec ) throws cfmRunTimeException {
		if( parentFunction != null ) {
			if ( parentFunction.isAbstract() ) {
				throw new cfmRunTimeException( catchDataFactory.generalException( _session, cfCatchData.TYPE_TEMPLATE,
						"Abstract Function Invocation", "Abstract functions may not be invoked" ) );
			}
			return parentFunction.run( _session, name, _actuals, superScope, _isLocalExec );
		}

		// Create the arguments array - this is empty if there are fewer actuals than formals
		int nargs = _actuals.size();
		cfArgStructData args = new cfArgStructData();
		
		// Instantiate the formals
		for( int i = 0; i < formals.size(); i++ ) {
			if( i < nargs ) {
				// note index increment is down to cfArrayData api that indexes from 1 as opposed to 0.
				args.setData( formals.get( i ), _actuals.get( i ) );
			}
		}
		
		// Put the remainder into "arguments"
		for( int i = formals.size(); i < nargs; i = i+1 ) {
			// note index increment is down to cfArrayData api that indexes from 1 as opposed to 0.
			args.setData( String.valueOf( i+1 ), _actuals.get(i) );
		}
		
		return execute( _session, args, _isLocalExec );
	}
	
	public cfData execute( cfSession _session, cfArgStructData _args, boolean _isLocalExec ) throws cfmRunTimeException
	{
	  	if( parentFunction != null ) { // CFFUNCTION-based UDF call
	  		return parentFunction.run( _session, name, _args, superScope, _isLocalExec );
	  	}
  
		cfData retVal = null;
		CFContext context = _session.getCFContext();
		if ( context == null ) {
			throwException( _session, "Internal error : failed to get context" ); 
		}
	
		// Create a call environment
		CFCall call = _session.enterUDF( _args, superScope, _isLocalExec );             

		// loop thru the formal args inserting their values to the call scope
		for ( int i = 0; i < formals.size(); i++ ) {
			String nextKey = formals.get( i );
			cfData nextData = _args.getData( nextKey );
			if ( nextData == null ) {
				throwException( _session, "Value not provided for required argument " +
											nextKey.toUpperCase() + " of function " + name );
			}
			if ( nextData != CFUndefinedValue.UNDEFINED ) {
				nextData = new indirectReferenceData( nextKey, _args, new cfStringData( nextKey ) );
			}
			call.put( nextKey, nextData, context);
		}
	
		// Execute the body.
		CFStatementResult result = body.Exec(context);
		if ( result == null ) {
			retVal = CFUndefinedValue.UNDEFINED;
		} else if ( result.isReturn() ) {
			retVal = result.getReturnValue();
			if ( ( retVal != null ) && ( retVal.getDataType() == cfData.CFLDATA ) ) {
				retVal = ((cfLData)retVal).Get( context );
	        }
		} else {
			// ### not sure that this should get through here
			retVal = cfBooleanData.TRUE;
		}
	
		// Pop the call
		_session.leaveUDF();
	
		// Return the return value
		return retVal;
	}// execute()

  public void dump( PrintWriter out ) 
  {
    dump( out, "" );
  }
  
	public void dump( PrintWriter out, String _label ) 
	{
		if ( parentFunction != null ) {
			parentFunction.dump( out, _label );
			return;
		}
		
		out.write( "<table class='cfdump_table_udf' width=\"100%\">" );
		out.write( "<th class='cfdump_th_udf'>" );
    if ( _label.length() > 0 ) out.write( _label + " - " );
    out.write( "function " );
		out.write( name );
		//out.write( " (" + this.hashCode() + ")" ); // useful for debugging
		out.write( "</th>" );
		out.write( "<tr><td class='cfdump_td_value'><table cellspacing=2 width=\"100%\">" );
		
		if ( ( formals == null ) || ( formals.size() == 0 ) )
		{
			out.write( "<tr><td  class='cfdump_td_udf'>Arguments:</td>" );
			out.write( "<td class='cfdump_td_value'>none</td></tr>" );
		}
		else
		{
			out.write( "<tr><td  class='cfdump_td_udf' colspan=2>Arguments:</td></tr>" );
			out.write( "<tr><td  class='cfdump_td_udf_args' colspan=2>" );
			out.write( "<table class='cfdump_table_udf_args'>" );
			out.write( "<th class='cfdump_th_udf_args'>Name</th>" );
			out.write( "<th class='cfdump_th_udf_args'>Required</th>" );
			out.write( "<th class='cfdump_th_udf_args'>Type</th>" );
			out.write( "<th class='cfdump_th_udf_args'>Default</th>" );
		
			for( int i=0; i < formals.size(); i++ ) {
				out.write( "<tr><td class='cfdump_td_value'>" + formals.get( i ).toString().toLowerCase() + "</td>" );
				out.write( "<td class='cfdump_td_value'>required</td>" );
				out.write( "<td class='cfdump_td_value'>any</td>" );
				out.write( "<td class='cfdump_td_value'></td></tr>" );
			}
			
			out.write( "</table>" );
			out.write( "</td></tr>" );
		}
		
		out.write( "</table></td></tr>" );
		out.write( "</table>" );
	}

	public String toString()
	{
		StringWriter w = new StringWriter();
		
		this.dump(new PrintWriter(w));
		
		return w.toString();
	}

}
