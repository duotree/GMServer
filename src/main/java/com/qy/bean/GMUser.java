package com.qy.bean;

public class GMUser {

	private int id;
	
	private String username;
	
	private String password;
	
	private int pri;
	
	public GMUser() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPri() {
		return pri;
	}

	public void setPri(int pri) {
		this.pri = pri;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
