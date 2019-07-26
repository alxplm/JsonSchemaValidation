package com.alxplm.iib;

import com.ibm.broker.config.appdev.InputTerminal;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.NodeProperty;
import com.ibm.broker.config.appdev.OutputTerminal;

/*** 
 * <p>  <I>JSONSchemaValidationNodeUDN</I> instance</p>
 * <p></p>
 */
public class JSONSchemaValidationNodeUDN extends Node {

	private static final long serialVersionUID = 1L;

	// Node constants
	protected final static String NODE_TYPE_NAME = "com/alxplm/iib/JSONSchemaValidationNode";
	protected final static String NODE_GRAPHIC_16 = "platform:/plugin/JsonSchemaValidation/icons/full/obj16/com/alxplm/iib/JSONSchemaValidation.gif";
	protected final static String NODE_GRAPHIC_32 = "platform:/plugin/JsonSchemaValidation/icons/full/obj30/com/alxplm/iib/JSONSchemaValidation.gif";

	protected final static String PROPERTY_SCHEMAPATH = "schemaPath";
	protected final static String PROPERTY_ISFULLLOG = "isFullLog";

	protected NodeProperty[] getNodeProperties() {
		return new NodeProperty[] {
			new NodeProperty(JSONSchemaValidationNodeUDN.PROPERTY_SCHEMAPATH,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.STRING, null,"","",	"com/alxplm/iib/JSONSchemaValidation",	"JsonSchemaValidation"),
			new NodeProperty(JSONSchemaValidationNodeUDN.PROPERTY_ISFULLLOG,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.BOOLEAN, "false","","",	"com/alxplm/iib/JSONSchemaValidation",	"JsonSchemaValidation")
		};
	}

	public JSONSchemaValidationNodeUDN() {
	}

	public final InputTerminal INPUT_TERMINAL_IN = new InputTerminal(this,"InTerminal.in");
	@Override
	public InputTerminal[] getInputTerminals() {
		return new InputTerminal[] {
			INPUT_TERMINAL_IN
	};
	}

	public final OutputTerminal OUTPUT_TERMINAL_VALID = new OutputTerminal(this,"OutTerminal.valid");
	public final OutputTerminal OUTPUT_TERMINAL_FAILURE = new OutputTerminal(this,"OutTerminal.failure");
	public final OutputTerminal OUTPUT_TERMINAL_INVALID = new OutputTerminal(this,"OutTerminal.invalid");
	@Override
	public OutputTerminal[] getOutputTerminals() {
		return new OutputTerminal[] {
			OUTPUT_TERMINAL_VALID,
			OUTPUT_TERMINAL_FAILURE,
			OUTPUT_TERMINAL_INVALID
		};
	}

	@Override
	public String getTypeName() {
		return NODE_TYPE_NAME;
	}

	protected String getGraphic16() {
		return NODE_GRAPHIC_16;
	}

	protected String getGraphic32() {
		return NODE_GRAPHIC_32;
	}

	/**
	 * Set the <I>JSONSchemaValidationNodeUDN</I> "<I>Schema path</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Schema path</I>"
	 */
	public JSONSchemaValidationNodeUDN setSchemaPath(String value) {
		setProperty(JSONSchemaValidationNodeUDN.PROPERTY_SCHEMAPATH, value);
		return this;
	}

	/**
	 * Get the <I>JSONSchemaValidationNodeUDN</I> "<I>Schema path</I>" property
	 * 
	 * @return String; the value of the property "<I>Schema path</I>"
	 */
	public String getSchemaPath() {
		return (String)getPropertyValue(JSONSchemaValidationNodeUDN.PROPERTY_SCHEMAPATH);
	}

	/**
	 * Set the <I>JSONSchemaValidationNodeUDN</I> "<I>Provide full log</I>" property
	 * 
	 * @param value boolean ; the value to set the property "<I>Provide full log</I>"
	 */
	public JSONSchemaValidationNodeUDN setIsFullLog(boolean value) {
		setProperty(JSONSchemaValidationNodeUDN.PROPERTY_ISFULLLOG, String.valueOf(value));
		return this;
	}

	/**
	 * Get the <I>JSONSchemaValidationNodeUDN</I> "<I>Provide full log</I>" property
	 * 
	 * @return boolean; the value of the property "<I>Provide full log</I>"
	 */
	public boolean getIsFullLog(){
	if (getPropertyValue(JSONSchemaValidationNodeUDN.PROPERTY_ISFULLLOG).equals("true")){
		return true;
	} else {
		return false;
		}
	}

	public String getNodeName() {
		String retVal = super.getNodeName();
		if ((retVal==null) || retVal.equals(""))
			retVal = "JSON Schema Validation";
		return retVal;
	};
}
