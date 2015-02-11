package topic0.excercise2;

public class House {
	
	private Person owner;
	private int numberBedrooms;
	private int numberBathrooms; 
	private int numberGarage;
	private boolean garden; 
	private boolean swimmingPool; 
	private Location adress;
		
	public House(Person owner, int numberBedrooms, int numberBathrooms,
			int numberGarage, boolean garden, boolean swimmingPool,
			Location adress) {
		this.owner = owner;
		this.numberBedrooms = numberBedrooms;
		this.numberBathrooms = numberBathrooms;
		this.numberGarage = numberGarage;
		this.garden = garden;
		this.swimmingPool = swimmingPool;
		this.adress = adress;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public int getNumberBedrooms() {
		return numberBedrooms;
	}
	
	public void setNumberBedrooms(int numberBedrooms) {
		this.numberBedrooms = numberBedrooms;
	}
	
	public int getNumberBathrooms() {
		return numberBathrooms;
	}
	
	public void setNumberBathrooms(int numberBathrooms) {
		this.numberBathrooms = numberBathrooms;
	}
	
	public int getNumberGarage() {
		return numberGarage;
	}
	
	public void setNumberGarage(int numberGarage) {
		this.numberGarage = numberGarage;
	}
	
	public boolean isGarden() {
		return garden;
	}
	
	public void setGarden(boolean garden) {
		this.garden = garden;
	}
	
	public boolean isSwimmingPool() {
		return swimmingPool;
	}
	
	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}
	
	public Location getAdress() {
		return adress;
	}
	
	public void setAdress(Location adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "House [owner=" + owner + ", numberBedrooms=" + numberBedrooms
				+ ", numberBathrooms=" + numberBathrooms + ", numberGarage="
				+ numberGarage + ", garden=" + garden + ", swimmingPool="
				+ swimmingPool + ", adress=" + adress + "]";
	} 
	

}
