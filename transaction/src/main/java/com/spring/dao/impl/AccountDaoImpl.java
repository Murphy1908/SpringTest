package com.spring.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.spring.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	/**
     * 根据用户名减少账户金额
     */
	@Override
	public void out(String outer, int money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("update account set money = money - ? where username = ?",money,outer);
	}
	
    /**
     * 根据用户名增加账户金额
     */
	@Override
	public void in(String inner, int money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("update account set money = money + ? where username = ?",money,inner);
	}

}
