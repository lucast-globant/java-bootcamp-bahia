package topic_4;

public class UserServiceProxy implements UserService {

	UserService implementation;
	
	public UserServiceProxy (UserService implementation) {
		this.implementation = implementation;
	}

	public void createUser(String name, String email, String password, int creditNumber) {
		implementation.createUser(name, email, password, creditNumber);
	}

	public String readUser(User user) {
		return implementation.readUser(user);
	}

	public void updateUser(User user, String newEmail, String newPassword, int newCreditNumber) {
		implementation.updateUser(user, newEmail, newPassword, newCreditNumber);
	}

	public void deleteUser(User user) {
		implementation.deleteUser(user);		
	}

	public void uploadPhoto(User user, Photo picture) {
		implementation.uploadPhoto(user, picture);
	}

	public void addPhotoLike(User user, Photo picture) {
		implementation.addPhotoLike(user, picture);
	}

	public void addFriend(User user, User friend) {
		implementation.addFriend(user, friend);		
	}

	public User getUser(int userId) {
		return implementation.getUser(userId);
	}
	
}