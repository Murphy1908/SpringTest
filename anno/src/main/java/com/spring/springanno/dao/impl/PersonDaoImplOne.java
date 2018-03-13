package com.spring.springanno.dao.impl;

import org.springframework.stereotype.Component;

import com.spring.springanno.dao.PersonDao;

@Component("personDaoImplOne")
public class PersonDaoImplOne implements PersonDao{
	
	@Override
	public void savePerson() {
		System.out.println("save Person One");
	}

}
