package key3;

public class PrivadoBuilder extends HospitalBuilder{

	
	@Override
	public Hospital createHospital() {
		// TODO Auto-generated method stub
		return new Privado();
	}

	@Override
	public Sector[] createSectors(int numberOfSectors) {
		Sector[] sectors=new Sector[numberOfSectors];
		
		//populate with sectors
		for(int i=0; i<numberOfSectors; i++)
			sectors[i]=new Sector(""+i, 2);
		
		return sectors;
	}
}
