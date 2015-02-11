public class Demo {
	public static void main(String[] args) {

		HouseBuilder houseBuilder = new MicroHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println("Features of the house: " + house.toString());

		houseBuilder = new MansionBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		house = houseDirector.getHouse();
		System.out.println("Features of the house: " + house.toString());
	}
}
