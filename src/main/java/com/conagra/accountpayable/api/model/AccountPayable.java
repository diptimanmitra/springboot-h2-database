package com.conagra.accountpayable.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_PAYABLE")
public class AccountPayable {
	
	private long id;
	private String accountNumber;
	private String purchaseOrderNumber;
	private String accountType;
	private int accountStatus;
	
	public AccountPayable() {
		
	}
	public AccountPayable(long id, String accountNumber, String purchaseOrderNumber, String accountType,
			int accountStatus) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "account_number", nullable = false)
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Column(name = "purchase_order_number", nullable = false)
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	
	@Column(name = "account_type", nullable = false)
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Column(name = "account_status", nullable = false)
	public int isAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "AccountPayable [id=" + id + ", accountNumber=" + accountNumber + ", purchaseOrderNumber="
				+ purchaseOrderNumber + ", accountType=" + accountType + ", accountStatus=" + accountStatus + "]";
	}
	
	

}
