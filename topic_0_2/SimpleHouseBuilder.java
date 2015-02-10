package topic_0_2;

public class SimpleHouseBuilder implements HouseBuilder {
	private House house;
	
	public SimpleHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildRooms() {
		house.setRooms(4);		
	}

	@Override
	public void buildDoors() {
		house.setDoors(10);
	}

	@Override
	public void buildWindows() {
		house.setWindows(3);
		
	}

	@Override
	public void buildGarage() {
		house.setGarage(1);		
	}

	@Override
	public House getHouse() {
		return house;
	}	
}
