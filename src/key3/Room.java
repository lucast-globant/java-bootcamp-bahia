package key3;

import java.awt.List;

/**
 * @author Jordan
 * people can recover here
 */
public class Room {
	
	private int beds;
	private int patients;
	
	public Room(int numberOfBeds){
		beds=numberOfBeds;
		patients=0;
	}
	
	
	/**
	 * when a patient enters
	 * @return if are space for the new guest
	 */
	public boolean addPatient(){
		if(patients<beds){
			patients++;
			return true;
		}
		else
			return false;
			
	}
	
	/**
	 * when a patient leaves the hospital or is translated
	 */
	public void removePatient(){
		if(patients>0)
			patients--;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getPatients() {
		return patients;
	}

	public void setPatients(int patients) {
		this.patients = patients;
	}
	
	
	

}
