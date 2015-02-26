package notifications;
import java.util.ArrayList;
import java.util.List;

public class MailListManager implements MailListSubject {

	private String message = "";
	private List<MarketManagerObserver> mailList = new ArrayList<MarketManagerObserver>();;
	private static MailListManager mlm = null;

	public static MailListManager getInstance() {
		if (mlm == null)
			mlm = new MailListManager();

		return mlm;
	}

	@Override
	public void addObserver(MarketManagerObserver mmObserver) {
		mailList.add(mmObserver);

	}

	@Override
	public void removeObserver(MarketManagerObserver mmObserver) {
		mailList.remove(mmObserver);
	}

	@Override
	public void notifyObservers() {

		for (MarketManagerObserver mmo : mailList)

			mmo.email(message);

	}

	public void setMessage(String msg) {
		this.message = msg;
		notifyObservers();
	}

}
