package com.training.ifaces;

import com.training.services.CurrencyConveter;

public class Application {
	
	public static void print(Converter<Double,Double> conv)
	{
		System.out.println(conv.convert(100.00));
	}

	public static void main(String[] args) {
		
		Converter<Double, Double>  obj =new CurrencyConveter();
		System.out.println(obj.convert(20.0));
		
		
		Converter<Double,Double> lambda =(val)->val *200.0;
		print(lambda);
		//System.out.println(lambda.convert(20.00));
		
		Converter<String, Integer> strLength=(str) -> str.length();
		
		System.out.println(strLength.convert("chennai"));

	}

}
