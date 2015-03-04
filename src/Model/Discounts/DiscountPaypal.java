package model.discounts;

import java.math.BigDecimal;
import java.util.List;

import model.Item;
import model.Product;



public class DiscountPaypal implements Discount {



	@Override
	public BigDecimal applyDiscount(List<Item> items, BigDecimal total) {
		
		if (items.size() == 0)
			return new BigDecimal("0.00");
		else if (items.size() == 1)
			return total;
				
		return total.subtract(cheapestProduct(items).getPrice());
		
	}
	
	
	private Product cheapestProduct(List<Item> myItems){

		if(myItems.size()>0){
			//declare and inicialization of return variable
			Product cheapest=myItems.get(0).getProduct();

			//search cheapest
			for (Item it : myItems) {
				if(it.getProduct().getPrice().compareTo(cheapest.getPrice())==-1)
					cheapest=it.getProduct();
				}

			return cheapest;
		}

		//if no products
		return null;
	}

}
