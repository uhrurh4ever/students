package com.example.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.StudentManagementSystem.Entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Oleg","Mongol","mongol@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Ivan","Ivanov","ivanov@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Tolik","Figolik","golik@gmail.com");
		studentRepository.save(student3); */
	}

}
