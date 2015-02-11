public class Hospital {

	private String name;
	private String address;
	private int beds;
	private int emergencyRooms;
	private boolean prepaidSocialWork;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String a) {
		address = a;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int b) {
		beds = b;
	}

	public int getEmergencyRooms() {
		return emergencyRooms;
	}

	public void setEmergencyRooms(int e) {
		emergencyRooms = e;
	}

	public boolean getPrepaidSocialWork() {
		return prepaidSocialWork;
	}

	public void setPrepaidSocialWork(boolean p) {
		prepaidSocialWork = p;
	}

	public String toString() {
		return "Name " + name + " | Address " + address + " | Beds " + beds + " | Emergency Rooms" + emergencyRooms
				+ " | Accept prepaid social work " + prepaidSocialWork;
	}
}
