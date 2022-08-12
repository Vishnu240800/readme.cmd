package com.training;

import java.util.*;


class StrList {
	
	public static List<StreamApi> streamList(){
		
		StreamApi area1 = new StreamApi("USA","Kansas City",501927);
		StreamApi area2 = new StreamApi("India","Chennai",7090000);
		StreamApi area3 = new StreamApi("USA","Los Angles",3970000);
		StreamApi area4 = new StreamApi("Nepal","Kathmandu",1000000);
		StreamApi area5 = new StreamApi("India","Kolkata",14900000);
		StreamApi area6 = new StreamApi("USA","Kansas City",706000);
		
		ArrayList<StreamApi> list = new ArrayList<StreamApi>();
		
		list.add(area1);
		list.add(area2);
		list.add(area3);
		list.add(area4);
		list.add(area5);
		list.add(area6);
		return list;
	}

}