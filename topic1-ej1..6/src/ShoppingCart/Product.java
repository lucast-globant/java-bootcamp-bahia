package ShoppingCart;

import Manager.ItemSubject;

public abstract class Product implements ItemSubject {
	
	public abstract float getPrice();

	public abstract String getName();

}