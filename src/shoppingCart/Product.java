package shoppingCart;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	private int code, category;
	private String name, description;
	private float price;
	private boolean isUnit;
	private static AtomicInteger nextCode = new AtomicInteger (0); // This should be initialized to the last
										// used code in the database

	/*
	 * The parameter 'isUnit' indicates whether the product is sold in units or
	 * in parts of a unit (kilograms, liters, etc)
	 */
	public Product(String name, float price, boolean isUnit) {
		this.name = name;
		this.price = price;
		this.isUnit = isUnit;
		this.code = nextCode.incrementAndGet();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setCategory(int idCategory) {
		category = idCategory;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}

	public int getCategory() {
		return category;
	}

	public int getCode() {
		return code;
	}

	public boolean isUnit() {
		return isUnit;
	}

	public String toString() {
		return ("- " + name + "... $" + String.format("%.2f\n", price));
	}
	
	protected static void resetIDs(){
		nextCode.set(0);
	}
}
