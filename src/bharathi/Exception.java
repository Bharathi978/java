package bharathi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

public static void main(String[] args) {
	
	
	System.out.println("Enter Some Input");
	 Scanner e = new Scanner(System.in);
	try {
	
	int i = e.nextInt();
	int a = i%0;
	System.out.println(a);
	
	}
	catch (ArithmeticException k) {
		System.err.println("Divisible zero not possible");
	}
	catch (InputMismatchException k2) {
		
	System.err.println("Input must be number");
	
	}
	
	System.out.println("completed");
	
	
	
	
	
}




}

