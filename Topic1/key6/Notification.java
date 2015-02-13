package Topic1.key6;

/**
 * @author Jordan
 * a notification is a simple message
 */
public class Notification {
	private String message;
	
	//notification messages (constants)
	public static final String PRICE_CHANGED="PRICE_CHANGED";
	public static final String TRANSACTION_DONE="TRANSACTION_DONE";
	public static final String PRODUCT_ADDED="PRODUCT_ADDED";
	
	public Notification(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}

}
