package ejercicio2;

import java.util.ArrayList;

import ejercicio2.rooms.Room;

public class Hospital {
	private String name;
	private ArrayList<Room> rooms;
	private ArrayList<Doctor> doctors;

	public Hospital() {
		rooms = new ArrayList<Room>();
		doctors = new ArrayList<Doctor>();
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String ret = "Hospital Name: " + name + "\n" + "Doctors \n" + printDoctors() + "\n" + "Rooms: \n" + printRooms() + "\n";
		return ret;

	}

	private String printRooms() {
		String ret = "";
		int counter = 1;
		for (Room r : rooms) {
			ret += counter + ") " + r.toString() + "\n";
			counter++;
		}
		return ret;
	}

	private String printDoctors() {
		String ret = "";
		int counter = 1;
		for (Doctor d : doctors) {
			ret += counter + ") " + d.toString() + "\n";
			counter++;
		}
		return ret;
	}

}
