package topic_4;

import java.util.ArrayList;

public class CatalogWeb extends ConcreteSubject {
	private static int idCatalog=0;
	private ArrayList<Article> articles;
	
	public CatalogWeb() {
		articles = new ArrayList<Article>();
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	public void addArticle (Article a) {
		idCatalog++;
		a.setIdArticle(idCatalog);
		articles.add(a);
	}
	
	public void removeArticle (Article a) { 
		articles.remove(a);
	}
	
	public void changePrice (Article a, float newPrice) {
		a.setPrice(newPrice);
		notifyPriceChanged();
	}
	
	public String informationCatalog() {
		String result = "";
		if (!articles.isEmpty()) {
			for (int i=0; i<articles.size()-1;i++)
				result = result.concat(articles.get(i).getInformation()+"\n");
			result = result.concat(articles.get(articles.size()-1).getInformation());
		}
		else
			result = "No information";
		return result;
	}

}
