package keyPoint2;

public class HouseDirector {
	private HouseBuilder houseBuilder = null;
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder=houseBuilder;
	}
	
	public void constructHouse(){
		houseBuilder.buildHouse();
		houseBuilder.buildSurface();
	}
	
	public House getHouse(){
		return houseBuilder.getHouse();
	}
}
