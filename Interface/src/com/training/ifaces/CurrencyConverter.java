package com.training.ifaces;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;


//A class can only extends another class but it can implements one or more interfaces



public class CurrencyConverter implements Function/*,CheckCondition */ {
	
	@Override
	public double apply(double value) {
		return value * 100;
	}

//	@Override
//	public boolean test(int value) {
//		// TODO Auto-generated method stub
//		return false;
//	}
	

}