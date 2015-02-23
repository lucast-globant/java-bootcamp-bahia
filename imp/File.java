package imp;

public class File {
	private static int Uniqueid = 1;
	private int id;

	public File() {
		id = this.newID();

	}

	private int newID() {
		return Uniqueid++;
	}

	public int getUniqueID() {
		return id;

	}

	public boolean equals(File f) {
		return f.getUniqueID() == this.getUniqueID();
	}

}
