package topic0.excercise3;

public class Appointment {
	
	private MedicalOffice office;
	private Doctor doctor; 
	private Pacient pacient; 
	private String dateAppointment;
	
	public Appointment(MedicalOffice office, Doctor doctor, Pacient pacient,
			String dateAppointment) {
		super();
		this.office = office;
		this.doctor = doctor;
		this.pacient = pacient;
		this.dateAppointment = dateAppointment;
	}

	public MedicalOffice getOffice() {
		return office;
	}

	public void setOffice(MedicalOffice office) {
		this.office = office;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Pacient getPacient() {
		return pacient;
	}

	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}

	public String getDateAppointment() {
		return dateAppointment;
	}

	public void setDateAppointment(String dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

	@Override
	public String toString() {
		return "Appointment [office=" + office + ", doctor=" + doctor
				+ ", pacient=" + pacient + ", dateAppointment="
				+ dateAppointment + "]";
	} 

}
