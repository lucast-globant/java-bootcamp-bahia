package cartServices;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private static Counter Counter = null;
	private static final AtomicInteger count = new AtomicInteger(0);

	private Counter() {
	}

	public static Counter getInstance() {
		if (Counter == null) {
			Counter = new Counter();
		}
		return Counter;
	}

	public int getUniqueId() {
		return count.incrementAndGet();
	}

}
