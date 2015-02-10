
public class buildingDirector {
	
	private buildingBuilder myBuildingBuilder;
	
	public void setBuildingBuilder(buildingBuilder bB){
		myBuildingBuilder=bB;
	}

	public building getBuilding(){
		return myBuildingBuilder.getBuilding();
	}
	
	public void constructBuilding(){
		myBuildingBuilder.createNewBuilding();
		myBuildingBuilder.buildBathRooms();
		myBuildingBuilder.buildBedRooms();
		myBuildingBuilder.buildRooms();
		myBuildingBuilder.buildTypeBuilding();
	}
}
