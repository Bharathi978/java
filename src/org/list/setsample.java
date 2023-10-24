package org.list;

import java.util.Set;
import java.util.TreeSet;

public class setsample {
	
	
	public static void main(String[] args) {
		Set f = new TreeSet();
		
		
		f.add(10);
		f.add(20);
		f.add(30);
		f.add(40);
		f.add(70);
		f.add(50);
		
			
			
			System.out.println(f.size());
			
			System.out.println(f.contains(40));
		// remove
			f.remove(70);
			System.out.println(f);
				
				
		
			// enhance(forech)	
			for (Object h : f) {
				System.out.println(h);
			}	
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	

}
