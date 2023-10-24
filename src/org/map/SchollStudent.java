package org.map;

public class SchollStudent {
	public SchollStudent() {
		System.out.println("student details");
	}
public SchollStudent(String name) {
		this();
		System.out.println("student name is " + name);
	}
	
public SchollStudent(int id) {
	this("sandal");
	System.out.println("student id is " + id);
	
}
public static void main(String[] args) {
	SchollStudent s = new SchollStudent(2556);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//public SchollStudent() {
//	System.out.println("Student Details");
//}
//	public SchollStudent(String name){
//		this();
//		System.out.println("Student name is"+ name);
//	}
//	
//    public SchollStudent(int id){
//    	 this("Sandal");
//    	 System.out.println("Student id is " + id);
//    	 
//     }
//     
//  public SchollStudent(String Address){
//    	 this(65432)''
//    	 System.out.println("student address is " + Address);
//     }
//}

