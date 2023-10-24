package abstra;
  

// this keyword function


class customer{
	int cus_id;
	String cus_name;
	String cus_location;
	
	
	public customer(int cus_id,String cus_name,String cus_location) {
		this.cus_id=cus_id;
		this.cus_name= cus_name;
		this.cus_location=cus_location;
	}
	
	
	
	
	void display() {
		String cus_name ="Raj";
		System.out.println("customerID: "+cus_id);
		System.out.println("customerName: "+cus_name);
		System.out.println("customerLocation: "+cus_location);

		
	}
	 
}
	 
	
	
	
	
	
	public class CRMApp{
	
	
	public static void main(String[] args) {
		customer c = new customer(10000, "bharathi", "chennai");
		c.display();
	}
	


}