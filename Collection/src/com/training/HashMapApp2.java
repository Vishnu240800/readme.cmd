package com.training;

import java.util.*;
import java.util.Map.Entry;

public class HashMapApp2 {

	public static void main(String[] args) {
		
		
		Student ram = new Student (101, "anand", 78);
		Student shyam = new Student (102, "basky", 68);
		Student mukesh = new Student (103, "mukesh", 78); 

		HashMap<Integer, Student> map= new HashMap<>();


		map.put(900, ram);
		map.put(902, shyam);
		map.put(904, mukesh);
	
		System.out.println("==============================access using  normal method========================================");
		System.out.println();
		//access using normal method
		System.out.println(map.get(900));
		System.out.println(map.get(902));
		System.out.println(map.get(904));
		
		
		
		System.out.println("===================================printing keys=================================================");
		System.out.println();
		//access using keys
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		System.out.println("===================================access using keys=============================================");
		System.out.println();
		for (Integer key :keys)
		{
			System.out.println(map.get(key));
		}
		
		
		
		System.out.println("====================================access using values==========================================");
		System.out.println();
		//access using values
		Collection <Student> list = map.values();
		
		for (Student eachStudent:list)
		{
			System.out.println(eachStudent);
		}
		System.out.println("=======================access by using both key and value by entry method========================");

		System.out.println();
		//access by using both key and value by entry method
		Set<Map.Entry<Integer, Student>> list2=map.entrySet();
		
		for (Entry<Integer, Student> eachEntry: list2)
		{
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		System.out.println("=================================================================================================");
		
	}
	

}
