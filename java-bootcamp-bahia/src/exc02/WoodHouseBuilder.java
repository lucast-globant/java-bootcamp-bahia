package exc02;

import java.util.ArrayList;
import java.util.List;

/* A concrete builder of houses made of wood */

public class WoodHouseBuilder implements HouseBuilder {

	private House house;

	public WoodHouseBuilder() {

		house = new House();
	}

	@Override
	public House getHouse() {

		return house;
	}

	@Override
	public void buildRooms() {

		Room r1 = new Room();
		r1.setHaveWindow(true);
		r1.setSize(25);
		r1.setMaterial(" Wood ");

		Room r2 = new Room();
		r2.setHaveWindow(true);
		r2.setSize(30);
		r2.setMaterial(" Wood ");

		Room r3 = new Room();
		r3.setHaveWindow(true);
		r3.setSize(15);
		r3.setMaterial(" Wood ");

		List<Room> rooms = new ArrayList<Room>();
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);

		house.setRooms(rooms);

	}

	@Override
	public void buildSize() {

		house.setSize(1000);
	}

	@Override
	public void buildRoof() {

		house.setRoof(" Gambriel ");

	}

	@Override
	public void buildAddress() {

		house.setAdress(" Evergreen 255 ");

	}

}
