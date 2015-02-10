package topic_0_3;

import java.util.ArrayList;

public class HospitalRoom extends Area {
	public int patients;
	public int beds;
	public ArrayList<Nurse> nurses;

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public ArrayList<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(ArrayList<Nurse> nurses) {
		this.nurses = nurses;
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
