package topic_4;

import java.io.File;

public class Photo {

	private static int idPicture = 0;
	private int likes;
	private File image;
	
	public Photo(File image) {
		this.likes = 0;
		this.image = image;
		idPicture++;
	}

	public void incrementLikes() {
		likes++;
	}
	
	public int getIdPicture() {
		return idPicture;
	}

	public int getLikes() {
		return likes;
	}

	public File getImage() {
		return image;
	}
		
}