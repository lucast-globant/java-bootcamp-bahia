package key2;

/**
 * Main class, a example of building a house with BUILDER PATTERN
 * @author Jordan
 *
 */
public class HouseClient {

	public static void main(String[] args){
		HouseDirector director=new HouseDirector();
		HouseBuilder brickbuilder=new BrickBuilder();
		
		House brickHouse=director.constructorHouse(brickbuilder);
		
		System.out.println("exiting");
	}
}
