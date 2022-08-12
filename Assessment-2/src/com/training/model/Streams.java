package com.training.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;
import com.training.model.StreamsResources.StreamService;

public class Streams{
	
	
	public static void main(String[] args)
	{
		List<StreamsResources> listValues = StreamService.streamService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================"+"Place"+"======================");
		
		System.out.println("Enter the country to find the place : ");
		
		String input1= sc.nextLine();
		
		List<String> findPlace = (List<String>) listValues.stream().filter(e-> e.getCountry().equals(input1)).map(r->r.getPlace()).collect(toList());
		
		findPlace.forEach(System.out::println);
		
		System.out.println("========================"+"Population"+"======================");
		
		System.out.println("Enter the country to find the population count : ");
		
		String input2= sc.nextLine();
		
		Long count=listValues.stream().filter(e->e.getCountry().contains(input2)).mapToLong(r->r.getPopulation()).sum();
			
		System.out.println(input2+" := total population = "+count);
				
		System.out.println("========================"+"City Count"+"======================");
		
		System.out.println("Enter the country to find the City Count : ");
		
		String input3= sc.nextLine();
		
		long findCityCount = listValues.stream().filter(e-> e.getCountry().equals(input3)).map(r -> r.getPlace()).count();
		
		System.out.println(input3+ " - " + findCityCount);
		
		
		sc.close();
	}

}

class StreamsResources{
		
	public String country;
	public String place;
	public long population;
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public long getPopulation() {
		return population;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}

	public StreamsResources(String country, String place, long population) {
		super();
		this.country = country;
		this.place = place;
		this.population = population;
	}

static class StreamService{
	
	public static ArrayList<StreamsResources> streamService()
	{
		
		StreamsResources obj = new StreamsResources("USA","Kansas City",501957l);
		StreamsResources obj1 = new StreamsResources("India","Chennai",7090000);
		StreamsResources obj2 = new StreamsResources("USA","Los Angeles",3970000);
		StreamsResources obj3 = new StreamsResources("Nepal","Kathmandu",1000000);
		StreamsResources obj4 = new StreamsResources("India","Kolkata",14900000);
		StreamsResources obj5 = new StreamsResources("USA","Denver",706000);
		
		
		ArrayList<StreamsResources> list= new ArrayList<StreamsResources>();
		
		list.add( obj);
		list.add( obj1);
		list.add( obj2);
		list.add( obj3);
		list.add( obj4);
		list.add( obj5);
		
		return list;
		
	}
	
}
}