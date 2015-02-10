package exc03;

/* Hospital Director */

public class HospitalMaker {

	private HospitalBuilder hospitalBuilder;

	public HospitalMaker(HospitalBuilder hb) {

		hospitalBuilder = hb;
	}

	public void constructHospital() {

		hospitalBuilder.buildDirector();
		hospitalBuilder.buildName();
		hospitalBuilder.buildRooms();
		hospitalBuilder.buildType();
	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}
