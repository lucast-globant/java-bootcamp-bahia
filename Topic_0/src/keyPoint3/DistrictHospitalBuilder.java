package keyPoint3;

public class DistrictHospitalBuilder implements HospitalBuilder {

	private Hospital hospital;
	
	public DistrictHospitalBuilder(){
		hospital = new Hospital();
	}
	
	@Override
	public void buildHospital(String name) {
		hospital.setName("District Hospital '" + name + "'");
	}

	@Override
	public void buildAreas() {
		AreaFactory areaFactory = AreaFactory.getInstance();
		hospital.addArea(areaFactory.getArea(AreaType.ICU));
		hospital.addArea(areaFactory.getArea(AreaType.WARD));
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}
