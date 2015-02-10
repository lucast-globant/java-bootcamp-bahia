package Exercise_3;

import java.util.ArrayList;

public class Hospital {
	private String name;
	private ArrayList<Doctor> doctors;
	private ArrayList<Nurse> nurses;
	private ArrayList<IntensiveCare> icrooms;
	private ArrayList<PatientBedrooms> pbrooms;

	public Hospital() {
		doctors = new ArrayList<Doctor>();
		nurses = new ArrayList<Nurse>();
		icrooms = new ArrayList<IntensiveCare>();
		pbrooms = new ArrayList<PatientBedrooms>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ArrayList<IntensiveCare> getIcrooms() {
		return icrooms;
	}

	public void setIcrooms(ArrayList<IntensiveCare> icrooms) {
		this.icrooms = icrooms;
	}

	public ArrayList<PatientBedrooms> getPbrooms() {
		return pbrooms;
	}

	public void setPbrooms(ArrayList<PatientBedrooms> pbrooms) {
		this.pbrooms = pbrooms;
	}

	public String toString() {
		String s = "";
		s += "Name: " + name + "\n";
		s += "Intensive care: \n";
		for (IntensiveCare i : icrooms)
			s += "\t" + i.toString();
		s += "Patient bedrooms: \n";
		for (PatientBedrooms p : pbrooms)
			s += "\t" + p.toString();
		s += "Doctors: \n";
		for (Doctor d : doctors)
			s += "\t" + d.toString();
		s += "Nurses: \n";
		for (Nurse n : nurses)
			s += "\t" + n.toString();
		return s;
	}

}
