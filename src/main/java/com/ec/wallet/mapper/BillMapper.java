package com.ec.wallet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ec.wallet.dao.Bill;

public interface BillMapper {
	int insertBill(Bill bill);
	List<Bill> searchBills(@Param("userId") long userId);
}
