package topic_4;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String email;
	private String password;
	private int creditNumber;
	private List<Photo> pictures;
	private List<Integer> friends;
	private static int idUser = 0;
	
	public User (String name, String email, String password, int creditNumber) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.creditNumber = creditNumber;
		this.pictures = new ArrayList<Photo>();
		this.friends = new ArrayList<Integer>();
		idUser++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}
	
	public String toString() {
		return "User ID: "+idUser+"\n"+"User name: "+name+"\n"+"email: "+email+"\n"+"Credit Number: "+creditNumber+"\n";
	}
	
	public void addPhoto (Photo picture) {
		pictures.add(picture);
	}
	
	public void addPhotoLike (Photo picture) {
		int index = pictures.indexOf(picture);
		pictures.get(index).incrementLikes();
	}
	
	public void addFriend (User friend) {
		friends.add(friend.getIdUser());
	}
}