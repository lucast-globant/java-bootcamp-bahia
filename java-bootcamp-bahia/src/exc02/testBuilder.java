package exc02;

/* A class to test and create a given type of house */

public class testBuilder {

	public static void main(String[] args) {

		HouseBuilder houseBuilder = new WoodHouseBuilder();
		HouseMaker houseMaker = new HouseMaker(houseBuilder);
		houseMaker.constructHouse();

		House house = houseMaker.getHouse();

		System.out.println(" House 1 ");
		System.out.println(house.toString());

		HouseBuilder houseBuilder2 = new ConcreteHouseBuilder();
		HouseMaker houseMaker2 = new HouseMaker(houseBuilder2);
		houseMaker2.constructHouse();

		House house2 = houseMaker2.getHouse();

		System.out.println(" House 2 ");
		System.out.println(house2.toString());

	}

}
