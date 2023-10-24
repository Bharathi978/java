package org.string;

public class NewUser {
	
	public static void main(String[] args) {
		
		String s= "Hello World";
		String s1 ="hello world";
		         // 012345678910
		//length of  string
		int length = s.length();
		System.out.println(length);                                         // 11
		
		//to upper case
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);                                     // HELLOWORD
		
		//to lower case
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);                                     // helloworld
		
		//equals
		boolean equals = s.equals(s1);
		System.out.println(equals);                                         //true
		
		//equal ignore
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);                               // false
		
		//index of
		int indexOf = s.indexOf('l');
		System.out.println(indexOf);                 						//2
		
		
	    //last index of
		int lastIndexOf = s.lastIndexOf('l');
		System.out.println(lastIndexOf );									//9
		
		//char At
		char charAt = s.charAt(0);
		System.out.println(charAt ); 										//H
		
		//contains
		boolean contains = s.contains("Hel");
		System.out.println(contains);										//TRUE
		
		//replace
		String replace = s.replace("Hello","Hai" );
		System.out.println(replace);                                        //HaiWorld
		
		//replace all
		String replaceAll = s.replaceAll("l", ".");
		System.out.println(replaceAll );                                    //He..oWor.d
		
		//starts with
		boolean startsWith = s.startsWith("He");
		System.out.println(startsWith );									//true						
		
		//end with
		boolean endsWith = s.endsWith("id");
		System.out.println(endsWith );										//false
		
		//is empty
		boolean empty = s.isEmpty();
		System.out.println( empty );                                       //false
		
		//trim
		String trim = s.trim();
		System.out.println(trim );										 //HelloWorld
		
		//substring
		String substring = s.substring(4);
		System.out.println(substring ); 								//o World
		
		//substring 2
		String substring2 = s.substring(3,8);
		System.out.println(substring2);                                  // lo wo
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
