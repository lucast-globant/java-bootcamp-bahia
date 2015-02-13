package shoppingCart;

public class ProductWithWarranty extends Product{

	private int daysOfWarranty;
	
	public ProductWithWarranty(String name, float price, boolean isUnit) {
		super(name, price, isUnit);
	}

	public int getDaysOfWarranty() {
		return daysOfWarranty;
	}

	public void setDaysOfWarranty(int daysOfWarranty) {
		this.daysOfWarranty = daysOfWarranty;
	}
}
