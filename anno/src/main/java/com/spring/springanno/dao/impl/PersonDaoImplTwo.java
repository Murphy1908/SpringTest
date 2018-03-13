package com.spring.springanno.dao.impl;

import org.springframework.stereotype.Component;

import com.spring.springanno.dao.PersonDao;

@Component("personDaoImplTwo")
public class PersonDaoImplTwo implements PersonDao {

	@Override
	public void savePerson() {
		// TODO Auto-generated method stub
		System.out.println("save Person Two");
	}

}
