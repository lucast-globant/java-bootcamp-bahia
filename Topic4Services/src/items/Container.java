package items;

import java.util.ArrayList;
import java.util.List;

import notifications.MailListManager;

/* Contain a list on items on stock and offers*/

public class Container {

	private List<Item> items;

	public Container() {
		items = new ArrayList<Item>();

		Item i1 = new Product(20, " Plate ", 1);
		Item i2 = new Product(10, " Fork ", 2);
		Item i3 = new Product(8, " Spoon ", 3);
		Item i4 = new Product(12, " Glass ", 4);
		Item i5 = new Product(400, " TV ", 5);
		Item i6 = new Product(200, " Radio ", 6);

		items.add(i1);
		items.add(i2);
		items.add(i3);
		items.add(i4);
		items.add(i5);
		items.add(i6);

	}

	public void addItem(Item i) {

		this.items.add(i);
		MailListManager.getInstance().setMessage(" A new item/offer - CODE : " + i.getCode() + " was added to the container stock");

	}

	public void changePrice(int code, float price) {

		for (Item i : items)

			if (i.getCode() == code) {
				i.setPrice(price);
				MailListManager.getInstance().setMessage(" The price of item of code : " + code + " was changed to : $" + price);

				break;
			}

	}

	public String toString() {
		String resu = "";
		for (Item item : items) {
			resu += item.toString() + '\n';
		}
		return resu;
	}

	public List<Item> items() {
		return items;
	}
}
