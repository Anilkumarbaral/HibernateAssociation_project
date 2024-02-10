package com.anil.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.it.entity.Laptops;

public interface LaptopRepository extends JpaRepository<Laptops, Integer>{

	
}
