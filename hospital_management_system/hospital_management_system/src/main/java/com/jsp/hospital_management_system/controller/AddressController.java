package com.jsp.hospital_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital_management_system.dto.Address;
import com.jsp.hospital_management_system.service.Addressservice;

@RestController
public class AddressController {

	@Autowired
	private Addressservice addressservice;
	
	@PostMapping("/saveaddress")
	public Address saveAddress(@RequestBody Address address) {
		return addressservice.saveAddress(address);
		
	}
	
	@PutMapping("/updateaddress")
	public Address updateAddress(@RequestParam int id,@RequestBody Address address) {
		return addressservice.updateAddress(id, address);
		
	}
	
	@DeleteMapping("/deleteaddress")
	public Address deleteAddress(@RequestParam int id) {
		return addressservice.deleteAddress(id);
		
	}
	
	@GetMapping("/getaddressbyid")
	public Address getaddressbyid(@RequestParam int id) {
		return addressservice.getAddressbyid(id);
		
	}
}
