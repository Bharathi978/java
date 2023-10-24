package org.list;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	
	
public static void main(String[] args) {
		
		
	
		
		List li = new ArrayList();
		li.add("bharathi");
		li.add(28);
		li.add(34556);
		li.add('A');
		li.add(25);
		
		
		System.out.println(li);
		
		
		
	System.out.println("========== for loop==========");	
		
		
	for (int i = 0; i < li.size(); i++) {
		
		System.out.println(li.get(i));
	}
	
	System.out.println("==============enhanced=========");	
	
	for (Object v : li) {
		System.out.println(v);}
		
	System.out.println("==========add 2 =======");
		
	li.add(1, "bhara");	
		
	System.out.println(li);
		
	System.out.println("==========remove========");	
		
	li.remove(2);
	System.out.println(li);
		
	System.out.println("==========set==========");
	  li.set(1, "aspire");
	System.out.println(li);
	
	
	System.out.println("==========index of==========");
	
	
	System.out.println(li.indexOf(34556));
	System.out.println(li.lastIndexOf('A'));
	
	System.out.println("==========contains========");
	System.out.println(li.contains(30));
	
	
	
	
	
	
	
}
	
	
	
	

}
