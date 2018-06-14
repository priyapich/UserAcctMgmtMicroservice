package com.example.accessMgmt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.accessMgmt.Entities.Account;
import com.example.accessMgmt.Entities.AccountSystem;
import com.example.accessMgmt.Entities.SystemInfo;
import com.example.accessMgmt.Entities.User;
import com.example.accessMgmt.Entities.UserAccount;
import com.example.accessMgmt.repository.AccountRepository;
import com.example.accessMgmt.repository.AccountSystemRepository;
import com.example.accessMgmt.repository.SystemInfoRepository;
import com.example.accessMgmt.repository.UserAccountRepository;
import com.example.accessMgmt.repository.UserRepository;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class UserAccessMgmtRestMicroserviceApplication {
	private static final Logger log = LoggerFactory.getLogger(UserAccessMgmtRestMicroserviceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(UserAccessMgmtRestMicroserviceApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(SystemInfoRepository sysInfoRepository,AccountRepository acctRepository,UserRepository userRepository,AccountSystemRepository acctSysRepo,UserAccountRepository usrAcctRepo) {
		return (args) -> {
			//clean table
			acctSysRepo.deleteAll();
			usrAcctRepo.deleteAll();
			sysInfoRepository.deleteAll();
			acctRepository.deleteAll();
			userRepository.deleteAll();
			
			 
			// save a couple of System
			SystemInfo system1 = new SystemInfo("Jupiter", "Jupiter System");
			sysInfoRepository.save(system1);
			SystemInfo system2 = new SystemInfo("Saturn", "Saturn System");
			sysInfoRepository.save(system2);
			SystemInfo system3 = new SystemInfo("Venus", "Venus System");
			sysInfoRepository.save(system3);
			
			Account acct1 = new Account("InfoSec", "1001");
			acctRepository.save(acct1);
			Account acct2 = new Account("AI", "1002");
			acctRepository.save(acct2);
			Account acct3 = new Account("AIMS","1003");
			acctRepository.save(acct3);
			
			User user1 = new User("PP","F");
			User user2 = new User("A1","M");
			User user3 = new User("P1","F");
			
			userRepository.save(user1);
			userRepository.save(user2);
			userRepository.save(user3);
			
			acctSysRepo.save(new AccountSystem(acct1,system1));
			
			acctSysRepo.save(new AccountSystem(acct2,system1));
			acctSysRepo.save(new AccountSystem(acct3,system1));
			acctSysRepo.save(new AccountSystem(acct2,system2));
			acctSysRepo.save(new AccountSystem(acct3,system2));
			acctSysRepo.save(new AccountSystem(acct1,system3));
			
			
			
			usrAcctRepo.save(new UserAccount(user1,acct1));
			usrAcctRepo.save(new UserAccount(user1,acct2));
			usrAcctRepo.save(new UserAccount(user2,acct2));
			usrAcctRepo.save(new UserAccount(user3,acct2));
			
			// fetch all System
			log.info("System found with findAll():");
			log.info("-------------------------------");
			for (SystemInfo sysInfo : sysInfoRepository.findAll()) {
				log.info(sysInfo.toString());
			}
			log.info("Account found with findAll():");
			for (Account acct : acctRepository.findAll()) {
				log.info(acct.toString());
			}
			log.info("User found with findAll():");
			for (User user : userRepository.findAll()) {
				log.info(user.toString());
			}
			
			// fetch an individual System by ID
			
			sysInfoRepository.findAll().forEach(
							systemInfo -> {
								log.info("System found with findById(1L):");
								log.info("--------------------------------");
								log.info(systemInfo.toString());
								log.info("");
							});
			
			acctRepository.findAll().forEach(
					acct -> {
				log.info("Account found with findById(1L):");
				log.info("--------------------------------");
				log.info(acct.toString());
				log.info("");
			});
			
			userRepository.findAll().forEach(
					user -> {
				log.info("User found with findById(1L):");
				log.info("--------------------------------");
				log.info(user.toString());
				log.info("");
			});
			
			log.info(" Account System  Relationship found:");
			acctSysRepo.findAll().forEach(accountSystem -> {
				log.info("--------------------------------");
				//accountSystem.getAccount().setAccountId((long)200);
				log.info(accountSystem.toString());
				
				//log.info(accountSystem.toString());
				log.info("");
			});
			
			log.info(" User Account   Relationship found:");
			usrAcctRepo.findAll().forEach(userAccount -> {
				log.info("--------------------------------");
				//accountSystem.getAccount().setAccountId((long)200);
				log.info(userAccount.toString());
				
				//log.info(accountSystem.toString());
				log.info("");
			});
			
		};
			
	}
}
