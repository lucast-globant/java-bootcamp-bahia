package exc03;

/* Concrete factory a type of room*/

public class EmergenyRoom implements Room {

	private int beds;
	private boolean available; // if its in condition to operation or not.

	@Override
	public int getNumberBeds() {

		return beds;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String toString() {

		return " Number of beds: " + beds + " Its the emergeny room available ?: " + available;
	}

}
