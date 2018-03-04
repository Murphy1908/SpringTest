package com.spring.createobj.createobj;

/**
 * 定义对象
 *
 */
public class CreateObj 
{
	/**
	 * 加入的无参构造函数
	 */
	public CreateObj(){
		System.out.println( "HelloIOC default Constructor" );
	}
	
    public void sayHello()
    {
        System.out.println( "Hello IOC!" );
    }
}
