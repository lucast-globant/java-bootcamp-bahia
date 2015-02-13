package Topic1.key1;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author Jordan
 * shopping cart
 */
public class Cart {

	protected ArrayList<Item> products;
	
	public Cart(){
		products=new ArrayList<Item>();
	}
	
	public void addToCart(Product prod, int quantity){
		products.add(new Item(quantity, prod));
	}
	
	public Item removeLastItem(){
		Item last=products.remove(products.lastIndexOf(products));
		return last;
	}
	
	public ArrayList<Item> getItems(){
		return products;
	}
	
	public void cleanCart(){
		products=new ArrayList<Item>();
	}
	
	
}
