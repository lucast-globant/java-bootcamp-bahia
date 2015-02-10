package key3;


public abstract class Hospital {
	protected String name;
	protected Sector[] sectors;

	public Sector[] getSectors(){
		return sectors;
	}
	
	public void setSectors(Sector[] sect){
		sectors=sect;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * calculated atribute to determine if are space in the sector (just stadistical) 
	 * @return 
	 */
	public int TotalPatients(){
		int total=0;
		for (Sector sector : sectors) {
			for (Room room : sector.rooms) {
					total+=( room.getPatients() );
			}
		}
		return total;
		
	}
	
	
	public void log(){
		if(name!=null)
		System.out.println("Hospital: "+name+ " Patients: "+TotalPatients());
	}
}
