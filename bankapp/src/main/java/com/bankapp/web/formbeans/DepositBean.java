package com.bankapp.web.formbeans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DepositBean {
	
	@NotNull(message="account id can not be null")
	private Integer accountid;
	
	@NotNull(message="ammount can not be null")
	@Min(value=50, message="min price should be more than 50")
	@Max(value=1000, message="max price should be less than 100000")
	private Double amount;
	
	
	public Integer getAccountid() {
		return accountid;
	}
	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
