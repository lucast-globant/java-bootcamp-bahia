package topic1.notifications;

import java.util.ArrayList;

public class Observable {

	private static ArrayList<Observer> observers;
	
	public Observable () {
		observers = new ArrayList<Observer>();
	}

	public static ArrayList<Observer> getItemObservers() {
		return observers;
	}
}
