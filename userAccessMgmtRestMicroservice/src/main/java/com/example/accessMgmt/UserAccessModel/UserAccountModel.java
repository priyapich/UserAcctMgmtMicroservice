package com.example.accessMgmt.UserAccessModel;

import com.example.accessMgmt.Entities.SystemInfo;

public class UserAccountModel {

	public UserAccountModel() {
		// TODO Auto-generated constructor stub
	}
	public UserAccountModel(String uName) {
		
		this.userName=uName;
	}
	
	public UserAccountModel(SystemInfo sysInfo) {
		
		this.systemName=sysInfo.getSysName();
		this.systemDesc=sysInfo.getDescription();
	}
	private String accountName;
	private Long acctId;
	private String userName;
	private String systemName;
	private String systemDesc;
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
	 * @return the acctId
	 */
	public Long getAcctId() {
		return acctId;
	}
	/**
	 * @param acctId the acctId to set
	 */
	public void setAcctId(Long acctId) {
		this.acctId = acctId;
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
	/**
	 * @return the systemName
	 */
	public String getSystemName() {
		return systemName;
	}
	/**
	 * @param systemName the systemName to set
	 */
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	/**
	 * @return the systemDesc
	 */
	public String getSystemDesc() {
		return systemDesc;
	}
	/**
	 * @param systemDesc the systemDesc to set
	 */
	public void setSystemDesc(String systemDesc) {
		this.systemDesc = systemDesc;
	}
	@Override
	public String toString() {
	    return "UserAccount [UserName=" + userName + ", acctID=" + acctId
		    + ", acctNme=" + accountName + ", sysName=" + systemName
		    + ", sysDesc=" + systemDesc + "]";
	}
}
