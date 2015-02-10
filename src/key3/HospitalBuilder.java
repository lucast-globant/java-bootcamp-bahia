package key3;

public abstract class HospitalBuilder {
	
	
	protected Hospital hospital;
	protected Sector[] sector;	
	
	public abstract Hospital createHospital();
	public abstract Sector[] createSectors(int number);
	
}
