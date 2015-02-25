package classes;

import interfaces.Item;

public class Product implements Item {

	private String name;
	private String code;
	private double value;

	public Product(String name, String code, double value) {
		this.name = name;
		this.code = code;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
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
