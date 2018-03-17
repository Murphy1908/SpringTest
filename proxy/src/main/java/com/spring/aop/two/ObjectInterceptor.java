package com.spring.aop.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.spring.aop.one.MyTransaction;

public class ObjectInterceptor implements InvocationHandler {

	//目标类
	private Object target;
	//切面类（这里指事物类）
	private MyTransaction transaction;
	
	//通过构造器赋值
	public ObjectInterceptor( Object target, MyTransaction transaction ){
		this.target = target;
		this.transaction = transaction;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//开启事务
		this.transaction.before();
		//调用目标类方法
		method.invoke(this.target, args);
		//提交事务
		this.transaction.after();
		return null;
	}

}
