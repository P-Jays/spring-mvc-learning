package com.loveyou2.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/processform")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processversiontwo")
	public String shoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		
		String result = "HEY!"+ name.toUpperCase();
		
		model.addAttribute("shout", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processversionthree")
	public String shoutDudeThree( 
			@RequestParam("studentName") String name , Model model) {
		
		String result = "HEY Baby !"+ name.toUpperCase();
		
		model.addAttribute("shout", result);
		
		return "helloworld";
	}
}
