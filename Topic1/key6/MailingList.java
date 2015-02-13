package Topic1.key6;

import java.util.ArrayList;
import java.util.List;


public class MailingList {
	
	private List<IObserver> observerList= new ArrayList<IObserver>();
	private Notification state;
	
	public Notification getState() {
		return state;
	}
	
	public void setState(Notification state) {
		this.state = state;
		stateChanged();
	}
	
	private void stateChanged() {
		for (IObserver iObserver : observerList) {
			iObserver.update(getState());
		}
		
	}
	
	public void attach(IObserver observer){
		observerList.add(observer);
	}
	
	public void detach(IObserver observer){
		observerList.remove(observer);
	}
	

}
