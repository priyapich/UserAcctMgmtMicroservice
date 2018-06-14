package com.example.accessMgmt.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.accessMgmt.Entities.AccountSystem;
import com.example.accessMgmt.Entities.AccountSystemIdentity;

public interface AccountSystemRepository extends CrudRepository<AccountSystem, AccountSystemIdentity>{
	Iterable<AccountSystem> findByAcct(String acctName);
	//Iterable<AccountSystem> findBySysInfo();
}