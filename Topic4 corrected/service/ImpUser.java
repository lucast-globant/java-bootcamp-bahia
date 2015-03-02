package com.topic4.ws.service;

import java.util.ArrayList;
import java.util.List;

import com.topic4.ws.photo.Photo;
import com.topic4.ws.user.User;

public class ImpUser implements IfaceUser {
	
	private List<User> users;
	private List<Photo> photos;
	
	public ImpUser() {
		users = new ArrayList<User> ();
		photos = new ArrayList<Photo> ();
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void deleteUser(User user) {
		users.remove(user);
		
	}

	@Override
	public User getUser(int userInd) {
		return users.get(userInd);
	}

	@Override
	public void modifyUser(User user, int userInd) {
		User u = users.get(userInd);
		u = user;
		users.set(userInd, u);
	}

	@Override
	public List<User> getUsers() {
		return this.users;
	}

	@Override
	public void uploadPhoto(User user, Photo photo) {
		photo.setOwner(user);
		int photoIndex = photos.size() + 1;
		photos.set(photoIndex, photo);		
	}

	@Override
	public List<Photo> getPhotos(User user) {
		return this.photos;
	}

	@Override
	public void addFriend(User user,int userInd, User userf) {
		User u = users.get(userInd);
		u.addFriend(userf);
		users.set(userInd, u);
	}

	@Override
	public void likePhoto(User user, Photo photo) {
		int photoIndex = photos.indexOf(photo);
		photo.like(user);
		photos.set(photoIndex, photo);
	}

	@Override
	public void removeFriend(User user, User userf) {
		int userIndex = users.indexOf(user);
		user.deleteFriend(userf);
		users.set(userIndex, user);
	}

	@Override
	public void unlikePhoto(User user, Photo photo) {
		// TODO Auto-generated method stub
		int photoIndex = photos.indexOf(photo);
		photo.unLike(user);
		photos.set(photoIndex, photo);
	}


}
