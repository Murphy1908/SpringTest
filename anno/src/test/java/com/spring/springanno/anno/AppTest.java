package com.spring.springanno.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	@Test
	public void testAnnotation(){
		/**
		 * 1、启动Spring容器
		 * 2、从Spring容器中取出数据
		 * 3、通过对象调用方法
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)context.getBean("PersonDI");	//@Component中不加内容默认是首字母小写的类名
		System.out.println(person.getPname());
	}
	
	@Test
	public void testDIStudent(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)context.getBean("PersonDI");	//@Component中不加内容默认是首字母小写的类名
		person.showStudent();
		person.showStudent1();
	}

}
