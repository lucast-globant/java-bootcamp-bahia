	/**
	 * This API provides CRUD operations for an user Service.
	 * @author: Rocca Martín Andrés
	 * @version: 25/02/2015
	 *
	 */
public interface UserService {

	/**
     * Add an user passed by parameter
     * @param user User to be added
     */
	public void addUser(User user);
	
	/**
     * Remove an user passed by parameter
     * @param user User to be removed
     */
	public void deleteUser(User user);
	
	/**
     * Return the number of user
     * @return int Number of users
     */
	public int numberOfUser();
	
	/**
     * Return an user which position is passed by parameter
     * @param index Position of the user to be returned
     * @return User in index position
     */
	public User getUser(int index);
	
}