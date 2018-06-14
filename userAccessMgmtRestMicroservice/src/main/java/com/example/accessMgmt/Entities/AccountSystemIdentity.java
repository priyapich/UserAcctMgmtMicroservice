package com.example.accessMgmt.Entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class AccountSystemIdentity implements Serializable{

	@NotNull
	private String accountName;
	@NotNull
	private String sysName;
	
	public AccountSystemIdentity() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountSystemIdentity(String acctName,String sysName) {
	this.accountName = acctName;
	this.sysName = sysName;
	}

	/**
	 * @return the acctName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param acctName the acctName to set
	 */
	public void setAccountName(String acctName) {
		this.accountName = acctName;
	}

	/**
	 * @return the sysName
	 */
	public String getSysName() {
		return sysName;
	}

	/**
	 * @param sysName the sysName to set
	 */
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass()) 
	            return false;
	 
	        AccountSystemIdentity that = (AccountSystemIdentity) o;
	        return Objects.equals(accountName, that.accountName) && 
	               Objects.equals(sysName, that.sysName);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(accountName, sysName);
	    }
	
}
