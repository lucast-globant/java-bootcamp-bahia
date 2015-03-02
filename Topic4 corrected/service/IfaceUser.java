package com.topic4.ws.service;

import java.util.List;

import com.topic4.ws.photo.Photo;
import com.topic4.ws.user.User;

public interface IfaceUser {
	public void addUser(User user);
	public void deleteUser(User user);
	public User getUser(int userInd); 
	public void modifyUser(User user, int userInd); 
	public List<User> getUsers();
	public void uploadPhoto(User user, Photo photo);
	public List<Photo> getPhotos(User user);
	public void addFriend(User user,int userInd, User userf);
	public void removeFriend(User user, User userf);
	public void likePhoto(User user, Photo photo);
	public void unlikePhoto(User user, Photo photo);
}
