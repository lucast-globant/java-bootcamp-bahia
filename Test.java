package topic0.ex2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildingBuilder buildingBuilder = new House (); 
		BuildingDirector director = new BuildingDirector (buildingBuilder);
		Building building = director.constructBuilding();
		System.out.println ("House description: "+building.toString()); 
	}

}
