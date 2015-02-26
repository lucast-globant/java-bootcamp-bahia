package userService;

import java.util.ArrayList;
import java.util.List;

public class Image {
	private String description;
	private int imageId;
	private String url;
	private List<String> likes;

	public Image(int imageId) {
		this.setImageId(imageId);
		setLikes(new ArrayList<String>());
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public void addLike(String fromUser) {
		likes.add(fromUser);
	}

	public void removeLike(String fromUser) {
		int index = getUserIndexInLikes(fromUser);
		if (index >= 0) {
			likes.remove(index);
		}
	}

	public int getUserIndexInLikes(String user) {
		int i = 0;
		boolean found = false;
		while (i < likes.size() && !found) {
			found = likes.get(i).equals(user);
			i++;
		}

		if (found) {
			return i - 1;
		} else {
			return -1;
		}
	}

	public int getNumberOfLikes() {
		return likes.size();
	}
}
