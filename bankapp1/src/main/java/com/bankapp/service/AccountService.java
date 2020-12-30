package com.bankapp.service;

import java.util.List;

import com.bankapp.dao.Account;

public interface AccountService {
	 public Account update(Account account);
	 public Account findAccById(int id);
	 public List<Account> getAllAccounts();
	 public Account addAcc(Account account);
	 public Account deleteAccount(int id);
	 public void Transfer(int frmAccId,int toAccId,double amnt);
	 public void deposit(int accId,double amnt);
	 public void withdraw(int accId,double amnt);

}
