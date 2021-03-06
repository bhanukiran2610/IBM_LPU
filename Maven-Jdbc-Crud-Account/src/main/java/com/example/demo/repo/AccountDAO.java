package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountDAO {
	public Account createAccount(Account account);
	
	public List<Account> getAllAccountDetails();
	
	public Account findByAccountNumber(String accountNumber);

	public void deleteById(String accountNumber) throws DataNotFoundException;
	
	public void updateByAccountNumber(String accountNumber, int initialBalance) throws DataNotFoundException;
	
	public List<Account> findByAmount(int amount);
	

}
