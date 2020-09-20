package com.onlinelibrary.model;

public class UserModel {
	private String username;
	private String password;

	public UserModel() {
		super();
	}

	public UserModel(String username, String password) {
		super();
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

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", Password=" + password + "]";
	}

}
