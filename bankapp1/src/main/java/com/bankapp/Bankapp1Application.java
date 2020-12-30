package com.bankapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountType;
import com.bankapp.service.AccountService;

@SpringBootApplication()
public class Bankapp1Application implements CommandLineRunner{
	@Autowired
	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(Bankapp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Account account1=new Account("raj", "new delhi", "5454545454", "raj@gamil.com", 6000.00,
				AccountType.SAVING);
		Account account2=new Account("ekta", "new delhi", "5454575454", "ekta@gamil.com", 6000.00,
				AccountType.SAVING);
		
		accountService.addAcc(account1);
	    accountService.addAcc(account2);
		System.out.println("--------------------2 default acc is added ----------------");
	}*/

}
}
