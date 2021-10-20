/**
 * 
 */
package com.springrest.bugg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.bugg.entity.Student;
import com.springrest.bugg.services.StudentService;

/**
 * @author Aniket
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String testStudents() {
		return "Studetns";
	}
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		return this.studentService.getAllStudents();
	}
	
	@GetMapping("student/{studentId}")
	public Student getStudent(@PathVariable long studentId ) {
		return this.studentService.getStudent(studentId);
	}
	
	@PostMapping("/students")
	public Student addStudents(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
}
