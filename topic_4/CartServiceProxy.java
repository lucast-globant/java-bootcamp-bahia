package topic_4;

public class CartServiceProxy implements CartService {
	
	CartService implementation;
	
	public CartServiceProxy (CartService implementation) {
		this.implementation = implementation;
	}

	public void addArticle(Article a) {
		implementation.addArticle(a);
	}

	public void removeArticle(Article a) {
		implementation.removeArticle(a);
	}

	public void addPayment(Payment payment) {
		implementation.addPayment(payment);
	}

	public void removePayment() {
		implementation.removePayment();
	}

	public Transaction checkOut() {
		return implementation.checkOut();
	}

	public float totalPrize() {
		return implementation.totalPrize();
	}

	public String getDataArticles() {
		return implementation.getDataArticles();
	}
	
}
