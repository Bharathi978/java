package bharathi;

public class printLowerTriangularMatrix {

	public static void main(String[] args) {
		
		
		
		
		 int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	     printLowerTriangularMatrix(matrix);
	 }

	 public static void printLowerTriangularMatrix(int[][] matrix) {
	     int n = matrix.length;
	     for (int i = 0; i < n; i++) {
	         for (int j = 0; j <= i; j++) {
	             System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println();
	     }
	 }

	 
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

