package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class WorldRoomData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long id;
	protected String longPath;
	protected Map<String, ValueData> variables;
	protected String narratedAction;
	protected List<Decision> decisions;
	protected List<WorldObjectData> objects;

	public WorldRoomData(long id, String long_path, Map<String, ValueData> variables, String narratedAction,
			List<Decision> decisions, List<WorldObjectData> objects) {
		this.id = id;
		this.longPath = long_path;
		this.variables = variables;
		this.narratedAction = narratedAction;
		this.decisions = decisions;
		this.objects = objects;
	}

	public String getLongPath() {
		return longPath;
	}

	public String getShortName() {
		return longPath.substring(longPath.lastIndexOf('/'));
	}

	public Map<String, ValueData> getVariables() {
		return variables;
	}

	public String getNarratedAction() {
		return narratedAction;
	}

	public List<Decision> getDecisions() {
		return decisions;
	}
	
	public List<WorldObjectData> getObjects() {
		return objects;
	}
}
