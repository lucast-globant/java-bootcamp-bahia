package Exercise_2;

public class SHouseBuilder implements HouseBuilder{
	private House house;
	
	public SHouseBuilder() {
		house = new House();
	}
	
	@Override
	public void buildAddress() {
		house.setAddress("Direccion1");
	}

	@Override
	public void buildPrice() {
		house.setPrice(30000);	
	}
	
	@Override
	public void buildFloors() {
		Room r1 = new Room("Bedroom","3x3");
		Room r2 = new Room("Bathroom","3x3");
		Room r3 = new Room("Living Room","3x3");
		Room r4 = new Room("Kitchen","3x3");
		Room [] rs = {r1,r2,r3,r4};
		Floor f1 = new Floor(rs);
		Floor [] fs = {f1}; 
		house.setFloors(fs);
	}

	@Override
	public void buildGarden() {
		Garden g = null;
		house.setGarden(g);
	}

	@Override
	public House getHouse() {
		return house;
	}

}
