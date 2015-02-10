public abstract class buildingBuilder {
	
	protected building myBuilding;
	
	public building getBuilding() {
		  return myBuilding;
	}
	
	public void createNewBuilding() {
		  myBuilding=new building();
	}
	
	public abstract void buildRooms();
	
	public abstract void buildBedRooms();
	
	public abstract void buildBathRooms();
	
	public abstract void buildTypeBuilding();
	
}
