package com.spring.service.impl;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.dao.AccountDao;
import com.spring.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	private TransactionTemplate transactionTemplate; 
	
	public void setAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate){
		this.transactionTemplate = transactionTemplate;
	}
	
	@Override
	public void transfer(String outer, String inner, int money) {
		// TODO Auto-generated method stub
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				accountDao.out(outer, money);
				int i = 1/0;
				accountDao.in(inner, money);
			}
		});
	}
}
