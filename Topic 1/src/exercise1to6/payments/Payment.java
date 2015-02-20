package exercise1to6.payments;

import exercise1to6.discount.Discount;



public interface Payment {
	public Discount getDiscount();
	public void pay(double total);

}
