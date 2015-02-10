package ejercicio2;

public class HospitalDirector {
	private HospitalBuilder hospitalBuilder = null;

	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		this.hospitalBuilder = hospitalBuilder;
	}

	public void constructHospital() {
		hospitalBuilder.buildStructure();
		hospitalBuilder.buildRooms();
		hospitalBuilder.buildCrew();
	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}
