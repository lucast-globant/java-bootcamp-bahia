package Exercise_2;

public class BHouseBuilder implements HouseBuilder{
	private House house;
	
	public BHouseBuilder() {
		house = new House();
	}
	
	@Override
	public void buildAddress() {
		house.setAddress("Direccion3");
	}

	@Override
	public void buildPrice() {
		house.setPrice(50000);	
	}
	
	@Override
	public void buildFloors() {
		Room r1 = new Room("Bathroom","3x3");
		Room r2 = new Room("Living Room","3x3");
		Room r3 = new Room("Kitchen","3x3");
		Room [] rs1 = {r1,r2,r3};
		Room r4 = new Room("Bedroom","3x3");
		Room r5 = new Room("Bedroom","3x3");
		Room r6 = new Room("Bedroom","3x3");
		Room r7 = new Room("Bathroom","3x3");
		Room [] rs2 = {r4,r5,r6,r7};
		Floor f1 = new Floor(rs1);
		Floor f2 = new Floor(rs2);
		Floor [] fs = {f1,f2}; 
		house.setFloors(fs);
	}

	@Override
	public void buildGarden() {
		Garden g = new Garden(true);
		house.setGarden(g);
	}

	@Override
	public House getHouse() {
		return house;
	}
}
