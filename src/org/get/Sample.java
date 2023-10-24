package org.get;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sample {
public static void main(String[] args) {
	
	
	
	
	GetterSample u = new GetterSample(10, "bharathi", 2245546738278l);
	GetterSample u1 = new GetterSample(20 , "vel", 43526627272l);
	GetterSample u2 =new GetterSample(30, "kumar", 453636329l);
	
	
	
	// Crate user defined list
	List<GetterSample> li = new ArrayList<>();
	li.add(u);
	li.add(u1);
	li.add(u2);
	for (GetterSample x : li) {
		System.out.println(x.id);
		System.out.println(x.name);
		System.out.println(x.phone);
	}
	System.out.println("id is "+li.get(0).id);
	System.out.println("name is "+li.get(0).getName());
	System.out.println("phone num: "+li.get(0).getPhone());
	
	
	// user defind set
	
	
/*	Set<GetterSample>li = new LinkedHashSet<GetterSample>();
	li.add(u);
	li.add(u1);
	li.add(u2);
	for (GetterSample k : li) {
		
		System.out.println("id is "+k.getId());
		System.out.println("name is "+k.getName());
		System.out.println("phone no is "+k.getPhone());
		
	}*/

	
	
	
	
	
}
	
	
	
	
	
}
