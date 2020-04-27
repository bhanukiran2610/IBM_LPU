package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.AccountDAO;
import com.example.demo.dto.AccountDto;
import com.example.demo.model.Account;

@Service(value = "accountService")
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {
	
	private AccountDAO accountDAO;

	// Constructor Injection
	@Autowired
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}

	@Override
	@Transactional
	public ResponseEntity<List<AccountDto>> getAccounts() {
		Iterable<Account> accounts = accountDAO.findAll();
		List<AccountDto> accountDTO = new ArrayList<AccountDto>();
		for (Account a : accounts) {
			/*
			 * accountDTO.add(new AccountDto(a.getAccountID(), a.getAccountType(),
			 * a.getBalance()));
			 */
			accountDTO.add(new AccountDto(a.getCustomerId(), a.getNumber()));
		}
		return ResponseEntity.ok().body(accountDTO);
	}

	@Override
	public ResponseEntity<AccountDto> findAccountById(int id) {
		if (accountDAO.findById(id).isPresent()) {
			Account account = accountDAO.findById(id).get();

			AccountDto accountDTO = new AccountDto(account.getCustomerId(), account.getNumber());
			return ResponseEntity.ok().body(accountDTO);
		} else
			return null;
	}
	
	public ResponseEntity<Iterable<Account>> findByCustomerId(String customerId){
		Iterable<Account> accounts = accountDAO.findByCustomerId(customerId);
		return ResponseEntity.ok().body(accounts);
		
	}


	

}
