package com.anil.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.it.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

	
}
