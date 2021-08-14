package groupProject1;

public class Task4 {

	public static void main(String[] args) {

		// Write a program to swap 2 numbers without a temporary variable:

		int a = 10;
		int b = 20;

		System.out.println("-----before swapping-------");
		System.out.println("First number is " + a);
		System.out.println("Second number is " + b);

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("-------after swapping------");
		System.out.println("First number is " + a);
		System.out.println("Second number is " + b);

	}

}
