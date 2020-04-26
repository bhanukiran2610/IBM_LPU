package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;

public interface AccountService {
	
	//public ResponseEntity<Iterable<Account>> getAccounts();
	public List<AccountDTO> getAllAccounts();
	
	public AccountDTO getAccount(int id);
	
	//public ResponseEntity<AccountDTO> findAccountById(int id);
	
	public ResponseEntity<AccountDTO> save(AccountDTO accountDto);

	public ResponseEntity<AccountDTO> deleteAccount(int id);

	public ResponseEntity<Account> updateAccont(Account account);

	public ResponseEntity<Iterable<Account>> findByAccountType(String accountType);
	
	public ResponseEntity<Iterable<Account>> findByAccountTypeAndBalance(String accountType,double balance);
	
	public void removeByAccountType(String accountType);
	

}
