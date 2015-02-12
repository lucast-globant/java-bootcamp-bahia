/*A concrete form to pay ; with PayPal*/

public class PayPalPayment implements Payment {

	private String email;
	private String password;

	public PayPalPayment(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
	public void pay(int total) {
		// TODO Auto-generated method stub

	}

}
