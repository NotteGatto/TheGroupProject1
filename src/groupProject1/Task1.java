package groupProject1;

public class Task1 {

	public static void main(String[] args) {
		
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int sArry[][] = { { 1, 2 },
				          { 3, 4 }, };
		
		int sum = 0;
		for (int i = 0; i < sArry.length; i++) {
			for(int j=0; j<sArry[0].length; j++) 
				
			sum += sArry[i][j];
		}
		System.out.println("The sum of all numbers is : " + sum+".");
		
	}
}
