public class Counter {

	private static Counter instance = null;
	private int count;

	private Counter() {
		count = 0;
	}

	public static Counter getInstace() {
		if (instance == null) {
			instance = new Counter();
		}
		return instance;
	}

	public int nextValue() {
		return ++count;
	}
}
