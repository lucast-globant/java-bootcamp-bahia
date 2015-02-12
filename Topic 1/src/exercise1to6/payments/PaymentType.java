package exercise1to6.payments;

import exercise1to6.discount.Discount;

public abstract class PaymentType implements Payment {
	private Discount discount;

	public PaymentType(Discount discount) {
		this.discount = discount;
	}

	public Discount getDiscount() {
		return discount;
	}

}
