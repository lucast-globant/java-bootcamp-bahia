package key2;


public class HouseDirector {
	/**
	 * @param builder who build your house :)
	 * @return a brand new House
	 */
	public House constructorHouse(HouseBuilder builder) {
		House house= builder.createHouse();
		log(house.getRepresentation());
		
		house.setFloor(builder.createFloor());
		log(house.getFloor().getRepresentation());
		
		house.setRoof(builder.createRoof());
		log(house.getRoof().getRepresentation());
		
		house.setWalls(builder.createWalls());
		log(house.getWalls().getRepresentation());
		
		return house;
	}
	
	/**
	 * @param str say something
	 */
	public void log(String str){
		System.out.println(str);
	}
}

