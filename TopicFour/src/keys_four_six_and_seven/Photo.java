package keys_four_six_and_seven;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Photo {

	private int photoId;
	private byte[] photo;
	// likes saves a list of users id which like the photo
	private List<Integer> likes;
	private static final AtomicInteger count = new AtomicInteger(0);

	public Photo() {
		likes = new LinkedList<Integer>();
		photoId = count.incrementAndGet();
	}

	public int getPhotoId() {
		return photoId;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void addLike(int userId) {
		likes.add(userId);
	}

	public List<Integer> getAllLikes() {
		return likes;
	}
}
