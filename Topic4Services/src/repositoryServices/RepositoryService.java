package repositoryServices;

import java.util.List;

public interface RepositoryService {

	public Item findItem(String name, String category);

	public List<Item> getItems();

}
