package com.globant.app.Services.Implementations;

import com.globant.app.DataAccess.Repositories.IUsersRepo;
import com.globant.app.Domain.Entities.Photo;
import com.globant.app.Domain.Entities.User;
import com.globant.app.Domain.Utilities.IUserManager;
import com.globant.app.Services.IUserService;

import java.util.Collection;

public class UserService implements IUserService {

	private IUsersRepo usersRepo;
	private IUserManager userManager;

	public UserService(IUsersRepo usersRepo, IUserManager userManager) {
		this.usersRepo = usersRepo;
		this.userManager = userManager;
	}

	@Override public User getUser(int userId) {
		return usersRepo.get(userId);
	}

	@Override public boolean addUser(String username, String password) {
		User user = new User(username, password);

		usersRepo.add(user);

		return true;
	}

	@Override public boolean deleteUser(int userId) {
		usersRepo.delete(userId);

		return true;
	}

	@Override public boolean updateUser(User user) {
		usersRepo.save(user);
		return true;
	}

	@Override public boolean login(String user, String password) {

		return userManager.login(user, password);
	}

	@Override public boolean logout() {
		userManager.logout();

		return true;
	}

	@Override public boolean setFriend(User friend) {
		userManager.getCurrentUser().getFriends().add(friend);
		return true;
	}

	@Override public Collection<User> getFriends(User user) {
		return user.getFriends();
	}

	@Override public boolean uploadPhoto(Photo photo) {
		userManager.getCurrentUser().getPhotos().add(photo);
		return true;
	}

	@Override public Collection<User> getLikes(Photo photoLiked) {
		return photoLiked.getLikes();
	}

	@Override public boolean setLike(User userLiked, Photo photoLiked) {
		return photoLiked.getLikes().add(userLiked);
	}

}
