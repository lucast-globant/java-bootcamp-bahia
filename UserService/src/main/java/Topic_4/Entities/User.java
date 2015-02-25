package Topic_4.Entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username, name, lastname, password;
	private List<Photo> photos;
	private List<String> friends;

	public User(String username, String name, String lastname, String password) {
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.password = password;
		this.photos = new ArrayList<Photo>();
		this.friends = new ArrayList<String>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public void addPhoto(Photo photo) {
		this.photos.add(photo);
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public void addFriend(String friend) {
		this.friends.add(friend);
	}

}
