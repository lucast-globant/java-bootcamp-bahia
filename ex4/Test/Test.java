package ex4.Test;

import static org.junit.Assert.*;
import ex4.Database;
import ex4.LocalService;
import ex4.Photo;
import ex4.User;
import ex4.UserService;

public class Test {

	@org.junit.Test
	public void check_User_Creation() {
		User user = new User("Francisco", "1111");
		assertEquals("Francisco", user.getName());
		assertEquals("1111", user.getPassword());
	}

	@org.junit.Test
	public void check_Friend_Add() {
		User user1 = new User("Francisco", "1111");
		User user2 = new User("Agustin", "2222");
		user1.addFriend(user2);
		assertEquals(true, user1.getFriends().contains(user2));
		assertEquals(true, user2.getFriends().contains(user1));
	}

	@org.junit.Test
	public void check_Friend_Remove() {
		User user1 = new User("Francisco", "1111");
		User user2 = new User("Agustin", "2222");
		user1.addFriend(user2);
		user2.deleteFriend(user1);
		assertEquals(false, user1.getFriends().contains(user2));
		assertEquals(false, user2.getFriends().contains(user1));
	}

	@org.junit.Test
	public void check_BD_ADD_USER() {
		UserService db = new LocalService();
		User user1 = new User("Francisco", "1111");
		User user2 = new User("Agustin", "2222");
		db.add(user1);
		db.add(user2);
		assertEquals(user1, db.get(user1.getID()));
		assertEquals(user2, db.get(user2.getID()));

	}

	@org.junit.Test
	public void check_BD_DELETE_USER() {
		UserService db = new LocalService();
		User user1 = new User("Francisco", "1111");
		User user2 = new User("Agustin", "2222");
		db.add(user1);
		db.add(user2);
		assertEquals(user1, db.get(user1.getID()));
		assertEquals(user2, db.get(user2.getID()));
		db.deleteUser(user1.getID());
		assertEquals(null, db.get(user1.getID()));

	}

	@org.junit.Test
	public void check_BD_UPDATE_USER() {
		UserService db = new LocalService();
		User user1 = new User("Francisco", "1111");
		User user2 = new User("Agustin", "2222");
		db.add(user1);
		assertEquals(user1, db.get(user1.getID()));
		db.updateUser(user1.getID(), user2);
		assertEquals(user2, db.get(user2.getID()));

	}

	@org.junit.Test
	public void check_BD_CREATE_PHOTO() {
		UserService db = new LocalService();
		User user1 = new User("Francisco", "1111");
		db.add(user1);
		Photo photo = new Photo(user1);
		db.uploadPhoto(photo);
		assertEquals(photo, db.getPhotos(user1).get(0));

	}

	@org.junit.Test
	public void check_BD_LIKE_PHOTO() {
		UserService db = new LocalService();
		User user1 = new User("Francisco", "1111");
		User user2 = new User("Agustin", "2222");
		db.add(user2);
		db.add(user1);
		Photo photo = new Photo(user1);
		db.uploadPhoto(photo);
		db.likePhoto(user2, photo);
		assertEquals(user2, db.getPhotos(user1).get(0).getLikes().get(0));

	}

	@org.junit.Test
	public void check_BD_UNLIKE_PHOTO() {
		UserService db = new LocalService();
		User user1 = new User("Francisco", "1111");
		User user2 = new User("Agustin", "2222");
		db.add(user2);
		db.add(user1);
		Photo photo = new Photo(user1);
		db.uploadPhoto(photo);
		db.likePhoto(user2, photo);
		db.unlikePhoto(user2, photo);
		assertEquals(true, db.getPhotos(user1).get(0).getLikes().isEmpty());

	}
}
