package org.encap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Javaday9task6 {
	public static void main(String[] args) {
		
		Questionensacpe9day r = new Questionensacpe9day();
		r.setName("Bharathi");
		r.setAddress("chennai");
		r.setDob("23.7.93");
		r.setDoj("12.2.2000");
		r.seteMail("sharathibharathi@gmail.com");
		r.setEmpid(1212);
		r.setGender("male");
		r.setPhNumber(9789268944l);
		r.setSalary(40000.00f);
		
		
		Questionensacpe9day r1 = new Questionensacpe9day();
		r1.setName("Sharathi");
		r1.setAddress("madurai");
		r1.setDob("23.7.94");
		r1.setDoj("12.4.2000");
		r1.seteMail("sharathi@gmail.com");
		r1.setEmpid(1213);
		r1.setGender("male");
		r1.setPhNumber(9789246784l);
		r1.setSalary(50000.00f);
		
		
		Questionensacpe9day r2 = new Questionensacpe9day();
		r2.setName("Muthu");
		r2.setAddress("kovai");
		r2.setDob("7.7.1998");
		r2.setDoj("12.2.2020");
		r2.seteMail("muthu@gmail.com");
		r2.setEmpid(1214);
		r2.setGender("male");
		r2.setPhNumber(972668944l);
		r2.setSalary(90000.00f);
		
		
		Questionensacpe9day r3 = new Questionensacpe9day();
		r3.setName("Dina");
		r3.setAddress("Bangalore");
		r3.setDob("23.7.96");
		r3.setDoj("11.2.2000");
		r3.seteMail("dhina@gmail.com");
		r3.setEmpid(1215);
		r3.setGender("male");
		r3.setPhNumber(9789968944l);
		r3.setSalary(990000.00f);
		
		
		Questionensacpe9day r4 = new Questionensacpe9day();
		r4.setName("Balu");
		r4.setAddress("madurai");
		r4.setDob("23.7.94");
		r4.setDoj("12.2.2000");
		r4.seteMail("sharathi@gmail.com");
		r4.setEmpid(1216);
		r4.setGender("male");
		r4.setPhNumber(9789268944l);
		r4.setSalary(2000000.00f);
		
		
		Questionensacpe9day r5 = new Questionensacpe9day();
		r5.setName("subbu");
		r5.setAddress("kovai");
		r5.setDob("23.7.92");
		r5.setDoj("12.2.2020");
		r5.seteMail("subbu@gmail.com");
		r5.setEmpid(1217);
		r5.setGender("male");
		r5.setPhNumber(9789268944l);
		r5.setSalary(80000.00f);
		
		
		
		
		Questionensacpe9day r6 = new Questionensacpe9day();
		r6.setName("Bharathy");
		r6.setAddress("chennai");
		r6.setDob("23.7.93");
		r6.setDoj("12.2.2000");
		r6.seteMail("sharathibharathi@gmail.com");
		r6.setEmpid(1218);
		r6.setGender("male");
		r6.setPhNumber(9789268944l);
		r6.setSalary(40000.00f);
		
		
		Questionensacpe9day r7 = new Questionensacpe9day();
		r7.setName("kannan");
		r7.setAddress("kerala");
		r7.setDob("23.7.93");
		r7.setDoj("1.2.2000");
		r7.seteMail("kanna@gmail.com");
		r7.setEmpid(1219);
		r7.setGender("male");
		r7.setPhNumber(9789268944l);
		r7.setSalary(30000.00f);
		
		
		Questionensacpe9day r8 = new Questionensacpe9day();
		r8.setName("madhu");
		r8.setAddress("tirchy");
		r8.setDob("23.7.93");
		r8.setDoj("12.2.2000");
		r8.seteMail("tiruchy@gmail.com");
		r8.setEmpid(1220);
		r8.setGender("male");
		r8.setPhNumber(9789268944l);
		r8.setSalary(43454000.00f);
	
		
		Questionensacpe9day r9 = new Questionensacpe9day();
		r9.setName("kavin");
		r9.setAddress("kovai");
		r9.setDob("23.7.93");
		r9.setDoj("12.2.2000");
		r9.seteMail("sharath23bharathi@gmail.com");
		r9.setEmpid(1221);
		r9.setGender("male");
		r9.setPhNumber(9789268944l);
		r9.setSalary(4765000.00f);
		
		Map<Integer, Questionensacpe9day> m = new LinkedHashMap<Integer,Questionensacpe9day>();
		
		m.put(1, r);
		m.put(2, r1);
		m.put(3, r2);
		m.put(4, r3);
		m.put(5, r4);
		m.put(6, r5);
		m.put(7, r6);
		m.put(8, r7);
		m.put(9, r8);
		m.put(10, r9);
		
	Set<Entry<Integer, Questionensacpe9day>> set = m.entrySet();
		
  for (Entry<Integer, Questionensacpe9day> itr : set) {
	
	  System.out.println("Employee number; " + itr.getKey());
	  System.out.println(itr.getValue().geteMail());
	  System.err.println(itr.getValue().getEmpid());
	  System.out.println(itr.getValue().getAddress());
	  System.out.println(itr.getValue().getDob());
	  System.out.println(itr.getValue().getDoj());
	  System.out.println(itr.getValue().getName());
	  System.out.println(itr.getValue().getPhNumber());
	  System.out.println(itr.getValue().getSalary());
	  
	  System.out.println("========================");
	  
	  
	  
	  
	  
}
  
  
  
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
