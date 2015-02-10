package key3;

public class testFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalFactory hf=new HospitalFactory();
		Privado concreteHospital1;
		concreteHospital1=(Privado) hf.createHospital(HospitalFactory.Type.PRIVADO);
		concreteHospital1.setName("del Sur");
		concreteHospital1.registerGuest();
		
		Municipal concreteHospital2;
		concreteHospital2=(Municipal) hf.createHospital(HospitalFactory.Type.MUNICIPAL);
		concreteHospital2.setName("municipal");
		
		concreteHospital1.log();
		concreteHospital2.log();
	}

}
