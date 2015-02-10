package Exercise_3;

public abstract class Room {
	protected int number, capacity;

	public Room(int n, int c) {
		capacity = c;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString() {
		String s = "";
		s += "Numero: " + number + " Capacidad: " + capacity;
		return s;
	}

}
