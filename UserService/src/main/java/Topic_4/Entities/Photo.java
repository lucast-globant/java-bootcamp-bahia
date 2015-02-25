package Topic_4.Entities;

import java.util.ArrayList;
import java.util.List;

public class Photo {
	private String path;
	private List<String> likes;

	public Photo(String path) {
		this.path = path;
		likes = new ArrayList<String>();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public void addLike(String username) {
		this.likes.add(username);
	}

	public void removeLike(String username) {
		this.likes.remove(username);
	}

}
