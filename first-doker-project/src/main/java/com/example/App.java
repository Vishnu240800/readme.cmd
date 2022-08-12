package com.example;

import java.util.List;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     List<String> names = Arrays.asList("surya","Abhi","sathiya","lokesh");
     
     names.forEach(System.out::println);
    }
    }
