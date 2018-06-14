package com.example.accessMgmt.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SystemInfo")
public class SystemInfo {

		@Id
	  	private String sysName;
		
		private String description;
		
	//	private Acct_System acctSystem;
		
		
		 
	/*	public SystemInfo(Acct_System acctSystem, String name) {
			
			this.acctSystem = acctSystem;
			this.sysName = name;
		}*/
		
		public SystemInfo(String name,String desc) {
			sysName = name;
			description = desc;
			
		}
		public SystemInfo() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	/*	@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "sysName")
		public Acct_System getAccountSystemDetail() {
			return acctSystem;
		}
		
		public void setAccountSystemDetail(Acct_System acctSys) {
			this.acctSystem =acctSys;
		}*/
	    
	    
		@Override
		public String toString() {
			return String.format(" System [ name=%s ,description =%s]", sysName,description);
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

				/**
				 * @return the description
				 */
				public String getDescription() {
					return description;
				}

				/**
				 * @param description the description to set
				 */
				public void setDescription(String description) {
					this.description = description;
				}

}
