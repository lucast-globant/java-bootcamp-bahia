package key_two;

public class Building {

	private float price;
	private float coveredArea;
	private float groundSize;

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getcoveredArea() {
		return coveredArea;
	}

	public void setCoveredArea(int coveredArea) {
		this.coveredArea = coveredArea;
	}

	public float getGroundSize() {
		return groundSize;
	}

	public void setGroundSize(float groundSize) {
		this.groundSize = groundSize;
	}

	public String toString() {
		return "price:" + price + ", area:" + coveredArea + ", ground size:" + groundSize;
	}

}
