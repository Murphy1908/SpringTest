package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.AccountDao;
import com.spring.service.AccountService;

@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	@Qualifier("accountDao")
	private AccountDao accountDao;
	//private TransactionTemplate transactionTemplate; 
	
	public void setAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
	}
	
/*	public void setTransactionTemplate(TransactionTemplate transactionTemplate){
		this.transactionTemplate = transactionTemplate;
	}*/
	
	@Override
	public void transfer(String outer, String inner, int money) {
		// TODO Auto-generated method stub
		
/*		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				accountDao.out(outer, money);
				int i = 1/0;
				accountDao.in(inner, money);
			}
		});*/
		accountDao.out(outer, money);
		//int i = 1/0;
		accountDao.in(inner, money);
	}
}
