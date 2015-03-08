package com.globant.app.Domain.Entities;

import java.util.HashSet;
import java.util.Set;

public class Photo {

	private int id;
	private String path;
	private User owner;
	private Set<User> likes;

	public Photo() {
		likes = new HashSet<User>();
	}

	public Photo(int id, String path, User owner) {
		this();
		this.id = id;
		this.path = path;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<User> getLikes() {
		return likes;
	}

	public void like(User user) {
		likes.add(user);
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
