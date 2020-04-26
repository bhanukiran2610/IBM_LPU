package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

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
	
	/*
	 * @Override public ResponseEntity<AccountDTO> findAccountById(int id) { if
	 * (accountDAO.findById(id).isPresent()) { Account account =
	 * accountDAO.findById(id).get();
	 * 
	 * AccountDTO accountDTO = new AccountDTO(account.getAccountType(),
	 * account.getBalance()); return ResponseEntity.ok().body(accountDTO); } else
	 * return null; }
	 */
	
	@Override
	public ResponseEntity<AccountDTO> save(AccountDTO accountDto) {

		Account account = new Account(UUID.randomUUID().toString(), accountDto.getAccountType(),
				accountDto.getBalance());
		accountDAO.save(account);
		return ResponseEntity.ok().body(accountDto);
	}
	
	@Override
	public ResponseEntity<AccountDTO> deleteAccount(int id) {
		if (accountDAO.findById(id).isPresent()) {
			Account account = accountDAO.findById(id).get();
			AccountDTO accountDto = new AccountDTO(account.getAccountType(), account.getBalance());
			accountDAO.deleteById(id);
		
			return ResponseEntity.ok().body(accountDto);
		} else
			return null;
	}
	
	@Override
	@Transactional
	public ResponseEntity<Account> updateAccont(Account account) {
		if (accountDAO.findById(account.getAccountNumber()).isPresent()) {
			accountDAO.save(account);
			return ResponseEntity.ok().body(account);
		} else
			return null;

	}
	
	@Override
	public ResponseEntity<Iterable<Account>> findByAccountType(String accountType) {
		Iterable<Account> accounts = accountDAO.findByAccountType(accountType);
		return ResponseEntity.ok().body(accounts);
	}
	
	

	@Override
	public ResponseEntity<Iterable<Account>> findByAccountTypeAndBalance(String accountType, double balance) {
		Iterable<Account> accounts = accountDAO.findByAccountTypeAndBalance(accountType, balance);
		return ResponseEntity.ok().body(accounts);
	}
	
	@Override
	@Transactional
	public void removeByAccountType(String accountType) {
		accountDAO.deleteByAccountType(accountType);
		
	}

}
