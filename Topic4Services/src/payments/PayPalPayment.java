package payments;

import discounts.CheapestItemFreeDiscount;
import discounts.Discount;

public class PayPalPayment implements Payment {

	private String email;
	private String password;
	private Discount discount;

	public PayPalPayment(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		discount = new CheapestItemFreeDiscount();
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
	public void pay(float total) {

	}

	@Override
	public Discount getDiscount() {
		return discount;
	}

}
