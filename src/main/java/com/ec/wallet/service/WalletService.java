package com.ec.wallet.service;

import java.util.List;

import com.ec.wallet.dao.Bill;

public interface WalletService {
	String queryWalletBalance(String name);
	boolean saveMoney(long userId, double money);
	boolean spendMoney(long userId, double money);
	List<Bill> searchBills(long userId);
}
