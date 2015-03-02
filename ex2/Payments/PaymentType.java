package ex2.Payments;

import ex2.Discount.*;

public abstract class PaymentType implements Payment {
	private Discount discount;

	public PaymentType(Discount discount) {
		this.discount = discount;
	}

	public Discount getDiscount() {
		return discount;
	}

}
