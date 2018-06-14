package com.example.accessMgmt.repository;

	import org.springframework.data.repository.CrudRepository;

import com.example.accessMgmt.Entities.SystemInfo;


	public interface SystemInfoRepository extends CrudRepository<SystemInfo, Long>{
	
	}