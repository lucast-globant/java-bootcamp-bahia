package Exercise_3;

import java.util.ArrayList;

public class IntensiveCare extends Room {
	private ArrayList<Patient> patients;

	public IntensiveCare(int n, int c) {
		super(n, c);
		patients = new ArrayList<Patient>();
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public boolean addPatient(Patient p) {
		if (!isFull()) {
			patients.add(p);
			return true;
		} else
			return false;
	}

	public boolean removePatient(Patient p) {
		patients.remove(p);
		return false;
	}

	public boolean isFull() {
		return patients.size() == capacity;
	}

	public String toString() {
		String s = super.toString() + "\n";
		if (patients.size() != 0) {
			for (Patient p : patients)
				s += "\t" + p.toString() + "\n";
		}
		return s;
	}

}
