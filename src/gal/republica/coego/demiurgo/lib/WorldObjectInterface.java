package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;

public interface WorldObjectInterface extends Serializable {

	public long getId();

	public String getClassName();

	public long getLoc_id();

	public String getUsername();

	public ValueInterface getField(String name);
}
