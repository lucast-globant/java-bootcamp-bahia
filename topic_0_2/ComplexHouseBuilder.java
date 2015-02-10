package topic_0_2;

public class ComplexHouseBuilder implements HouseBuilder{
	private House house;
	
	public ComplexHouseBuilder() {
		house = new House();
	}
	
	@Override
	public void buildRooms() {
		house.setRooms(8);		
	}

	@Override
	public void buildDoors() {
		house.setDoors(20);
	}

	@Override
	public void buildWindows() {
		house.setWindows(6);
		
	}

	@Override
	public void buildGarage() {
		house.setGarage(2);		
	}

	@Override
	public House getHouse() {
		return house;
	}	
}
