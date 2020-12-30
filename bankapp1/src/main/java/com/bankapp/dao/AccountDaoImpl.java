package com.bankapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

	private Map<Integer, Account> accouts = new HashMap<>();
	private int counter=0;
	
	
	/*
	 * { accouts.put(1, new
	 * Account(++counter,"nandu","vzg","623456788",5000.00,AccountType.SAVING));
	 * accouts.put(2, new
	 * Account(++counter,"kavya","vzg","98765788",6000.00,AccountType.SAVING));
	 * 
	 * }
	 */

	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return accouts.put(account.getId(), account);
	}

	@Override
	public Account findAccById(int id) {
		// TODO Auto-generated method stub
		return accouts.get(id);
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return new ArrayList<>(accouts.values());
	}

	@Override
	public Account addAcc(Account account) {
		// TODO Auto-generated method stub
		account.setId(++counter);
		return accouts.put(++counter,account);
		
	}

	@Override
	public Account deleteAccount(int id) {
		// TODO Auto-generated method stub
		return accouts.remove(id);
		
	}
	
	

}
