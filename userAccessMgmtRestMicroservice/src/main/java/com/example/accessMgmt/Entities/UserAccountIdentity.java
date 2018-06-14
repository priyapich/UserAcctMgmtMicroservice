package com.example.accessMgmt.Entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class UserAccountIdentity implements Serializable{

	@NotNull
	private String accountName;
	@NotNull
	private String userName;
	
	public UserAccountIdentity() {
		// TODO Auto-generated constructor stub
	}
	
	public UserAccountIdentity(String userName,String accountName) {
	this.accountName = accountName;
	this.userName = userName;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the userName
	 */
	public String getSystemName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setSystemName(String userName) {
		this.userName = userName;
	}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass()) 
	            return false;
	 
	        UserAccountIdentity that = (UserAccountIdentity) o;
	        return Objects.equals(accountName, that.accountName) && 
	               Objects.equals(userName, that.userName);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(accountName, userName);
	    }
	
}
