public class HospitalFactory {

	private HospitalDirector hospitalDirector = null;
	private HospitalBuilder hospitalBuilder = null;
	private static HospitalFactory hospitalFactory = null;

	private HospitalFactory() {
	}

	public static HospitalFactory getInstance() {
		if (hospitalFactory == null) {
			hospitalFactory = new HospitalFactory();
		}
		return hospitalFactory;
	}

	public Hospital getHospital(String type) {
		if ("municipal".equals(type)) {
			hospitalBuilder = new MunicipalHospitalBuilder();
			hospitalDirector = new HospitalDirector(hospitalBuilder);
		} else {
			hospitalBuilder = new ProvincialHospitalBuilder();
			hospitalDirector = new HospitalDirector(hospitalBuilder);
		}
		hospitalDirector.constructHospital();
		return hospitalDirector.getHospital();
	}
}
