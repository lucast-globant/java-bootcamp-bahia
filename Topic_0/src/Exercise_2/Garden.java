package Exercise_2;

public class Garden {
	private boolean pool;

	public Garden(boolean p) {
		pool = p;
	}

	public void setPool(boolean p) {
		pool = p;
	}

	public boolean getPool() {
		return pool;
	}

	public String toString() {
		if (pool = true)
			return "Garden with pool";
		else
			return "Garden";
	}
}
