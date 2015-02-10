package exc03;

/* A class to test and create hospitals */

public class testHospitalBuilder {

	public static void main(String[] args) {

		HospitalBuilder hb = new MunicipalHospitalBuilder();
		HospitalMaker hm = new HospitalMaker(hb);

		hm.constructHospital();
		Hospital hospital = hm.getHospital();

		System.out.println(hospital.toString());

	}

}
