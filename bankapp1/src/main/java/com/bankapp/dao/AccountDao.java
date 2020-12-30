package com.bankapp.dao;

import java.util.List;

public interface AccountDao {
	 public Account update(Account account);
	 public Account findAccById(int id);
	 public List<Account> getAllAccounts();
	 public Account addAcc(Account account);
	 public Account deleteAccount(int id);
}
