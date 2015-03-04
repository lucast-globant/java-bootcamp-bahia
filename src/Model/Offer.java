package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * @author Jordan
 * an offer includes other individual products or other offers, 
 * his price and name must be setted independently,
 *  if you want to know the real price, you´ll need to use the calculateRealPrice() procedure 
 */
public class Offer extends Product{
	protected List<Product> productsOffer;
	//inhirids name and price
	
	public Offer(List<Product> productsOffer, String name, String price) {
		super();
		this.productsOffer = productsOffer;
		this.price=new BigDecimal(price); //offer price is independent of the calculatedPrice
		this.name=name;
	}
	
	public List<Product> getProductsOffer() {
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
