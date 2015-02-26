package shoppingCart;

import java.util.ArrayList;

public class SparseArrayList<E> extends ArrayList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void add(int index, E element) {
		// If there is already an object in the given index, it replaces the
		// existing object with the new one. Else, it inserts nulls between the
		// size and the given index
		if (index >= 0 && index < size()) {
			super.set(index, element);
		} else {
			int insertNulls = index - size();
			for (int i = 0; i < insertNulls; i++) {
				super.add(null);
			}
			super.add(element);
		}
	}
}
