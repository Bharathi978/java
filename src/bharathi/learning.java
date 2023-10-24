package bharathi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



public class learning {

	
	

		private static void tc1() {
			/// to find given number even or add //
			System.out.println("======================Tc1 ==============================================");

			int num = 8;
			if (num % 2 == 0) {
				System.out.println("it in even number :" + num);
			}

			else {
				System.out.println("it is ad number:" + num);
			}

		}

		private static void tc2() {
			/// to find even number between 0 to 10///
			System.out.println("======================Tc2=====================================================");

			int num = 10;
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}

		private static void tc3() {

			System.out.println("======================Tc3===================================================");

			// to find add number between 0 to 10
			int num = 10;
			for (int i = 0; i <= num; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}

		}

		private static void tc4() {
			// to find count of even number between 0 to 100//
			System.out.println("======================Tc4================================================");

			int num = 100;
			int count = 0;
			for (int i = 0; i <= num; i++) {
				if (i % 2 == 0) {
					count = count + 1;
				}
			}
			System.out.println("count of even number :" + count);

		}

		private static void tc5() {
			System.out.println("======================Tc5================================================");

			// TO find count of add number between 0 to 100//
			int num = 100;
			int count = 0;
			for (int i = 0; i <= num; i++) {
				if (i % 2 == 1) {
					count = count + 1;
				}
			}
			System.out.println("count of add number :" + count);
		}

		private static void tc6() {
			// the sum of number between 10 to 20
			System.out.println("======================Tc6================================================");

			int num = 100;
			int sum = 0;
			for (int i = 0; i <= num; i++) {
				sum = sum + i;

			}
			System.out.println(sum);
		}

		private static void tc7() {
			// to count of even and add number 0 to 20///
			System.out.println("========================Tc7================================================");

			int num = 20;
			int addcount = 0, evencount = 0;

			for (int i = 0; i <= num; i++) {
				if (i % 2 == 0) {
					evencount = evencount + 1;
				} else {
					addcount = addcount + 1;
				}
			}
			System.out.println("even number count:" + evencount);
			System.out.println("addd number count:" + addcount);
		}

		private static void tc8() {
			// to factorial of the given number//
			System.out.println("========================Tc8================================================");

			int num = 5;
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("factorail give the number:" + fact);

		}

		private static void tc9() {
			// To reverse the condision//
			System.out.println("========================Tc9================================================");

			int number = 1235;
			int remainder = 0;
			int result = 0;
			while (number > 0) {

				// To fetc the last digit
				remainder = number % 10; // remainder%10=5

				// add the last digit to variable
				result = result * 10 + remainder; // result= (0*10)+5

				// Remove the last digit
				number = number / 10; // number= 12345/10
			}

			System.out.println("Reversed is result:" + result);
			System.out.println("number is :" + number);
		}

		private static void tc10() {
			// 10. To get count of the given number //
			System.out.println("============================Tc10================================================");

			int number = 234567;
			int remainder = 0;
			int count = 0;
			while (number > 0) {

				// To fetc the last digit
				remainder = number % 10;

				count = count + 1;

				// Remove the last digit
				number = number / 10;
			}

			System.out.println("count is result:" + count);

		}

		private static void tc11() {
			// Product the digit//
			System.out.println("============================Tc11================================================");

			int number = 1265;
			int remainder = 0;
			int result = 3;
			while (number > 0) {

				// To fetc the last digit
				remainder = number % 10;

				result = result * remainder;

				// Remove the last digit
				number = number / 10;
			}
			System.out.println("product the digit :" + result);

		}

		private static void tc12() {

			// find Armstrong number//
			System.out.println("============================Tc12================================================");

			int number = 371;
			int emp = number;
			int remainder = 0;
			int result = 0;

			while (number > 0) {
				remainder = number % 10;
				result = result + (remainder * remainder * remainder);
				number = number / 10;
			}

			if (emp == result) {
				System.out.println("armstrong number is valid:" + result);
			} else {

				System.out.println("armstrong number is not valid;");
			}

		}

