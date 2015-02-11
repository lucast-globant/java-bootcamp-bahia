package topic0.ex2;

public class BuildingDirector {
	
	private BuildingBuilder buildingBuilder;
	
	public BuildingDirector (BuildingBuilder builder) {
		buildingBuilder = builder; 
	}

	public Building constructBuilding() {
		buildingBuilder.setBathrooms();
		buildingBuilder.setBedrooms();
		buildingBuilder.setGarden();
		buildingBuilder.setGarage();
		return buildingBuilder.getBulding();
	}
}


