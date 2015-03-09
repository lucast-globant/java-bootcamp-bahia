package topic_1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements MailSubject {
	
	private ArrayList<Article> articles;
	private User user;
	private Payment payment;
	private List<MailObserver> mailist;
	
	public ShoppingCart(User user) {
		this.user = user;
		articles = new ArrayList<Article>();
		mailist = new ArrayList<MailObserver>();
	}
	
	public void addArticle (Article a) {
		articles.add(a);
		doNotify("New article added.\n" + a.getInformation());
	}
	
	public Transaction checkOut() {
		float totalCost = totalCost(articles);
		float discount = payment.getDiscount(articles);
		float totalPrice = totalCost - discount;
		Transaction transaction = new Transaction(payment,totalPrice);
		doNotify("New transaction made.\n" + transaction.toString());
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

	@Override
	public void doNotify (String message) {
		for(MailObserver mail : mailist)
			mail.update(message);		
	}

	@Override
	public void attach (MailObserver observer) {
		if(!mailist.contains(observer))
			mailist.add(observer);
	}

	@Override
	public void detach(MailObserver observer) {
		mailist.remove(observer);	
	}
}
