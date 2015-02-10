package topic_0_3;

import java.util.ArrayList;

public class MaternityWard extends Area {

	public int patient;
	public Doctor doctor;
	public ArrayList<Nurse> nurses;
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public ArrayList<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(ArrayList<Nurse> nurses) {
		this.nurses = nurses;
	}

	public void setPatients(int patients) {
		this.patient = patients;
	}

	@Override
	public int getPatients() {
		return patient;
	}

	@Override
	public boolean avaibable() {
		return patient == 0;
	}
}
