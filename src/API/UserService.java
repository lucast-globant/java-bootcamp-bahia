package API;

import Model.CustomerService;


/**
 * @author Jordan
 * sevices to manage users/customers
 */
public interface UserService {

	//CRUD
	public void create(CustomerService user); 

	public CustomerService getUser(String userName);
	
	public boolean isTheUser(String userName);

	public void delete(String userName);

	public void update(String userName, CustomerService userUpdate);		
	
	//rest of operations
	public void addFriend(CustomerService user, CustomerService friend);

	public void giveALike(CustomerService user);

	public void uploadProfilePhoto(CustomerService user,String url);

}

