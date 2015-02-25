package keys_four_six_and_seven;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class User {

	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private LinkedList<User> friends;
	private static final AtomicInteger count = new AtomicInteger(0);

	public User() {
		userId = count.incrementAndGet();
		friends = new LinkedList<User>();
	}

	public int getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addFirend(User friend) {
		friends.remove(friend);
		friends.add(friend);
	}

	public LinkedList<User> getAllFriends() {
		return friends;
	}

	public void removeFriend(User user) {
		friends.remove(user);
	}

	@Override
	public String toString() {
		return "User [userid=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + "]";
	}

}
