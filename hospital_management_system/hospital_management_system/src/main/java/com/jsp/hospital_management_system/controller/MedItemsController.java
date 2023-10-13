package com.jsp.hospital_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital_management_system.dto.Meditems;
import com.jsp.hospital_management_system.service.Meditemservice;

@RestController
public class MedItemsController {

	@Autowired
	private Meditemservice meditemservice;
	
	@PostMapping("/savemeditems")
	public Meditems saveMeditems(@RequestParam int mid,@RequestBody Meditems meditems) {
		return meditemservice.saveMeditems(meditems, mid);
		
	}
	
	@PutMapping("/updatemeditem")
	public Meditems updateMeditems(@RequestParam int id,@RequestBody Meditems meditems) {
		return meditemservice.updteMeditems(id, meditems);
		
	}
	
	@DeleteMapping("/deletemeditems")
	public Meditems deleteMeditems(@RequestParam int id) {
		return meditemservice.deleteMeditems(id);
		
	}
	
	@GetMapping("/getmeditemsbyid")
	public Meditems getMeditemsbyid(@RequestParam int id) {
		return meditemservice.getMeditemsbyid(id);
		
	}
}
