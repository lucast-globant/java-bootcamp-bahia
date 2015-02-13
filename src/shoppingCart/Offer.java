package shoppingCart;

import java.util.ArrayList;
import java.util.List;

// An offer is a special kind of product that has a list of items
public class Offer extends Product{
	private List<Item> components;
	
	public Offer(String name, float price) {
		super(name, price, true);
		components = new ArrayList<>();
	}

	public void addItem(Item item){
		components.add(item);
	}
	
	public void addItem(Product product, float quantity){
		components.add(new Item(product,quantity));
	}
	
	@Override
	public float getPrice(){
		return super.getPrice();
	}
	
	@Override
	public String toString() {
		String output = "*" + super.getName() + "...... $" + String.format("%.2f", super.getPrice()) + "\n";
		for (Item actualItem : components)
			output = output.concat(actualItem.toString());
		return output;
	}
}
