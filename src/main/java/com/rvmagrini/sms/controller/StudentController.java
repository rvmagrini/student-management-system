package com.rvmagrini.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rvmagrini.sms.service.StudentService;

//CONTROLLER CLASS: API LAYER
//- has all resources for our API


@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// Handling list students and return mode and view
	// GetMapping makes this method serve as a Restful End-Point:
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}

}
