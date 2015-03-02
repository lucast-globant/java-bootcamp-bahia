import java.util.List;


public class UserServiceImp implements UserService{
	
	private List<User> usersList;
	
	public void addUser(User user){
		usersList.add(user);
	}
	
	public void deleteUser(User user){
		usersList.remove(user);
	}
	
	public int numberOfUser(){
		return usersList.size();
	}
	
	public User getUser(int index){
		return usersList.get(index);
	}
	
	public void addFriend(User user, User friendUser){
		user.addFriend(friendUser);
	}
	
	public void removeFriend(User user, User friendUser){
		user.removeFriend(friendUser);
	}
	
	public void addPhoto(User user, Photo photo){
		user.addPhoto(photo);
	}
	
	public void removePhoto(User user, Photo photo){
		user.removePhoto(photo);
	}
	
	public void like(User user, Photo photo){
		photo.like(user);
	}
	
	public void disLike(User user, Photo photo){
		photo.disLike(user);
	}
}