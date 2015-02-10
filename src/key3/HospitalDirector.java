package key3;


public class HospitalDirector {
	/**
	 * @param builder who build your house :)
	 * @return a brand new House
	 */
	public Hospital constructHospital(HospitalBuilder builder) {
		Hospital hospital= builder.createHospital();
		//log(hospital.getRepresentation());
		
		hospital.setSectors(builder.createSectors(3));
//		log(hospital.getSectors().getRepresentation());
		
		
		
		return hospital;
	}
	
	/**
	 * @param str say something
	 */
	public void log(String str){
		System.out.println(str);
	}
}

