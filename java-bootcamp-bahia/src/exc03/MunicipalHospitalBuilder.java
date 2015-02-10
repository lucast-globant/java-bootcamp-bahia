package exc03;

import java.util.ArrayList;
import java.util.List;

/* A concrete builder of Municipal Hospital */

public class MunicipalHospitalBuilder implements HospitalBuilder {

	private Hospital hospital;

	public MunicipalHospitalBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildRooms() {

		RoomFactory rf = new RoomFactory();
		Room r1 = rf.getRoom("ER");
		((EmergenyRoom) r1).setBeds(10);
		((EmergenyRoom) r1).setAvailable(true);

		Room r2 = rf.getRoom("ER");
		((EmergenyRoom) r2).setBeds(5);
		((EmergenyRoom) r2).setAvailable(false);

		Room r3 = rf.getRoom("CR");
		((CommonRoom) r3).setBeds(6);
		((CommonRoom) r3).setHaveTV(true);

		Room r4 = rf.getRoom("CR");
		((CommonRoom) r4).setBeds(5);
		((CommonRoom) r4).setHaveTV(false);

		List<Room> rooms = new ArrayList<Room>();

		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
		rooms.add(r4);

		hospital.setRooms(rooms);

	}

	@Override
	public void buildName() {

		hospital.setName(" Municipal ");
	}

	@Override
	public void buildType() {

		hospital.setType(" Public ");

	}

	@Override
	public void buildDirector() {

		hospital.setDirector(" Carlos Gonzales ");

	}

	@Override
	public Hospital getHospital() {

		return hospital;
	}

}
