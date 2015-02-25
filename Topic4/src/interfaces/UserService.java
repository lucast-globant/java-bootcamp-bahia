package interfaces;

import java.awt.Image;
import classes.WebUserServiceResult;

public interface UserService {

	public WebUserServiceResult createUser(String mail, String password, String name, String lastName);

	public User readUser(String mail);

	public WebUserServiceResult updateUser(String mail, String password, String name, String lastName);

	public WebUserServiceResult deleteUser(String mail);

	public WebUserServiceResult uploadPhoto(String mail, Image photo);

	public WebUserServiceResult addFriend(String mailUser1, String mailUser2);

	public WebUserServiceResult addLike(String mailUser1, String mailUser2);

}
