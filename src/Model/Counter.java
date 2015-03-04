package model;



/**
 * @author Jordan 
 * a autoincrement counter, only one counter per page is allowed
 */
public class Counter {
	private static int count; // acumulador
	private static Counter counter;

	/**
	 * prevent clients from using the constructor, only one its allowed
	 */
	private Counter() {
		count = 0;
	}

	/**
	 * Singleton instance
	 * 
	 * @return
	 */
	public static Counter getCounterInstance() {
		if (counter == null)
			counter = new Counter();
		return counter;
	}

	public int next() {
		return ++count;
	}

	public static int getCount() {
		return count;
	}
	
	

}
