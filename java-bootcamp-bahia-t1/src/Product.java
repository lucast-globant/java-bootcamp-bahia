/* A concrete product */

public class Product implements Item {

	private float price;
	private String name;
	private int code;

	public Product(int price, String name, int code) {
		super();
		this.price = price;
		this.name = name;
		this.code = code;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public void setCode(int code) {
		this.code = code;

	}

	@Override
	public void setPrice(float price) {
		this.price = price;

	}

	public String toString() {
		return "- Item name: " + name + " ...... " + " $" + price;
	}

}
