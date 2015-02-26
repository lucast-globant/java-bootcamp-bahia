package classes;

import interfaces.Item;
import java.util.ArrayList;
import java.util.List;

public class Offer implements Item {

	private String name;
	private String code;
	private double value;
	private List<Item> items;

	public Offer(String name, String code, double value) {
		this.name = name;
		this.code = code;
		this.value = value;
		items = new ArrayList<Item>();
	}

	public void addItem(Item it) {
		items.add(it);
	}

	public void removeItem(Item it) {
		items.remove(it);
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
		String res = "*" + name + "\t$" + value + '\n';
		for (Item it : items) {
			res = res + '\t' + it.display();
		}
		return res;
	}
}
