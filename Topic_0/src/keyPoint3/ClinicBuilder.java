package keyPoint3;

public class ClinicBuilder implements HospitalBuilder {

	private Hospital hospital;
	
	public ClinicBuilder(){
		hospital = new Hospital();
	}
	
	@Override
	public void buildHospital(String name) {
		hospital.setName("Clinic '" + name + "'");
	}

	@Override
	public void buildAreas() {
		AreaFactory areaFactory = AreaFactory.getInstance();
		hospital.addArea(areaFactory.getArea(AreaType.WARD));
		hospital.addArea(areaFactory.getArea(AreaType.PHARMACY));
		hospital.addArea(areaFactory.getArea(AreaType.CONSULTING));
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}
