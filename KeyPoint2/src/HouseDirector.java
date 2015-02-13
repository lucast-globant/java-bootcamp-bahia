public class HouseDirector {

	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder h) {
		houseBuilder = h;
	}

	public void constructHouse() {
		houseBuilder.buildBedrooms();
		houseBuilder.buildBathrooms();
		houseBuilder.buildLivingRooms();
		houseBuilder.buildKitchens();
		houseBuilder.buildLaundries();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
