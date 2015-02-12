package Items;

public class Item {
	protected String name;
	protected double price;

	public Item(String n, double p) {
		name = n;
		price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		String s = "";
		s += "- " + name + " ......." + " $ " + price + "\n";
		return s;
	}

}
