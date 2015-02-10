package ejercicio2;

public class Main {

	public static void main(String[] args) {
		HospitalBuilder hospitalBuilder = new HospitalPenna();
		HospitalDirector hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructHospital();
		System.out.println(hospitalDirector.getHospital().toString());

	}

}
