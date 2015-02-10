package Exercise_2;

public class MHouseBuilder implements HouseBuilder {
	private House house;

	public MHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildAddress() {
		house.setAddress("Direccion2");
	}

	@Override
	public void buildPrice() {
		house.setPrice(40000);
	}

	@Override
	public void buildFloors() {
		Room r1 = new Room("Bedroom", "3x3");
		Room r2 = new Room("Bedroom", "3x3");
		Room r3 = new Room("Bathroom", "3x3");
		Room r4 = new Room("Living Room", "3x3");
		Room r5 = new Room("Kitchen", "3x3");
		Room[] rs = { r1, r2, r3, r4, r5 };
		Floor f1 = new Floor(rs);
		Floor[] fs = { f1 };
		house.setFloors(fs);
	}

	@Override
	public void buildGarden() {
		Garden g = new Garden(false);
		house.setGarden(g);
	}

	@Override
	public House getHouse() {
		return house;
	}
}
