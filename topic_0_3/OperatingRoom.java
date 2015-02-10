package topic_0_3;

public class OperatingRoom extends Area {
	private int patients;
	private int number;
	private int capacity;
	private Doctor doctor;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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
		return !doctor.equals(null) && patients < capacity;
	}

}
