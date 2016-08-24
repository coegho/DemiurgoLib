package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;

public interface ValueInterface extends Serializable {
	public String[] getValueCodes();
	public ReturnValueTypes getType();
}
