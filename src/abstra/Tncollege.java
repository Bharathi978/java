package abstra;



public class Tncollege extends college {

	//Partial abstraction


	@Override
	public void community() {
		System.out.println("community acsess");

	}
	public static void main(String[] args) {
		Tncollege o = new Tncollege();
		o.adhar();
		o.passport();
		o.community();
	}



}
