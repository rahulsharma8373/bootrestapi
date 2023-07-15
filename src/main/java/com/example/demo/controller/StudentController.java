package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Student;

@RestController
public class StudentController {
	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		Student student = new Student(1, "rahul", "sharma");
		return student;
	}

//http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudentList() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "rahul", "sharma"));
		students.add(new Student(2, "sharma", "kumar"));
		students.add(new Student(3, "kumar", "siwan"));
		System.out.println(students);
		return students;

	}
// pathvariable
//http://localhost:8080/students/1

	@GetMapping("student/{id}/{first-name}/{last-name}")
	public Student studentParhvariable(@PathVariable("id") int studentId, @PathVariable("first-name") String firstName,
			@PathVariable("last-name") String lastName) {
		return new Student(studentId, firstName, lastName);
	}
	
	//http://localhost:8080/students/query?id=1
	@GetMapping("/students/query")
	public Student studentRequestVariable(@RequestParam int id) {
		return new Student(id,"rahul","kumar");
		
	}
// http post request 
	// @postmaping and @requestbody
	@PostMapping("/student/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getFirstname());
		System.out.println(student.getLastName());
		return student;
		
	}
}
