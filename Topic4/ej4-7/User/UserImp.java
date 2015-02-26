package User;

import java.util.List;

public class UserImp implements UserService {
	private DataBase db = DataBase.getInstance();
	
	@Override
	public void addUser(User user) {
		db.addUser(user);		
	}

	@Override
	public void modifyUser(User user) {
		db.modifyUser(user);
		
	}

	@Override
	public void removeUser(int id) {
		db.removeUser(db.getUser(id));
		
	}

	@Override
	public void addFriend(User user, User friend) {
		db.addFriend(user, friend);
	}


	@Override
	public void uploadPhoto(User user, Photo photo) {
		db.addPhoto(user, photo);
	}

	@Override
	public void likePhoto(User user, Photo photo) {
		db.likePhoto(user, photo);		
	}

	@Override
	public List<User> getUsers() {
		return db.getUsers();
	}


}
