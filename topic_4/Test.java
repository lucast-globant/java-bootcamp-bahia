package topic_4;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void addProduct() {
		User user = new User ("Carlos","carlos@gmail.com","bootcamp",123456);
		CartService cart_service = new CartServiceProxy(new CartServiceImplementation(user));
		Article a = new Item("item1",100);
		Article b = new Item("item2",100);
		cart_service.addArticle(a);
		cart_service.addArticle(b);
		assertEquals(200,cart_service.totalPrize(),0);
	}
	
	@org.junit.Test
	public void checkout() {
		User user = new User ("Carlos","carlos@gmail.com","bootcamp",123456);
		CartService cart_service = new CartServiceProxy(new CartServiceImplementation(user));
		Article a = new Item("item1",100);
		Article b = new Item("item2",100);
		cart_service.addArticle(a);
		cart_service.addArticle(b);
		Payment payment = new CreditCard(user.getName(),user.getCreditNumber());
		cart_service.addPayment(payment);
		Transaction transaction = cart_service.checkOut();
		assertEquals(180,transaction.getTotalPrice(),0);
	}

}
