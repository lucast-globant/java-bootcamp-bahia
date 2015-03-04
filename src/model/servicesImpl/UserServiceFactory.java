package model.servicesImpl;

import api.UserService;


public class UserServiceFactory {

	private UserServiceFactory() {}  

	public static UserService getLocalService(){  
		return new LocalUserService();  
	}  

	public static UserService getRemoteService(){ 
		
		//TODO
//		return new UserServiceProxy(impl);  
		
		return null;
	}    

}
