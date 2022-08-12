package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
public class Collectionsday2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Collectionsday2Application.class, args);
		
		BookService obj=ctx.getBean(BookService.class);
		System.out.println(obj.findAll());
		
	}
	@Bean
	public Book harrypotter() {
		return new Book(101, "Sathiya", 99);
				
	}

}
