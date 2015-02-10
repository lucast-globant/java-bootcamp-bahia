public class homeBuildingBuilder extends buildingBuilder {
	
	public void buildRooms(){
		myBuilding.setRooms(5);
	}
	
	public void buildBedRooms(){
		myBuilding.setBedRooms(3);
	}
	
	public void buildBathRooms(){
		myBuilding.setBathRooms(2);
	}
	
	public void buildTypeBuilding(){
		myBuilding.setTypeBuilding("house");
	}
}
