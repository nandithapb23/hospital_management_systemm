package com.jsp.hospital_management_system.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital_management_system.dto.Medorder;
import com.jsp.hospital_management_system.service.Medorderservice;

@RestController
@Validated
public class MedorderController {

	@Autowired
	private Medorderservice medorderservice;
	
	@PostMapping("/savemedorder")
	public Medorder saveMedorder(@Valid @RequestParam int eid,@RequestBody Medorder medorder) {
		return medorderservice.saveMedorder(medorder, eid);
		
	}
	
	@PutMapping("/updatemedorder")
	public Medorder updateMedorder(@Valid @RequestParam int id,@RequestBody Medorder medorder) {
		return medorderservice.updateMedorder(id, medorder);
		
	}
	
	@DeleteMapping("/deletemedorder")
	public Medorder deleteMedorder(@Valid @RequestParam int id) {
		return medorderservice.deleteMedorder(id);
		
	}
	
	@GetMapping("/getmedorderbyid")
	public Medorder getMedorderbyid(@Valid @RequestParam int id) {
		return medorderservice.getMedorderbyid(id);
		
	}
}
