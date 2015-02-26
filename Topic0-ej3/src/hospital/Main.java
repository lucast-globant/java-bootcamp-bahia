package hospital;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalBuilder builder = new ImpHospitalBuilder();
	    BuildHospital buildhouse = new BuildHospital();
	    Hospital hospital = buildhouse.build(builder);
	    System.out.println(hospital);

	    
	    
	}

}
