package com.singh.springrest.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singh.springrest.demo.model.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Amrit", "Singh"));
		students.add(new Student("John", "Doe"));
		students.add(new Student("Mary", "Sue"));
		
		return students;
	}

}
