package com.globant.app.Services;

import com.globant.app.Domain.Entities.User;

import java.util.List;

public interface IUserService {

	/* CRUD Services */
	public User getUser(String username);

	public boolean addUser(String username, String password);

	public boolean deleteUser(String username);

	public boolean updateUser(User user);

	/* Login Services */
	public User login(String user, String password);

	public boolean logout(String username);

	/* Friends Services */
	public boolean setFriend(User friend);

	public List<User> getFriends(User user);

	/* Photos Services */
	public boolean uploadPhoto(String photo);

	/* Likes Services */
	public List<User> getLikes(String photoLiked);

	public boolean setLike(User userLiked, String photoLiked);
}
