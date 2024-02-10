package com.anil.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="jpa_laptops")
@Data
public class Laptops {
	
	@Id
	private Integer laptopId;
	private String laptopModel;
	private String laptopBrand;

	@OneToOne
	@JoinColumn(name="student_id_ref")
	private Student student;
}
