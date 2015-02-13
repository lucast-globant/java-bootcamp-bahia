package topic_1;

public interface SubjectObservable {
	
	public void attach (Observer o);
	public void detach (Observer o);
	public void notifyArticleAdded();
	public void notifyPriceChanged();
	public void notifyTransactionMade();
	
}
