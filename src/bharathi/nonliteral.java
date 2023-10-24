package bharathi;

public class nonliteral {
public static void main(String[] args) {
	

	 String s = new String("bharahi");
	  String s1 = new String("java");
	  String s2= new String("java");
	
	
	
	

		
		int i = System.identityHashCode(s);
		
		System.out.println("bharathi ;"+ i);
		
		
		int r = System.identityHashCode(s1);
		
		System.out.println("java ;"+r);
		
		
		
		int t = System.identityHashCode(s2);
		System.out.println("java ;"+t);
	}
	
	
	
	

	
	
	
	
	
	
	
	
}
