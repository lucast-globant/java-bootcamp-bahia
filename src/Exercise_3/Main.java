package Exercise_3;

public class Main {
	public static void main(String args[]) {
		Hospital hospital;

		HospitalFactory hospitalFactory = new HospitalFactory();

		hospital = hospitalFactory.createHospital(HospitalTypes.HospitalType.REHABILITAION);

		System.out.println(hospital);
	}

}
