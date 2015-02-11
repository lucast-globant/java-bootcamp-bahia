
public class House {
	private	String	wall;
	private	String	roof;
	private	String	floor;
	
	//Constructor with paramerts
	public	House(String wall, String roof, String floor){
		this.wall = wall;
		this.roof = roof;
		this.floor = floor;
	}
		
	//Constructor without paramerts
	public	House(){
		this.wall = "";
		this.roof = "";
		this.floor = "";
	}
	
	public void setWall(String wall){
		this.wall = wall;
	}
	public void setRoof(String roof){
		this.roof = roof;
	}
	public void setFloor(String floor){
		this.floor = floor;
	}
	
	public String getWall(){return wall;}
	public String getRoof(){return roof;}
	public String getFloor(){return floor;} 
}
