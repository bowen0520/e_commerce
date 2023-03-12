package com.ec.wallet.dao;

import java.util.LinkedList;
import java.util.List;

public class BillList {
	private long userId;
	private long billCount;
	private List<Bill> bills;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getBillCount() {
		return billCount;
	}
	public void setBillCount(long billCount) {
		this.billCount = billCount;
	}
	public List<Bill> getBills() {
		return bills;
	}
	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}
}
