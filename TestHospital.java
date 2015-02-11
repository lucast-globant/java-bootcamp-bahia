package topic0.ex3;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HospitalFactory factory = new HospitalFactory ();
		Hospital publicHospital = factory.getHospital("public");
		System.out.println("The public Hospital : "+publicHospital.getName()+
				" has "+publicHospital.getRooms()+" rooms"+" and "+publicHospital.getMedicalOffices()+" medical offices.\nSocial Work: "+publicHospital.isSocialWorkAllowed());
		
		Hospital privateHospital = factory.getHospital("private");
		System.out.println("The private Hospital : "+privateHospital.getName()+
				" has "+privateHospital.getRooms()+" rooms"+" and "+privateHospital.getMedicalOffices()+" medical offices.\nSocial Work: "+privateHospital.isSocialWorkAllowed());
	}

}
