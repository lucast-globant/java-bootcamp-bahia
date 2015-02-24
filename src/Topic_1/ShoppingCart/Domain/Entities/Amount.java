package Topic_1.ShoppingCart.Domain.Entities;

import Topic_1.ShoppingCart.Domain.Discounts.DiscountInfo;
import Topic_1.ShoppingCart.Domain.Discounts.IDiscountable;

/**
 * Represents an amount that can have a discount
 */
public class Amount implements IDiscountable {

	private double amount;
	private DiscountInfo discountInfo;

	public Amount(double amount) {
		this.amount = amount;
	}

	public Amount(double amount, DiscountInfo discountInfo) {
		this.amount = amount;
		this.discountInfo = discountInfo;
	}

	public double getUndiscountedAmount() {
		return amount;
	}

	public double getAmount() {
		return hasDiscount() ? getDiscount().getDiscountFunction().calculateDiscount(amount) : amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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

	@Override public String toString() {
		String tmp = "";

		// If the amount has discount, print discount information
		if (hasDiscount()) {
			tmp += String.format("Original: %.2f\t\t$ %.2f\t\t%s",
					getUndiscountedAmount(),
					getAmount(),
					getDiscount().getDescription()
			);
		} else {
			tmp += String.format("$ %.2f", getAmount());
		}

		return String.format("Total %39s", tmp);
	}
}
