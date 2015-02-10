package Exercise_2;

public class HouseBuilder implements BuildingBuilder {

	private House house;

	public HouseBuilder() {
		house = new House();
	}

	@Override
	public void buildBedrooms() {
		house.setBedroom("Three beds and a wardrobe");
	}

	@Override
	public void buildKitchen() {
		house.setKitchen("A table, six chairs and a big counter");
	}

	@Override
	public void buildLoundry() {
		house.setLoundry("A washing machine and a washbasin");
	}

	@Override
	public void buildLivingRoom() {
		house.setLivingRoom("Three sofas and a little table");
	}

	@Override
	public void buildBathroom() {
		house.setBathroom("A toilet, a shower, a mirror and a sink");
	}

	public House getHouse() {
		return house;
	}

}
