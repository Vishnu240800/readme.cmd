package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class NewproApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewproApplication.class, args);
	}
	
	@RequestMapping(path = "/api/v1")
	@Controller
	public class Home{
		
		@RequestMapping(path = "/home")
		@ResponseBody
		public String hello(){
			
			return getMessage();
		}
	
	
		@ModelAttribute
		public String getMessage()
		{
			return " <h1 style=color:blue> welcome to mvc </h1> ";
		}
	}
	}


