package Topic1.key1;

import Topic1.key2.DiscountPaypal;

public class PaypalAccount extends FinancialPayment{
	
	private String username;
	private String password;
	private String email;
	
	
	public PaypalAccount(String username, String password, String email, String bal) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		setBalance(bal);
		
		discount=new DiscountPaypal();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	
}
