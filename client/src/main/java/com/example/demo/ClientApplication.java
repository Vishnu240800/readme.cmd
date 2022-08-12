package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

//import com.example.demo.entity.Book;
import com.example.demo.ifaces.Bookrepo;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ClientApplication.class, args);
		
		Bookrepo obj = ctx.getBean(Bookrepo.class);
		
		System.out.println(obj.findAll());
	}

}
