package repositoryServices;

import java.util.List;

public class RepositoryServiceImp implements RepositoryService {

	private Container container;

	public RepositoryServiceImp(Container container) {
		this.container = container;
	}

	@Override
	public Item findItem(String name, String category) {

		for (Item i : container.items())

			if (i.getName().equals(name))

				return i;

		return null;

	}

	@Override
	public List<Item> getItems() {
		return container.items();
	}

}
