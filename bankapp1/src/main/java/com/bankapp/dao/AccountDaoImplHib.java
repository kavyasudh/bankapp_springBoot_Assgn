package com.bankapp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AccountDaoImplHib implements AccountDao {

	private EntityManager em;

	@Autowired
	public AccountDaoImplHib(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Account> getAllAccounts() {
		return em.createQuery("select a from Account a").getResultList();
	}

	@Override
	public Account addAcc(Account account) {
		em.persist(account);
		return account;
	}

	@Override
	public Account update(Account account) {
		em.merge(account);
		return account;
	}

	@Override
	public Account deleteAccount(int accountId) {
		Account accountToDelete = findAccById(accountId);
		em.remove(accountToDelete);
		return accountToDelete;
	}

	@Override
	 public Account findAccById(int id) {
		Account account= em.find(Account.class, id);
		if(account==null)
			throw new AccountNotFoundException("account with id: "+ id +" is not found");
		return account;
	}

}
