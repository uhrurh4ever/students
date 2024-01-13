package com.example.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementSystem.Entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
