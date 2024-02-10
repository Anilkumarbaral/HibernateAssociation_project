package com.anil.it.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="jpa_category")
@Data
public class Category {

	@Id
	private String cid;
	private String titile;
	
	@ManyToMany
	private List<Product>productsList;
}
