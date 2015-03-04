package model.discounts;

import java.math.BigDecimal;
import java.util.List;

import model.Item;




public interface Discount {
	
	public BigDecimal applyDiscount(List<Item> items, BigDecimal price);

}
