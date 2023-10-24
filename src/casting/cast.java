package casting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class cast {

	String FirstReverse(String str) {
		return new StringBuilder(str).reverse().toString();	
	}

	String SecondReverse(String as) {
		return new StringBuilder(as).reverse().toString();
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		cast p = new cast();
		cast o = new cast(); 
		System.out.println(p.FirstReverse(s.nextLine()));
		System.out.println(o.SecondReverse(s.nextLine()));

	}}


//
//	// Static method
//	  static void myStaticMethod() {
//	    System.out.println("Static methods can be called without creating objects");
//	  }
//
//	  // Public method
//	  public void myPublicMethod() {
//	    System.out.println("Public methods must be called by creating objects");
//	  }
//
//	  // Main method
//	  public static void main(String[] args) {
//	    myStaticMethod();
//	    cast myObj = new cast(); // Create an object of MyClass
//	    myObj.myPublicMethod(); // Call the public method
//	  }
//
//
//	  }











//Widening Casting
//		
//				int myInt = 9;
//				double myDouble=myInt;  //  Automatic casting: int to double
//		
//				System.out.println(myInt);
//				System.out.println(myDouble);
//		
//		
//		
//				//Narrowing Casting
//		
//				double myDoubl = 9.78d;
//				int myIn = (int) myDoubl; // Manual casting: double to int
//		
//				System.out.println(myDoubl);   // Outputs 9.78
//				System.out.println(myIn);      // Outputs 9
//		







