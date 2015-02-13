package topic_1;

import java.util.ArrayList;

public class ConcreteSubject implements SubjectObservable {
	
	private ArrayList<Observer> observers;
	
	public ConcreteSubject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyArticleAdded() {
		for (Observer o: observers) 
			o.updateArticleAdded();
	}

	@Override
	public void notifyPriceChanged() {
		for (Observer o: observers)
			o.updatePriceChanged();		
	}

	@Override
	public void notifyTransactionMade() {
		for (Observer o: observers)
			o.updateTransactionMade();
	}
	
}
