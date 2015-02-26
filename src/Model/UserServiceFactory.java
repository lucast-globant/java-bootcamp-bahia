package Model;

import API.UserService;

public class UserServiceFactory {

	private UserServiceFactory() {}  

	public static UserService getLocalService(){  
		return new Users();  
	}  

	public static UserService getRemoteService(){ 
		
		//TODO
//		return new UserServiceProxy(impl);  
		
		return null;
	}    

}
