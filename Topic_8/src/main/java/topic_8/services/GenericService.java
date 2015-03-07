package topic_8.services;

import java.util.List;

public interface GenericService<T> {
	public T create(T t);

	public T read(Integer id);

	public T update(T t);

	public void delete(Integer id);

	public List<T> findAll();
}
