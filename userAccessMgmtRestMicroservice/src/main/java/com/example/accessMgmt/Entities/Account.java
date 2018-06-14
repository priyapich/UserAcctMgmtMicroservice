package com.example.accessMgmt.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Account")
public class Account  {
	@Id
	private String accountName;
	

	private String accountId;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountName,String accountId) {
		this.accountName = accountName;
		this.accountId = accountId;
	}


	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}


	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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


	

	

	
/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountName")
	public AccountSystem getAccountSystem() {
		return acctSystem;
	}
	
	public void setAccountSystem(AccountSystem acctSys) {
		this.acctSystem =acctSys;
	}
    
	
	public Account(AccountSystem acctSystem, String accountName) {
		this.acctSystem = acctSystem;
		this.accountName = accountName;
	}*/


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(" Account [id=%s, name=%s]", accountId,accountName);
	}






}
