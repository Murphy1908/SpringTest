package com.spring.aopmethod;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest{
	@Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService useService = (UserService) context.getBean("userService");
        useService.addUser(null);
    }
}
