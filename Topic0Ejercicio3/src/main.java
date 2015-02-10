
public class main {

	public static void main(String[] args) {
		buildingFactory myBuildingFactory = new buildingFactory();

		building myHospital = myBuildingFactory.getBuilding("hospital building");
		System.out.println(myHospital.numBathRooms());
		
	}

}
