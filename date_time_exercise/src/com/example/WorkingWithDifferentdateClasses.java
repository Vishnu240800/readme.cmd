package com.example;

import java.util.*;
import java.sql.*;
import java.time.*;

public class WorkingWithDifferentdateClasses {

	public static void main(String[] args) {
		
		//creating util date
		java.util.Date date1 = new java.util.Date();
		
		System.out.println(date1);
		System.out.println(date1.getTime());
		
		//util date to sqldate
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		
		System.out.println(date2);
		
		//sql date to loacldate
		LocalDate localDate =date2.toLocalDate();
		
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonth());

		
		java.sql.Date sqlDate2= java.sql.Date.valueOf(localDate);
		
		System.out.println("sql date 2 : " + sqlDate2);
	}

}