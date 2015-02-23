package Topic1.key1;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Jordan
 * shopping cart
 */
public class Cart {

	protected List<Item> products;
	
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
	
	public List<Item> getItems(){
		return products;
	}
	
	public void cleanCart(){
		products=new ArrayList<Item>();
	}
	
	/**
	 * @param category
	 * @return all items that contains a product with that category
	 */
	public List<Item> getProductsByCategory(String category){
		ArrayList<Item> listByCategory=new ArrayList<Item>();
		for (Item item : products) {
			if (item.getProduct().getCategory().equals(category))
				listByCategory.add(item);
		}
		
		return listByCategory;
	}
	
	
}
