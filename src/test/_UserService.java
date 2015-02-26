package test;

import static org.junit.Assert.*;

import org.junit.Test;

import API.UserService;
import Model.CustomerAccount;
import Model.CustomerService;
import Model.UserServiceFactory;
import Model.Users;

public class _UserService {

	@Test
	public void UserService_create_ANewCustomerAccountArrived() {
		UserService us=UserServiceFactory.getLocalService();
		CustomerService newcs=new CustomerAccount("jordan");
		us.create(newcs);
		CustomerService expectedCs;
		expectedCs = us.getUser("jordan");
		assertEquals(newcs, expectedCs);
	
	}

	@Test
	public void UserService_delete_ALessCustomerAccount() {
		UserService us=UserServiceFactory.getLocalService();
		CustomerService newcs=new CustomerAccount("jordan");
		CustomerService newcs2=new CustomerAccount("laura");
		us.create(newcs);
		us.create(newcs2);
		us.delete("laura");

		assertEquals(false, us.isTheUser("laura"));

	}
	
	@Test
	public void UserService_addFriend_ANewFriendContact() {
		UserService us=UserServiceFactory.getLocalService();
		CustomerService newcs=new CustomerAccount("jordan");
		CustomerService newcs2=new CustomerAccount("laura");
		us.create(newcs);
		us.create(newcs2);

		us.addFriend(newcs, newcs2);

		assertEquals(true, newcs.friends().contains(newcs2));

	}
	
	
}
