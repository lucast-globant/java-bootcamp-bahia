package Manager;
//This interface should be implemented by all the classes that require to be notified when changes are made on an item

public interface ItemObserver {
	
	void getNotify(String message);
	
}
