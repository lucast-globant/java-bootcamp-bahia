package Topic_1.ShoppingCart.Domain.Discounts.Types;

import Topic_1.ShoppingCart.Domain.Entities.Cart;
import Topic_1.ShoppingCart.Domain.Entities.CartItem;
import Topic_1.ShoppingCart.Domain.Discounts.DiscountInfo;
import Topic_1.ShoppingCart.Domain.Discounts.DiscountTypes;
import Topic_1.ShoppingCart.Domain.Discounts.IDiscount;
import Topic_1.ShoppingCart.Domain.PaymentMethods.IPaymentMethod;

import java.util.Collections;

/**
 * Defines the discount applied when paying by cash
 */
public class CashDiscount implements IDiscount {

	@Override public Cart applyDiscount(Cart cart, IPaymentMethod paymentType) {

		if (cart.getItems().size() > 1) {

			// Get the most expensive item
			CartItem mostExpensiveItem = Collections.max(cart.getItems());

			// Get 90% discount
			DiscountInfo discount = DiscountTypes.ninetyPercentDiscount();

			// Apply discount
			mostExpensiveItem.setDiscountInfo(discount);
		}

		return cart;
	}
}