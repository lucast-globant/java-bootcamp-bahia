package Exercise_3;

public class CHBuilder implements HospitalBuilder {
	private Hospital hospital;

	public CHBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildName() {
		hospital.setName("Hospital");
	}

	@Override
	public void buildPatientsBedroom() {
		PatientBedrooms p = new PatientBedrooms(1, 1);
		hospital.getPbrooms().add(p);
	}

	@Override
	public void buildIntensiveCare() {
		IntensiveCare i = new IntensiveCare(1, 1);
		hospital.getIcrooms().add(i);
	}

	@Override
	public void buildDoctors() {
		Doctor d1 = new Doctor(1, "Juan", "Perez");
		Doctor d2 = new Doctor(2, "Carlos", "Perez");
		hospital.getDoctors().add(d1);
		hospital.getDoctors().add(d2);
	}

	@Override
	public void buildNurses() {
		Nurse n1 = new Nurse(1, "Maria", "Perez");
		Nurse n2 = new Nurse(2, "Sonia", "Perez");
		Nurse n3 = new Nurse(3, "Julia", "Perez");
		hospital.getNurses().add(n1);
		hospital.getNurses().add(n2);
		hospital.getNurses().add(n3);
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}
