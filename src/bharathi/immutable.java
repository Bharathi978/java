package bharathi;

public class immutable {
public static void main(String[] args) {
	

	   String s = "java";
	   String s1 =" maven";

	
	
	String r = s.concat(s1);
	System.out.println(r);
	
	
	int m = System.identityHashCode(s);
	System.out.println("mem of java ;"+ m);
	
	
	int t = System.identityHashCode(s1);
	System.out.println("mem of maven ;"+ t);
	
	
	int y = System.identityHashCode(r);
	System.out.println("mem of java maven ;"+ y);
	
	
	
	
	// StringIndexOutOfBoundsException
	System.out.println(System.identityHashCode(s));
	System.out.println(s.charAt(8));
	
	 }
}