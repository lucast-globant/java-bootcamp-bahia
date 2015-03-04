package model.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import model.User;
import api.UserService;




/**
 * @author Jordan userService's implementation
 */
public class LocalUserService implements UserService {
	
	private List<User> usersList;
	
	public LocalUserService(){
		usersList=new ArrayList<User>();
	}

	@Override
	public void create(User user) {
		usersList.add(user);

	}

	@Override
	public User getUser(String userName){
		for (User customerAccount : usersList) {
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
	public void update(String userName, User userUpdate) {
		User oldCU=getUser(userName);
		oldCU=userUpdate;

	}
		
	public void addFriend(User user, User friend) {
		user.addFriend(friend);
	}

	public void giveALike(User user) {
		user.giveALike();

	}

	public void uploadProfilePhoto(User user,String url) {
		user.uploadPerfilPhoto(url);

	}

	@Override
	public boolean isTheUser(String userName) {
		if(getUser(userName)==null)
			return false;
		return true;
	}

}
