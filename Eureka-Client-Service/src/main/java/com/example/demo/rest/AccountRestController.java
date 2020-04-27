package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountRestController {
	
	private AccountService accountService;

	@Autowired
	public AccountRestController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@GetMapping("/accounts")
	public ResponseEntity<List<AccountDto>> getAccounts() {
		return accountService.getAccounts();
	}

	
	@GetMapping("/accounts/{accountID}")
	public ResponseEntity<AccountDto> findAccountById(@PathVariable int accountID) {
		return accountService.findAccountById(accountID);
	}
	
	
	@GetMapping("/accounts/get/{customerId}")
	public ResponseEntity<Iterable<Account>> findAccountByType(@PathVariable String customerId){
		return accountService.findByCustomerId(customerId);
	}

}
