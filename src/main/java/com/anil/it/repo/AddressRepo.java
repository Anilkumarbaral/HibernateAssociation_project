package com.anil.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.it.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
	

}
