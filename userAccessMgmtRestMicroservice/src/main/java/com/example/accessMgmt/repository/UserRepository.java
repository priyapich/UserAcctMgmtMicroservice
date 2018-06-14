package com.example.accessMgmt.repository;


import org.springframework.data.repository.CrudRepository;


import com.example.accessMgmt.Entities.User;




public interface UserRepository extends CrudRepository<User, Long>{
	Iterable<User> findAll();
}