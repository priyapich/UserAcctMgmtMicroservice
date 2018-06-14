package com.example.accessMgmt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessMgmt.Entities.Account;
import com.example.accessMgmt.Entities.UserAccount;
import com.example.accessMgmt.repository.UserAccountRepository;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	public UserAccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	 @Autowired 
	private UserAccountRepository usrAcctRepo;
	 

   /*  public void setUsrAcctRepo(UserAccountRepository usrAcctRepo ) { 
	 
         this.usrAcctRepo = usrAcctRepo;
     }
	 
	public UserAccountRepository getUsrAcctRepo() {
		return usrAcctRepo;
	}*/
	/*@Override
	    public UserAccount retrieveAccountName(String usrName) {
	        // TODO Auto-generated method stub
	        return usrAcctRepo.findByAcct(usrName);
	    }

	 @Override
	    public Iterable<UserAccount> listAllAccounts() {
	        // TODO Auto-generated method stub
	        return usrAcctRepo.findAll();
	    }*/
	

}
