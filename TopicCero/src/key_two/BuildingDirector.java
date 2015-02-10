package key_two;

public class BuildingDirector {

	private BuildingBuilder buildingBuilder = null;

	public BuildingDirector(BuildingBuilder buildingBuilder) {
		this.buildingBuilder = buildingBuilder;
	}

	public void constructBuilding() {
		buildingBuilder.buildPrice();
		buildingBuilder.buildCoveredArea();
		buildingBuilder.buildGroundSize();
	}

	public Building getBuilding() {
		return buildingBuilder.getBuilding();
	}

}
