package userServices;

public interface UserService {

	public void create(String id, String pass);

	public void read(String id);

	public void delete(String id);

	public void update(String id, String property, String value);

	public void uploadPhoto(String id, Photo photo);

	public void likePhoto(String id, Photo photo);

	public void addFriends(String idUser, String idFriend);

}
