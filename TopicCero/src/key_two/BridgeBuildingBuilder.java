package key_two;

public class BridgeBuildingBuilder implements BuildingBuilder {

	private Building building;

	public BridgeBuildingBuilder() {
		building = new Building();
	}

	@Override
	public void buildPrice() {
		building.setPrice(2000000);
	}

	@Override
	public void buildCoveredArea() {
		building.setCoveredArea(200);
	}

	@Override
	public void buildGroundSize() {
		building.setGroundSize(0);
	}

	@Override
	public Building getBuilding() {
		return building;
	}
}
