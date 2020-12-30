package com.bankapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import com.bankapp.web.beans.DepositBean;
import com.bankapp.web.beans.TransferBean;
import com.bankapp.web.beans.WithdrawBean;
//......../mgr/transfer
@RestController
@RequestMapping(path = "mgr")
public class TransactionController {
	private AccountService accountService;

	@Autowired
	public TransactionController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@PostMapping(path="transfer", 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes =MediaType.APPLICATION_JSON_VALUE )
	public String transferFund( @RequestBody TransferBean bean) {
		accountService.Transfer(bean.getFromAccountId(), bean.getToAccountId(), bean.getAmount());
		return "fund is transferred";
	}
	
	@PostMapping(path="deposit", 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes =MediaType.APPLICATION_JSON_VALUE )
	public String deposit( @RequestBody DepositBean dbean) {
		accountService.deposit(dbean.getAccountId(),dbean.getAmount());
		return "amount deposited";
	}
	
	@PostMapping(path="withdraw", produces = MediaType.APPLICATION_JSON_VALUE, consumes =MediaType.APPLICATION_JSON_VALUE )
	    public String withdraw( @RequestBody WithdrawBean wbean) {
		accountService.withdraw(wbean.getAccountId(),wbean.getAmount());
		return "withdraw successfull";
	}
	
}
