/**
 * 
 */
package com.tcs.bean;

/**
 * @author Aniket
 *
 */
public class Admin {
	private int adminUserId;
	private String adminuserName;
	private String adminPassword;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminUserId, String adminuserName, String adminPassword) {
		super();
		this.adminUserId = adminUserId;
		this.adminuserName = adminuserName;
		this.adminPassword = adminPassword;
	}
	public int getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(int adminUserId) {
		this.adminUserId = adminUserId;
	}
	public String getAdminuserName() {
		return adminuserName;
	}
	public void setAdminuserName(String adminuserName) {
		this.adminuserName = adminuserName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
}
