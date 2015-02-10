package Exercise_2;

public class Room {
	private String name, dimension;

	public Room(String n, String d) {
		name = n;
		dimension = d;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setDimension(String d) {
		dimension = d;
	}

	public String getDimension() {
		return dimension;
	}

	public String toString() {
		String s = "";
		s += "Name: " + name + " Dimension: " + dimension;
		return s;
	}

}
