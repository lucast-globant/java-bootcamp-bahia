package topic_1;

import java.util.ArrayList;

public class PayPal implements Payment{
	
	private String email;
	private String password;
	
	public PayPal(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public float getDiscount(ArrayList<Article> articles) {
		float discount = 0;
		if (articles.size()>0) {
			discount = articles.get(0).getPrice();
			for (int i=1; i<=articles.size(); i++) {
				if (articles.get(i).getPrice() < discount)
					discount = articles.get(i).getPrice();
			}
		}
		return discount;
	}
	
}
