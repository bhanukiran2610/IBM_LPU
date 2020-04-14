package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repo.AccountDAO;
import com.example.demo.repo.DataNotFoundException;


@Service
public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;
	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}
	
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDAO.createAccount(account);
	}
	
	
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return accountDAO.getAllAccountDetails();
	}

	
	
	public Account findByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return accountDAO.findByAccountNumber(accountNumber);
	}
	
	public void deleteById(String accountNumber) throws DataNotFoundException {
		accountDAO.deleteById(accountNumber);
	}
	
	
	public void updateByAccountNumber(String accountNumber, int initialBalance) throws DataNotFoundException {
		try {
			accountDAO.updateByAccountNumber(accountNumber, initialBalance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<Account> findByAmount(int amount) {
		// TODO Auto-generated method stub
		return accountDAO.findByAmount(amount);
	}

}
