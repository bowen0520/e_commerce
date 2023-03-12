package com.ec.wallet.mapper;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

import com.ec.wallet.dao.User;

public interface UserMapper {
	User searchByUserId(@Param("userId") long userId);
	User searchByName(@Param("name") String name);
	int insertUser(User user);
	int changeBalance(@Param("userId") long userId, @Param("balance") BigDecimal balance);
}
