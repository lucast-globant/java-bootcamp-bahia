	/**
	 * This API provides CRUD operations for an user Service.
	 * @author: Rocca Martín Andrés
	 * @version: 2/03/2015
	 *
	 */
public interface UserService {

	/**
     * Add a user passed by parameter
     * @param user User to be added
     */
	public void addUser(User user);
	
	/**
     * Remove a user passed by parameter
     * @param user User to be removed
     */
	public void deleteUser(User user);
	
	/**
     * Return the number of users
     * @return int Number of users
     */
	public int numberOfUser();
	
	/**
     * Return a user which position is passed by parameter
     * @param index Position of the user to be returned
     * @return User in index position
     */
	public User getUser(int index);
	
	/**
     * Add a friend to a user
     * @param user The user who add a new friend
     * @param friendUser The friend to add
     */
	public void addFriend(User user, User friendUser);
	
	/**
     * Remove a friend from a user
     * @param user The user who remove a new friend
     * @param friendUser The friend to remove
     */
	public void removeFriend(User user, User friendUser);
		
	/**
     * Add a photography to a user given by parameter
     * @param user The user who add a new photography
     * @param photo The photography to add
     */
	public void addPhoto(User user, Photo photo);
	
	/**
     * Remove a photography from a user given by parameter
     * @param user The user who remove the photography
     * @param photo The photography to remove
     */
	public void removePhoto(User user, Photo photo);
	
	
	/**
     * Add a new like of a user to a photography
     * @param user The user who make the like
     * @param photo The photography liked
     */
	public void like(User user, Photo photo);
	
	/**
     * Remove a like of a user from a photography
     * @param user The user who make the dislike
     * @param photo The photography disliked
     */
	public void disLike(User user, Photo photo);
		
}