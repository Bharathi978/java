package org.scan;

import java.util.Scanner;

public class StudentFile {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("student Name ");
		String nextLine = k.nextLine();
		System.out.println("student Name "+ nextLine);
		
		System.out.println("student Id ");
		long nextLong = k.nextLong();
		System.out.println("student Id" +nextLong);
		
		System.out.println("Mark 1");
		byte nextByte = k.nextByte();
		System.out.println("Mark 1 "+nextByte);
		
		System.out.println("Mark 2");
		byte nextByte2 = k.nextByte();
		System.out.println("Mark 2 "+nextByte2);
		
		System.out.println("Mark 3");
		byte nextByte3 = k.nextByte();
		System.out.println("Mark 3 "+nextByte3);
		
		System.out.println("Mark 4");
		byte nextByte4 = k.nextByte();
		System.out.println("Mark 4 "+nextByte4);
		
		System.out.println("Mark 5");
		byte nextByte5 = k.nextByte();
		System.out.println("Mark 5 "+nextByte5);
		
		System.out.println("Average");
		float average = ((nextByte+nextByte2+nextByte3+nextByte4+nextByte5)/5);
		System.out.println(average);
	}
	
	
	

}
