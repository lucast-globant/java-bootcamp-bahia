package topic_1;

import java.util.ArrayList;

public class Test {
	
	public static void main (String[] args) {
		
		CatalogWeb cw = new CatalogWeb();
		MarketManager mm = new MarketManager();
		cw.attach(mm);
		
		Article a = new Item("item1",100);
		Article b = new Item("item2",100);
		Article c = new Item("item3",200);
		ArrayList<Article> offer = new ArrayList<Article>();
		offer.add(a);
		offer.add(b);
		Article d = new Offer("offer",75,offer);
		
		cw.addArticle(c);
		cw.addArticle(d);
		
		User user = new User ("Carlos","carlos@gmail.com","bootcamp",123456);
		
		System.out.println("WEB CATALOG:");
		System.out.println(cw.informationCatalog());
		cw.changePrice(a, 85);
		System.out.println("WEB CATALOG:");
		System.out.println(cw.informationCatalog());
		
		ShoppingCart sp = new ShoppingCart(user);
		sp.attach(mm);
		sp.addArticle(a);
		
		System.out.println("SHOPPING CART:");
		System.out.println(sp.informationCart());
		
		
		Payment payment = new CreditCard(user.getName(),user.getCreditNumber());
		sp.setPayment(payment);
		Transaction transaction = sp.checkOut();
		System.out.println("transaction price: "+transaction.getTotalPrice());
		
		System.out.println("SHOPPING CART:");
		System.out.println(sp.informationCart());
	}
}
