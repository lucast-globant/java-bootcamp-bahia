package topic4;

import java.util.ArrayList;
import java.util.List;

public class Photo {

	private String photoName;
	private String photoPath;
	private List<User> usersLikes;
		
	public Photo(String photoName, String photoPath) {
		this.photoName = photoName;
		this.photoPath = photoPath;
		this.usersLikes = new ArrayList<User> ();
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public List<User> getLikes() {
		return usersLikes;
	}
		
	public void setLike (User u) {
		usersLikes.add(u);
	}
	
	public void removeLike (User u) {
		usersLikes.remove(u);
	}
	
}
