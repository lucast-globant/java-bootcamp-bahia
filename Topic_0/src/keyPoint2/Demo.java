package keyPoint2;

public class Demo {

	public static void main(String[] args) {
		HouseBuilder houseBuilder = new DetachedHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		System.out.println("Detached House:\n" + houseDirector.getHouse().toString());
		
		houseBuilder = new StudioHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		System.out.println("Studio House:\n" + houseDirector.getHouse().toString());
	}

}
