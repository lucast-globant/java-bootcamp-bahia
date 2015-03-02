package ex4;

import java.util.HashSet;
import java.util.Set;

public class User {
	private static int uniqueID = 1;
	private int id;
	private String name;
	private String password;
	private Set<User> friends;

	public User() {
		this.id = getNewUniqueID();
		friends = new HashSet<User>();
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.id = getNewUniqueID();
		friends = new HashSet<User>();
	}

	private int getNewUniqueID() {
		return uniqueID++;
	}

	public boolean equals(User compare) {
		return compare.getID() == this.getID();
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<User> getFriends() {
		return friends;
	}

	public void deleteFriend(User friend) {
		if (friends.contains(friend) && friend.getFriends().contains(this)) {
			friends.remove(friend);
			friend.deleteFriend(this);
		}
		if (friends.contains(friend) && !friend.getFriends().contains(this)) {
			friends.remove(friend);
		}
		if (!friends.contains(friend) && friend.getFriends().contains(this))
			friend.deleteFriend(this);
	}

	public void addFriend(User friend) {
		if (!friends.contains(friend) && !friend.getFriends().contains(this)) {
			friends.add(friend);
			friend.addFriend(this);
		}
		if (!friends.contains(friend) && friend.getFriends().contains(this)) {
			friends.add(friend);
		}
		if (friends.contains(friend) && !friend.getFriends().contains(this))
			friend.addFriend(this);
	}
}
