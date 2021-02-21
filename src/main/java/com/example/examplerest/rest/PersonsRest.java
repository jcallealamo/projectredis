package com.example.examplerest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.examplerest.pojo.business.Persons;
import com.example.examplerest.pojo.specialized.PersonsService;

@RestController
@RequestMapping("/operation")
public class PersonsRest {
	
	@Autowired
	private PersonsService personsService;
	
	@GetMapping
	public Persons findPersons(@RequestParam String idPersons)  {
		System.out.println("hola coñita");
		return personsService.findPersons(idPersons);
	}

}
