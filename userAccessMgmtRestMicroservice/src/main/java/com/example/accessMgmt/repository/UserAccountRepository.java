package com.example.accessMgmt.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.accessMgmt.Entities.UserAccount;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long>{

	UserAccount findByAcct(String name);
}