package exc03;

/* Concrete factory a type of room*/

public class CommonRoom implements Room {

	private int beds;
	private boolean haveTV;

	@Override
	public int getNumberBeds() {

		return beds;
	}

	public boolean isHaveTV() {
		return haveTV;
	}

	public void setHaveTV(boolean haveTV) {
		this.haveTV = haveTV;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public String toString() {

		return " Number of beds: " + beds + " Have TV ?: " + haveTV;
	}

}
