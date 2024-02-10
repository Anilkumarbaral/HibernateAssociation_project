package com.anil.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anil.it.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
