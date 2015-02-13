public class Product implements Item {

	private String name;
	private int code;
	private double value;

	public Product(String n, int c, double v) {
		name = n;
		code = c;
		value = v;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String display() {
		return "-" + name + "\t$ " + value + '\n';
	}
}
