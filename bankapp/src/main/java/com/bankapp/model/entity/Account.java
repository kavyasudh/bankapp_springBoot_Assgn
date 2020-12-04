package com.bankapp.model.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="account_table")
public class Account {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountid;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Double balance;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String email;
	@Column(unique = true, nullable = false)
	private String aadharcard;
	@Column(unique = true, nullable = false)
	private String panNumber;
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	
	@JoinColumn(name="acc_Id_fk")
	@OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.LAZY)
	
	  private List<TransactionLog> transactionlog=new ArrayList<>();
	 
	
	  private AccountStatus accountStatus=AccountStatus.ACTIVE;
	  
	  
	  
	  public AccountStatus getAccountStatus() { return accountStatus; }
	  
	  
	  
	  public void setAccountStatus(AccountStatus accountStatus) {
	  this.accountStatus = accountStatus; }
	 
	  
	  
	public AccountType getAccountType() {
		return accountType;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	
	  public List<TransactionLog> getTransactionlog() { return transactionlog; }
	  
	  public void setTransactionlog(List<TransactionLog> transactionlog) {
	  this.transactionlog = transactionlog;
	  }
	 
	public Account() {}
	

	//@Autowired
	public Account(String name, Double balance, String address, String phone, String email, String aadharcard,
			String panNumber, AccountType accountType) {
		
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.aadharcard = aadharcard;
		this.panNumber = panNumber;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", aadharcard=" + aadharcard + ", panNumber=" + panNumber + ", accountType="
				+ accountType + ", transactionlog=" + transactionlog + ", accountStatus=" + accountStatus + "]";
	}

	

	
	
	
	
	
	
}
