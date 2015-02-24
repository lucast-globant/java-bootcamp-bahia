package Topic_1.AudioPlayer;

public class Track {

	private String filename;

	public Track(String filename) {

		this.filename = filename;
	}

	@Override public String toString() {
		return filename;
	}
}
