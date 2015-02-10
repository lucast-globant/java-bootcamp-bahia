
public class main {

	public static void main(String[] args) {
		
		buildingDirector myBuildingDirector = new buildingDirector();

		buildingBuilder myHomeBuildingBuilder = new homeBuildingBuilder();
		
		myBuildingDirector.setBuildingBuilder(myHomeBuildingBuilder);
		
		myBuildingDirector.constructBuilding();
		
	}

}
