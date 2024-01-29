package com.ravi.Spring_Security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/index")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String index() {
		return "index";
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String about() {
		return "about";
	}
}
