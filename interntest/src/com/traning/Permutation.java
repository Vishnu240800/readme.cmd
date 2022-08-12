package com.traning;

import java.util.Scanner;

class Function{
	
	public void permute(String str,int start,int end )
	{
		if(start == end)
		{
			System.out.println(str);
		}
		else
		{
			for (int i=0;i<=end;i++)
			{
				str = swap(str,start,i);
				permute(str,start+1,end);
				str=swap(str,start,i);
			}
		}
	}
	
	
	private String swap(String str, int i, int j) {
		
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
	}

}

public class Permutation {

	public static void main(String[] args) {
	
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter The String : ");
		String str=sca.nextLine();
		int len=str.length();
		
		Function function= new Function();
		function.permute(str, 0, len-1);	
		sca.close();
	}

}
