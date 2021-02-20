package com.example.examplerest.pojo.specialized;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examplerest.pojo.business.Persons;
import com.example.examplerest.service.RedisHashService;


@Service
public class PersonsService {
	
	@Autowired
	private RedisHashService service;
	
	public Persons findPersons(String idPersons) {
		return service.getAndParse("PERSONS", idPersons, Persons.class);
	}
	
	

}
