package comm.example.demo.repo;

import java.util.List;

import comm.example.demo.bean.Account;

public interface AccountDAO {
	
	public Account createAccount(Account account);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
	
	
	
	/*
	 * public void deleteAccount(String id); public void updateAccount(String id,
	 * String accountType, int balance);
	 */
	

}
