package org.operation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class OpenOne {
public static void main(String[] args) throws IOException {
	File z = new File("D:\\ google.txt");
	boolean NewFile = z.createNewFile();
	System.out.println(NewFile);
	//write file
	FileUtils.write(z, "bharathi \tjava \nclass");
	FileUtils.write(z, "\nselenium", true);
	
	boolean canExecute = z.canExecute();
	System.out.println(canExecute);
	
	boolean canRead = z.canRead();
	System.out.println(canRead);
	
	boolean canWrite = z.canWrite();
	System.out.println(canWrite);
	
	boolean file = z.isFile();
	System.out.println(file);
	
	List<String> readLines = FileUtils.readLines(z);
	System.out.println(readLines);
	
	for (String stg : readLines) {
		System.out.println(stg);}
	
	
	
	String toString = FileUtils.readFileToString(z);
	System.out.println(toString);
}
}
