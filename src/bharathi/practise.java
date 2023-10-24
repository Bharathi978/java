package bharathi;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class practise {
	
	
	
	public static void main(String[] args) {
		
	
		
		Vector<Integer> i = new Vector<>();
		
		i.add(30);
		i.add(50);
		i.add(39);
		i.add(56);
		i.add(30);
		
	Iterator<Integer> k = i.iterator();

		
	while (k.hasNext()) {
		Integer t = k.next();
		if (t==30||t==39) {
			k.remove();
		}
	}
	
	for (Integer v : i) {
		System.out.println(v);
	}
	
	
	
	}
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//public static void main(String[] args) {
//	
//int num =  987654;
//int rem=0;
//int res=0;
//while (num>0) {
//	
//	rem=num%10;
//	res=res+rem;
//	num=num/10;
//	
//}
//	
//	System.out.println("ans ;"+res);
//}
























