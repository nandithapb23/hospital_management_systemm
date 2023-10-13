package com.jsp.hospital_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital_management_system.dto.Encounter;
import com.jsp.hospital_management_system.service.Encounterservice;
import com.jsp.hospital_management_system.util.ResponseStructure;

@RestController
public class EncounterController {

	@Autowired
	private Encounterservice encounterservice;
	
	@PostMapping("/saveencounter")
	public ResponseEntity<ResponseStructure<Encounter>> saveEncounter(@RequestBody Encounter encounter,@RequestParam int pid,@RequestParam int bid) {
		return encounterservice.saveEncounter(encounter, pid, bid);
		
	}
	@PutMapping("/updatencounter")
	public ResponseEntity<ResponseStructure<Encounter>> updatEncounter(@RequestParam int id,@RequestBody Encounter encounter,@RequestParam int bid) {
		return encounterservice.updateEncounter(id, encounter, bid);
		
	}
	
	@DeleteMapping("/deleteencounter")
	public ResponseEntity<ResponseStructure<Encounter>> deletEncounter(@RequestParam int id) {
		return encounterservice.deletEncounter(id);
		
	}
	
	@GetMapping("/getencounterbyid")
	public ResponseEntity<ResponseStructure<Encounter>> getEncounterbyid(@RequestParam int id) {
		return encounterservice.getEncounterbyid(id);
		
	}
}
