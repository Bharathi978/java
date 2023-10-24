package abstra;



public class ktm implements Bike{

	@Override
	public void cost() {
		System.out.println(" cost is : 274747 Rs");

	}

	@Override
	public void speed() {
		System.out.println("speed is :75kmph");

	}


	public static void main(String[] args) {
		ktm k =new ktm();
		k.cost();
		k.speed();


	}

}
