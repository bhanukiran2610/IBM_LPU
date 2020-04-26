package com.example.demo.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value = "Account Management System ",description = "All crud and other operations pertaining to Account in Account Management System")
public class AccountController {
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@ApiOperation(value = "View a list of available accounts", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	
	
	/*public ResponseEntity<Iterable<Account>> getAllAccounts()
	{
		return accountService.getAccounts();
	}*/
	
	
	@GetMapping("/accounts")
	 public ResponseEntity<Object> getAllAccounts() {
		  return new ResponseEntity<>(accountService.getAllAccounts(), HttpStatus.OK);
	
	}
	
	@SuppressWarnings("unchecked")
	@ApiOperation("Find Accound by Id")
	@GetMapping("/accounts/{id}")
	 public ResponseEntity<Account> getAccountById(@PathVariable("id") Integer id){
	  return new ResponseEntity(accountService.getAccount(id),HttpStatus.OK);
	 }
	
		/*
		 * @GetMapping("/accounts/{accountID}") public ResponseEntity<AccountDTO>
		 * findAccountById(@PathVariable int accountID) { return
		 * accountService.findAccountById(accountID); }
		 */
	
	@ApiOperation("Add Accounts")
	@PostMapping("/accounts")
	public ResponseEntity<AccountDTO> saveAccount(@RequestBody AccountDTO accountDto) {
		return accountService.save(accountDto);
	}
	
	@ApiOperation("Delete Accounts by Id")
	@DeleteMapping("/accounts/{accountID}")
	public ResponseEntity<AccountDTO> deleteaccount(@PathVariable int accountID){
		return accountService.deleteAccount(accountID);
	}
	
	@ApiOperation("Update Accounts")
	@PutMapping("/accounts")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account){
		return accountService.updateAccont(account);
	}
	
	@ApiOperation("Find Account by AccountType")
	@GetMapping("/accounts/get/{accountType}")
	public ResponseEntity<Iterable<Account>> findAccountByType(@PathVariable String accountType){
		return accountService.findByAccountType(accountType);
	}
	
	@ApiOperation("Find account by account type and balance")
	@GetMapping("/accounts/get/{accountType}/{Balance}")
	public ResponseEntity<Iterable<Account>> findAccountByTypeAndBalance(@PathVariable String accountType,@PathVariable double Balance){
		return accountService.findByAccountTypeAndBalance(accountType, Balance);
	}
	
	@ApiOperation("Delete account by account type")
	@DeleteMapping("/accounts/delete/{accountType}")
	public void deleteaccount(@PathVariable String accountType){
		 accountService.removeByAccountType(accountType);
	}
	

}
