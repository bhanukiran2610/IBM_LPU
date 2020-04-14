package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Account;
import com.example.demo.repo.DataNotFoundException;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int choice=0;
    	Scanner scanner=new Scanner(System.in);
    
        do {
        	System.out.println();
        	System.out.println("1.Insert the values ");
        	System.out.println("2.List all the values");
        	System.out.println("3.Find account by Account number");
        	System.out.println("4.Delete account by Account number");
        	System.out.println("5.Update account by Account number");
        	System.out.println("6.List accounts using balance");
        	System.out.println("0.exit");
        	
        	choice=scanner.nextInt();
        	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		AccountService service=context.getBean("accountServiceImpl",AccountServiceImpl.class);
    		Account account=context.getBean("account",Account.class);
        	switch(choice) {
        	case 1:
        		String str[]=UUID.randomUUID().toString().split("-");
        		account.setAccountNumber(str[0]);
        		account.setAccountType("Savings");
        		account.setInitialBalance(20000);
       		    account=service.createAccount(account);
       		    System.out.println(account);
       		    break;
        	case 2:
        		List<Account> list=service.getAllAccountDetails();
        		Iterator<Account> i=list.iterator();
        		while(i.hasNext())
        		{ 
        			Account accountObj=i.next();
        			System.out.println(accountObj);
        		}
        		
        	case 3:
        		System.out.println("Enter the AccountNumber to Search :");
    			String accNum=scanner.next();
        		account=service.findByAccountNumber(accNum);
        		System.out.println(account);
        		break;
        	case 4:
        		try {
        			System.out.println("Enter the AccountNumber to be deleted :");
        			String accNum1=scanner.next();
					service.deleteById(accNum1);
				} catch (DataNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		break;
        	case 5:
        		try {
        			System.out.println("Enter the AccountNumber to be Updated :");
        			String accNum2=scanner.next();
        			System.out.println("Enter the Amount :");
        			int amountValue=scanner.nextInt();
					service.updateByAccountNumber(accNum2,amountValue);
				} catch (DataNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		break;
        	case 6:
        		 List<Account> l=service.findByAmount(5000);
        		 for(Account a:l) {
        			  System.out.println(a);
        		 }
        		
        		break;
        	case 0:
        		break;
        		
        	default:
        		System.out.println("You have entered a wrong choice :-( ");
        		break;
        		
        		
        	
        	}
        	
        	
        }while(choice!=0);
        	
        
  
    }
}
