package house;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseBuilder builder = new ImpHouseBuilder();
	    BuildHouse buildhouse = new BuildHouse();
	    House house = buildhouse.build(builder);
	    System.out.println(house);
	}

}
