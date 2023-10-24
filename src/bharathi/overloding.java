package bharathi;

public class overloding {

	static int max(int a, int b) {
		return a>b?a:b;
		
	}
	
	static double max(double a,double b) {
		return a>b?a:b;
		
	}
	static char max(char a, char b) {
		return a>b?a:b;
		
	}
	
	static  void test() {
		System.out.println("im bharathi");
				
	}
	
	static void test(int a,int b) {
		System.out.println("im sharathi");
	}
	
	public static void main(String[] args) {
		System.out.println(max(3, 7));
		System.out.println(max(7.4, 5.8));
		System.out.println(max('d', 'g'));
		test();
		test('7', '9');
	}
}
