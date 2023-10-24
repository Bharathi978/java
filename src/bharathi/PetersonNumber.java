package bharathi;

import java.util.Scanner;

public class PetersonNumber {
	 
	 // 145 is PetersonNumber  : 1 +      4*3*2= 24 +  5*4*3*2*1 = 120      
	//  23 is not PetersonNumber:  2 + 3*2=6  = 8
	
	public static void main(String []args) {

	Scanner r = new Scanner(System.in);
	System.out.println("enter number");
	int n = r.nextInt();
	int temp = n, sum = 0;
    while (temp > 0) {
        int digit = temp % 10;
        sum += factorial(digit);
        temp /= 10;
    }
    if (sum == n) {
        System.out.println(n + " is a Peterson number.");
    } else {
        System.out.println(n + " is not a Peterson number.");
    }
}

public static int factorial(int n) {
    int fact = 1;
    for (int i = 2; i <= n; i++) {
        fact *= i;
    }
    return fact;
	
	
	
	
}
}
