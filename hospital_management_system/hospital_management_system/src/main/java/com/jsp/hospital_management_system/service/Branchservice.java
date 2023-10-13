package com.jsp.hospital_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.hospital_management_system.dao.Branchdao;
import com.jsp.hospital_management_system.dto.Branch;

@Service
public class Branchservice {

	@Autowired
	private Branchdao branchdao;
	
	public Branch saveBranch(int hid,int aid,Branch branch) {
		return branchdao.saveBranch(hid, aid, branch);
		
	}
	public Branch updateBranch(int id,Branch branch) {
		Branch dbBranch=branchdao.updateBranch(id, branch);
		if(dbBranch!=null) {
			return dbBranch;
		}else {
			return null;
		}
		
	}
	public Branch deleteBranch(int id) {
		Branch branch=branchdao.deleteBranch(id);
		if(branch!=null) {
			return branch;
		}else {
			return null;
		}
		
	}
	public Branch getBranchbyid(int id) {
		Branch branch=branchdao.getbranchbyid(id);
		if(branch!=null) {
			return branch;
		}else {
			return null;
		}
		
	}
}
