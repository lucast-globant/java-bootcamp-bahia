package topic_0_3;

import java.util.ArrayList;

public class Hospital {
	private String name;
	private String director;
	private ArrayList<Doctor> doctors;
	private ArrayList<Nurse> nurses;
	private ArrayList<Area> areas;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}
	public ArrayList<Nurse> getNurses() {
		return nurses;
	}
	public void setNurses(ArrayList<Nurse> nurses) {
		this.nurses = nurses;
	}
	public ArrayList<Area> getAreas() {
		return areas;
	}
	public void setAreas(ArrayList<Area> areas) {
		this.areas = areas;
	}
	
	public String toString() {
		int patients = 0;
		for (Area a: areas) {
			patients+=a.getPatients();
		}
		return "hospital name: "+ name + ", director: " + director + ", areas: " +areas.size() + ", total patients: " + patients ;
	}
}
