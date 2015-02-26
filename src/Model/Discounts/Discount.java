package Model.Discounts;

import java.math.BigDecimal;
import java.util.List;

import Model.Item;



public interface Discount {
	
	public BigDecimal applyDiscount(List<Item> items, BigDecimal price);

}
