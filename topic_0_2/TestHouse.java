package topic_0_2;

public class TestHouse {

	public static void main(String[] args) {

			HouseBuilder houseBuilder = new SimpleHouseBuilder();
			HouseDirector houseDirector = new HouseDirector(houseBuilder);
			houseDirector.constructHouse();
			House house = houseDirector.getHouse();
			System.out.println("the house contains: " + house);
			
			houseBuilder = new ComplexHouseBuilder();
			houseDirector = new HouseDirector(houseBuilder);
			houseDirector.constructHouse();
			house = houseDirector.getHouse();
			System.out.println("the house contains: " + house);

	}
}
