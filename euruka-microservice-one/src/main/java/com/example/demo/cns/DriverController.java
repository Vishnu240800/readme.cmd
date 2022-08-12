package com.example.demo.cns;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;


@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {
	
	
	private DriverService service;
	
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
		@GetMapping(path= "/drivers")
		public List<Driver> getAllDrivers(){
			
			return this.service.findAll();
			
		}
		@GetMapping(path = "/drivers/{id}")
		public Driver getDriverById(@PathVariable("id") int id) {
			return this.service.findById(id);
		}
		
		@GetMapping(path = "/drivers/name/{driverName}")
		public List<Driver> getDriverByName(@PathVariable("driverName") String srchName) {
			return this.service.findByDrivername(srchName);
		}
		
		@GetMapping(path = "/drivers/number/{mobileNumber}")
		public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber") long phoneNumber) {
			return this.service.findByMobileNumber(phoneNumber);
		}
		
		@GetMapping(path = "/drivers/rating/{rating}")
		public List<Driver> getDriverByRating(@PathVariable("rating") double rating) {
			return this.service.searchByRating(rating);
		}
		
		
		@PutMapping(path = "/drivers/update/{id}/{rating}")
		public ResponseEntity<String> updateDriver( @PathVariable("id") int driverId, @PathVariable("rating")double updatedRating){
			
			int driver = this.service.modifyRating(driverId, updatedRating);
		
			return ResponseEntity.ok().body(driver + " row updated"); 


		}
		

		@GetMapping(path = "/drivers/sort/{propName}")
		public List<Driver> sortedByDriver(@PathVariable("propName") String propValues) {
			return this.service.sortedList(propValues);
		}
		
		
		
		@PostMapping(path = "/drivers")
		public ResponseEntity<Driver> addDriver(@RequestBody Driver entity){
			
			Driver driver = this.service.add(entity);
			
			URI location=
			           ServletUriComponentsBuilder
			          .fromCurrentRequest()				//http:locahhost:8080/drivers
			         .path("/{id}")							//http:locahhost:8080/drivers/{id}
			          .buildAndExpand(entity.getDriverId())	//http:locahhost:8080/drivers/103
			          .toUri();  
			
			return ResponseEntity.created(location).body(driver);  


		}
		
		@DeleteMapping(path="/drivers/remove/{id}")
		public String removeDriver(@PathVariable("id") int id)
		{
			 return this.service.delete(id);
			 
		}
		
		
		

}
	