package topic_1;

import java.util.ArrayList;

public class ShoppingCart extends ConcreteSubject {
	
	private ArrayList<Article> articles;
	private User user;
	private Payment payment;
	
	public ShoppingCart(User user) {
		this.user = user;
		articles = new ArrayList<Article>();
	}
	
	public void addArticle (Article a) {
		articles.add(a);
		notifyArticleAdded();
	}
	
	public Transaction checkOut() {
		float totalCost = totalCost(articles);
		float discount = payment.getDiscount(articles);
		float totalPrice = totalCost - discount;
		Transaction transaction = new Transaction(payment,totalPrice);
		notifyTransactionMade();
		emptyCart();
		return transaction;
	}
	
	private float totalCost (ArrayList<Article> articles) {
		float total = 0;
		for (Article a : articles)
			total+=a.getPrice();
		return total;
	}
	
	public void emptyCart() {
		articles = new ArrayList<Article>();
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public User getUser() {
		return user;
	}
	
	public String informationCart() {
		String result = "";
		if (!articles.isEmpty()) {
			for (int i=0; i<articles.size()-1;i++)
				result = result.concat(articles.get(i).getInformation()+"\n");
			result = result.concat(articles.get(articles.size()-1).getInformation());
		}
		else
			result = "No information.";
		return result;
	}
}
