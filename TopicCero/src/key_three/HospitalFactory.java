package key_three;

public class HospitalFactory {

	public Hospital getHospital(String type) {
		if ("public".equals(type)) {
			return new PublicHospital();
		} else {
			return new PrivateHospital();
		}
	}

}
