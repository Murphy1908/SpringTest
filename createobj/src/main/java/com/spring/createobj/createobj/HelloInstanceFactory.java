package com.spring.createobj.createobj;

public class HelloInstanceFactory {
	
    public HelloInstanceFactory(){
        System.out.println("实例工厂方法构造函数");
    }
 
    //利用实例工厂方法创建对象
    public CreateObj getInstance(){
    	CreateObj instanceIoc = new CreateObj();
        return instanceIoc;
    }
}
