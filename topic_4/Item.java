package topic_4;

public class Item implements Article {
	
	private String name;
	private float price;
	private int idArticle;
	
	public Item(String name, float price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void setPrice(float price) {
		this.price = price;		
	}

	@Override
	public String getInformation() {
		return "Id Article: "+ idArticle + " Item name: " + name + " price: $" + price;
	}

	@Override
	public int getIdArticle() {
		return idArticle;
	}

	@Override
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

}
