package com.tnsif.adminservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
@Entity
public class Admin {
	
	@Id
	private int adminid;
	private String username;
	private String password;
	private String email;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminid, String username, String password, String email, LocalDateTime createdAt) {
		super();
		this.adminid = adminid;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", username=" + username + ", password=" + password + ", email=" + email+ "]";
	}
	
}
