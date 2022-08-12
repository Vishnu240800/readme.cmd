package com.traning.model;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class files {
	
	public static void main(String[] args) throws IOException {
		File files=new File("E:\\training\\Fruit.txt");
		boolean alreadyPresent =files.exists();
		System.out.println(alreadyPresent);
		if(alreadyPresent==false) {
			try {
				boolean created=files.createNewFile();
				System.out.println("file created"+created);
				FileWriter file= new FileWriter(files);
				BufferedWriter bwiter=new BufferedWriter(file);
				bwiter.write("Apple is red in colour");
				bwiter.flush();
				bwiter.close();
				
				bwiter.newLine();
				bwiter.write("orange is round in shape");
				bwiter.flush();
				bwiter.close();
				
				bwiter.newLine();
				bwiter.write("banana is good for health");
				bwiter.flush();
				bwiter.close();
				 
				bwiter.newLine();
				bwiter.write("grapes grown as bunch");
				bwiter.flush();
				bwiter.close();
				
				bwiter.newLine();
				bwiter.write("mango is seasonal fruit");
				bwiter.flush();
				bwiter.close();
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File files1=new File("E:\\training\\Files.txt");
		boolean Present =files.exists();
		System.out.println(Present);
		if(Present==false) {
			try {
				boolean created=files1.createNewFile();
				System.out.println("file created"+created);
				BufferedWriter bwiter1=new BufferedWriter(new FileWriter(files1));
				bwiter1.write("description");
				bwiter1.flush();
				bwiter1.close();
				
				  
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	BufferedReader breader=new BufferedReader(new FileReader(files));
	String line=breader.readLine();
	while(line!=null) {
		System.out.println(line);
		line=breader.readLine();
		BufferedWriter bwiter2=new BufferedWriter(new FileWriter(files1,true));
		
		
	}
		files.delete();

}
}