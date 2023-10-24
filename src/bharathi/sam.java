package bharathi;

public class sam{

	
	
	public enum color{
		RED,GREEN,BLUE
	}
	public static void main(String[] args) {
		color colr = color.BLUE;
		
		
		switch (colr) {
		case BLUE:
			System.out.println("1");
			break;
		case RED:
			System.out.println("2");
			break;
		default:
			System.out.println("0");
			break;
		}
	}
}
