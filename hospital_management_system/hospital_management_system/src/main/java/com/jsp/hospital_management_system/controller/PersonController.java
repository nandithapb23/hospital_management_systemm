package com.jsp.hospital_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital_management_system.dto.Person;
import com.jsp.hospital_management_system.service.Personservice;

@RestController
public class PersonController {

	@Autowired
	private Personservice personservice;
	
	@PostMapping("/saveperson")
	public Person savePerson(@RequestBody Person person) {
		return personservice.savePerson(person);
	}
	
	@PutMapping("/updateperson")
	public Person updatePerson(@RequestParam int id,@RequestBody Person person) {
		return personservice.updatePerson(id, person);
		
	}
	
	@DeleteMapping("/deleteperson")
	public Person deletePerson(@RequestParam int id) {
		return personservice.deletePerson(id);
		
	}
	
	@GetMapping("/getpersonbyid")
	public Person getPersonbyid(@RequestParam int id) {
		return personservice.getPersonbyid(id);
		
	}
}
