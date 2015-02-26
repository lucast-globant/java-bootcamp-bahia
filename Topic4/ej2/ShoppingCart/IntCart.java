package ShoppingCart;

import java.util.List;

public interface IntCart {

	public abstract void addItem(Item item);
	public abstract void removeItem(int i);
	public abstract List<Item> getItemsList();
	public abstract void printItems();
	public abstract float calculateTotal();
	public abstract void pay(PaymentMethod paymentMethod);
	public abstract Item getItem(int i);
	public abstract float getOfferPrice();

}