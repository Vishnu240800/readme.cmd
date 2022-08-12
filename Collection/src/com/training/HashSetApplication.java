package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetApplication {

	public static void main(String[] args) {
		
		Student ram=new Student(101,"ram",78);
		Student sathiya=new Student(102,"sathiya",68);
		Student vish=new Student(103,"vish",98);
		Student ram1=new Student(103,"loki",98);
		
		Set<Student> set =new TreeSet<>();
		set.add(ram);
		set.add(sathiya);
		set.add(vish);
		set.add(ram1);
		
		
//		for (Student eachStudent:set)
//		{
//			System.out.println(eachStudent.getFirstName());
//		}
//		
	    set.forEach(System.out::println);
		System.out.println(set.size());
		
		
	}

}
