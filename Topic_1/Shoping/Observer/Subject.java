package Observer;

public interface Subject {
	public void addObserver(Observer o);

	public void removeObserver(Observer o);

	public void doNotify(String s);
}
