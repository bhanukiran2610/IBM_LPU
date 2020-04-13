package com.example.demo.repo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;
import com.example.demo.model.AccountRowMapper;

@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO {
	private JdbcTemplate jdbcTemplate;
	private Logger logger=Logger.getLogger("AccountDAOImpl");
	@Autowired
	public AccountDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		String query="insert into account(accountNumber,accountType,balance) values('"
				+account.getAccountNumber()+"','"
				+account.getAccountType()+"',"+account.getInitialBalance()+")";
		
		jdbcTemplate.update(query);
		
		return account;
	}
	
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		//List<Account> accounts=jdbcTemplate.query("select * from account",new AccountRowMapper());
		List<Account> accounts=jdbcTemplate.query("select * from account", new BeanPropertyRowMapper(Account.class));
		return accounts;
	}
	
	
	public Account findByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.queryForObject("select * from account where accountNumber=?", new Object[] {accountNumber},new AccountRowMapper());
	}
	
	
	
	public void deleteById(String accountNumber) {
		// TODO Auto-generated method stub
		String str="delete from account where accountNumber='"+accountNumber+"'";
		 jdbcTemplate.update(str);
		 System.out.println("account deleted successfully with id: "+accountNumber);
	}
	
	
	
	
	public void updateByAccountNumber(String accountNumber, int initialBalance) {
		String SQL = "update account set balance= ? where accountNumber = ?";
	      jdbcTemplate.update(SQL,initialBalance, accountNumber);
	      System.out.println("Account has been updated sucessfully with id "+accountNumber);
	}
	
	public List<Account> findByAmount(int amount) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from account where balance>?",new Object[] {amount},new AccountRowMapper());
	}


}
