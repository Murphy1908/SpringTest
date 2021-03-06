package com.spring.createobj.createobj;

import org.junit.*;
import org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateObjTest{

	/**
	 * 传统的测试对象方法
	 * 用于测试对象创建
	 */
	@Test
	public void testTradion(){
		CreateObj creobj = new CreateObj();
		creobj.sayHello();
	}
	
	/**
     *  Spring 容器利用构造函数创建对象
     */
    @Test
    public void testCreateObjectByConstrutor(){
        //1、启动 spring 容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");	//Spring的配置文件尽量放在根目录上
        //2、从 spring 容器中取出数据
        CreateObj IOC = (CreateObj) context.getBean("createObj");
        //3、通过对象调用方法
        IOC.sayHello();
         
        //利用配置文件 alias 别名属性创建对象
        CreateObj IOC2 = (CreateObj) context.getBean("createObj2");
        IOC2.sayHello();
    }
    
    /**
     * Spring 容器利用静态工厂方法创建对象
     */
    @Test
    public void createObjectStaticFactory(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CreateObj staticFactory =
                (CreateObj) context.getBean("helloStaticFactory");
        staticFactory.sayHello();
    }
    
    /**
     * Spring 容器利用实例工厂方法创建对象
     */
    @Test
    public void createObjectInstanceFactory(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CreateObj staticFactory =
                (CreateObj) context.getBean("instance");
        staticFactory.sayHello();
    }
    
    /**
     * 用于查看bean创建过程中是否调用无参构造函数
     */
    @Test
    public void WhenCreateObject(){
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    /**
     * 用于验证单例、多例模式
     */
    @Test
    public void test_scope_single_CreateObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CreateObj Obj1 = (CreateObj) context.getBean("createObj");
        CreateObj Obj2 = (CreateObj) context.getBean("createObj");
        System.out.println(Obj1.equals(Obj2)); //true
    }
    
    /**
     * Spring容器初始化和销毁
     */
    @Test
    public void testSpringLifeCycle(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringLifeCycle hello = (SpringLifeCycle) context.getBean("springLifeCycle");
         
        hello.sayHello();
         
        //销毁spring容器
        ClassPathXmlApplicationContext classContext = (ClassPathXmlApplicationContext) context;
        classContext.close();
    }
}
