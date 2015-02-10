package ejercicio1;

public class Main {

	public static void main(String[] args) {
		HouseBuilder houseBuilder = new IgluBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.ConstructHouse();
		House casa = houseDirector.getHouse();
		System.out.println(casa.toString());

		houseBuilder = new MansionBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.ConstructHouse();
		casa = houseDirector.getHouse();
		System.out.println(casa.toString());

		houseBuilder = new DuplexBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.ConstructHouse();
		casa = houseDirector.getHouse();
		System.out.println(casa.toString());

	}

}
