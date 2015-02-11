package Ejercicio3;

public class Turn {
	private	int turnCode;
	private int patientCode;
	private int doctorCode;
	
	public Turn() {
	}
	public Turn(int turnCode, int patientCode, int doctorCode) {
		this.turnCode = turnCode;
		this.patientCode = patientCode;
		this.doctorCode = doctorCode;
	}
	
	public void setTurnCode(int turnCode){
		this.turnCode = turnCode;
	}
	public void setPatientCode(int patientCode){
		this.patientCode = patientCode;
	}
	public void setDoctorCode(int doctorCode){
		this.doctorCode = doctorCode;
	}
	
	public int getTurnCode(){return turnCode;}
	public int getPatientCode(){return patientCode;}
	public int getDoctorCode(){return doctorCode;}
}
