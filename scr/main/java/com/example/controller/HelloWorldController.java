package com.example.webapp1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to Technical Cloud Knowledge India"
			+
			"\n"
			+
			"MD Name Of Sanjay Dahiya"
			+
			"\n";
	}

}
