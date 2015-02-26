package key_six;

public class Computer implements ItemElement {

	private float price;
	private String ram;
	private String cpu;
	private String hardDisk;

	public Computer(int price, String name, String ram, String cpu,
			String hardDisk) {
		this.price = price;
		this.ram = ram;
		this.cpu = cpu;
		this.hardDisk = hardDisk;
	}

	// standar computer
	public Computer() {
		this.price = 5000;
		this.ram = "4gn";
		this.cpu = "amd phenom x2";
		this.hardDisk = "320gb";
	}

	public float getPrice() {
		return price;
	}

	public String getRam() {
		return ram;
	}

	public String getCpu() {
		return cpu;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public String toString() {
		return "ITEM: " + cpu + " $" + price;
	}

	@Override
	public void changePrice(float newPrice) {
		this.price = newPrice;
		SingletonShopping.getInstance().newNotification(
				"Computer " + cpu + " price changed");
	}
}
