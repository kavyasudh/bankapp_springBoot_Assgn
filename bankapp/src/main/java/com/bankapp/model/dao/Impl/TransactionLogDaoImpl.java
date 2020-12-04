package com.bankapp.model.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankapp.model.dao.TransactionLogDao;
import com.bankapp.model.entity.TransactionLog;
import com.bankapp.model.entity.TxType;

@Repository
public class TransactionLogDaoImpl implements TransactionLogDao{

	
	private SessionFactory factory;
	
	
	@Autowired
	public TransactionLogDaoImpl(SessionFactory factory) {
		
		this.factory = factory;
	}

	private Session getSession() {
		return factory.getCurrentSession();
		
	}

	@Override
	public TransactionLog addTransactionLog(int accountId,String txInfo, Double amount, TxType txType) {
		// TODO Auto-generated method stub
		TransactionLog log=new TransactionLog(txInfo,amount,txType);
		getSession().persist(log);
		return log;
	}

	@Override
	public List<TransactionLog> getTransactionLogs() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from TransactionLog").list();
		
	}

	@Override
	public List<TransactionLog> getAllTransactionLogsForAccount(int accountId) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from TransactionLog where accountId=?").list();
	}
	
}
