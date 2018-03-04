package com.spring.springdi.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Person 
{
	private Long pid;
	private String pname;
	private Student students;
	private List lists;
	private Set sets;
	private Map maps;
	private Properties properties;
	
	public Person() {
		super();
	}

	public Person(Long pid, String pname, Student students, List lists, Set sets, Map maps, Properties properties) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.students = students;
		this.lists = lists;
		this.sets = sets;
		this.maps = maps;
		this.properties = properties;
	}
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	public List getLists() {
		return lists;
	}
	public void setLists(List lists) {
		this.lists = lists;
	}
	public Set getSets() {
		return sets;
	}
	public void setSets(Set sets) {
		this.sets = sets;
	}
	public Map getMaps() {
		return maps;
	}
	public void setMaps(Map maps) {
		this.maps = maps;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
