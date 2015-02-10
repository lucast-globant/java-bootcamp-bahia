package Exercise_2;

public class MainE2 {

	public static void main(String[] args) {
		HouseBuilder hb = new SHouseBuilder();
		HouseDirector hd = new HouseDirector(hb);
		hd.constructHouse();
		System.out.println("House 1:");
		System.out.println(hd.getHouse());
		System.out.println("################################################");
		hb = new MHouseBuilder();
		hd = new HouseDirector(hb);
		hd.constructHouse();
		System.out.println("House 2:");
		System.out.println(hd.getHouse());
		System.out.println("################################################");
		hb = new BHouseBuilder();
		hd = new HouseDirector(hb);
		hd.constructHouse();
		System.out.println("House 3:");
		System.out.println(hd.getHouse());
		System.out.println("################################################");
	}

}
