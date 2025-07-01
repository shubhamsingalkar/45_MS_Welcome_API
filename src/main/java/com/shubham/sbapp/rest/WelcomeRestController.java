package com.shubham.sbapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	Environment env;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		String port = env.getProperty("server.port");// To get the port number used for the API.
		
	return "Welcome to Micro-Services ("+port+")";	
		
	/*
	 * Note: We can give port manually by using "run-configuraion" and then Argument
	 * tab inside we have give VM argument as -Dserver.port=<PortNumber>
	 */
	}
	
}
