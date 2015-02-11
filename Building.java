package topic0.ex2;


public class Building {
	
	private int bedrooms;
	private int bathrooms; 
	private int garage;
	private boolean garden;
	
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public int getGarage() {
		return garage;
	}
	public void setGarage(int garage) {
		this.garage = garage;
	}
	public boolean isGarden() {
		return garden;
	}
	public void setGarden(boolean garden) {
		this.garden = garden;
	}
	
	@Override
	public String toString() {
		return "Building [bedrooms=" + bedrooms + ", bathrooms=" + bathrooms
				+ ", garage=" + garage + ", garden=" + garden + "]";
	} 

	
}
