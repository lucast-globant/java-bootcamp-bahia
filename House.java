package topic0.ex2;

public class House implements BuildingBuilder {
	
	private Building building; 
	
	public House () {
		building = new Building (); 
	}
	
	public void setBedrooms() {
		building.setBedrooms(3);		
	}

	public void setBathrooms() {
		building.setBathrooms(2);
	}

	public void setGarage() {
		building.setGarage(1);
	}

	public void setGarden() {
		building.setGarden(true);
	}

	public Building getBulding() {
		return building;
	}
	

}
