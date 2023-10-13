package com.jsp.hospital_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.hospital_management_system.dao.Persondao;
import com.jsp.hospital_management_system.dto.Person;

@Service
public class Personservice {

	@Autowired
	private Persondao persondao;
	
	public Person savePerson(Person person) {
		return persondao.savePerson(person);
		
	}
	public Person updatePerson(int id,Person person) {
		Person dbPerson=persondao.updatePerson(id, person); 
		if(dbPerson!=null) {
			return dbPerson;
		}else {
			return null;
		}
		
	}
	public Person deletePerson(int id) {
		Person person=persondao.deletePerson(id);
		if(person!=null) {
			return person;
		}else {
			return null;
		}
		
	}
	public Person getPersonbyid(int id) {
		Person person=persondao.getPersonbyid(id);
		if(person!=null) {
			return person;
		}else {
			return null;
		}
		
	}
	public List<Person> getallPersons() {
		return persondao.getallperson();
	}
}
