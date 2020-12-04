package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entity.TransactionLog;
import com.bankapp.model.entity.TxType;

public interface TransactionLogService {

	public TransactionLog addTransactionLog(int accountId,String txInfo,Double amount,TxType txType);
	public List<TransactionLog> getTransactionLogs();
	public List<TransactionLog> getAllTransactionLogsForAccount(int accountId);
	
}
