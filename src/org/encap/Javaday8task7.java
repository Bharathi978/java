package org.encap;

import java.util.LinkedHashSet;
import java.util.Set;

public class Javaday8task7 {
	public static void main(String[] args) {
		
		Questionenscap2 r = new Questionenscap2();
		r.setStudentid(4647);
		r.setAddress("chennai");
		r.setDob("14.4.2020");
		r.seteMail("bharathisharathi@gmail.com");
		r.setGender("male");
		r.setName("Bharathi");
		r.setPhNumber(3456789009876l);
		
		
		Questionenscap2 r1 = new Questionenscap2();
		r1.setStudentid(5075);
		r1.setAddress("madurai");
		r1.setDob("11.7.2020");
		r1.seteMail("sharathi@gmail.com");
		r1.setGender("male");
		r1.setName("sharathi");
		r1.setPhNumber(3456789009876l);
		
		

		Questionenscap2 r2 = new Questionenscap2();
		r2.setStudentid(5045);
		r2.setAddress("kovai");
		r2.setDob("11.7.2021");
		r2.seteMail("masthii@gmail.com");
		r2.setGender("male");
		r2.setName("balu");
		r2.setPhNumber(3456789076l);
		
		
		Questionenscap2 r3 = new Questionenscap2();
		r3.setStudentid(5325);
		r3.setAddress("rameshvaram");
		r3.setDob("11.7.2022");
		r3.seteMail("kumar@gmail.com");
		r3.setGender("male");
		r3.setName("kumar");
		r3.setPhNumber(34567893456776l);
		
		Questionenscap2 r4 = new Questionenscap2();
		r4.setStudentid(9735);
		r4.setAddress("nagercoil");
		r4.setDob("2.2.2022");
		r4.seteMail("madhu@gmail.com");
		r4.setGender("male");
		r4.setName("madhan");
		r4.setPhNumber(3456789463876l);
		
		Questionenscap2 r5 = new Questionenscap2();
		r5.setStudentid(97565);
		r5.setAddress("kanyakumari");
		r5.setDob("2.5.2022");
		r5.seteMail("sndhosh@gmail.com");
		r5.setGender("male");
		r5.setName("sandhosh");
		r5.setPhNumber(45556789463876l);
		
		

		Questionenscap2 r6 = new Questionenscap2();
		r6.setStudentid(97565);
		r6.setAddress("mumbai");
		r6.setDob("2.5.2023");
		r6.seteMail("dhanam23@gmail.com");
		r6.setGender("Female");
		r6.setName("dhanam");
		r6.setPhNumber(45565789463876l);
		

		Questionenscap2 r7 = new Questionenscap2();
		r7.setStudentid(97565);
		r7.setAddress("hyderbad");
		r7.setDob("12.5.2022");
		r7.seteMail("kavin@gmail.com");
		r7.setGender("male");
		r7.setName("kavin");
		r7.setPhNumber(456789463876l);
		

		Questionenscap2 r8 = new Questionenscap2();
		r8.setStudentid(97565);
		r8.setAddress("thuticorin");
		r8.setDob("2.5.2020");
		r8.seteMail("subbu@gmail.com");
		r8.setGender("male");
		r8.setName("subbu");
		r8.setPhNumber(45556789463876l);
		

		Questionenscap2 r9= new Questionenscap2();
		r9.setStudentid(67565);
		r9.setAddress("sivakasi");
		r9.setDob("2.6.2022");
		r9.seteMail("muthu@gmail.com");
		r9.setGender("male");
		r9.setName("Muthu");
		r9.setPhNumber(45556789463876l);
		
		Set<Questionenscap2> s = new LinkedHashSet<Questionenscap2>();
		s.add(r);
		s.add(r1);
		s.add(r2);
		s.add(r3);
		s.add(r4);
		s.add(r5);
		s.add(r6);
		s.add(r7);
		s.add(r8);
		s.add(r9);
		
		for (Questionenscap2 ios : s) {
			System.out.println(ios.getName());
			System.out.println(ios.getGender());
			System.out.println(ios.getAddress());
			System.out.println(ios.geteMail());
			System.out.println(ios.getPhNumber());
			System.out.println(ios.getStudentid());
			
			
			
			
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
