package User;
import java.util.ArrayList;
import java.util.List;


public class Photo {
	private final String path;
	private final User owner;
	private final List<User> likes;
	
	public Photo(String _path, User _owner){
		this.path = _path;
		this.owner = _owner;
		likes = new ArrayList<User>();
	}
	
	public void like(User _user){
		likes.add(_user);
	}
	
	public void unLike(User _user){
		likes.remove(_user);
	}
	
	public User getOwner(){
		return owner;
	}
	
	public String getPath(){
		return path;
	}

	public int getNumberOfLikes() {
		return likes.size();
	}
	
}