package com.bankapp.model.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankapp.model.dao.AccountDao;
import com.bankapp.model.dao.exception.AccountNotFoundException;
import com.bankapp.model.entity.Account;


@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory factory;
	
	private Session getSession() {
		return factory.getCurrentSession();
		
	}
	
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Account").list();
	}

	@Override
	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		getSession().update(account);
		return account;
		
		
	}

	@Override
	public Account delAccount(int accountId) {
		// TODO Auto-generated method stub
		Account accToDel=getaccountById(accountId);
		getSession().delete(accToDel);
		return accToDel;
		
	}

	@Override
	public Account getaccountById(int accountId) {
		// TODO Auto-generated method stub
		Account account=getSession().find(Account.class, accountId);
		if(account==null) 
			throw new AccountNotFoundException("account with id"+accountId+"not found");
			
		return account;
		
	}

	@Override
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
		getSession().save(account);
		return account;
		
		
	}

	@Override
	public Account updateAccount(int id, Account account) {
				Account accountToUpdate = getaccountById(id);
			accountToUpdate.setAddress(account.getAddress());
			accountToUpdate.setPhone(account.getPhone());
			accountToUpdate.setEmail(account.getEmail());
			getSession().update(accountToUpdate);
			return accountToUpdate;
		}

	}


