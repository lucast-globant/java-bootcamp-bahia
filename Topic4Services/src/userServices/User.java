package userServices;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String id;
	private String pass;
	private String email;
	private List<Photo> photos;
	private List<String> friends;

	public User(String id, String pass) {
		this.id = id;
		this.pass = pass;
		this.email = new String();
		photos = new ArrayList<Photo>();
		friends = new ArrayList<String>();
	}

	public void getUserInfo() {
		System.out.print("User Id: " + id);
		if (email.isEmpty()) {
			System.out.println(", no email");
		} else {
			System.out.println(", email: " + email);
		}
	}

	public void update(String property, String value) {
		if ("email".equals(property)) {
			this.email = value;
		} else {
			if (property.equals("pass")) {
				this.pass = value;
			}
		}
	}

	public void insertPhoto(Photo photo) {
		photos.add(photo);
	}

	public void addLikes(Photo photo) {
		int i = photos.indexOf(photo);
		photos.get(i).addLike();
	}

	public void addFriend(String IdFriend) {
		friends.add(IdFriend);
	}

}
