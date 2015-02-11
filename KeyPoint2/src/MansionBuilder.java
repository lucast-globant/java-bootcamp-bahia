public class MansionBuilder implements HouseBuilder {

	private House house;

	public MansionBuilder() {
		house = new House();
	}

	@Override
	public void buildBedrooms() {
		house.setBedrooms(8);
	}

	@Override
	public void buildBathrooms() {
		house.setBathrooms(6);
	}

	@Override
	public void buildLivingRooms() {
		house.setLivingRooms(4);
	}

	@Override
	public void buildKitchens() {
		house.setKitchens(5);
	}

	@Override
	public void buildLaundries() {
		house.setLaundries(3);
	}

	@Override
	public House getHouse() {
		return house;
	}
}
