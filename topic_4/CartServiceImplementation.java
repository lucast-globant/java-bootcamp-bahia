package topic_4;

public class CartServiceImplementation implements CartService {

	private ShoppingCart shopping_cart;
	
	public CartServiceImplementation(User user) {
		this.shopping_cart = new ShoppingCart(user);
	}

	public void addArticle(Article a) {
		shopping_cart.addArticle(a);		
	}

	public void removeArticle(Article a) {
		shopping_cart.removeArticle(a);
	}

	public void addPayment(Payment payment) {
		shopping_cart.setPayment(payment);
	}

	public void removePayment() {
		shopping_cart.setPayment(null);
	}

	public Transaction checkOut() {
		return shopping_cart.checkOut();
	}

	public float totalPrize() {
		return shopping_cart.totalCost();
	}

	public String getDataArticles() {
		return shopping_cart.informationCart(); 
	}

}
