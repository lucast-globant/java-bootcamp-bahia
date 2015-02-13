package topic_1;

import java.util.ArrayList;

public class Cash implements Payment {

	@Override
	public float getDiscount(ArrayList<Article> articles) {
		float discount = 0;
		if (articles.size()>0) {
			discount = articles.get(0).getPrice();
			for (int i=1; i<=articles.size(); i++) {
				if (articles.get(i).getPrice() > discount)
					discount = articles.get(i).getPrice();
			}
		}
		return (float) (0.9 * discount);
	}
	
}
