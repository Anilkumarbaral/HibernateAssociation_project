package com.anil.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="jpa_addresstbl")
@Data
public class Address {
	
	@Id
	private Integer addressId;
	private String street;
	private String city;
	private String country;
	
	@ManyToOne
	private Student student;

}
