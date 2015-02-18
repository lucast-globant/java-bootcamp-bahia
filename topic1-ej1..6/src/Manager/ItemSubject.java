package Manager;

//This interface should be implemented by all the items that need to be observed
public interface ItemSubject {
	void addItemObserver(ItemObserver itemObserver);

	void removeItemObserver(ItemObserver itemObserver);

	void doNotify(String message);
}
