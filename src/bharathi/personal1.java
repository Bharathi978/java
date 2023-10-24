package bharathi;

public class personal1 {
	// instance variable
	
	public int a = 100;
	
	 private void local() {
     System.out.println(a);
	}
	
	
   private void local1() {
	System.out.println(a);
   a++;
   System.out.println(a);
}
	public static void main(String[] args) {
		
		
		personal1 m = new personal1();
		//System.out.println(m.a);
		
		m.local();
		m.local1();
		
	}

}
