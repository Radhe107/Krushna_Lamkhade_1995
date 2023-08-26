package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCon {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("going fatward with Ashok it");

		return "home";
	}

}
