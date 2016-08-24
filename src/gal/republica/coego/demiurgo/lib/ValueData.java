package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;

public class ValueData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String[] valueCodes;
	protected ReturnValueTypes type;
	
	public ValueData(String[] valueCodes, ReturnValueTypes type) {
		this.valueCodes = valueCodes;
		this.type = type;
	}
	
	public String[] getValueCodes() {
		return valueCodes;
	}
	public ReturnValueTypes getType() {
		return type;
	}
}
