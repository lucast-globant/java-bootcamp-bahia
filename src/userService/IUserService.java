package userService;

/**
 * Interface to a User Service. It implements a service where users can have
 * friends, upload photos, and like photos of their friends.
 * 
 * @author Elisabet Arratia
 */
public interface IUserService {

	/**
	 * Creates a new user
	 *
	 * @param userId
	 *            a String with the ID of teh user to be created.
	 * @param userName
	 *            a String with the user's Name.
	 */
	public void addUser(String userId, String userName);

	/**
	 * Removes new user
	 *
	 * @param userId
	 *            a String with the ID of the user to be removed. If
	 *            <code>userId</code> doesn't exist, it doesn't do anything.
	 */
	public void removeUser(String userId);

	/**
	 * Adds a "like" to a photo. If the users <code>fromUser</code> and
	 * <code>toUser</code> are not friends, the method doesn't do anything
	 *
	 * @param fromUser
	 *            a String with the ID of the user that likes a photo.
	 * @param toUser
	 *            a String with the ID of the user to whom the photo belongs.
	 * @param inPhoto
	 *            the ID of the photo that user <code>fromUser</code> liked from
	 *            user <code>toUser</code>.
	 */
	public void addLike(String fromUser, String toUser, int inPhoto);

	/**
	 * Removes a "like" from a photo.
	 *
	 * @param fromUser
	 *            a String with the ID of the user that used to like a photo.
	 * @param toUser
	 *            a String with the ID of the user to whom the photo belongs.
	 * @param inPhoto
	 *            the ID of the photo that user <code>fromUser</code> stopped
	 *            liking from user <code>toUser</code>.
	 */
	public void removeLike(String fromUser, String toUser, int inPhoto);

	/**
	 * Uploads a photo
	 *
	 * @param userId
	 *            a String with the ID of the user who uploaded a photo.
	 * @param photoURL
	 *            a String with the URL of the photo to be uploaded
	 * @param photoDescription
	 *            a String with the description
	 */
	public void uploadPhoto(String userId, String photoURL,
			String photoDescription);

	/**
	 * Adds user <code>friend</code> as a friend to user <code>toUser</code>
	 *
	 * @param friend
	 *            a String with the ID of the user to be added as a friend of
	 *            <code>toUser</code>.
	 * @param toUser
	 *            a String with the ID of the user to whom <code>friend</code>
	 *            is added as a friend.
	 */
	public void addFriend(String friend, String toUser);

	/**
	 * Adds user <code>friend</code> as a friend to user <code>toUser</code>
	 *
	 * @param friend
	 *            a String with the ID of the user to be added as a friend of
	 *            <code>toUser</code>.
	 * @param toUser
	 *            a String with the ID of the user from whom <code>friend</code>
	 *            is to be removed as a friend.
	 */
	public void removeFriend(String friend, String toUser);

	/**
	 * Returns the number of users in the DB
	 *
	 * @return the number of users in the DB
	 */
	public int getNumberOfUsers();
}
