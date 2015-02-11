package exercise1to6;


public abstract class PaymentType implements Payment{
	Discount discount;
	
	public void applyDiscount(){
		discount.makeDiscount();
	}


}
