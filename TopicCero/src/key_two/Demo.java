package key_two;

public class Demo {

	public static void main(String[] args) {

		BuildingBuilder buildingBuilder = new HouseBuildingBuilder();
		BuildingDirector buildingDirector = new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		Building building = buildingDirector.getBuilding();
		System.out.println("building is: " + building);

		buildingBuilder = new BridgeBuildingBuilder();
		buildingDirector = new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		building = buildingDirector.getBuilding();
		System.out.println("building is: " + building);
	}
}
