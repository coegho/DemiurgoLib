package gal.republica.coego.demiurgo.lib;

import java.io.Serializable;
import java.util.List;

public interface WorldRoomInterface extends Serializable {

	public long getId();

	public String getLongPath();

	public ValueInterface getVariable(String name);
	
	public List<WorldObjectInterface> getObjects();
	
	public String getNarratedAction();
	
	public List<Decision> getDecisions();
}