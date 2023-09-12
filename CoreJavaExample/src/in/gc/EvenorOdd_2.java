//program to print the given num is even or odd
package in.gc;

public class EvenorOdd_2 {

	public static void main(String[] args) {
		int n = 12;// declaring a variable and assigning value

		// check whether the given num is even or odd
		if (n % 2 == 0) {// if n is divisible by 2 it gives even or else it gives odd
			System.out.println("it is even");
		} else {
			System.out.println("it is odd");
		}
	}
}
