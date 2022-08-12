package com.training.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
	
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\training\\Fruit.txt");
		boolean Present =file.exists();
		System.out.println(Present);
		if(Present==false) {
			try {
				boolean created=file.createNewFile();
				System.out.println("file created"+created);
				FileWriter fileW= new FileWriter(file);
				BufferedWriter bufferW=new BufferedWriter(fileW);
				bufferW.write("Apple is red in colour");
				bufferW.flush();
				bufferW.close();
				
				bufferW.newLine();
				bufferW.write("orange is round in shape");
				bufferW.flush();
				bufferW.close();
				
				bufferW.newLine();
				bufferW.write("banana is good for health");
				bufferW.flush();
				bufferW.close();
				 
				bufferW.newLine();
				bufferW.write("grapes grown as bunch");
				bufferW.flush();
				bufferW.close();
				
				bufferW.newLine();
				bufferW.write("mango is seasonal fruit");
				bufferW.flush();
				bufferW.close();
				
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		File files1=new File("E:\\training\\Files.txt");
		boolean isPresent =file.exists();
		System.out.println(isPresent);
		if(Present==false) {
			try {
				boolean created=files1.createNewFile();
				System.out.println("file created"+created);
				BufferedWriter bwiter1=new BufferedWriter(new FileWriter(files1));
				bwiter1.write("description");
				bwiter1.flush();
				bwiter1.close();
				
				  
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	BufferedReader breader=new BufferedReader(new FileReader(file));
	String line=breader.readLine();
	while(line!=null) {
		System.out.println(line);
		line=breader.readLine();
		BufferedWriter bufferW1=new BufferedWriter(new FileWriter(files1,true));
		
		
	}
		file.delete();

}
}