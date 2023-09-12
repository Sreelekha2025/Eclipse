//program for Even or odd without ifelse
package in.gc;

public class EvenorODD {

	public static void main(String[] args) {
		int n = 13;

		// using ternary operator to check if n is even or odd
		String number = (n % 2 == 0) ? "even" : "odd";
		System.out.println("it is" + number);

	}

}
