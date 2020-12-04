package com.bankapp.model.dao;

import java.util.List;

import com.bankapp.model.entity.Account;

public interface AccountDao {

	public List<Account> getAllAccounts();
	public Account updateAccount(Account account);
	public Account updateAccount(int id,Account account);
	public Account delAccount(int accountId);
	public Account getaccountById(int accountId);
	public Account addAccount(Account account);
}
