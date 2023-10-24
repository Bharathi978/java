package bharathi;

import java.util.Scanner;

public class Square {


  // Square number or not checking

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = s.nextInt();

		int square = num* num;

		String a = Integer.toString(num);
		String a1 = Integer.toString(square);


		if (a1.endsWith(a)) {
			System.out.println(num + " is an automorphic number.");
		} else {
			System.out.println(num + " is not an automorphic number.");


		}




	}






}
