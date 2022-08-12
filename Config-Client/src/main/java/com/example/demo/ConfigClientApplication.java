package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User.User;
import com.example.demo.repos.AddressRepository.AddressRepository;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	@Value("${customer.firstName}")
	private String name;
	
	@GetMapping(path = "/names")
	public String getName()
	{
		return this.name;
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ConfigClientApplication.class, args);
		
//		AddressRepository repo = ctx.getBean(AddressRepository.class);
//		
//		System.out.println(repo.findAll());
		
	}

}
