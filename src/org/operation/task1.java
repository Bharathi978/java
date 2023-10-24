package org.operation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class task1 {
	
	
	public static void main(String[] args) throws IOException {
		 File f = new File("D:\\ newfile\\file.txt");
		 
		//boolean main = f.mkdir();
		//System.out.println(main);
		
	//	boolean createNewFile = f.createNewFile();
	//	System.out.println(createNewFile);
		
//		FileUtils.write(f, "\nclass started",true);//0
//		
//	System.out.println("File writed");
//		
//		
//	FileUtils.write(f, "\n bharathi\n java",true);//1
//	FileUtils.write(f, "\n shrathi",true);//2
//	FileUtils.write(f, "\n kumar",true);//3
//	FileUtils.write(f, "\n muthu",true);//4
//	FileUtils.write(f, "\n arun",true);//5
//	FileUtils.write(f, "\n siva",true);//6
//	FileUtils.write(f, "\n sandal",true);//7
//	FileUtils.write(f, "\n madhan",true);//8
//	FileUtils.write(f, "\n vengat",true);//9
//	FileUtils.write(f, "\n balu",true);//10
//	FileUtils.write(f, "\n dhina",true);//11
		
		String readFileToString =  FileUtils.readFileToString(f);
		System.out.println(readFileToString.contains("java"));
     
		
	}
	
	

}
