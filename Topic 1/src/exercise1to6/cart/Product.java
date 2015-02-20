package exercise1to6.cart;

public class Product implements Item {
	private String name;
	private double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;

	}

	public String toString() {
		return "Item Name "+name+ " ....$ " + price +"\n";
	}

}
