package classes;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import interfaces.User;

public class WebUser implements User {

	private String mail;
	private String password;
	private String name;
	private String lastName;
	private Image photo;
	private List<User> friends;
	private List<User> likesPhoto;

	public WebUser(String mail, String password, String name, String lastName) {
		updateUser(mail, password, name, lastName);
		photo = null;
		friends = new ArrayList<User>();
		likesPhoto = new ArrayList<User>();
	}

	@Override
	public void updateUser(String mail, String password, String name, String lastName) {
		this.mail = mail;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String getMail() {
		return mail;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	@Override
	public void addFriend(User user) {
		friends.add(user);
	}

	@Override
	public void addLikePhoto(User user) {
		likesPhoto.add(user);
	}

	@Override
	public boolean areFriends(User user) {
		return friends.contains(user);
	}
}
