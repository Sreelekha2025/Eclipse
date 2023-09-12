//program for factorial using recurion
package in.gc;

public class Factorialrecursion {
	// Recursive method to calculate the factorial of 'n'
	static int factorial(int n) {
		if (n == 1) {
			return 1; // In Base case If 'n' is 1, return 1 (factorial of 1)
		}
		// In Recursive case Multiply 'n' by the factorial of 'n-1'
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = 5; // Set 'n' to 5, the number for which to calculate the factorial

		// Call the 'factorial' method and print the result
		System.out.println("Factorial of " + n + " is: " + factorial(n));
	}

}
