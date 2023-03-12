package com.ec.wallet.dao;

import java.math.BigDecimal;

public class Bill {
	private long billId;
	private long userId;
	private BigDecimal transaction;
	private String note;
	
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", userId=" + userId + ", transaction=" + transaction + ", note=" + note
				+ "]";
	}
	public Bill(long billId, long userId, BigDecimal transaction, String note) {
		super();
		this.billId = billId;
		this.userId = userId;
		this.transaction = transaction;
		this.note = note;
	}
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public BigDecimal getTransaction() {
		return transaction;
	}
	public void setTransaction(BigDecimal transaction) {
		this.transaction = transaction;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
