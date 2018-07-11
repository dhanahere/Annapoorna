package com.dhana.Annapoorna.entity;

public class Login {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [loginname=" + username + ", password=" + password + "]";
	}
	public Login()
	{
		
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	

}
