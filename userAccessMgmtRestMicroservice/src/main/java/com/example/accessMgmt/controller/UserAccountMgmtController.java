package com.example.accessMgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.accessMgmt.Entities.UserAccount;
import com.example.accessMgmt.Service.UserAccountService;
import com.example.accessMgmt.repository.UserAccountRepository;

@Controller
public class UserAccountMgmtController {


	public UserAccountMgmtController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	UserAccountService userAccountService;

	@Autowired
	UserAccountRepository userAccountRepository;
	
	
	


//	@GetMapping("/UserAccount/user")
//	@ResponseBody
//	public UserAccount retrieveAcctForUser(
//			@RequestParam(name = "userName", required = false, defaultValue = "AA") String userName) {
//		 
//		return  userAccountService.retrieveAccountName(userName);
//	}
//	
	
	
	

	/*@RequestMapping(method = RequestMethod.GET, value = "/user")
	@ResponseBody
	public Iterable<User> getUserDetails() {
		return userRepository.findAll();

	}
*/
	
    
	
}
