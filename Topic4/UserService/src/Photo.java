import java.util.List;


public class Photo {

	private String path;
	private List<User> usersLikeList;
	
	public Photo(String path){
		this.path=path;
	}
	
	public List<User> getLikes(){
		return usersLikeList;
	}
	
	public void like(User user){
		usersLikeList.add(user);
	}
	
	public String getPath(){
		return path;
	}
}