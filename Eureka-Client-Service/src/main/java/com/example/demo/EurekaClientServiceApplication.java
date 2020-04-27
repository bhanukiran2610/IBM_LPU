package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientServiceApplication implements CommandLineRunner{
	
	private AccountService accountService;
	private AccountDAO accountDAO;

	@Autowired
	public EurekaClientServiceApplication(AccountService accountService, AccountDAO accountDAO) {
		super();
		this.accountService = accountService;
		this.accountDAO = accountDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		accountDAO.save(new Account(833090,UUID.randomUUID().toString()));
		accountDAO.save(new Account(949288, UUID.randomUUID().toString()));
		System.out.println(accountService.getAccounts().toString());

}
	}
