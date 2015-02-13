/*A concrete form to pay ; with Credit Card*/

public class CredictCardPayment implements Payment {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	private Discount discount;

	public CredictCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
		discount = new TenPercentDiscount();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(float total) {

		System.out.println("Your purchase in credit card for $" + total + " was succed !");
		System.out.println("You have a 10% for buying with credit card");
		System.out.println("Calculating new cost..");

	}

	@Override
	public Discount getDiscount() {

		return discount;

	}

}
