package Topic1.key2;

import java.math.BigDecimal;
import java.util.List;
import Topic1.key1.Item;

public class DiscountCreditCard implements Discount {

	@Override
	public BigDecimal applyDiscount(List<Item> items, BigDecimal total) {
		if (items.size() == 0)
			return new BigDecimal("0.00");

		return total.subtract(
				//total menos el 10% discount
				enterPercentageDiscount(total, "0.1" ));
	}
	
	/**
	 * simply to a shortcut to enter discounts
	 * @param balance
	 * @param discount a float percentage in form as a String (10%=""+0.1)
	 * @return the final price
	 */
	private BigDecimal enterPercentageDiscount(BigDecimal balance,String discount){
	
		return //balance.subtract(
				balance.multiply(new BigDecimal(discount)) ;
		
	}
	
}
