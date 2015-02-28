package Manager;

import java.util.ArrayList;

//This class will hold all the observers list
public class ObserversList {

	// Here we store all the observers

	private static ArrayList<ItemObserver> itemObservers = new ArrayList<ItemObserver>();

	public static ArrayList<ItemObserver> getItemObservers() {
		return itemObservers;
	}
}