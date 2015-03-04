package api;

import model.User;




/**
 * @author Jordan
 * sevices to manage users/customers
 */
public interface UserService {

	//CRUD
	public void create(User user); 

	public User getUser(String userName);
	
	public boolean isTheUser(String userName);

	public void delete(String userName);

	public void update(String userName, User userUpdate);		
	
	//rest of operations
	public void addFriend(User user, User friend);

	public void giveALike(User user);

	public void uploadProfilePhoto(User user,String url);

}

