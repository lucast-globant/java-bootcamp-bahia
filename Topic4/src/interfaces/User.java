package interfaces;

import java.awt.Image;

public interface User {

	public void updateUser(String mail, String password, String name, String lastName);

	public void setPhoto(Image photo);

	public String getMail();

	public String getPassword();

	public String getName();

	public String getLastName();

	public void addFriend(User user);

	public boolean areFriends(User user);

	public void addLikePhoto(User user);
}
