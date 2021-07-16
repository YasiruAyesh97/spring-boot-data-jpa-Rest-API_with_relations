package com.example.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.dto.Response;
import com.example.first.model.Student;
import com.example.first.service.StudentService;

@RestController
public class FirstController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/test")
	public String name() { 
		return "hello";
	}
	@GetMapping("/allStudent")
	public Iterable<Student> allStudent() { 
		return studentService.getAllStudent();
	}
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	} 
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	} 
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
	@GetMapping("getStudentByName/{name}")
	public Student getStudentByName(@PathVariable String name) { 
		return studentService.getStudentByName(name);
	}
	@PutMapping("updateStudentEmail")
	public void updateStudentEmail(@RequestBody Student student) { 
		 studentService.updateStudentEmail(student.getEmail(),student.getId());
	}
	@GetMapping("/allJoinStudent")
	public List<Response> allJoinStudent() { 
		return studentService.getStudentJoinData();
	}
}
