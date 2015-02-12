package key_two;

public class Mouse implements ItemElement {

	private float price;
	private String model;

	public Mouse(float price, String model) {
		this.price = price;
		this.model = model;
	}

	// standar mouse
	public Mouse() {
		this.price = 100;
		this.model = "b3";
	}

	public float getPrice() {
		return price;
	}

	public String getModel() {
		return model;
	}

	public String toString() {
		return "ITEM: " + "mouse " + model + " $" + price;
	}
}
