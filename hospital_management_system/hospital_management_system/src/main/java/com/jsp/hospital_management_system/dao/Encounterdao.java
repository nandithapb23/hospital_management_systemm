package com.jsp.hospital_management_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.hospital_management_system.dto.Encounter;
import com.jsp.hospital_management_system.repo.EncounterRepo;

@Repository
public class Encounterdao {

	@Autowired
	private EncounterRepo encounterRepo;
	
	public Encounter saveEncounter(Encounter encounter) {
		return encounterRepo.save(encounter);
		
	}
	public Encounter updatEncounter(int id,Encounter encounter) {
		if(encounterRepo.findById(id).isPresent()) {
			encounter.setId(id);
			return encounterRepo.save(encounter);
		}else {
			return null;
		}
		
	}
	public Encounter deletEncounter(int id) {
		if(encounterRepo.findById(id).isPresent()) {
			Encounter encounter=encounterRepo.findById(id).get();
			encounterRepo.deleteById(id);
			return encounter;
		}else {
			return null;
		}
		
	}
	public Encounter getEncounterbyid(int id) {
		return encounterRepo.findById(id).get();
		
	}
}
