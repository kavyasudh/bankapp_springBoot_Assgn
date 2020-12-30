package com.bankapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;

@Service(value="as")
@Transactional

public class AccountServiceImpl implements AccountService{
	private static final Logger logger=LoggerFactory.getLogger(AccountServiceImpl.class);
 
	private AccountDao accDao;
	
	
	@Autowired
	public AccountServiceImpl(AccountDao accDao) {
		
		this.accDao = accDao;
	}

	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return accDao.update(account);
	}
	 @Loggable
	@Override
	public Account findAccById(int id) {
		// TODO Auto-generated method stub
		return accDao.findAccById(id);
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accDao.getAllAccounts();
	}

	@Override
	public Account addAcc(Account account) {
		// TODO Auto-generated method stub
		return accDao.addAcc(account);
	}

	@Override
	public Account deleteAccount(int id) {
		// TODO Auto-generated method stub
		return accDao.deleteAccount(id);
	}

	@Override
	public void Transfer(int frmAccId, int toAccId, double amnt) {
		// TODO Auto-generated method stub
		Account frmAcc=accDao.findAccById(frmAccId);
		Account toAcc=accDao.findAccById(toAccId);
		
		frmAcc.setBalance(frmAcc.getBalance()-amnt);
		toAcc.setBalance(toAcc.getBalance()+amnt);
		
		accDao.update(frmAcc);
		accDao.update(toAcc);
	}

	@Override
	public void deposit(int accId, double amnt) {
		// TODO Auto-generated method stub
		
		Account account=accDao.findAccById(accId);
		account.setBalance(account.getBalance()+amnt);
		accDao.update(account);
		
		
	}

	@Override
	public void withdraw(int accId, double amnt) {
		// TODO Auto-generated method stub
        Account account=accDao.findAccById(accId);
		account.setBalance(account.getBalance()-amnt);
		accDao.update(account);
		
	}

	
}
