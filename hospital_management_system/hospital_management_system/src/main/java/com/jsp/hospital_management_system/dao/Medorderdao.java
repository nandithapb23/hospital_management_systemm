package com.jsp.hospital_management_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.hospital_management_system.dto.Encounter;
import com.jsp.hospital_management_system.dto.Medorder;
import com.jsp.hospital_management_system.repo.MedorderRepo;

@Repository
public class Medorderdao {

	@Autowired
	private MedorderRepo medorderRepo;
	
	@Autowired
	private Encounterdao encounterdao;
	
	public Medorder saveMedorder(Medorder medorder,int eid) {
		Encounter encounter=encounterdao.getEncounterbyid(eid);
		medorder.setEncounter(encounter);
		return medorderRepo.save(medorder);
		
	}
	public Medorder updateMedorder(int id,Medorder medorder) {
		if(medorderRepo.findById(id).isPresent()) {
			medorder.setId(id);
			return medorderRepo.save(medorder);
		}else {
			return null;
		}
		
	}
	public Medorder deleteMedorder(int id) {
		if(medorderRepo.findById(id).isPresent()) {
			Medorder medorder=medorderRepo.findById(id).get();
			medorderRepo.deleteById(id);
			return medorder;
		}else {
			return null;
		}
		
	}
	public Medorder getMedorderbyid(int id) {
		return medorderRepo.findById(id).get();
		
	}
}
