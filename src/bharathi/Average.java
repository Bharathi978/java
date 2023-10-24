package bharathi;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	
	
	
  // Average value
	 public static void main(String[ ] args) {
		 
		    Scanner scanner = new Scanner(System.in);
	        
	        ArrayList<Integer> nums = new ArrayList<Integer>();
	        
	        int sum = 0;
	        while(nums.size()<2){
	            int num = scanner.nextInt();
	            
	            
	            //your code goes here
	            nums.add(num);
	            sum +=num;
	        }
	        
	        //calculate and output the average integer value
	        System.out.println(sum/2);
	    }
	
	
}
