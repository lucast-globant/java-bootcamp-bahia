package com.topic4.ws.user;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private Set<User> friends;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<User> getFriends() {
		return friends;
	}
	public void setFriends(Set<User> friends) {
		this.friends = friends;
	}
	public void addFriend(User friend){
		friends.add(friend);
	}
	public void deleteFriend(User friend){
		friends.remove(friend);
	}
	
}
