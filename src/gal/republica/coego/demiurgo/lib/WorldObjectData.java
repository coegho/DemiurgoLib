package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;
import java.util.Map;

public class WorldObjectData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long id;
	protected Map<String, ValueData> fields;
	protected String className;
	protected long loc_id;
	protected String username;

	/**
	 * 
	 * @param id
	 *            Object's ID.
	 * @param classname
	 *            Name of the object's class.
	 * @param loc_id
	 *            ID of the object's location.
	 * @param fields
	 *            Object's fields.
	 */
	public WorldObjectData(long id, String classname, long loc_id, Map<String, ValueData> fields) {
		this.id = id;
		this.className = classname;
		this.loc_id = loc_id;
		this.fields = fields;
	}

	public long getId() {
		return id;
	}

	public String getClassName() {
		return className;
	}


	public long getLocId() {
		return loc_id;
	}


	public String getUsername() {
		return username;
	}

	public Map<String, ValueData> getFields() {
		return fields;
	}
}
