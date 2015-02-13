public class MarketManager implements MarketManagerObserver {

	String name;
	String branchName;

	public MarketManager(String name, String branchName) {
		super();
		this.name = name;
		this.branchName = branchName;
	}

	@Override
	public void email(String msg) {

		System.out.println(name + " of " + branchName + " INBOX ----- MESSAGE : " + msg);

	}

}
