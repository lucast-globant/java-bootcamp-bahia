package Ejercicio3;

public class TestHospital {

	public static void main(String[] args) {
		Hospital h1 = new Hospital();
		h1.setName("Hospital Español");
		h1.setNumberPatients(100);
		h1.setNumberRooms(75);
		
		Doctor d1 = new Doctor();
		d1.setName("Miguel");
		d1.setLastName("Antares");
		d1.setCod(1895);
		d1.setEmail("mAntares@gmail.com");
		
		Patient p1 = new Patient();
		p1.setLastName("Auguo");
		p1.setName("Victor");
		p1.setId(6565);
		p1.setEmail("vAuguo@gmail.com");
		
		Turn t1 = new Turn();
		t1.setDoctorCode(1895);
		t1.setPatientCode(6565);
		t1.setTurnCode(1);
		
		System.out.println("Turn number "+t1.getTurnCode()+" have the patient "+p1.getLastName()+", "+p1.getName()+" with the doctor "+d1.getLastName()+", "+d1.getName()+" in the hospital "+h1.getName());
	}

}
