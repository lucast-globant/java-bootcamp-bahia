package keyPoint3;


public class GeneralHospitalBuilder implements HospitalBuilder {

	private Hospital hospital;
	
	public GeneralHospitalBuilder(){
		hospital = new Hospital();
	}
	
	@Override
	public void buildHospital(String name) {
		hospital.setName("General Hospital '" + name + "'");
	}

	@Override
	public void buildAreas() {
		AreaFactory areaFactory = AreaFactory.getInstance();
		hospital.addArea(areaFactory.getArea(AreaType.ICU));
		hospital.addArea(areaFactory.getArea(AreaType.WARD));
		hospital.addArea(areaFactory.getArea(AreaType.PHARMACY));
		hospital.addArea(areaFactory.getArea(AreaType.SURGERY));
		hospital.addArea(areaFactory.getArea(AreaType.MATERNITYWARD));
		hospital.addArea(areaFactory.getArea(AreaType.EMERGENCY));
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}
