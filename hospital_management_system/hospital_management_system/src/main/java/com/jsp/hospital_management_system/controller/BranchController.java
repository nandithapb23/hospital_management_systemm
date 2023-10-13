package com.jsp.hospital_management_system.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital_management_system.dto.Branch;
import com.jsp.hospital_management_system.service.Branchservice;

@RestController
public class BranchController {

	@Autowired
	private Branchservice branchservice;
	
	@PostMapping("/savebranch")
	public Branch saveBranch(@Valid @RequestBody Branch branch, @RequestParam int hid,@RequestParam int aid) {
		return branchservice.saveBranch(hid, aid, branch);
		
	}
	
	@PutMapping("/updatebranch")
	public Branch updateBranch(@Valid @RequestParam int id,@RequestBody Branch branch) {
		return branchservice.updateBranch(id, branch);
		
	}
	
	@DeleteMapping("/deletebranch")
	public Branch deleteBranch(@Valid @RequestParam int id) {
		return branchservice.deleteBranch(id);
		
	}
	
	@GetMapping("/getbrnchbyid")
	public Branch getBranchbyid(@Valid @RequestParam int id) {
		return branchservice.getBranchbyid(id);
		
	}
}
