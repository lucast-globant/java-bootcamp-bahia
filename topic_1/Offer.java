package topic_1;

import java.util.ArrayList;

public class Offer implements Article {
	private String name;
	private float price;
	private ArrayList<Article> offer;
	private int idArticle;
	
	public Offer(String name, float price, ArrayList<Article> offer) {
		this.name = name;
		this.price = price;
		this.offer = offer;
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

	public ArrayList<Article> getOffer() {
		return offer;
	}

	public void setOffer(ArrayList<Article> offer) {
		this.offer = offer;
	}
	
	@Override
	public String getInformation() {
		String result = "Id Article: "+ idArticle + " Offer name: " + name + " price: $" + price + "\n\t";
		for (int i=0; i<offer.size()-1;i++)
			result = result.concat(offer.get(i).getInformation()+"\n\t");
		result = result.concat(offer.get(offer.size()-1).getInformation());
		return result;
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