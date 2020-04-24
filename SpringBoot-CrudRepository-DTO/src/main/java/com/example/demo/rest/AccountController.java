package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	
	/*public ResponseEntity<Iterable<Account>> getAllAccounts()
	{
		return accountService.getAccounts();
	}*/
	@GetMapping("/accounts")
	 public ResponseEntity<Object> getAllAccounts() {
		  return new ResponseEntity<>(accountService.getAllAccounts(), HttpStatus.OK);
		 }
	
	@GetMapping("/accounts/{id}")
	 public ResponseEntity<Account> getAccountById(@PathVariable("id") Integer id){
	  return new ResponseEntity(accountService.getAccount(id),HttpStatus.OK);
	 }

}
