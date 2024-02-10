package com.anil.it.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jpa_student")
@Data
public class Student {

	@Id
	private Integer id;
	private String studentName;
	private String about;

	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private Laptops laptop;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Address>addressList=new ArrayList<>();
}
