package topic_1;

import java.util.ArrayList;

public class CreditCard implements Payment {
	
	private String name;
	private int creditNumber;
	
	public CreditCard(String name, int creditNumber) {
		this.name = name;
		this.creditNumber = creditNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

	@Override
	public float getDiscount(ArrayList<Article> articles) {
		float discount = 0;
		float total = 0;
		for (Article a : articles)
			total+=a.getPrice();
		discount = (float) (0.1 * total);
		return discount;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", creditNumber=" + creditNumber + "]";
	}

}
