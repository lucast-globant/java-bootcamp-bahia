package keyPoint3;

public class HospitalDirector {
	private HospitalBuilder houseBuilder = null;
	public HospitalDirector(HospitalBuilder houseBuilder){
		this.houseBuilder=houseBuilder;
	}
	
	public void constructHospital(String name){
		houseBuilder.buildHospital(name);
		houseBuilder.buildAreas();
	}
	
	public Hospital getHospital(){
		return houseBuilder.getHospital();
	}
}
