package com.jimmyyouhei.springmvc_and_springsecurity.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/loginPage")
	public String loginHomePage() {
		return "login";
	}
	
	@GetMapping("/")
	public String homePage() {
			return "page1";
	}
	
	@GetMapping("/page2")
	public String page2() {
		return "page2";
	}
	
	
}
