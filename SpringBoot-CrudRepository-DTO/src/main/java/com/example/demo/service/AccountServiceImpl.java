package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;

@Service(value = "accountService")
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}
	
	public ResponseEntity<Iterable<Account>> getAccounts() {
		Iterable<Account> accounts=accountDAO.findAll();
		return ResponseEntity.ok().body(accounts);
	}
}
