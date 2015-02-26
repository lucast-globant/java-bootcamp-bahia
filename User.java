package topic4;

import java.util.ArrayList;
import java.util.List;

public class User {

	String userName;
	String userPass;
	String userEmail;

	private List<User> userFriends;
			
	public User(String userName, String userPass, String userEmail) {
		this.userName = userName;
		this.userPass = userPass;
		this.userEmail = userEmail;
		this.userFriends =  new ArrayList<User> ();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void addFriend (User u) {
			userFriends.add(u);
	}
		
	public void removeFriend (User u) {
		userFriends.remove(u);
	}

	public List<User> getFriends(){
		return userFriends;
	}
		
}
