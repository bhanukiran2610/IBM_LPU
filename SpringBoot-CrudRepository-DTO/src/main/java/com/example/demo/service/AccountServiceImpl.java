package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.AccountDAO;
import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;

@Service(value = "accountService")
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}
	
	/*
	 * public ResponseEntity<Iterable<Account>> getAccounts() { Iterable<Account>
	 * accounts=accountDAO.findAll(); return ResponseEntity.ok().body(accounts); }
	 */
	
	@Override
	public AccountDTO getAccount(int id) {
		if(accountDAO.findById(id).isPresent()) {
			Account fetchAccount=accountDAO.findById(id).get();
			AccountDTO fetchAccountDto=new AccountDTO(fetchAccount.getAccountType(), fetchAccount.getBalance());
			return fetchAccountDto;
		}
		else {
			return null;
		}
		
	}
	
	@Override
	public List<AccountDTO> getAllAccounts(){
		List<AccountDTO> allAccounts = new ArrayList<>();
		  accountDAO.findAll().forEach(account -> {
		   allAccounts.add(new AccountDTO( account.getAccountType(),account.getBalance()));
		  });
		  return allAccounts;
	}
}
