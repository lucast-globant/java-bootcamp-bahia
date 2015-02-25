import java.util.List;


public class UserServiceImp {
	
	private List<User> usersList;
	
	public void addUser(User user){
		usersList.add(user);
	}
	
	public void deleteUser(User user){
		usersList.remove(user);
	}
	
	public int numberOfUser(){
		return usersList.size();
	}
	
	public User getUser(int index){
		return usersList.get(index);
	}
	
}
