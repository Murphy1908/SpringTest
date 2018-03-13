package com.spring.springanno.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author gz_zz
 * 使用@Component切勿加入带参构造函数
 * 
 */
@Component("PersonDI")	//@Component中不加内容默认是首字母小写的类名
public class Person 
{
	private int pid;
	private String pname;
	private String psex;
	
	@Resource(name="student")
	private Student student;
	
	public void showStudent(){
		this.student.showStudent();
	}
	
	@Autowired
	private Student student1;
	
	public void showStudent1(){
		this.student1.showStudent();
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	
}
