package gal.republica.coego.demiurgo.lib;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * This class serves to create a RMI object that acts as a proxy for user
 * interfaces, web interface for example.
 * 
 * @author Martín Coego Pérez
 * @since 1.0
 */
public interface ServerInterface extends Remote {

	/**
	 * Returns a Token identifying the user, or null if login fails.
	 * 
	 * @param world
	 *            World's name.
	 * @param name
	 *            User name.
	 * @param password
	 *            User password.
	 * @return
	 */
	public String login(String world, String name, String password) throws java.rmi.RemoteException;

	/**
	 * Returns an User object relative to the user.
	 * 
	 * @param token
	 *            Authentication token.
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public UserInterface me(String token) throws java.rmi.RemoteException;

	/**
	 * Returns a room.
	 * 
	 * @param token
	 *            Authentication token.
	 * @param path
	 *            Room's path.
	 * @throws java.rmi.RemoteException
	 */
	public WorldRoomInterface checkRoom(String token, String path) throws java.rmi.RemoteException;

	/**
	 * Executes code related to an action.
	 * 
	 * @param token
	 *            Authentication token.
	 * @param path
	 *            Current room's path.
	 * @param code
	 *            Code to execute.
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public boolean executeCode(String token, String path, String code) throws java.rmi.RemoteException;

	/**
	 * Creates a new class into the world.
	 * 
	 * @param token
	 *            Authentication token.
	 * @param name
	 *            New class' name.
	 * @param code
	 *            New class' code.
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public boolean newClass(String token, String name, String code) throws java.rmi.RemoteException;

	/**
	 * Creates a new room.
	 * 
	 * @param token
	 *            Authentication token.
	 * @param path
	 *            New room's path.
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public boolean createRoom(String token, String path) throws java.rmi.RemoteException;

	/**
	 * Submits a decision from an user.
	 * 
	 * @param token
	 *            Authentication token.
	 * @param user
	 *            User who submit his decision. //TODO: identify users
	 * @param text
	 *            Decision's text.
	 * @throws java.rmi.RemoteException
	 */
	public void submitDecision(String token, String text) throws java.rmi.RemoteException;

	/**
	 * Returns a list with all the rooms with pending decisions.
	 * 
	 * @param token
	 *            Authentication token.
	 * @return
	 * @throws RemoteException
	 */
	public List<String> getPendingRooms(String token) throws RemoteException;

	/**
	 * Returns a list with all decisions submitted outside a room.
	 * 
	 * @param token
	 *            Authentication token.
	 * @return
	 * @throws RemoteException
	 */
	public List<Decision> getNoRoomDecisions(String token) throws RemoteException;
}
