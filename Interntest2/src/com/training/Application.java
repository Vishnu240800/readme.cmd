package com.training;

import static java.util.stream.Collectors.toList;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		
		List<StreamApi> listElements =StrList.streamList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PLACE name :");
		String input=sc.next();
		
		
		Function<StreamApi,String> mapcountry =e->e.getCountry();
		Predicate<StreamApi> place =r->r.getPlace().equals(input);
		List<String> table = listElements.stream().filter(place).map(mapcountry).collect(toList());
		table.forEach(System.out::println);
		
		System.out.println("Enter the COUNTRY to find its population :");
		String input1=sc.next();
		Function<StreamApi,Long> people =e->e.getPopulation();
		Predicate<StreamApi> area =r->r.getCountry().equals(input1);
		List<Long> table1 = listElements.stream().filter(area).map(people).collect(toList());
		table1.forEach(System.out::println);
		
		System.out.println("Enter  the COUNTRY name to find its number of occurence");
		String b = sc.next();
		long list =listElements.stream().filter(e->e.getCountry().equals(b)).count();
		System.out.println(b +"-"+list);
		sc.close();

	}
}
