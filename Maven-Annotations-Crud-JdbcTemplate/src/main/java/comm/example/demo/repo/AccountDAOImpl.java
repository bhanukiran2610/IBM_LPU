package comm.example.demo.repo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import comm.example.demo.bean.Account;

@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO{
	
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
	
	

}
