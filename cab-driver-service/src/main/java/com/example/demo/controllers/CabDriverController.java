package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;



@RestController
@RequestMapping(path = "api/v1/drivers")
@CrossOrigin(origins = "*")
public class CabDriverController {
	
	@Autowired
	private CabDriverService service;

	public CabDriverController(CabDriverService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public CabDriver add(@RequestBody CabDriver entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<CabDriver> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(value = "/findById/{id}")
	public Optional<CabDriver> findById(@PathVariable("id") int id){
		return this.service.findById(id);
	}
	
	@DeleteMapping(value = "/deleteById")
	public void remove(int id) {
		
		Optional<CabDriver> foundElement = this.service.findById(id);
		
		if(foundElement.isPresent()) {
			this.service.remove(id);
		}else {
			throw new RuntimeException("Element with"+ id + "not present");
		}
	}

}
