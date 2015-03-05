package demo;


public class Attendee {

	private final int id;
	private final String name;
	
	public Attendee(int id, String name){
		this.name =name;
		this.id=id;
	}
	
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
}
