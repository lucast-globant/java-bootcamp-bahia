public class House {

	private int bedrooms;
	private int bathrooms;
	private int livingRooms;
	private int kitchens;
	private int laundries;

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int b) {
		bedrooms = b;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int b) {
		bathrooms = b;
	}

	public int getLivingRooms() {
		return livingRooms;
	}

	public void setLivingRooms(int l) {
		livingRooms = l;
	}

	public int getKitchens() {
		return kitchens;
	}

	public void setKitchens(int k) {
		kitchens = k;
	}

	public int getLaundries() {
		return laundries;
	}

	public void setLaundries(int l) {
		laundries = l;
	}

	public String toString() {
		return "Bedrooms " + bedrooms + " | Bathrooms " + bathrooms + " | Living Rooms " + livingRooms + " | Kitchens " + kitchens
				+ " | Laundries " + laundries;
	}
}
