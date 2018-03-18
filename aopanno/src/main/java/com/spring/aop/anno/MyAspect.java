package com.spring.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {
	
	/**
	 * JoinPoint 能获取目标方法的一些基本信息
	 * @param joinPoint
	 */
	@Before(value="execution(* com.spring.aop.anno.*.*(..))")
	public void myBefore(JoinPoint joinPoint){
		System.out.println("前置通知："+joinPoint.getSignature().getName());
	}
	
	@AfterReturning(value="execution(* com.spring.aop.anno.*.*(..))",returning="ret")
	public void myAfterReturing(JoinPoint joinPoint, Object ret){
		System.out.println("后置通知："+joinPoint.getSignature().getName()+",-->"+ret);
	}
}
