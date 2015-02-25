package Topic_4.ShoppingCart.Items;

public class Product implements Item {
	protected String name;
	protected float price;

	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		String s = name + " ....... " + " $ " + price + "\n";
		return s;
	}

}
