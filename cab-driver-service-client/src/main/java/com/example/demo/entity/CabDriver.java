package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "Gows_Cab_Driver")
public class CabDriver {
	
	@Id
	@Column(name = "driver_Id")
	int driverId;
	
	@Column(name = "driver_Name")
	String driverName;
	
	@Column(name = "mobile_Number")
	long mobileNumber;
	
	@Column(name = "rating")
	double rating;
	

}
