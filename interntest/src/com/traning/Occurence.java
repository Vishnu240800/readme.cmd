package com.traning;


import java.util.*;

public class Occurence {
	
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter The Total Count Of Values : ");
			int n =sc.nextInt();
			int[] array= new int[n];
			int[] array1= new int[n];
			System.out.println("Enter The Values : ");
			for(int i =0;i<n;i++) {
				array[i]=sc.nextInt();
				array1[i]=array[i];
			}
			Arrays.sort(array1);
			for(int i=0;i<array1.length;i++){
				int count=0;
				String position="";
				if(i==0 || array1[i-1]!=array1[i]){
					for(int j=0;j<array.length;j++){
						if(array1[i]==array[j]){
							count++;
							position+=Integer.toString(j)+",";
						}
					}
					System.out.println(array1[i]+" = "+count);
					System.out.println("Position : "+position.substring(0,position.length()-1));
				}
				else{
					continue;
				}
			}
		sc.close();
		}
	}