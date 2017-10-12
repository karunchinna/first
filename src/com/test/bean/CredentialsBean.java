package com.test.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="User_Credentials")
public class CredentialsBean {

	@Id
	@NotEmpty(message="user Id Should not be EMPTY")
	private String userID;
	@NotEmpty(message="plz enter password")
	@Size(min=4, max=20)
	private String password;
	@NotEmpty(message="Select user type")
	private String userType;
	
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "CredentialsBean [userID=" + userID + ", password=" + password
				+ ", userType=" + userType + "]";
	}
	
	
}
