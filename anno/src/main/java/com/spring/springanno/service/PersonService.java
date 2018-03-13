package com.spring.springanno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springanno.dao.PersonDao;

@Service("personService")
public class PersonService {

	@Autowired
	private PersonDao personDaoImplOne;
	
	public void savePerson() {
		this.personDaoImplOne.savePerson();
	}
	
}
