public class Demo {

	public static void main(String[] args) {

		HospitalFactory hospitalFactory = HospitalFactory.getInstance();
		Hospital hospital = hospitalFactory.getHospital("municipal");
		System.out.println(hospital.toString());

		hospital = hospitalFactory.getHospital("provincial");
		System.out.println(hospital.toString());
	}
}
