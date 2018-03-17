package com.spring.aopmethod;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    /**
     * JoinPoint 能获取目标方法的一些基本信息
     * @param joinPoint
     */
/*    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知 ： " + joinPoint.getSignature().getName());
    }
     
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知 ： " + joinPoint.getSignature().getName() + " , -->" + ret);
    }
     
    public void myAfter(){
        System.out.println("最终通知");
    }*/
    
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }
    
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("前置通知");
        //手动执行目标方法
        Object obj = joinPoint.proceed();
         
        System.out.println("后置通知");
        return obj;
    }
}
