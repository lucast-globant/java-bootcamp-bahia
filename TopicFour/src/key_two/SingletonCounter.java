package key_two;

import java.util.concurrent.atomic.AtomicInteger;

public class SingletonCounter {

	private static SingletonCounter singletonCounter = null;
	private static final AtomicInteger count = new AtomicInteger(0);

	private SingletonCounter() {
	}

	public static SingletonCounter getInstance() {
		if (singletonCounter == null) {
			singletonCounter = new SingletonCounter();
		}
		return singletonCounter;
	}

	public int getUniqueId() {
		return count.incrementAndGet();
	}
}
