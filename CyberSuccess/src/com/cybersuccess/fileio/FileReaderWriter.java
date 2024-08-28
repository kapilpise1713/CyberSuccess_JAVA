package com.cybersuccess.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileReaderWriter {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileReader fReader = new FileReader("D:\\ss.txt");
		FileWriter fWriter = new FileWriter("D:\\Destination.txt");
		int info;
		while((info=fReader.read()) != -1) {
			System.out.println(" "+(char)info);
			fWriter.write(info);
		}
		fReader.close();
		fWriter.close();
		
		
	}

}
