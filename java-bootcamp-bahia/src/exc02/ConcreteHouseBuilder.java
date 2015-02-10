package exc02;

import java.util.ArrayList;

/* A concrete builder of houses made of concrete */

public class ConcreteHouseBuilder implements HouseBuilder {

	private House house;

	public ConcreteHouseBuilder() {
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
		r1.setSize(27);
		r1.setMaterial(" Concrete ");

		Room r2 = new Room();
		r2.setHaveWindow(false);
		r2.setSize(20);
		r2.setMaterial(" Concrete ");

		Room r3 = new Room();
		r3.setHaveWindow(false);
		r3.setSize(45);
		r3.setMaterial(" Concrete ");

		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);

		house.setRooms(rooms);
	}

	@Override
	public void buildSize() {

		house.setSize(1500);

	}

	@Override
	public void buildAddress() {

		house.setAdress("SpringBank AV 155");

	}

	@Override
	public void buildRoof() {

		house.setRoof(" SaltBox ");

	}

}
