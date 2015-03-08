package com.globant.app.Domain.Entities;

import java.util.*;

public class User {
	private String username;
	private String password;

	private Cart storedCart;
	private int id;

	private Set<User> friends;

	private List<Photo> photos;

	public User(String username, String password) {
		friends = new HashSet<User>();
		photos = new ArrayList<Photo>();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cart getStoredCart() {
		return storedCart;
	}

	public void setStoredCart(Cart storedCart) {
		this.storedCart = storedCart;
	}

	public int getId() {
		return id;
	}

	public Set<User> getFriends() {
		return friends;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

}