		private static void tc13() {
			// Fibonacci series
			System.out.println("============================Tc13================================================");

			int a = 1;
			int b = 4;

			for (int i = 0; i < 5; i++) {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}

		}

		private static void tc14() {

			// sorting the Array //
			System.out.println("============================Tc14================================================");

			int a[] = { 80, 74, 79, 98, 67, 73, 26, 63, 74, 18, 27, 36 };

			Arrays.sort(a);

			for (int i : a) {
				System.out.println(i);
			}

			System.out.println("maxvalue:" + a[a.length - 1]);
			System.out.println("minvalue:" + a[0]);
			System.out.println("2nd largest value:" + a[a.length - 2]);
		}

		private static void tc15() {

			// Reverse the String
			System.out.println("============================Tc15================================================");

			String s = "welcome bharathi";
			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				char c = s.charAt(i);
				rev = rev + c;

			}

			System.out.println("before reverse:" + s);

			System.out.println("after reverse :" + rev);

		}

		private static void tc16() {
			// palindrome
			System.out.println("============================Tc16================================================");

			String s = "nooon";
			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				char c = s.charAt(i);
				rev = rev + c;

			}

			if (s.equals(rev)) {
				System.out.println("given string  is palindrome");
			} else {
				System.out.println("given string  is  not palindrome");
			}
		}

		private static void tc17() {
			// Each word first letter convert capital//
			System.out.println("============================Tc17================================================");

			String s = "welcome to java class";
			String[] sp = s.split(" ");

			String res = "";

			for (String itr : sp) {
				char c = itr.charAt(0);
				char h = Character.toUpperCase(c);
				res = res + h + itr.substring(1) + " ";

			}

			System.out.println(res.trim());
		}

		private static void tc18() {
			// Each word is reverse //
			System.out.println("============================Tc18================================================");

			String s = "welcome to pythan course";
			//	String[] sp = s.split("");
			//	String res = " ";
			//	
			//	for (String itr : sp) {
			//		String rev= "";
			//		for (int i = itr.length()-1; i>=0; i--) {
			//			char ch = itr.charAt(i);
			//			rev=rev+ch;
			//		}
			//		res=res+rev+"";
			//	}
			//	
			//	System.out.println(res);

			String res = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				char c = s.charAt(i);
				res = res + c;
			}

			System.out.println(res);

		}

		private static void tc19() {

			// To remove the duplicate Array //
			System.out.println("============================Tc19================================================");

			int a[] = { 30, 40, 50, 50, 50, 40, 60, 70 };
			Set<Integer> s = new LinkedHashSet<Integer>();

			for (Integer itr : a) {
				s.add(itr);
			}

			System.out.println(s);
		}

		private static void tc20() {

			// To remove dublicates charaters in string//
			System.out.println("============================Tc20================================================");

			String s = "good morning good ...";
			String emp = "";
			Set<Character> d = new LinkedHashSet<Character>();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				d.add(ch);
			}

			for (Character itr : d) {
				emp = emp + itr;
			}

			System.out.println(s);
			System.out.println(emp);

		}

		private static void tc21() {
			// To remove dublicate word at string//
			System.out.println("============================Tc21================================================");

			String s = "good morning good";
			String[] d = s.split("");
			Set<String> k = new LinkedHashSet<String>();
			String res = "";
			for (String itr : d) {
				k.add(itr);
			}

			for (String i : k) {
				res = res + i + "";
			}
			System.out.println(res);

		}
		

		private static void tc22() {
			// sum of the digit
			System.out.println("============================Tc22================================================");

			int n = 263;
			int res = 0;
			int rem = 0;
			while (n > 0) {
				rem = n % 10;

				res = res + rem;
				n = n / 10;
			}
			System.out.println(res);

		}

		private static void tc23() {
			// sort the array without using predefined class and mehtods
			System.out.println("============================Tc23================================================");

			int a[] = { 100, 20, 30, 40, 60, 50, 70, 90 };
			System.out.println("before swap:");
			for (int i : a) {
				System.out.println(i);
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("after swap:");
			for (int ii : a) {
				System.out.println(ii);
			}

		}

		private static void tc24() {
			// RightTrianglePattern
			System.out.println("============================Tc24================================================");

			int i, j, g = 5;
			// outer loop for rows
			for (i = 0; i <=g; i++) {

				// inner loop for columns
				for (j = 1; j <= i; j++) {
					// prints stars
					System.out.print("0" + "1");
				}
				// throws the cursor in a new line after printing each line
				System.out.println();
			}
		}

		private static void tc25() {
			System.out.println("============================Tc25================================================");
			// LeftTrianglePattern

			int i, j, row = 6;
			// Outer loop work for rows
			for (i = 0; i < row; i++) {
				// inner loop work for space
				for (j = 2 * (row - i); j >= 0; j--) {
					// prints space between two stars
					System.out.print(" ");
				}
				// inner loop for columns
				for (j = 0; j <= i; j++) {
					// prints star
					System.out.print("* ");
				}
				System.out.println();
			}
		}

		private static void tc26() {
			// Reverse The string//
			System.out.println("============================Tc26================================================");
			String str = "Welcome";
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			String reversedStr = sb.toString();
			System.out.println(reversedStr);

		}

		private static void tc27() {
			System.out.println("============================Tc27================================================");

			// Acending order or decending order//

			Integer a[] = { 1, 1, 2, 3, 3, 5, 6, 7, 8, 9, };
			Arrays.sort(a);
			List<Integer> l = Arrays.asList(a);

			Integer max = Collections.max(l);
			System.out.println("max:" + max);

			Integer min = Collections.min(l);
			System.out.println("min :" + min);

			Collections.sort(l);
			System.out.println("asending :" + l);

			Collections.reverse(l);
			System.out.println("desending :" + l);


		}

		private static void tc28() {
			System.out.println("============================Tc28================================================");
			//  find the missing number 
			int n = 20;
			Integer[] a = { 1, 3, 6, 9, };

			List<Integer> list = Arrays.asList(a);

			for (int i = 1; i < 20; i++) {
				if (!list.contains(i)) {
					System.out.println(i);
				}
			}

		}

		private static void tc29() {

			// count between 0 to 50 prime number and get the prime number
			// Alter the prime number
			System.out.println("============================Tc29================================================");

			boolean isPrime;
			int alter = 0;
			int count = 0;


			for (int i = 2; i <= 50; i++) {
				isPrime = true;


				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {

						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					alter++;

					if (alter%2 ==1 ) {
						count++;
						System.out.println(i+" ");


					}

				}

			}
			System.out.println("total count :"+count);
		}



		private static void tc30() {
			System.out.println("============================Tc30================================================");
			
			 for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + "  ");
		            }
		            System.out.println();
		        }
		}
		
		
		private static  void tc31() {
			System.out.println("============================Tc31================================================");

			String s = "iam bharathi chennai";
			String[] l = s.split(" ");
			String res ="";

			for (String itr : l) {

				res=res+itr.substring(1);

			}
			System.out.println(res);
			
			
			
		}

			


		public static void main(String[] args) {
			learning j = new learning();
			Class<? extends learning> class1 = j.getClass();
			System.out.println(class1);
			Package package1 = class1.getPackage();
			System.out.println(package1);

			tc1();
			tc2();
			tc3();
			tc4();
			tc5();
			tc6();
			tc7();
			tc8();
			tc9();
			tc10();
			tc11();
			tc12();
			tc13();
			tc14();
			tc15();
			tc16();
			tc17();
			tc18();
			tc19();
			tc20();
			tc21();
			tc22();
			tc23();
			tc24();
			tc25();
			tc26();
			tc27();
			tc28();
			tc29();
			tc30();
			tc31();

		}








	}





	
	
	
	
	
	
	
	
	

