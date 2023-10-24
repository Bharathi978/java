package localvariable;

public class instance {

	// INSTANCE VARIABLE
	public int a;

	private void add() {
		a=100;
		System.out.println(a);
	}

	public static void main(String[] args) {
		instance i = new instance();
		System.out.println("before intilize"+i.a);

		i.add();
		//       
		System.out.println("After intilize "+i.a);
		//       
		instance i1 = new instance();
		System.out.println(i1.a);
		//       
	}




}
