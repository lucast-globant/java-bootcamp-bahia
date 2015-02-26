package classes;

import java.util.concurrent.Semaphore;

public class Counter {

	private static Counter instance = null;
	private int count;
	private Semaphore semaphore;

	private Counter() {
		count = 0;
		semaphore = new Semaphore(1);
	}

	public static Counter getInstance() {
		if (instance == null) {
			instance = new Counter();
		}
		return instance;
	}

	public int nextValue() {
		int num = 0;
		try {
			semaphore.acquire();
			num = ++count;
			semaphore.release();
		} catch (InterruptedException e) {
		}
		return num;
	}
}
