package key_four;

public class SingletonCounter {

	private static SingletonCounter singletonCounter = null;
	private int counter = 0;

	private SingletonCounter() {
	}

	public static SingletonCounter getInstance() {
		if (singletonCounter == null) {
			singletonCounter = new SingletonCounter();
		}
		return singletonCounter;
	}

	public int getUniqueId() {
		counter++;
		return counter;
	}
}
