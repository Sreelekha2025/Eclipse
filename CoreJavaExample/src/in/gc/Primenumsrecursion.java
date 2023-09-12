//program to print 1 to 100 prime nums using reursion
package in.gc;

public class Primenumsrecursion {
	public static void main(String[] args) {
		// Start printing prime numbers from 1 to 100
		printPrimes(1, 100);
	}

	// Recursive function to print prime numbers in the range [start, end]
	public static void printPrimes(int start, int end) {
		if (start <= end) {
			if (isPrime(start)) {
				System.out.print(start + " "); // Print prime number
			}
			printPrimes(start + 1, end); // Recursively check the next number
		}
	}

	// Function to check if a number is prime
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}
		if (number <= 3) {
			return true; // 2 and 3 are prime numbers
		}
		if (number % 2 == 0 || number % 3 == 0) {
			return false; // Numbers divisible by 2 or 3 are not prime
		}

		for (int i = 5; i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return false; // If divisible by i or i+2, not prime
			}
		}
        return true; // If not divisible by any smaller number, it's prime
    }
}


