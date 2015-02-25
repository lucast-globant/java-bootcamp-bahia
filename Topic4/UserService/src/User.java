import java.util.Date;
import java.util.List;

public class User {

	String name;
	String email;
	Date birthday;
	private List<User> friendsList;
	private List<Photo> photoList;
	
	public User(String name, String email, Date birthday){
		this.name=name;
		this.email=email;
		this.birthday=birthday;
	}
	
	public void addFriend(User friend){
		friendsList.add(friend);
	}
	
	public void addPhoto(Photo photo){
		photoList.add(photo);
	}
	
	public List<User> getFriends(){
		return friendsList;
	}
	
	public List<Photo> getPhotos(){
		return photoList;
	}
}