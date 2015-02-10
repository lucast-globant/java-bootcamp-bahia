package exc02;

/* Director */

public class HouseMaker {

	private HouseBuilder houseBuilder;

	public HouseMaker(HouseBuilder hb) {

		houseBuilder = hb;
	}

	public void constructHouse() {

		houseBuilder.buildAddress();
		houseBuilder.buildRoof();
		houseBuilder.buildRooms();
		houseBuilder.buildSize();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}

}
