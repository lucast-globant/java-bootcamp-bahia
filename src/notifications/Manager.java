package notifications;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Observer {
	private List<String> mailingList;

	public Manager() {
		mailingList = new ArrayList<>();
	}

	@Override
	public void update(String message) {
		mailingList.add(message);
	}

}
