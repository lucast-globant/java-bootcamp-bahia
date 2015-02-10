package Exercise_2;

public class HouseDirector {
	private HouseBuilder hb = null;
	
	public HouseDirector(HouseBuilder h){
		hb = h;
	}
	
	public void constructHouse(){
		hb.buildAddress();
		hb.buildPrice();
		hb.buildFloors();
		hb.buildGarden();
	}
	
	public House getHouse(){
		return hb.getHouse();
	}
}
