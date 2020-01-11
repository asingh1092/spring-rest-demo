package com.singh.springrest.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singh.springrest.demo.model.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;
	
	// define @PostConstruct data to load the student data
	@PostConstruct
	public void loadData() {
		students = new ArrayList<>();
		students.add(new Student(0, "Mario", "Rossi"));
		students.add(new Student(1, "Amrit", "Singh"));
		students.add(new Student(2, "John", "Doe"));
		students.add(new Student(3, "Mary", "Sue"));
	}
	
	// define endpoint for "/students" - returns list of students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}
	
	//define endpoint for "/student/{studentId}" - returns student 
	@GetMapping("/student/{studentId}")
	public Student getStudentsId(@PathVariable int studentId) {
		return students.get(studentId);
	}

}
