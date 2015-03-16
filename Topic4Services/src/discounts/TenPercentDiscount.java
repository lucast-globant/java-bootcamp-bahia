package discounts;
import java.util.List;

import repositoryServices.Item;

/* A concrete discount ; 10% of the total of the purchase*/

public class TenPercentDiscount implements Discount {

	@Override
	public float applyDiscount(List<Item> items, float total) {
		return total - ((total * 10) / 100);
	}

}
