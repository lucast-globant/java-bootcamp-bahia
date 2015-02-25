package Topic_4.Services;

import Topic_4.ShoppingCart.Mailist.Mailist;
import Topic_4.ShoppingCart.ShopingCart.Cart;

public class CartServiceFactory {

	private CartServiceFactory() {

	}

	public static CartService getLocalService(Mailist mailist) {
		if (mailist == null)
			return new Cart();
		else
			return new Cart(mailist);
	}
}
