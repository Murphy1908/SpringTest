package com.spring.aop;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.one.MyTransaction;
import com.spring.aop.one.ProxyUser;
import com.spring.aop.one.UserService;
import com.spring.aop.one.UserServiceImpl;
import com.spring.aop.two.ObjectInterceptor;

public class AppTest{
	
	@Test
	public void testOne(){
		MyTransaction transaction = new MyTransaction();
		UserService userService = new UserServiceImpl();
		//产生静态代理对象
		ProxyUser proxy = new ProxyUser(userService, transaction);
		proxy.addUser(null);
		proxy.deleteUser(0);
	}
	
	@Test
	public void testTwo(){
		//目标类
		Object target = new UserServiceImpl();
		//事务类
		MyTransaction transaction = new MyTransaction();
		
		ObjectInterceptor proxyObject = new ObjectInterceptor(target, transaction);
        /**
         * 三个参数的含义：
         * 1、目标类的类加载器
         * 2、目标类所有实现的接口
         * 3、拦截器
         */
        UserService userService = (UserService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), proxyObject);
        userService.addUser(null);
	}
	
	@Test
    public void testAop(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser(null);
    }
}
