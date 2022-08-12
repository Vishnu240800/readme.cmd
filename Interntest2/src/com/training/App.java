package com.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class App {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("File.txt");
		BufferedReader br = new BufferedReader(new FileReader("Fruit.txt"));
		
		String line = br.readLine();
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
			
		}
		pw.flush();
		br.close();
		pw.close();
		

	}

}
