package topic_1_7;

public class Track {
	private String name;
	private String artist;
	private String album;
	private int year;
	private String genre;
	private String duration;
	private TrackContext trackContext;
	
	public Track(String name, String artist, String album, int year, String duration, String genre) {
		super();
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.duration = duration;
		this.genre = genre;
		this.trackContext = new TrackContext(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public TrackContext getTrackContext() {
		return trackContext;
	}
	
}
