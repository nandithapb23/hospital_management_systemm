package com.jsp.hospital_management_system.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "name should not be blank")
	@NotNull(message = "name should not be null")
	private String name;
	@NotBlank(message = "email should not be blank")
	@Pattern(regexp ="^[A-Za-z0-9+_.-]+@(.+)$")
	private String email;
	
}
