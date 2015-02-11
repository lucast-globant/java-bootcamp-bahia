package exercise1to6;

public abstract class PaymentType implements Payment {
	Discount discount;

	public PaymentType(Discount discount) {
		this.discount = discount;
	}

	public Discount getDiscount() {
		return discount;
	}

}
