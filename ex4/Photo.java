package ex4;

import java.util.ArrayList;
import java.util.List;

public class Photo {
	private final User owner;

	public User getOwner() {
		return owner;
	}

	private List<User> likes;

	public Photo(User owner) {
		this.owner = owner;
		likes = new ArrayList<User>();
	}

	public void addLike(User user1) {
		likes.add(user1);
	}

	public void removeLike(User user1) {
		likes.remove(user1);
	}

	public List<User> getLikes() {
		return likes;
	}

	public int cantLikes() {
		return likes.size();
	}
}
