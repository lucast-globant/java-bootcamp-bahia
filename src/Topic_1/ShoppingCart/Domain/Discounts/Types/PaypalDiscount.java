package Topic_1.ShoppingCart.Domain.Discounts.Types;

import Topic_1.ShoppingCart.Domain.Entities.Cart;
import Topic_1.ShoppingCart.Domain.Entities.CartItem;
import Topic_1.ShoppingCart.Domain.Discounts.DiscountInfo;
import Topic_1.ShoppingCart.Domain.Discounts.DiscountTypes;
import Topic_1.ShoppingCart.Domain.Discounts.IDiscount;
import Topic_1.ShoppingCart.Domain.PaymentMethods.IPaymentMethod;

import java.util.Collections;

/**
 * Defines the discount applied when paying by Paypal
 */
public class PaypalDiscount implements IDiscount {
	@Override public Cart applyDiscount(Cart cart, IPaymentMethod paymentType) {

		if (cart.getItems().size() > 1) {

			// Select the cheapest item
			CartItem cheapestItem = Collections.min(cart.getItems());

			// Select the discount to be applied
			DiscountInfo discount = DiscountTypes.freeDiscount();

			// Apply discount
			cheapestItem.setDiscountInfo(discount);
		}

		return cart;
	}
}
