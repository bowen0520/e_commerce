package com.ec.wallet.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.ec.wallet.dao.Bill;
import com.ec.wallet.dao.User;
import com.ec.wallet.mapper.BillMapper;
import com.ec.wallet.mapper.UserMapper;
import com.ec.wallet.service.WalletService;
import com.ec.wallet.util.MybatisUtils;

@Service
public class WalletServiceImpl implements WalletService{
	private SqlSession sqlSession= MybatisUtils.getSession();
	private BillMapper billMapper = sqlSession.getMapper(BillMapper.class);
	private UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	
	@Override
	public String queryWalletBalance(String name) {
		User user = userMapper.searchByName(name);
		return user.getBalance().toString();
	}

	@Override
	public boolean saveMoney(long userId, double money) {
		String syn = String.valueOf(userId);
		try {
			synchronized (syn) {
				User user = userMapper.searchByUserId(userId);
				user.setBalance(user.getBalance().add(new BigDecimal(money)));
				userMapper.changeBalance(userId, user.getBalance());
				Bill bill = new Bill(0L, userId, new BigDecimal(money), "save maney");
				billMapper.insertBill(bill);
				sqlSession.commit();
			}
		} catch (Exception e) {
			sqlSession.rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean spendMoney(long userId, double money) {
		String syn = String.valueOf(userId);
		try {
			synchronized (syn) {
				User user = userMapper.searchByUserId(userId);
				user.setBalance(user.getBalance().add(new BigDecimal("-" + money)));
				userMapper.changeBalance(userId, user.getBalance());
				Bill bill = new Bill(0L, userId, new BigDecimal(money), "spend maney");
				billMapper.insertBill(bill);
				sqlSession.commit();
			}
		} catch (Exception e) {
			sqlSession.rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public List<Bill> searchBills(long userId) {
		return billMapper.searchBills(userId);
	}

}
