package com.training;

import java.util.Scanner;
import java.util.TreeSet;

class Fruit implements Comparable<Fruit>{
	
	public String fruitNames;

	public String getFruitNames() {
		return fruitNames;
	}

	public void setFruitNames(String fruitNames) {
		this.fruitNames = fruitNames;
	}

	public Fruit(String fruitNames) {
		super();
		this.fruitNames = fruitNames;
	}

	@Override
	public int compareTo(Fruit value) {
		return this.fruitNames.compareTo(value.fruitNames);
	}

	@Override
	public String toString() {
		return this.fruitNames;
	}
	
	
}


public class DuplicationRemovel {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Enter The No.Elements : ");
		int n = sca.nextInt();
		String[] str = new String[n];
		System.out.println("Enter The Values : ");
		for(int i=0;i< n;i++) {
			str[i]=sca.next();
		}
		
		TreeSet<String> set =new TreeSet<>();
		for(int i=0;i<str.length;i++) {
			String value=str[i];
			set.add(value);
		}
		
		System.out.println(set);
	}
		
	}


