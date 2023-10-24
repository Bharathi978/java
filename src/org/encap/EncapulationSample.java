package org.encap;

public class EncapulationSample {

	
	String name;
	public String getName() {
		return "my name is:"+name;
	}
	
	
	private void setname(String name ) {

		if (name.startsWith("i")) {
			this.name=  name;
		}}	
	
		public static void main(String[] args) {
			
			EncapulationSample l = new EncapulationSample();
			l.setname("kavi");
			System.out.println(l.getName());
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
