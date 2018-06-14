package com.infotech.pem.model;

/**
 * This is model class for user. It take data for instance variable.
 * @author Bhushan Medage
 *
 */
public class User {
	
	/**
	 * This is name of user
	 */
	private String name;
	
	/**
	 * This is username of user
	 */
	private String loginName;
	
	/**
	 * This is password for user
	 */
	private String password;
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String email;
	private String address;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean valid;
	private int userid;	
	
	public boolean isValid() {
        return valid;
	}

     public void setValid(boolean newValid) {
        valid = newValid;
	}	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

}
