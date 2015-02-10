package exc03;

import java.util.ArrayList;
import java.util.List;

/* A concrete builder of Pena Hospital */

public class PenaHospitalBuilder implements HospitalBuilder {

	private Hospital hospital;

	public PenaHospitalBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildRooms() {

		RoomFactory rf = new RoomFactory();
		Room r1 = rf.getRoom("ER");
		((EmergenyRoom) r1).setBeds(1);
		((EmergenyRoom) r1).setAvailable(true);

		Room r2 = rf.getRoom("ER");
		((EmergenyRoom) r2).setBeds(12);
		((EmergenyRoom) r2).setAvailable(false);

		Room r3 = rf.getRoom("CR");
		((CommonRoom) r3).setBeds(10);
		((CommonRoom) r3).setHaveTV(true);

		Room r4 = rf.getRoom("CR");
		((CommonRoom) r4).setBeds(15);
		((CommonRoom) r4).setHaveTV(false);

		Room r5 = rf.getRoom("ER");
		((EmergenyRoom) r5).setBeds(5);
		((EmergenyRoom) r5).setAvailable(true);

		List<Room> rooms = new ArrayList<Room>();

		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
		rooms.add(r4);
		rooms.add(r5);

		hospital.setRooms(rooms);

	}

	@Override
	public void buildName() {

		hospital.setName(" PENA ");

	}

	@Override
	public void buildType() {

		hospital.setType(" private ");

	}

	@Override
	public void buildDirector() {

		hospital.setDirector(" Rogelio Funes Mori ");

	}

	@Override
	public Hospital getHospital() {

		return hospital;
	}

}
