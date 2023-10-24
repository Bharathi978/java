package Array;

public class sample {

	public static void main(String[] args) {


		//		int a[] = new int [5];
		//
		//
		//		a [0]=10;
		//
		//		a [1]=20;
		//
		//		a [2]=30;
		//
		//		a [3]=40;
		//
		//		a [4]=40;
		//
		//
		//
		//		// for loop
		//		for (int i = 0; i < a.length; i++) {
		//			System.out.println(a[i]);
		//		}
		//
		//
		//
		//		//enhanced for loop
		//		for (int i : a) {
		//			System.out.println(i);
		//		}


		//		String [] car = {"volvo","bmw","ford"};
		//		
		//		//edit
		//		car[0]= "aspire";
		//		System.out.println(car[0]);
		//		
		//		
		//		// for loop
		//		
		//		for (int i = 0; i < car.length; i++) {
		//			System.out.println(car[i]);
		//		}
		//		
		//		// length
		//		System.out.println(car.length);
		//
		//
		//		// enhanced loop
		//		for (String k : car) {
		//			System.out.println(k);
		//		}





		// multidimension	Array


		int [][] mynumber = {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println(mynumber[2][1]);          // output 8


		// change the element
		mynumber [2][2]= 10;
		System.out.println(mynumber[2][2]);



		// for loop onside onther loop
		for (int i = 0; i < mynumber.length; i++) {
			for (int j = 0; j < mynumber[i].length; j++) {
				System.out.println(mynumber[i][j]);

			}
		}








	}



















}







