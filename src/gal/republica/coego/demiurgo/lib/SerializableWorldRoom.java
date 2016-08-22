package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;

public interface SerializableWorldRoom extends Serializable {

	public long getId();

	public String getLongPath();

	public SerializableValue getVariable(String name);
}