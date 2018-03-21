package com.spring.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.AccountService;

/**
 * Unit test for simple App.
 */
public class TransactionTest{
	
    @Test
    public void testNoTransaction(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService account = (AccountService) context.getBean("accountService");
        //Tom 向 Marry 转账1000
        account.transfer("Tom", "Marry", 1000);
    }
}
