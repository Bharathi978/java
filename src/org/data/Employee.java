package org.data;



public class Employee {
	
	//data type over loading
		private void emp(String name) {
			System.out.println("emp Name "+name);
		}
		
		private void emp(String dep,int id) {
			
	    System.out.println("emp dep is :"+dep);
	    System.out.println("emp Id is :"+id);
		}
		
		
		
		//count type
		private void emp(String access,int no,String comp) {
		System.out.println("emp nick name:"+access);
	    System.out.println("emp number:"+no);
	    System.out.println("emp parent Name:"+comp);
		}
		
		
		
		
		//order type
		private void emp(int ac , String type,int no) {
		System.out.println("account number:"+ac);
	    System.out.println("account linked:"+type);
		System.out.println("ac has"+no);
		
		
		}
		
		
		
		
	public static void main(String[] args) {
		Employee m=new Employee();
		m.emp("bharathi");
		m.emp("mech", 5678);
		m.emp("sharathi", 978926894, "gobi");
		m.emp("saving");
		m.emp("hal",56789);
		
}
}