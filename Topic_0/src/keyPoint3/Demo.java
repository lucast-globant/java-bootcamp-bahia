package keyPoint3;

public class Demo {

	public static void main(String[] args) {
		HospitalBuilder penna, municipal, itemedica, greysloan;
		
		penna = new GeneralHospitalBuilder();
		HospitalDirector hospitalDirector = new HospitalDirector(penna);
		hospitalDirector.constructHospital("José Penna");
		System.out.println(hospitalDirector.getHospital().toString());
		
		municipal= new GeneralHospitalBuilder();
		hospitalDirector = new HospitalDirector(municipal);
		hospitalDirector.constructHospital("Municipal");
		System.out.println(hospitalDirector.getHospital().toString());
		
		itemedica= new ClinicBuilder();
		hospitalDirector = new HospitalDirector(itemedica);
		hospitalDirector.constructHospital("Itemédica");
		System.out.println(hospitalDirector.getHospital().toString());
		
		greysloan= new TraumaCentreBuilder();
		hospitalDirector = new HospitalDirector(greysloan);
		hospitalDirector.constructHospital("Grey Sloan Memorial");
		System.out.println(hospitalDirector.getHospital().toString());

	}

}
