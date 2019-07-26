package com.db.employeemanagementsystem.bean;

public class LoginBean {
	private String UserName;
	private String password;
	
	public LoginBean(String userName, String password) {
		super();
		UserName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "LoginBean [UserName=" + UserName + ", password=" + password + "]";
	}
	
}
