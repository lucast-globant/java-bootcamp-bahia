package userServices;

public class UserServiceProxy implements UserService {

	private final UserService userservice;

	protected UserServiceProxy(UserService userservice) {
		this.userservice = userservice;
	}

	public void create(String id, String pass) {
		userservice.create(id, pass);
	}

	public void read(String name) {
		userservice.read(name);
	}

	public void delete(String name) {
		userservice.delete(name);
	}

	public void update(String name, String property, String value) {
		userservice.update(name, property, value);
	}

	public void uploadPhoto(String id, Photo photo) {
		userservice.uploadPhoto(id, photo);
	}

	public void likePhoto(String id, Photo photo) {
		userservice.likePhoto(id, photo);
	}

	public void addFriends(String idUser, String isFriend) {
		userservice.addFriends(idUser, isFriend);
	}

}
