package repositoryServices;

import java.util.List;

public class RepositoryProxy implements RepositoryService {

	RepositoryServiceImp repositoryImp;

	@Override
	public Item findItem(String name, String category) {

		return repositoryImp.findItem(name, category);
	}

	@Override
	public List<Item> getItems() {
		return repositoryImp.getItems();
	}

}
