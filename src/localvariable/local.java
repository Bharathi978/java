package localvariable;

public class local {
	
	
	
	
	// local variable
	private void add() {
 
		int a = 10;
		System.out.println("a in method "+a);
	}
	
	
	
	private void add1() {
		 
		int a = 100;
		System.out.println("a in method "+a);
	}
	
	
	public static void main(String[] args) {
		int a =1000;
		System.out.println("ab method in"+a);
		local l = new local();
		l.add();
		l.add1();
		
	}
	

}
