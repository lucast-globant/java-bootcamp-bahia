package topic_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private static AtomicInteger counter = new AtomicInteger(1);
	
	public static int getCount() {
		return counter.getAndIncrement();
	}
	
}