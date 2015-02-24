package Topic_1.ShoppingCart.Domain.Discounts;

/**
 * Defines the function to calculate the discount of an object
 */
public interface IDiscountFunction {

	double calculateDiscount(double currentPrice);
}

