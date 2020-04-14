package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;
import com.example.demo.repo.DataNotFoundException;

public interface AccountService {
	public Account createAccount(Account account);
	
	public List<Account> getAllAccountDetails();
	
	public Account findByAccountNumber(String accountNumber);
	
	public void deleteById(String accountNumber) throws DataNotFoundException;
	
	public void updateByAccountNumber(String accountNumber,int initialBalance) throws DataNotFoundException;
	
	public List<Account> findByAmount(int amount);
	
}
