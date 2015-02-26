package User;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private String lastname;
	private Date birth;
	private String email;
	private Set<User> friends;
	
	public User(int _id, String _username, String _password, String _name, String _lastname, Date _birth, String _email) {
		this.id = _id;
		this.username = _username;
		this.password = _password;
		this.name = _name;
		this.lastname = _lastname;
		this.birth = _birth;
		this.email = _email;
		friends = new HashSet<User>();
	}
	
	//
	//

	public void setId(int _id) {
		this.id = _id;
	}
	
	public void setUsername(String _username) {
		this.username = _username;
	}

	public void setPassword(String _password) {
		this.password = _password;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public void setLastname(String _lastname) {
		this.lastname = _lastname;
	}

	public void setBirth (Date _birth) {
		this.birth = _birth;
	}

	public void setEmail(String _email) {
		this.email = _email;
	}
	
	//
	//

	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;		
	}

	public String getName() {
		return name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public Date getBirth() {
		return birth;
	}

	public String getEmail() {
		return email;
	}
	
	//
	//
	
	public void addFriend(User _friend){
		friends.add(_friend);
	}
	
	public void removeFriend(User _friend){
		friends.remove(_friend);
	}
	
	public Set<User> getFriends(){
		return friends;
	}

}
