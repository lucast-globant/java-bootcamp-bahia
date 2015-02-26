package discounts;
import items.Item;

import java.util.List;

/* A concrete discount ; 10% of the total of the purchase*/

public class TenPercentDiscount implements Discount {

	@Override
	public float applyDiscount(List<Item> items, float total) {
		return total - ((total * 10) / 100);
	}

}
