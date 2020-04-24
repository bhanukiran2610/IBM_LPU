package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;

public interface AccountService {
	
	//public ResponseEntity<Iterable<Account>> getAccounts();
	public List<AccountDTO> getAllAccounts();
	public AccountDTO getAccount(int id);
	

}
