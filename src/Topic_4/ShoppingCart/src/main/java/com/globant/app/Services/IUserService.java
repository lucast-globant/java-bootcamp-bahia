package com.globant.app.Services;

import com.globant.app.Domain.Entities.Photo;
import com.globant.app.Domain.Entities.User;

import java.util.Collection;

public interface IUserService {

	/* CRUD Services */

	User getUser(int userId);

	boolean addUser(String username, String password);

	boolean deleteUser(int userId);

	boolean updateUser(User user);

	/* Login Services */
	boolean login(String user, String password);

	boolean logout();

	/* Friends Services */
	boolean setFriend(User friend);

	Collection<User> getFriends(User user);

	/* Photos Services */
	boolean uploadPhoto(Photo photo);

	/* Likes Services */
	Collection<User> getLikes(Photo photoLiked);

	boolean setLike(User userLiked, Photo photoLiked);
}
