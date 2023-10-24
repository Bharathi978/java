package localvariable;

public class STATIC {


	int a=10;
	static int b =20;

	private void add() {
		System.out.println("instance variable"+a);
		a++;

		System.out.println("instance vaariable"+a);
		
		System.out.println("Static variable"+b);
		b++;
		
		System.out.println("static variable"+b);
		
		

	}
public static void main(String[] args) {
	STATIC S = new STATIC();
	S.add();
	
	STATIC S1 =new STATIC();
	S1.add();
	
	
}




}
