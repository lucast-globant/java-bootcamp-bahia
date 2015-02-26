package Model;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Jordan
 * simulate a connection to a persistent data(eg. file, db, etc),
 *  has operations to retrieveData in the form like a page need
 */
public class DataConnection{

		
	
	/**
	 * @return a list that contain only ConcreteProducts (simple product list)
	 */
	public static List<ConcreteProduct> retrieveData(){
		
		return makeCatalog1();
		
		
	}
	
	/**
	 * @return a list of products that contains Offers
	 */
	public static List<Product> retrieveOffers(){
			
			
			return makeCatalog3();
		
	}
		
	private static List<ConcreteProduct> makeCatalog1(){
		ArrayList<ConcreteProduct> catalog=new ArrayList<ConcreteProduct>();
		
		catalog.add(new ConcreteProduct("coca", "", "", "20.00"));
		catalog.add(new ConcreteProduct("fernet", "", "", "40.00"));
		catalog.add(new ConcreteProduct("interlagos", "", "", "10.00"));
		
		return catalog;
	}
	
	private static List<Product> makeCatalog2(){
		ArrayList<Product> catalog=new ArrayList<Product>();
	
		
		ArrayList<Product> productlist=new ArrayList<Product>();
		productlist.add(new ConcreteProduct("coca", "", "", "22.00"));
		productlist.add(new ConcreteProduct("fernet", "", "", "40.00"));
		Offer offer=new Offer(productlist, "Oferta del Bootcamp", "59.99");
		
		catalog.add(offer);
		catalog.add(new ConcreteProduct("Interlagos", "", "", "10.00"));
			
		return catalog;
	}
	
	private static List<Product> makeCatalog3(){
		ArrayList<Product> catalog=new ArrayList<Product>();
	
		ArrayList<Product> productlist=new ArrayList<Product>();
		productlist.add(new ConcreteProduct("coca", "", "", "22.00"));
		productlist.add(new ConcreteProduct("fernet", "", "", "40.00"));
		
		ArrayList<Product> productlist2=new ArrayList<Product>();
		productlist2.add(new ConcreteProduct("coca", "", "", "22.00"));
		productlist2.add(new ConcreteProduct("fernet", "", "", "40.00"));
		Offer offer2=new Offer(productlist2, "Oferta del Bootcamp", "59.99");
		productlist.add(offer2);
		
		Offer offer=new Offer(productlist, "Oferta del Bootcamp", "59.99");
		catalog.add(offer);
		catalog.add(new ConcreteProduct("Interlagos", "", "", "10.00"));
			
		return catalog;
	}
		
}
