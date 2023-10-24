package bharathi;

import java.util.Scanner;

public class LargestnumberFind {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is " + largest);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
