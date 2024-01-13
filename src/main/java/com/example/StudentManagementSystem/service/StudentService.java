package com.example.StudentManagementSystem.service;

import java.util.List;

import com.example.StudentManagementSystem.Entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
