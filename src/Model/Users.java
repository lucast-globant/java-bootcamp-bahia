package Model;

import java.util.ArrayList;
import java.util.List;

import API.UserService;


/**
 * @author Jordan userService's implementation
 */
public class Users implements UserService {
	
	private List<CustomerService> usersList;
	
	public Users(){
		usersList=new ArrayList<CustomerService>();
	}

	@Override
	public void create(CustomerService user) {
		usersList.add(user);

	}

	@Override
	public CustomerService getUser(String userName){
		for (CustomerService customerAccount : usersList) {
			if(customerAccount.getUserName().equals(userName))
				return customerAccount;
		}
		return null;
	}

	@Override
	public void delete(String userName) {
		for(int i=0; i<usersList.size(); i++){
			if(usersList.get(i).getUserName().equals(userName))
				usersList.remove(i);
		}

	}

	@Override
	public void update(String userName, CustomerService userUpdate) {
		CustomerService oldCU=getUser(userName);
		oldCU=userUpdate;

	}
		
	public void addFriend(CustomerService user, CustomerService friend) {
		user.addFriend(friend);
	}

	public void giveALike(CustomerService user) {
		user.giveALike();

	}

	public void uploadProfilePhoto(CustomerService user,String url) {
		user.uploadPerfilPhoto(url);

	}

	@Override
	public boolean isTheUser(String userName) {
		if(getUser(userName)==null)
			return false;
		return true;
	}

}
