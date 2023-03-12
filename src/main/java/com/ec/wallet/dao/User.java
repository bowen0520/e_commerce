package com.ec.wallet.dao;

import java.math.BigDecimal;

public class User {
	private long userId;
	private String name;
	private BigDecimal balance;
	
	public User(long userId, String name, BigDecimal balance) {
		super();
		this.userId = userId;
		this.name = name;
		this.balance = balance;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
