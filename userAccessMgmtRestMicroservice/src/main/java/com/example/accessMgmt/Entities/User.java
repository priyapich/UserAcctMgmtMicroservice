package com.example.accessMgmt.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")

public class User  {

	
	
	private String sex ;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String userName;
	
	public User( String userName,String sex) {
		
			this.userName = userName;
			this.sex = sex;
		}

	
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}


	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

		@Override
		public String toString() {
			return String.format(" User [id=%s, userName=%s]", sex, userName);
		}
	
		
	
}