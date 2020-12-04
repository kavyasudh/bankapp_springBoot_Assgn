package com.bankapp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entity.TransactionLog;
import com.bankapp.model.entity.TxType;
import com.bankapp.model.service.TransactionLogService;
import com.bankapp.web.formbeans.TransactionBean;
import com.bankapp.web.formbeans.TransferBean;

@Controller
public class TransactonLogMgtController {
 
	private TransactionLogService  transactionLogService;

	@Autowired
	public TransactonLogMgtController(TransactionLogService transactionLogService) {
		
		this.transactionLogService = transactionLogService;
		
	}
	@GetMapping("transactions.do")
	public ModelAndView transactionsGet(HttpServletRequest req,ModelAndView mv) {
		mv.setViewName("transactions");
		mv.addObject("transactions", transactionLogService.getTransactionLogs());
    	//mv.addObject("user", req.getSession(false).getAttribute("user"));
		return mv;
	}
	
	@GetMapping("transaction.do/{id}")
	public ModelAndView transactionGet(@PathVariable("id") int fromaccountId,HttpServletRequest req,ModelAndView mv) {
		mv.setViewName("transactions");
		mv.addObject("transactions", transactionLogService.getAllTransactionLogsForAccount(fromaccountId));
    //	mv.addObject("user", req.getSession(false).getAttribute("user"));
		return mv;
	}
	
	}
	/*
	 * @GetMapping("hello") public ModelAndView hello(ModelAndView mv) {
	 * TransactionLog t=new TransactionLog("txInfo",100.00, TxType.TRANSFER);
	 * transactionLogService.addTransactionLog(1,"txInfo",100.00, TxType.TRANSFER);
	 * mv.setViewName("hello"); mv.addObject("key","transLog"); return mv;
	 * 
	 * }
	 */
	
	
