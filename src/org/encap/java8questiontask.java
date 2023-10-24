package org.encap;

import java.util.LinkedHashSet;
import java.util.Set;

public class java8questiontask {
	public static void main(String[] args) {
		QuestionEncap e = new QuestionEncap();
		e.setEmpid(1122);
		e.setName("muthu");
	    e.setPhNumber(9876543210l);
	    e.setAddress("omr chennai");
	    e.setDob("15.02.1995");
	    e.setDoj("10.01.2022");
	    e.seteMail("San7@gamil.com");
	    e.setGender("male");
	    e.setSalary(23525.45f);
	    
	    QuestionEncap e2 = new QuestionEncap();
	    e2.setEmpid(1123);
		e2.setName("ganesh");
	    e2.setPhNumber(8976543210l);
	    e2.setAddress("Thambaram chennai");
	    e2.setDob("18.01.1995");
	    e2.setDoj("10.02.2022");
	    e2.seteMail("kumar@gamil.com");
	    e2.setGender("male");
	    e2.setSalary(32525.45f);
	    
	    QuestionEncap e3 = new QuestionEncap();
	    e3.setEmpid(1120);
		e3.setName("bharathy");
	    e3.setPhNumber(6988543210l);
	    e3.setAddress("sengalpattu chennai");
	    e3.setDob("24.07.1995");
	    e3.setDoj("10.02.2021");
	    e3.seteMail("bharat@gamil.com");
	    e3.setGender("male");
	    e3.setSalary(29525.45f);
	    
	    QuestionEncap e4 = new QuestionEncap();
	    e4.setEmpid(1115);
		e4.setName("venkat");
	    e4.setPhNumber(8976543210l);
	    e4.setAddress("vadapalani chennai");
	    e4.setDob("28.09.1994");
	    e4.setDoj("20.05.2020");
	    e4.seteMail("venkat7@gamil.com");
	    e4.setGender("male");
	    e4.setSalary(30025.45f);
		
	    QuestionEncap e5 = new QuestionEncap();
	    e5.setEmpid(1126);
		e5.setName("arjun");
	    e5.setPhNumber(6976543280l);
	    e5.setAddress("Nellai");
	    e5.setDob("02.09.1998");
	    e5.setDoj("20.05.20222");
	    e5.seteMail("arjun6@gamil.com");
	    e5.setGender("male");
	    e5.setSalary(18025.45f);
	    
	    QuestionEncap e6 = new QuestionEncap();
	    e6.setEmpid(1012);
		e6.setName("balu");
	    e6.setPhNumber(9976543210l);
	    e6.setAddress("madurai");
	    e6.setDob("15.1.1990");
	    e6.setDoj("20.05.2016");
	    e6.seteMail("balu1@gamil.com");
	    e6.setGender("male");
	    e6.setSalary(50025.45f);
	    
	    QuestionEncap e7 = new QuestionEncap();
	    e7.setEmpid(1119);
		e7.setName("mannan");
	    e7.setPhNumber(8975543210l);
	    e7.setAddress("Bangalore");
	    e7.setDob("6.09.1989");
	    e7.setDoj("20.05.2009");
	    e7.seteMail("mannan77@gamil.com");
	    e7.setGender("male");
	    e7.setSalary(65025.45f);
	    
	    QuestionEncap e8 = new QuestionEncap();
	    e8.setEmpid(1125);
		e8.setName("jeevan");
	    e8.setPhNumber(6213443210l);
	    e8.setAddress("madurai");
	    e8.setDob("8.5.1992");
	    e8.setDoj("20.05.2022");
	    e8.seteMail("jeevan3@gamil.com");
	    e8.setGender("male");
	    e8.setSalary(80025.45f);
	    
	    QuestionEncap e9 = new QuestionEncap();
	    e9.setEmpid(1129);
		e9.setName("Arvind");
	    e9.setPhNumber(9994543210l);
	    e9.setAddress("madurai");
	    e9.setDob("18.04.1994");
	    e9.setDoj("2.05.2021");
	    e9.seteMail("arvind67@gamil.com");
	    e9.setGender("male");
	    e9.setSalary(20025.45f);
	    
	    QuestionEncap e10 = new QuestionEncap();
	    e10.setEmpid(1130);
		e10.setName("dina");
	    e10.setPhNumber(9996543210l);
	    e10.setAddress("kovai");
	    e10.setDob("21.02.1996");
	    e10.setDoj("17.08.2020");
	    e10.seteMail("dina2@gamil.com");
	    e10.setGender("male");
	    e10.setSalary(40025.45f);	
	    
	    Set<QuestionEncap> s  = new LinkedHashSet<QuestionEncap>();
	   s.add(e);
	   s.add(e2);
	   s.add(e3);
	   s.add(e4);
	   s.add(e5);
	   s.add(e6);
	   s.add(e7);
	   s.add(e8);
	   s.add(e9);
	   s.add(e10);
	   
	   for (QuestionEncap itr : s) {
		System.out.println(itr.getEmpid());
		System.out.println(itr.getName());
		System.out.println(itr.getPhNumber());
		System.out.println(itr.getAddress());
		System.out.println(itr.getDob());
		System.out.println(itr.getDoj());
		System.out.println(itr.geteMail());
		System.out.println(itr.getGender());
		System.out.println(itr.geteMail());
		System.out.println(itr.getSalary());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
