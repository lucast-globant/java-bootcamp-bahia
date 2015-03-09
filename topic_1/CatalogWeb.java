package topic_1;

import java.util.ArrayList;
import java.util.List;

public class CatalogWeb implements MailSubject {
	private static int idCatalog=0;
	private ArrayList<Article> articles;
	private List<MailObserver> mailist;
	
	public CatalogWeb() {
		articles = new ArrayList<Article>();
		mailist = new ArrayList<MailObserver>();
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
		float oldPrice = a.getPrice();
		a.setPrice(newPrice);
		doNotify("A price has changed "+a.getInformation() +"\nThe old price was "+oldPrice);
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

	@Override
	public void doNotify (String message) {
		for(MailObserver mail : mailist)
			mail.update(message);		
	}

	@Override
	public void attach (MailObserver observer) {
		if(!mailist.contains(observer))
			mailist.add(observer);
	}

	@Override
	public void detach(MailObserver observer) {
		mailist.remove(observer);	
	}
}
