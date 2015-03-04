package test.java;

import static org.junit.Assert.*;
import model.User;
import model.servicesImpl.LocalUserService;
import model.servicesImpl.UserServiceFactory;

import org.junit.Test;

import api.UserService;

public class LocalUserServiceTest {

	@Test
	public void UserService_create_ANewCustomerAccountArrived() {
		UserService us=UserServiceFactory.getLocalService();
		User newcs=new User("jordan");
		us.create(newcs);
		User expectedCs;
		expectedCs = us.getUser("jordan");
		assertEquals(newcs, expectedCs);
	
	}

	@Test
	public void UserService_delete_ALessCustomerAccount() {
		UserService us=UserServiceFactory.getLocalService();
		User newcs=new User("jordan");
		User newcs2=new User("laura");
		us.create(newcs);
		us.create(newcs2);
		us.delete("laura");

		assertEquals(false, us.isTheUser("laura"));

	}
	
	@Test
	public void UserService_addFriend_ANewFriendContact() {
		UserService us=UserServiceFactory.getLocalService();
		User newcs=new User("jordan");
		User newcs2=new User("laura");
		us.create(newcs);
		us.create(newcs2);

		us.addFriend(newcs, newcs2);

		assertEquals(true, newcs.friends().contains(newcs2));

	}
	
	
}
