package Exercise_3;

public class MainE3 {
	public static void main(String[] args) {
		HospitalBuilder hb = new CHBuilder();
		HospitalDirector hd = new HospitalDirector(hb);
		hd.constructHospital();
		System.out.println(hd.getHospital());
		System.out.println("################################################");

	}
}
