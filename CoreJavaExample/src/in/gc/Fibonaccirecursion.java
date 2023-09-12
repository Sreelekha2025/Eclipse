//fibonacci using recursion
package in.gc;

public class Fibonaccirecursion {
	// Recursive method to calculate Fibonacci number at position 'n'
	public static int fibonacciRecursion(int n) {
		if (n == 0) {
			return 0; // In Base case Fibonacci(0) is 0
		}
		if (n == 1 || n == 2) {
			return 1; // Base case: Fibonacci(1) and Fibonacci(2) are 1
		}
		// In Recursive case Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
		return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
	}

	public static void main(String args[]) {
		int maxNumber = 10; // Set the maximum number of Fibonacci numbers to generate
		System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
		for (int i = 0; i < maxNumber; i++) {
			System.out.print(fibonacciRecursion(i) + " "); // Print the Fibonacci number at position 'i'
		}
	}
}


