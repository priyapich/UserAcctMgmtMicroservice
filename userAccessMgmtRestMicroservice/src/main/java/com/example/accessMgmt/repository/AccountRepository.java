package com.example.accessMgmt.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.accessMgmt.Entities.Account;



public interface AccountRepository extends CrudRepository<Account, Long>{
	
	Account findByAccountName(String name);
}