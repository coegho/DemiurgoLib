package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;

public interface UserInterface extends Serializable {

	public String getUsername();

	public long getObjId();

	public boolean isAdmin();
}
