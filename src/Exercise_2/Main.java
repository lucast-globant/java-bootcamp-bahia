package Exercise_2;

public class Main {
	public static void main(String[] args) {

		// Create house builder
		HouseBuilder houseBuilder = new HouseBuilder();

		// Create house builder director with previously created builder
		HouseBuildDirector houseBuildDirector = new HouseBuildDirector(houseBuilder);

		// Actually build the house
		houseBuildDirector.buildHouse();

		// Retrieve the house
		House house = houseBuildDirector.getHouse();

		// Print the result
		System.out.println(house.toString());
	}
}
