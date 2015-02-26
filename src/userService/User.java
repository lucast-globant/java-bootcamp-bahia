package userService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
	private List<Image> photos;
	private List<String> friends;
	private String userId;
	private String name;
	private AtomicInteger nextPhotoId = new AtomicInteger(0);

	public User(String userId, String userName) {
		photos = new ArrayList<Image>();
		friends = new ArrayList<String>();
		this.name = userName;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public String getUserId() {
		return userId;
	}

	public void addPhoto(String photoURL, String photoDescription) {
		Image photo = new Image(nextPhotoId.incrementAndGet());
		photo.setDescription(photoDescription);
		photo.setUrl(photoURL);
		photos.add(photo);
	}

	public void removePhoto(int photoId) {
		int index = getPhotoIndex(photoId);
		if (index >= 0) {
			photos.remove(index);
		}
	}

	public Image getPhoto(int photoId) {
		int index = getPhotoIndex(photoId);
		if (index >= 0) {
			return photos.get(index);
		} else {
			return null;
		}
	}

	public int getPhotoIndex(int photoId) {
		int i = 0;
		boolean found = false;
		while (i < photos.size() && !found) {
			found = photos.get(i).getImageId() == photoId;
			i++;
		}

		if (found) {
			return (i - 1);
		} else {
			return -1;
		}
	}

	public List<Image> getPhotos() {
		return photos;
	}

	public void addFriend(String friendId) {
		if (getFriendIndex(friendId) < 0) {
			friends.add(friendId);
		}
	}

	public void removeFriend(String friendId) {
		int index = getFriendIndex(friendId);
		if (index >= 0) {
			friends.remove(index);
		}
	}

	private int getFriendIndex(String friendId) {
		int i = 0;
		boolean found = false;
		while (i < friends.size() && !found) {
			found = friends.get(i) == friendId;
			i++;
		}

		if (found) {
			return i - 1;
		} else {
			return -1;
		}
	}

	public List<String> getFriends() {
		return friends;
	}

	public void addLike(String fromUser, int inPhoto){
		if (getFriendIndex(fromUser) >= 0){
			int index = getPhotoIndex(inPhoto);
			if (index >= 0) {
				Image photo = photos.get(index);
				photo.addLike(fromUser);
				photos.set(index, photo);
			}
		}
	}
	
	public void removeLike(String fromUser, int inPhoto){
			int index = getPhotoIndex(inPhoto);
			if (index >= 0) {
				Image photo = photos.get(index);
				photo.removeLike(fromUser);
				photos.set(index, photo);
			}
	}
}
