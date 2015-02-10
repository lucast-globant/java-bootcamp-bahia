package key_two;

public class HouseBuildingBuilder implements BuildingBuilder {

	private Building building;

	public HouseBuildingBuilder() {
		building = new Building();
	}

	@Override
	public void buildPrice() {
		building.setPrice(100000);
	}

	@Override
	public void buildCoveredArea() {
		building.setCoveredArea(80);
	}

	@Override
	public void buildGroundSize() {
		building.setGroundSize(120);
	}

	@Override
	public Building getBuilding() {
		return building;
	}

}
