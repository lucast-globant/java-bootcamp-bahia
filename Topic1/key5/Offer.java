package Topic1.key5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Topic1.key1.Cart;
import Topic1.key1.Item;
import Topic1.key1.Product;

/**
 * @author Jordan
 * an offer includes other individual products or other offers, 
 * his price and name must be setted independently,
 *  if you want to know the real price, you´ll need to use the calculateRealPrice() procedure 
 */
public class Offer extends Product{
	protected ArrayList<Product> productsOffer;
	//inhirids name and price
	
	public Offer(ArrayList<Product> productsOffer, String name, String price) {
		super();
		this.productsOffer = productsOffer;
		this.price=new BigDecimal(price); //offer price is independent of the calculatedPrice
		this.name=name;
	}
	
	public ArrayList<Product> getProductsOffer() {
		return productsOffer;
	}

	public void setProductsOffer(ArrayList<Product> productsOffer) {
		this.productsOffer = productsOffer;
	}
	
	/**
	 * Calculate the combined price of the Offer (the real one)
	 * @return
	 */
	@Deprecated
	private BigDecimal calculateRealPrice(){
		BigDecimal total=new BigDecimal("0.00");
		for (Product product : productsOffer) {
			total=total.add(product.getPrice());
		}
		return total;
		
	}
	
	@Override
	public String listMe() {
		StringBuffer offerList=new StringBuffer(); 
		offerList.append(getName()+"..."+getPrice()+"$\n");
		for (Product product : productsOffer) {
			offerList.append(" "+product.listMe());
			
		}
		return offerList.toString();
	}
		


}
