package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.Account;


public interface AccountService {
	public ResponseEntity<List<AccountDto>> getAccounts();

	public ResponseEntity<AccountDto> findAccountById(int id);
	
	public ResponseEntity<Iterable<Account>> findByCustomerId(String customerId);
}
