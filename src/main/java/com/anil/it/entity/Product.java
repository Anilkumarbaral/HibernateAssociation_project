package com.anil.it.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="jpa_product")
@Data
public class Product {

	@Id
	private String pid;
	private String productName;
	
	@ManyToMany(mappedBy = "productsList",cascade=CascadeType.ALL)
	private List<Category>CategoryList;
}
