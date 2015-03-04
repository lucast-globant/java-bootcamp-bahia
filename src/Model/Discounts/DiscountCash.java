package model.discounts;

import java.math.BigDecimal;
import java.util.List;

import model.Item;
import model.Product;





public class DiscountCash implements Discount {


	@Override
	public BigDecimal applyDiscount(List<Item> items, BigDecimal total) {
		if (items.size() == 0)
			return new BigDecimal("0.00");
				
		return total.subtract(enterPercentageDiscount(
				mostExpensiveProduct(items).getPrice(), "0.9"));
	}
	
	private Product mostExpensiveProduct(List<Item> myItems) {
		if (myItems.size() > 0) {
		// declare and inicialization of return variable
		Product mep = myItems.get(0).getProduct();
		// search cheapest
		for (Item item : myItems) {
			if (item.getPrice().compareTo(mep.getPrice()) == 1)
			mep = item.getProduct();
			}
			return mep;
		}
		// if no products
		return null;
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
