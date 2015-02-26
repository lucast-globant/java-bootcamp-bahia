package User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	
	private Map <Integer, User> users;
	private Map <User, List<Photo>> photos;
	private static DataBase instance = new DataBase();
	
	private  DataBase(){
		users = new HashMap <Integer, User>();
		photos = new HashMap <User, List<Photo>>();
	}
	
	public void addFriend(User user, User friend){
		user.addFriend(friend);
	}

	
	public void likePhoto(User user, Photo photo){
		photo.like(user);
	}
	
	public static DataBase getInstance(){
		return instance;
	}
	
	public void addUser(User user){
		users.put(user.getId(), user);
	}

	public User getUser(int id) {
		return users.get(id);
	}

	public void removeUser(User user) {
		users.remove(user.getId());
	}
	
	public void modifyUser(User user){
		users.remove(user.getId());
		users.put(user.getId(), user);
	}
	
	public List<User> getUsers() {
		return (List<User>) users.values();
	}

	public void addPhoto(User user, Photo photo) {
		List<Photo> photosUser = photos.get(user);
		if(photosUser != null)
			photosUser.add(photo);
		else{
			List<Photo> photosaux = new ArrayList<Photo>();
			photosaux.add(photo);
			photos.put(user, photosaux);
		}
	}
	
	public List<Photo> getUserPhotos(User user){
		return photos.get(user);
	}
	
}