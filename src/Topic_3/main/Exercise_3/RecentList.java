package Topic_3.main.Exercise_3;

import java.util.*;

public class RecentList<T> extends ArrayList<T>{
	private int capacity;

	public RecentList(int capacity){
		super(capacity + 1);
		this.capacity = capacity;
	}

	@Override public boolean add(T element){
		if (this.contains(element)) {
			this.remove(this.indexOf(element));
			super.add(element);
		} else {
			super.add(element);
			if (this.size() > capacity)
				this.remove(0);
		}
		return true;
	}

}

