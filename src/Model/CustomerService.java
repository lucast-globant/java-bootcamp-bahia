package Model;

import java.util.List;

import API.CartService;
import Model.paymentMethods.Cash;
import Model.paymentMethods.CreditCard;
import Model.paymentMethods.FinancialPayment;
import Model.paymentMethods.PaypalAccount;

/**
 * @author Jordan
 * services that a customer expose
 */
public interface CustomerService {
	
		public CartService getCart();
		
		public String getUserName();
		
		//payment methods
		public void setCreditCard(CreditCard card);
		
		public void setPaypalAccount(PaypalAccount account);
		
		public void addCash(Cash amount);
		
		public FinancialPayment getCreditCard();
		
		public FinancialPayment getPaypalAccount();
		
		public FinancialPayment getCash();
		
		//social methods	
		public void addFriend(CustomerService friend);
		
		public List<CustomerService> friends();
		
		public void giveALike();
		
		public void uploadPerfilPhoto(String url);


		

}
