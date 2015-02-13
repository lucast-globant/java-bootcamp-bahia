package topic1.offer;

public abstract class Offer {
	
	protected String name; 
	
	public Offer (String name) {
		this.name = name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
}
