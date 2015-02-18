package ShoppingCart.PaymentMethods;

import java.util.List;

import ShoppingCart.Item;
import ShoppingCart.PaymentMethod;



public class CreditCard implements PaymentMethod {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCard(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
	    this.dateOfExpiry=expiryDate;
    }

    @Override
    public void pay(float amount, List<Item> items, int id) {
    	amount = amount-(amount/10);
    	System.out.println(id +"     "+ amount +"      credit/debit card");
    }

}
