package bharathi;

public class mutable {
	
	 static StringBuilder s = new StringBuilder("java");
	 static StringBuilder s1 = new StringBuilder("maven");
	
	public static void main(String[] args) {
		
		
		StringBuilder d = s.append(s1);
		System.out.println(d);
		
		int t = System.identityHashCode(s);
		System.out.println("mem of java ;"+ t);
		
		
		int r = System.identityHashCode(s1);
		System.out.println("mem of maven ;"+ r);
		
		
		int f = System.identityHashCode(d);
		System.out.println("mem od java maven ; "+ f);
		
		
	}
	
	

}
