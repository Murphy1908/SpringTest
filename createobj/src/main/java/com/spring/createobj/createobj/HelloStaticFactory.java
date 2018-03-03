package com.spring.createobj.createobj;

public class HelloStaticFactory {
	
    public HelloStaticFactory(){
        System.out.println("HelloStaticFactory constructor");
    }
    
    //静态工厂方法
    public static CreateObj getInstances(){
        return new CreateObj();
    }
}
