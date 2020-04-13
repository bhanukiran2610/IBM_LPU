package comm.example.demo.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Account {
	
	private String accountNumber;
	private AccountType accountType;
	private int initialBalance;
	
	

}
