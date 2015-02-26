package classes;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class WebUser {

	private User user;
	private Image photo;
	private List<WebUser> friends;
	private List<WebUser> likesPhoto;

	public WebUser(String mail, String password, String name, String lastName) {
		user = new User(mail, password, name, lastName);
		photo = null;
		friends = new ArrayList<WebUser>();
		likesPhoto = new ArrayList<WebUser>();
	}

	public void updateUser(String mail, String password, String name, String lastName) {
		user.setMail(mail);
		user.setPassword(password);
		user.setName(name);
		user.setLastName(lastName);
	}

	public String getMail() {
		return user.getMail();
	}

	public String getPassword() {
		return user.getPassword();
	}

	public String getName() {
		return user.getName();
	}

	public String getLastName() {
		return user.getLastName();
	}

	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	public void addFriend(WebUser user) {
		friends.add(user);
	}

	public void addLikePhoto(WebUser user) {
		likesPhoto.add(user);
	}

	public boolean areFriends(WebUser user) {
		return friends.contains(user);
	}
}
