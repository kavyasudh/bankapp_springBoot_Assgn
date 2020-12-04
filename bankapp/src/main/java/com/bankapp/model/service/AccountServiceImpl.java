package com.bankapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.dao.AccountDao;
import com.bankapp.model.entity.Account;
import com.bankapp.model.entity.TxType;

@Service(value="as")
@Transactional
public class AccountServiceImpl implements AccountService{

	
	private AccountDao accountDao;
	
	private TransactionLogService transactionLogService;
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao, TransactionLogService transactionLogService) {
	
		this.accountDao = accountDao;
		this.transactionLogService = transactionLogService;
	}


	
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.getAllAccounts();
	}

	@Override
	public void deposit(int accountId, double amount) {
		// TODO Auto-generated method stub
		Account account=accountDao.getaccountById(accountId);
		account.setBalance(account.getBalance()+amount);
		accountDao.updateAccount(account);
		//transactionLogService.addTransactionLog(accountId,"deposit amount", amount , TxType.DEPOSIT);
		
	}

	@Override
	public void withdraw(int accountId, double amount) {
		// TODO Auto-generated method stub
		
		Account account=accountDao.getaccountById(accountId);
		account.setBalance(account.getBalance()-amount);
		accountDao.updateAccount(account);
	}

	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {
		// TODO Auto-generated method stub
		withdraw(fromAccountId, amount);
		deposit(toAccountId, amount);
		
	}

	@Override
	public void updateAccount(int id, Account account) {
		
		accountDao.updateAccount(id,account);
		
	}

	@Override
	public Account delAccount(int accountId) {
		// TODO Auto-generated method stub
		return accountDao.delAccount(accountId);
	}

	@Override
	public Account getaccountById(int accountId) {
		// TODO Auto-generated method stub
		return accountDao.getaccountById(accountId);
	}

	@Override
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.addAccount(account);
	}
	
	
	
}
