package Mailist;

import Observer.Observer;

public class MarketManager implements Observer {
	private String name;

	public MarketManager(String n) {
		name = n;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void update(String s) {
		System.out.println(s);
	}

}
