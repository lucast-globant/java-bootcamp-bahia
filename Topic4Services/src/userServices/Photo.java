package userServices;

import java.awt.image.BufferedImage;

public class Photo {
	private String id;
	private int numbersOfLikes;
	private BufferedImage photo;

	public Photo(String id, BufferedImage photo) {
		this.id = id;
		this.photo = photo;
		numbersOfLikes = 0;
	}

	public void addLike() {
		numbersOfLikes++;
	}

	public int getLikes() {
		return numbersOfLikes;
	}
}
