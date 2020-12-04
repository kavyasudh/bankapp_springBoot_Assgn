package com.bankapp.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.model.entity.Account;
import com.bankapp.model.entity.AccountType;
import com.bankapp.model.entity.TransactionLog;
import com.bankapp.model.entity.TxType;
import com.bankapp.model.service.AccountService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("model-config.xml");
		
		AccountService as=ctx.getBean("as", AccountService.class);
		
		Account a=new Account("kavya", 5000.00, "vskp","8375427869146", "k@k.com", "65435618973", "678yfhd", AccountType.SAVINGS);
		as.addAccount(a);
		/*
		 * TransactionLog t=new TransactionLog("txInfo",100.00, TxType.TRANSFER);
		 * a.getTransactionlog().add(t); as.addAccount(a);
		 */
}
}