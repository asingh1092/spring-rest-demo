package com.singh.springrest.demo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singh.springrest.demo.exception.StudentErrorResponse;
import com.singh.springrest.demo.exception.StudentNotFoundException;
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

	// define endpoint for "/student/{studentId}" - returns student
	@GetMapping("/student/{studentId}")
	public Student getStudentsId(@PathVariable int studentId) {

		// Check studentId against list size
		if (studentId >= students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student Id not found - " + studentId);
		}

		return students.get(studentId);
	}
}
