package ejercicio2;

import java.util.ArrayList;

import ejercicio2.rooms.Basic;
import ejercicio2.rooms.IntensiveCare;
import ejercicio2.rooms.Room;
import ejercicio2.rooms.RoomFactory;
import ejercicio2.rooms.Surgery;

public class HospitalPenna implements HospitalBuilder {
	Hospital hospital;

	public HospitalPenna() {
		hospital = new Hospital();
	}

	@Override
	public void buildStructure() {
		hospital.setName("Hospital J. A. Penna");

	}

	@Override
	public void buildRooms() {
		ArrayList<String> patients = new ArrayList<String>();
		patients.add("Patient 1");
		patients.add("Patient 2");
		Room r1 = createSurgery(patients, 1, 1000, 0, false);
		Room r2 = createBasicRoom(patients, 2, 100, 30, true);
		Room r3 = createTherapyRoom(patients, 5, 500, 3, true);
		hospital.addRoom(r1);
		hospital.addRoom(r2);
		hospital.addRoom(r3);
	}

	private Room createSurgery(ArrayList<String> patients, int capacity, int price, int number, boolean isEmpty) {
		RoomFactory roomFactory = new RoomFactory();
		Surgery r = (Surgery) roomFactory.factory("surgery");
		r.setPatients(patients);
		r.setCapacity(capacity);
		r.setPrice(price);
		r.setNumber(number);
		r.setEmpty(isEmpty);
		return r;

	}

	private Room createBasicRoom(ArrayList<String> patients, int capacity, int price, int number, boolean hasBathroom) {
		RoomFactory roomFactory = new RoomFactory();
		Basic r = (Basic) roomFactory.factory("basic");
		r.setPatients(patients);
		r.setCapacity(capacity);
		r.setPrice(price);
		r.setNumber(number);
		r.setHasBathroom(hasBathroom);
		return r;

	}

	private Room createTherapyRoom(ArrayList<String> patients, int capacity, int price, int number, boolean fullyEquipped) {
		RoomFactory roomFactory = new RoomFactory();
		IntensiveCare r = (IntensiveCare) roomFactory.factory("therapy");
		r.setPatients(patients);
		r.setCapacity(capacity);
		r.setPrice(price);
		r.setNumber(number);
		r.setFullyEquipped(fullyEquipped);
		return r;

	}

	@Override
	public Hospital getHospital() {
		// TODO Auto-generated method stub
		return hospital;
	}

	@Override
	public void buildCrew() {
		Doctor doc = new Doctor();
		doc.setName("Francisco Cuenca");
		doc.setMat(44);
		hospital.addDoctor(doc);

	}

}
