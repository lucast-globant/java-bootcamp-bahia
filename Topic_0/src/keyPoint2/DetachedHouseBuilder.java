package keyPoint2;

import java.awt.Point;

public class DetachedHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public DetachedHouseBuilder(){
		house = new House();
	}

	@Override
	public void buildHouse() {
		Floor floor0, floor1;
		floor0 = new Floor(0,3);
		floor0.addRoom(new Room(new Point(0,0), new Point(5,4), "Living Room"));
		floor0.addRoom(new Room(new Point(5,0), new Point(8,4), "Kitchen"));
		
		floor1 = new Floor(1,2);
		floor1.addRoom(new Room(new Point(0,0), new Point(3,4), "Red Room"));
		floor1.addRoom(new Room(new Point(5,0), new Point(8,4), "Kids Room"));
		floor1.addRoom(new Room(new Point(3,1), new Point(5,4), "Bathroom"));
		floor1.addRoom(new Room(new Point(3,0), new Point(5,1), "Stairs"));
		
		house.addFloor(floor0);
		house.addFloor(floor1);
	}

	@Override
	public void buildSurface() {
		house.setSurface(32);
	}

	@Override
	public House getHouse() {
		return house;
	}
	
}
