package topic4;

//create user service for crud operations
public interface UserService {
	
	public void createUser (User u);
		
	public User readUser(int index);

	public void updateUser (int index, String name, String pass, String email) ;
	
	public void deleteUser(User u);

	public void addUserFriend (int index, User friend);
	
	public void deleteUserFriend (int index, User friend);
	
	public void addUserLike (User u, Photo p);
	
	public void deleteUserLike (User u, Photo p);
	
}
