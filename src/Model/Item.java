package model;

import java.math.BigDecimal;

/**
 * @author Jordan
 * item to purchase, its defined by a product and a quantity of that product
 */
public class Item {

	protected int quantity;
	protected Product product;
	
			
	public Item(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	/**
	 * total=product price*quantity
	 * @return total price of the item.
	 */
	public BigDecimal getPrice(){
		return product.getPrice().multiply(new BigDecimal(""+quantity) );
	}
}
