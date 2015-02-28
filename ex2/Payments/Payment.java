package ex2.Payments;

import ex2.Discount.*;



public interface Payment {
	public Discount getDiscount();
	public void pay(double total);

}
