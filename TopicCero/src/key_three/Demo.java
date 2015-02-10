package key_three;

public class Demo {

	public static void main(String[] args) {
		HospitalFactory hospitalFactory = new HospitalFactory();

		Hospital h1 = hospitalFactory.getHospital("public");
		System.out.print("First hospital accepts medical insurance: " + h1.acceptsMedicalInsurance());
		System.out.print(", has:" + h1.getAmountOfEmergencyRooms() + " emergency rooms");
		System.out.println(", and has:" + h1.getAmountOfOperatingRooms() + " operating rooms");

		Hospital h2 = hospitalFactory.getHospital("private");
		System.out.print("Second hospital accepts medical insurance: " + h2.acceptsMedicalInsurance());
		System.out.print(", has:" + h2.getAmountOfEmergencyRooms() + " emergency rooms");
		System.out.println(", and has:" + h2.getAmountOfOperatingRooms() + " operating rooms");
	}
}
