package keyPoint3;

public class TraumaCentreBuilder implements HospitalBuilder {

	private Hospital hospital;
	
	public TraumaCentreBuilder(){
		hospital = new Hospital();
	}
	
	@Override
	public void buildHospital(String name) {
		hospital.setName("Trauma Centre '" + name + "'");
	}

	@Override
	public void buildAreas() {
		AreaFactory areaFactory = AreaFactory.getInstance();
		hospital.addArea(areaFactory.getArea(AreaType.ICU));
		hospital.addArea(areaFactory.getArea(AreaType.WARD));
		hospital.addArea(areaFactory.getArea(AreaType.EMERGENCY));
		hospital.addArea(areaFactory.getArea(AreaType.SURGERY));
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}
