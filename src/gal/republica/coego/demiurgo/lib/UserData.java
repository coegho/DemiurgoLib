package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;

public class UserData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String username;
	protected boolean admin;
	protected long obj_id;


	/**
	 * This constructor requires a posterior call to the method 'rebuild'.
	 */
	public UserData(String username, boolean admin, long obj_id) {
		this.username = username;
		this.admin = admin;
		this.obj_id = obj_id;
	}

	public String getUsername() {
		return username;
	}

	public boolean isAdmin() {
		return admin;
	}


	public long getObjId() {
		return obj_id;
	}
}
