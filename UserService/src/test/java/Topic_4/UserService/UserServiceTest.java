package Topic_4.UserService;

import static org.junit.Assert.*;

import org.junit.Test;

import Topic_4.Entities.Photo;
import Topic_4.Entities.User;
import Topic_4.Services.UserService;
import Topic_4.Services.UserServiceFactory;

public class UserServiceTest {

	@Test
	public void createUserTest() {
		UserService userService = UserServiceFactory.getLocalService();
		userService.createUser("username", "name", "lastname", "password");
		User user2 = userService.createUser("username", "name", "lastname", "password");
		assertEquals(null, user2);
	}

	@Test
	public void readUserTest() {
		UserService userService = UserServiceFactory.getLocalService();
		User expected = userService.createUser("username", "name", "lastname", "password");
		User actual = userService.readUser("username");
		assertEquals(expected, actual);
	}

	@Test
	public void updateUserTest() {
		UserService userService = UserServiceFactory.getLocalService();
		User user = userService.createUser("username", "name", "lastname", "password");
		userService.updateUser(user, "name", "lastname", "pass");
		assertEquals("pass", user.getPassword());
	}

	@Test
	public void deleteUserTest() {
		UserService userService = UserServiceFactory.getLocalService();
		User user = userService.createUser("username", "name", "lastname", "password");
		boolean actual = userService.deleteUser(user);
		assertTrue(actual);
		actual = userService.deleteUser(user);
		assertFalse(actual);
	}

	@Test
	public void addFriendTest() {
		UserService userService = UserServiceFactory.getLocalService();
		User user = userService.createUser("username", "name", "lastname", "password");
		userService.createUser("username2", "name", "lastname", "password");
		boolean actual = userService.addFriend(user, "username2");
		assertTrue(actual);
		actual = userService.addFriend(user, "username2");
		assertFalse(actual);
		actual = userService.addFriend(user, "other");
		assertFalse(actual);
	}

	@Test
	public void giveLikeTest() {
		UserService userService = UserServiceFactory.getLocalService();
		User user = userService.createUser("username", "name", "lastname", "password");
		userService.uploadPhoto(user, "path");
		Photo photo = user.getPhotos().get(0);
		boolean actual = userService.giveLike(user, photo);
		assertTrue(actual);
		actual = userService.giveLike(user, photo);
		assertFalse(actual);
	}

}
