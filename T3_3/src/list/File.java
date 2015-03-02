package list;

public class File {
	
	private String name; 
	
	public File(String _name) {
		name = _name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getName () {
		return this.name;
	}
	
	public boolean idem (File file) {
		return name.equals(file.getName());
	}

	
}