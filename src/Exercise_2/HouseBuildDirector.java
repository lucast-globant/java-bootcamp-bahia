package Exercise_2;

public class HouseBuildDirector {
	private HouseBuilder houseBuilder;

	public HouseBuildDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void buildHouse() {
		houseBuilder.buildBedrooms();
		houseBuilder.buildKitchen();
		houseBuilder.buildLivingRoom();
		houseBuilder.buildLoundry();
		houseBuilder.buildBathroom();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}

}
