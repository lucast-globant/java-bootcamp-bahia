package keyPoint2;

import java.awt.Point;

public class StudioHouseBuilder implements HouseBuilder {
	private House house;
	
	public StudioHouseBuilder(){
		house = new House();
	}

	@Override
	public void buildHouse() {
		Floor floor0;
		floor0 = new Floor(0,2);
		floor0.addRoom(new Room(new Point(0,0), new Point(2,3), "Room"));
		floor0.addRoom(new Room(new Point(2,0), new Point(3,3), "Bathroom"));

		house.addFloor(floor0);
	}

	@Override
	public void buildSurface() {
		house.setSurface(9);
	}

	@Override
	public House getHouse() {
		return house;
	}
}
