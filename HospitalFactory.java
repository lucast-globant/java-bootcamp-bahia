package topic0.ex3;

public class HospitalFactory {

	public Hospital getHospital (String type) {
		
		Hospital hospital = null; 
		switch (type) {
			case "public":
				hospital = new Public();
				break;
			case "private": 
				hospital = new Private();
				break;
			default:
				break;
		}
		
		return hospital;
	}
	
}
