package org.excp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SampleExpection {

	public static void main(String[] args) throws IOException {
		
		
		
System.out.println("==========arithamatic exception========");
		
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4/0);
//		System.out.println(5);
		
		
// null exception

//		String s = null;
//		System.out.println(System.identityHashCode(s));
//		System.out.println(s.charAt(10));
//		
// index bonding error
//		         String u = "hai";
//				 System.out.println(u.charAt(6));
//		
		
// Array index output bond exception
//		 int a [] = new int [4];
//		 
//		 a[1]= 10;
//		 a[2]= 20;
//		 a[3]=30;
//		 a[4]= 40;
//		 
		
//	java.lang.IndexOutOfBoundsException
//		List li = new ArrayList ();
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		System.out.println(li.get(5));
		
//	 java.lang.NumberFormatException
//		
//    	String j = "@38692";
//	    int price = Integer.parseInt(j);
//		
//		if (price>= 50000) {
//			System.out.println("product is grater than 50 k");
//		}
//		else {
//			System.out.println("product is less than 50 k");
//		}
//	
//  java.util.InputMismatchException
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter value");
	int int1 = sc.nextInt();
	System.out.println("value enter"+int1);
	
// checked exception
		
	File f = new File("D:\\");
	f.createNewFile();
	
	
// try catch finally method
	
	System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(4/0);}
	
	catch (  Exception e) {
		 System.out.println("dont try zero");}
	
	finally {
		System.out.println("done");}
	
	System.out.println(5);
	System.out.println(6);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
