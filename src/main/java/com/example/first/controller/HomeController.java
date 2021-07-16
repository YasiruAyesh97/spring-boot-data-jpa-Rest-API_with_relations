package com.example.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.first.model.Student;
import com.example.first.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	StudentService studentService;

	@GetMapping(value="/home")
	public String welcome(Model model) {
		Iterable<Student> listStudents = studentService.getAllStudent();
		model.addAttribute("listStudents",listStudents);
		return "index";
	}
	
	
}
