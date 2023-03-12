package com.ec.wallet.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ec.wallet.dao.Bill;
import com.ec.wallet.mapper.BillMapper;
import com.ec.wallet.mapper.UserMapper;
import com.ec.wallet.service.impl.WalletServiceImpl;
import com.ec.wallet.util.MybatisUtils;

public class WalletServiceTest {
	@Autowired
	private WalletService walletService = new WalletServiceImpl();
	
	@Test
	public void queryWalletBalanceTest() {
		String maneyString = walletService.queryWalletBalance("zbw");
		System.out.println(maneyString);
	}
	
	@Test
	public void saveMoneyTest() {
		boolean res = walletService.saveMoney(95, 20.5);
		System.out.println(res);
	}
	
	@Test
	public void spendMoneyTest() {
		boolean res = walletService.spendMoney(95, 9.99);
		System.out.println(res);
	}
	
	@Test
	public void searchBillsTest() {
		List<Bill> bills = walletService.searchBills(95);
		for(Bill bill: bills) {
			System.out.println(bill);
		}
	}
}
