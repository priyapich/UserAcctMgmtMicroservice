package com.example.accessMgmt.Entities;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "User_Account")
public class UserAccount {

	public UserAccount() {
		// TODO Auto-generated constructor stub
	}
	@EmbeddedId
	private  UserAccountIdentity usrAccountIdentity;
	
	

	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "accountName", insertable=false, updatable=false,nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	
	private Account acct;
	
	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "userName", insertable=false, updatable=false,nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	
	private User user;
	
	
    public UserAccount(User user,Account acct) {
		
		this.acct = acct;
		this.user = user;
		this.usrAccountIdentity = new UserAccountIdentity(user.getUserName(),acct.getAccountName());
	}
    
    
	
	    public Account getAccount() {
	        return acct;
	    }

	

		public void setAccount(Account acct) {
	        this.acct = acct;
	    }
	    
	
	    
		
	   /**
		 * @return the acct
		 */
		public Account getAcct() {
			return acct;
		}




		/**
		 * @param acct the acct to set
		 */
		public void setAcct(Account acct) {
			this.acct = acct;
		}


		/**
		 * @return the user
		 */
		public User getUser() {
			return user;
		}


		/**
		 * @param user the user to set
		 */
		public void setUser(User user) {
			this.user = user;
		}




	@Override
		public String toString() {
			return String.format("   User Account   [UserName=%s,acctName=%s]", user.getUserName(),acct.getAccountName());
		}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass())
	            return false;
	 
	        UserAccount that = (UserAccount) o;
	        return Objects.equals(acct, that.acct) &&
	               Objects.equals(user, that.user);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(acct, user);
	    }

}
