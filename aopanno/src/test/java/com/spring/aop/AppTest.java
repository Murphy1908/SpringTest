package com.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.anno.UserService;

/**
 * Unit test for simple App.
 */
public class AppTest{
	@Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser();
        userService.deleteUser();
    }
}
