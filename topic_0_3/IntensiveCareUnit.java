package topic_0_3;

import java.util.ArrayList;

public class IntensiveCareUnit extends Area {

	public int patients;
	public ArrayList<Doctor> doctors;
	public ArrayList<Nurse> nurses;
	public int beds;
	
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

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public void setPatients(int patients) {
		this.patients = patients;
	}

	@Override
	public int getPatients() {
		return patients;
	}

	@Override
	public boolean avaibable() {
		return patients < beds;
	}
}
