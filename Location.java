package topic0.excercise2;

public class Location {
	
	private String city;
	private int zipCode;
	private String street;
	private int number;
	private String obs;
	
	public Location(String city, int zipCode, String street, int number, 
			String obs) {
		this.city = city;
		this.zipCode = zipCode;
		this.street = street;
		this.number = number;
		this.obs = obs;
	} 

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", zipCode=" + zipCode + ", street="
				+ street + ", number=" + number + obs + "]";
	}
	
	
}
