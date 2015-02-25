package classes;

public class WebUserServiceResult {

	private int code;
	private String message;

	public WebUserServiceResult(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
