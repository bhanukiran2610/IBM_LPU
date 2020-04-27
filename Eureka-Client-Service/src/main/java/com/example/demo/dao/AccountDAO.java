package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.Account;

@Repository(value = "accountDAO")

public interface AccountDAO extends CrudRepository<Account, Integer> {
	
	@Query
	public Iterable<Account> findByCustomerId(String customerId);

}