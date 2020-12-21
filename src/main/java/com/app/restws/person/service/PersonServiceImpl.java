package com.app.restws.person.service;

import org.springframework.stereotype.Service;

import com.app.restws.person.model.Address;
import com.app.restws.person.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	public String getPersons() {
		Person p = new Person();
		Address a = new Address();

		p.setPid(100);
		p.setName("AbcPerson");
		a.setCity("Pentapadu");
		p.setAddress(a);

		return p.toString();

	}

	@Override
	public String getPerson() {

		return getPersons();
	}

}
