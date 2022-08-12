package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripDTO {
	
	private CabDriver driver;
	private List<TripDetail> trip;

}
