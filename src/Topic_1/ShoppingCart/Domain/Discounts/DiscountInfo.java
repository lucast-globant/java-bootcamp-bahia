package Topic_1.ShoppingCart.Domain.Discounts;

/**
 * Encapsulates the information about the discount made
 * over a discountable object like Amount or CartItem
 */
public class DiscountInfo {

	private String description;
	private IDiscountFunction discountFunction;

	public DiscountInfo(String description, IDiscountFunction discountFunction) {
		this.description = description;
		this.discountFunction = discountFunction;
	}

	public IDiscountFunction getDiscountFunction() {
		return discountFunction;
	}

	public void setDiscountFunction(IDiscountFunction discountFunction) {
		this.discountFunction = discountFunction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
