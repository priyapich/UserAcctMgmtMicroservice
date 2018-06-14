package com.example.accessMgmt.Entities;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Acc_Sys")
public class AccountSystem {

	public AccountSystem() {
		// TODO Auto-generated constructor stub
	}
	

	@EmbeddedId
	private AccountSystemIdentity actSysIdentity;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "accountName",insertable=false, updatable=false, nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@MapsId("acctName")
	private Account acct;
	
	@ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "sysName", insertable=false, updatable=false,nullable = false)
	 @OnDelete(action = OnDeleteAction.CASCADE)
	//@MapsId("systemName")
	private SystemInfo sysInfo;
	
	
    public AccountSystem(Account acct,SystemInfo sysInfo) {
		
		this.acct = acct;
		this.sysInfo = sysInfo;
		this.actSysIdentity = new AccountSystemIdentity(acct.getAccountName(), sysInfo.getSysName());
	}
    
        public Account getAccount() {
	        return acct;
	    }


  	  /**
  	 * @return the actSysIdentity
  	 */
  	public AccountSystemIdentity getActSysIdentity() {
  		return actSysIdentity;
  	}

  	/**
  	 * @param actSysIdentity the actSysIdentity to set
  	 */
  	public void setActSysIdentity(AccountSystemIdentity actSysIdentity) {
  		this.actSysIdentity = actSysIdentity;
  	}


		public void setAccount(Account acct) {
	        this.acct = acct;
	    }
	    
	
	    public SystemInfo getSystemInfo() {
	        return sysInfo;
	    }

	    public void setSystemInfo(SystemInfo sysInfo) {
	        this.sysInfo = sysInfo;
	    }
		
	   @Override
		public String toString() {
			return String.format(" Account System [acctName=%s, sysName=%s]", acct.getAccountName(),sysInfo.getSysName());
		}

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass())
	            return false;
	 
	        AccountSystem that = (AccountSystem) o;
	        return Objects.equals(acct, that.acct) &&
	               Objects.equals(sysInfo, that.sysInfo);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(acct, sysInfo);
	    }

}
