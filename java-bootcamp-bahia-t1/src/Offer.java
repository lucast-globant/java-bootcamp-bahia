import java.util.ArrayList;
import java.util.List;

/* An Offer : include other individual products or other offers*/

@SuppressWarnings("unused")
public class Offer implements Item {

	private float price;
	private String name;
	private String code;
	private List<Item> items;

	public Offer(String name, String code, List<Item> items) {
		this.name = name;
		this.code = code;
		this.items = items;
	}

	@Override
	public float getPrice() {
		int price = 0;

		for (Item i : items)

			price += i.getPrice();

		return price;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;

	}

	@Override
	public void setPrice(float price) {
		this.price = price;

	}

	public String toString() {
		String resu = "* Offer Name: " + name + " ....... " + " $" + getPrice() + "\n";
		for (Item item : items) {
			resu += "\t" + item.toString() + "\n";
		}
		return resu;
	}

}
