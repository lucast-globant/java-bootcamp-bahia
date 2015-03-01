package topic1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private static AtomicInteger counter = new AtomicInteger (0);

	public static int getCount() {
		return counter.getAndIncrement();
	} 
	
	public static int get() {
		return counter.get();
	} 
	
}
