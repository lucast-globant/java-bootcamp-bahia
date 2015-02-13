public class MicroHouseBuilder implements HouseBuilder {

	private House house;

	public MicroHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildBedrooms() {
		house.setBedrooms(1);
	}

	@Override
	public void buildBathrooms() {
		house.setBathrooms(1);
	}

	@Override
	public void buildLivingRooms() {
		house.setLivingRooms(1);

	}

	@Override
	public void buildKitchens() {
		house.setKitchens(1);
	}

	@Override
	public void buildLaundries() {
		house.setLaundries(1);
	}

	@Override
	public House getHouse() {
		return house;
	}
}
