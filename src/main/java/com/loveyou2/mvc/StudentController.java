package com.loveyou2.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showform")
	public String showForm(Model model) {
		
		Student newStudent = new Student();
		
		model.addAttribute("student",newStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("first name: "+student.getFirstName());
		System.out.println("last name: "+student.getLastName());
		
		return "student-confirmation";
	}
}
