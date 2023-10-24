package org.map;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapsample {


	public static void main(String[] args) {



		Map<Integer, String> n = new HashMap();

		n.put(1, "bharathi");
		n.put(2, "muthu");
		n.put(3, "vengat");
		n.put(4, "dear");
		   
			
				System.out.println(n);
		
				System.out.println(n.size());
				System.out.println(n.containsKey(5));
				System.out.println(n.containsValue("muthu"));
				System.out.println(n.get(4));
				System.out.println(n.keySet());
				System.out.println(n.values());
				

//
//			  Set<Entry<Integer, String>> entrySet = n.entrySet();
//			for (Entry<Integer, String> entry : entrySet) {
//				  String value = entry.getValue();
//				System.out.println(value);
//
//		
		
		

		for(Integer i :n.keySet()) {
			System.out.println(i);
		}


	}





	//		List li = new ArrayList();
	//		
	//		li.add("bharathi"); //0
	//		li.add("muthu");    //1
	//		li.add("sandal");   //2
	//		li.add(97); //3
	//		li.add(97);         //4
	//		li.add('y');//5
	//		
	//		// list convert to Set  
	//		Set<Integer> u = new HashSet<>();
	//		u.addAll(li);
	//		System.out.println("remove Dublicate :"+ u);
	//		




	//		System.out.println(li);
	//		
	//		System.out.println("========================");
	//		
	//		for (int i = 0; i < li.size(); i++) {
	//			System.out.println(li.get(i));
	//		}
	//		
	//	System.out.println("========================");
	//	
	//	
	//	for (Object v : li) {
	//		System.out.println(v);
	//	}
	//	System.out.println("========================");
	//	
	//	li.add(1, "kumar");
	//	System.out.println(li);
	//	
	//	System.out.println("========================");
	//	
	//	li.remove(2);
	//	System.out.println(li);
	//	
	//	System.out.println("========================");
	//	
	//	li.set(3, "aspire");
	//	System.out.println(li);
	//	
	//	System.out.println("========================");
	//	
	//	li.size();
	//
	//	System.out.println(li);
	//	
	//	System.out.println("========================");
	//	
	//	Object object = li.get(3);
	//	System.out.println(object);
	//	System.out.println("========================");
	//	
	//	
	//	System.out.println(li.indexOf(97));
	//	System.out.println(li.lastIndexOf(97));
	//	
	//	System.out.println(li.contains('y'));

	//	



}































