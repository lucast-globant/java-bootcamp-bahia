package topic3.key3;

public class File {
	
	private String name; 
	
	public File(String fileName) {
		name = fileName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName () {
		return this.name;
	}
	
	public boolean equals (File file) {
		return name.equals(file.getName());
	}

	
}
