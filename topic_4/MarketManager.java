package topic_4;

import java.util.ArrayList;

public class MarketManager implements Observer {
	
	private ArrayList<String> mails;

	public MarketManager() {
		this.mails = new ArrayList<String>();
	}

	public ArrayList<String> getMails() {
		return mails;
	}

	@Override
	public void updateArticleAdded() {
		mails.add("An article has added.");
//		System.out.println("mail article");
	}

	@Override
	public void updatePriceChanged() {
		mails.add("A price has changed.");
//		System.out.println("mail price change");
	}

	@Override
	public void updateTransactionMade() {
		mails.add("A transaction was made.");
//		System.out.println("mail transaction");
		
	}
	
}
