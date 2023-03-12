package com.ec.wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ec.wallet.dao.Bill;
import com.ec.wallet.dao.User;
import com.ec.wallet.service.WalletService;
import com.ec.wallet.service.impl.WalletServiceImpl;

@RestController()
@RequestMapping("/library")
public class WalletController {
	@Autowired
	private WalletService walletService = new WalletServiceImpl();
	
	@RequestMapping("/queryWalletBalance")
	public String queryWalletBalance(@RequestParam(value="name", defaultValue="zbw") String name) {
		return walletService.queryWalletBalance(name);
	}

	@RequestMapping("/saveMoney")
	public boolean saveMoney(@RequestParam(value="userId", defaultValue="95") long userId, @RequestParam(value="money", defaultValue="11.1") double money) {
		return walletService.saveMoney(userId, money);
	}

	@RequestMapping("/spendMoney")
	public boolean spendMoney(@RequestParam(value="userId", defaultValue="95") long userId, @RequestParam(value="money", defaultValue="11.1") double money) {
		return walletService.spendMoney(userId, money);
	}

	@RequestMapping("/searchBills")
	public List<Bill> searchBills(@RequestParam(value="userId", defaultValue="95") long userId) {
		return walletService.searchBills(userId);
	}
	
}
