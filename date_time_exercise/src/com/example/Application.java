package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		
		
		Student ram=new Student(101, "Ram", 
									LocalDate.of(1972, 10, 12), 
									LocalDateTime.of(2000, Month.JUNE, 5, 9, 30));
		Student shyam=new Student(102, "shyam", 
									LocalDate.now(),
									LocalDateTime.now());
		
		System.out.println("Rams year of birth :" + ram.getDateOfBirth().getYear());
		System.out.println("Rams first birthday :" + ram.getDateOfBirth().plus(1, ChronoUnit.YEARS));
		
		System.out.println("Shyams year of birth :" + ram.getDateOfBirth().getYear());
		System.out.println("Shyams 60th birthday :" + ram.getDateOfBirth().plus(60, ChronoUnit.YEARS));
		System.out.println("Shyam's Previous Birthday "+shyam.getDateOfBirth().minus(2,ChronoUnit.YEARS));
		System.out.println("Shyam's  Birthday after 2 months "+shyam.getDateOfBirth().plus(2,ChronoUnit.MONTHS));
	}

}
