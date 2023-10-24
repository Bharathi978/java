package org.encap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Javaquestion9daytask7quest {
	
	public static void main(String[] args) {
		
		Question9task7 r = new Question9task7();
		r.setName("Bharathi");
		r.setAddress("chennai");
		r.setDob("23.7.93");
		r.setDoj("12.2.2000");
		r.seteMail("sharathibharathi@gmail.com");
		r.setEmpid(1212);
		r.setGender("male");
		r.setPhNumber(9789268944l);
		r.setSalary(40000.00f);
		
		Question9task7 r1 = new Question9task7();
		r1.setName("sharathi");
		r1.setAddress("chennai");
		r1.setDob("23.7.93");
		r1.setDoj("12.2.2000");
		r1.seteMail("sharathi@gmail.com");
		r1.setEmpid(1213);
		r1.setGender("male");
		r1.setPhNumber(9789268944l);
		r1.setSalary(40000.00f);
		
		Question9task7 r2 = new Question9task7();
		r2.setName("madhan");
		r2.setAddress("chennai");
		r2.setDob("23.7.93");
		r2.setDoj("12.2.2000");
		r2.seteMail("madhan@gmail.com");
		r2.setEmpid(1214);
		r2.setGender("male");
		r2.setPhNumber(9789268944l);
		r2.setSalary(40000.00f);
		

		Question9task7 r3 = new Question9task7();
		r3.setName("muthu");
		r3.setAddress("chennai");
		r3.setDob("23.7.93");
		r3.setDoj("12.2.2000");
		r3.seteMail("sharathi@gmail.com");
		r3.setEmpid(1215);
		r3.setGender("male");
		r3.setPhNumber(9789268944l);
		r3.setSalary(40000.00f);
		
		Question9task7 r4 = new Question9task7();
		r4.setName("balu");
		r4.setAddress("chennai");
		r4.setDob("23.7.93");
		r4.setDoj("12.2.2000");
		r4.seteMail("balu@gmail.com");
		r4.setEmpid(1216);
		r4.setGender("male");
		r4.setPhNumber(9789268944l);
		r4.setSalary(40000.00f);
		
		Question9task7 r5 = new Question9task7();
		r5.setName("kumar");
		r5.setAddress("chennai");
		r5.setDob("23.7.93");
		r5.setDoj("12.2.2000");
		r5.seteMail("kumar@gmail.com");
		r5.setEmpid(1217);
		r5.setGender("male");
		r5.setPhNumber(9789268944l);
		r5.setSalary(40000.00f);
		
		Question9task7 r6 = new Question9task7();
		r6.setName("kavin");
		r6.setAddress("chennai");
		r6.setDob("23.7.93");
		r6.setDoj("12.2.2000");
		r6.seteMail("kavin@gmail.com");
		r6.setEmpid(1218);
		r6.setGender("male");
		r6.setPhNumber(9789268944l);
		r6.setSalary(40000.00f);
		

		Question9task7 r7 = new Question9task7();
		r7.setName("krishanan");
		r7.setAddress("chennai");
		r7.setDob("23.7.93");
		r7.setDoj("12.2.2000");
		r7.seteMail("krish@gmail.com");
		r7.setEmpid(1219);
		r7.setGender("male");
		r7.setPhNumber(9789268944l);
		r7.setSalary(40000.00f);
		
		Question9task7 r8 = new Question9task7();
		r8.setName("madhu");
		r8.setAddress("chennai");
		r8.setDob("23.7.93");
		r8.setDoj("12.2.2000");
		r8.seteMail("sharathibharathi@gmail.com");
		r8.setEmpid(1220);
		r8.setGender("female");
		r8.setPhNumber(9789268944l);
		r8.setSalary(40000.00f);
		

		
		Question9task7 r9 = new Question9task7();
		r9.setName("kamalam");
		r9.setAddress("chennai");
		r9.setDob("23.7.93");
		r9.setDoj("12.2.2000");
		r9.seteMail("sharathibharathi@gmail.com");
		r9.setEmpid(1221);
		r9.setGender("female");
		r9.setPhNumber(9789268944l);
		r9.setSalary(40000.00f);
		
	Map<Integer,Question9task7 > m = new LinkedHashMap<Integer,Question9task7>();
		
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
		
	Set<Entry<Integer, Question9task7>> set = m.entrySet();
		
  for (Entry<Integer, Question9task7> itr : set) {
	
	  System.out.println("Employee number; " + itr.getKey());
	  System.out.println(itr.getValue().geteMail());
	  System.err.println(itr.getValue().getEmpid());
	  System.out.println(itr.getValue().getAddress());
	  System.out.println(itr.getValue().getDob());
	  System.out.println(itr.getValue().getDoj());
	  System.out.println(itr.getValue().getName());
	  System.out.println(itr.getValue().getPhNumber());
	  System.out.println(itr.getValue().getSalary());
	  System.out.println(itr.getValue().getGender());
	  System.out.println("========================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
