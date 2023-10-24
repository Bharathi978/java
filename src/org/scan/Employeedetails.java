package org.scan;

import java.util.Scanner;

public class Employeedetails {
	public static void main(String[] args) {
		
		Scanner l =new Scanner(System.in);
		System.out.println("empName");
		String nextLine = l.nextLine();
		System.out.println("empName"+ nextLine);
		
		System.out.println("emp id:");
		long nextLong = l.nextLong();
		System.out.println("emp id:" + nextLong);

		System.out.println("emp Phone no");
		long nextLong2 = l.nextLong();
		System.out.println("emp phone no "+nextLong2);
	
		System.out.println("emp salary");
		float nextFloat = l.nextFloat();
		System.out.println("emp salary "+nextFloat);
		
		System.out.println("emp Gender");
	String next2 = l.next();
		System.out.println("emp Gender "+ next2);
		
		System.out.println("emp City");
		String next = l.next();
		System.out.println("emp City "+next);
}
}