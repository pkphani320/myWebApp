package com.myWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myWebApp {
	
	@GetMapping("getMessage")
	public String getMessage() {
		return "pratice";
	}

}
