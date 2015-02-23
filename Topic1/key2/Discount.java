package Topic1.key2;

import java.math.BigDecimal;
import java.util.List;

import Topic1.key1.Item;

public interface Discount {
	
	public BigDecimal applyDiscount(List<Item> items, BigDecimal price);

}
