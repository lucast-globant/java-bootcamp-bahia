package Topic_1.ShoppingCart.Domain.Entities;

import Topic_1.ShoppingCart.Domain.Discounts.DiscountInfo;
import Topic_1.ShoppingCart.Domain.Discounts.IDiscountable;
import Topic_1.ShoppingCart.Domain.Utilities.IdManager;

/**
 * Represents an item that can be added to the cart
 */
public abstract class CartItem implements IDiscountable, Comparable<CartItem> {

	protected int id;
	protected String name;
	protected double price;
	protected DiscountInfo discountInfo;

	protected boolean dirtyPrice = false;

	public CartItem(String name, double price) {
		this.id = IdManager.nextId();
		this.name = name;
		this.price = price;
	}

	public DiscountInfo getDiscountInfo() {
		return discountInfo;
	}

	public void setDiscountInfo(DiscountInfo discountInfo) {
		this.discountInfo = discountInfo;
	}

	@Override public boolean hasDiscount() {
		return discountInfo != null;
	}

	@Override public DiscountInfo getDiscount() {
		return discountInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return hasDiscount() ? getDiscount().getDiscountFunction().calculateDiscount(price) : price;
	}

	public void setPrice(double price) {
		if (this.price != price)
			dirtyPrice = true;
		this.price = price;
	}

	@Override public int compareTo(CartItem cartItem) {
		return Double.compare(price, cartItem.getPrice());
	}

	public int getId() {
		return id;
	}

	public boolean isDirtyPrice() {
		return dirtyPrice;
	}
}
