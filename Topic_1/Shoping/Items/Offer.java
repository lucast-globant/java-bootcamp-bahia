package Items;

import java.util.ArrayList;
import java.util.List;

public class Offer extends Item {
	protected List<Item> items;

	public Offer(String n, double p) {
		super(n, p);
		items = new ArrayList<Item>();
	}

	public Offer(String n, double p, List<Item> i) {
		super(n, p);
		items = i;
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public List<Item> getList() {
		return items;
	}

	public void setList(List<Item> l) {
		items = l;
	}

	public String toString() {
		String s = "";
		s += "* " + name + " ....... $ " + price + "\n";
		for (Item i : items) {
			s += "\t" + i.toString();
		}
		return s;
	}

}
