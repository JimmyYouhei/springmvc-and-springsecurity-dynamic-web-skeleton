package com.jimmyyouhei.springmvc_and_springsecurity.controller;

import javax.validation.Valid;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jimmyyouhei.springmvc_and_springsecurity.entity.Student;

@Controller
public class CourseValidation {
	
	@GetMapping("/admin")
	public String courseForm(Model model) {
		
		Student newStudent = new Student();
		
		model.addAttribute("student" , newStudent);
		
			return "CourseForm";
	}

	@PostMapping("/admin/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student newStudent , BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			System.out.println("error");
			return "CourseForm";

		} else {
			System.out.println("ok");
			return "showInfor";
		}
		
	}
	
	@ModelAttribute
	public void nationsToChooseFrom(Model model) {
		model.addAttribute("nations", new String[] {"Vietnam" , "US" , "UK" , "China" , "French"});
	}
	
	@ModelAttribute
	public void coursesToChoose(Model model) {
		 model.addAttribute("courses", new String[] {"C#", "Java" ,"C++" , "Python" , "Ruby"} );	
	}
	
	@ModelAttribute
	public void languageseToChooseFrom(Model model) {
		model.addAttribute("languages" , new String[] {"Vietnamese" , "English" , "French"});
	}
	
	
}
