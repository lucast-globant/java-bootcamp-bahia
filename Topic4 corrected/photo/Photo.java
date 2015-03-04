package com.topic4.ws.photo;

import java.util.ArrayList;
import java.util.List;
import com.topic4.ws.user.User;

public class Photo {
	private String path;
	private User owner;
	private List<User> likes;
	
	public Photo(String path, User owner){
		this.path = path;
		this.owner = owner;
		likes = new ArrayList<User>();
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	public void like(User user){
		likes.add(user);
	}
	
	public void unLike(User user){
		likes.remove(user);
	}
	
	public User getOwner(){
		return owner;
	}
	
	public String getPath(){
		return path;
	}

	public int getLikesCount() {
		return likes.size();
	}
	
	public List<User> getLikes() {
		return this.likes;
	}
	
}
