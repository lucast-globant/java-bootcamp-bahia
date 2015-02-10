package Exercise_2;

public class House {

	private String bedroom;
	private String kitchen;
	private String loundry;
	private String livingRoom;
	private String bathroom;

	public String getBedroom() {
		return bedroom;
	}

	public void setBedroom(String bedroom) {
		this.bedroom = bedroom;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getLoundry() {
		return loundry;
	}

	public void setLoundry(String loundry) {
		this.loundry = loundry;
	}

	public String getLivingRoom() {
		return livingRoom;
	}

	public void setLivingRoom(String livingRoom) {
		this.livingRoom = livingRoom;
	}

	public String getBathroom() {
		return bathroom;
	}

	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	@Override
	public String toString() {
		return String.format("House:\n" + "\tBedrooom: %s\n" + "\tKitchen: %s\n" + "\tLoundry: %s\n" + "\tLiving room: %s\n"
						+ "\tBathroom: %s\n", bedroom,
				kitchen, loundry, livingRoom, bathroom);
	}

}
