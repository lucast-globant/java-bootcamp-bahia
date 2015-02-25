package topic_4;

public interface CartService {
	
	public void addArticle (Article a);
	public void removeArticle (Article a);
	public void addPayment (Payment payment);
	public void removePayment ();
	public Transaction checkOut();
	public float totalPrize();
	public String getDataArticles();
	
}
