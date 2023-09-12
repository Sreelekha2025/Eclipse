// program to print 1 to 100 prime numbers
package in.gc;

public class Printprimenums {
	public static void main(String[] args) {

		int i = 0;
		int num = 0;
		// Empty String to store primr nums
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0; // intialize counter variable to count
			for (num = i; num >= 1; num--) {
				if (i % num == 0)// if it is divisible by num,increments the counter
				{
					counter = counter + 1;
				}
			}
			if (counter == 2)// if the counter is rqual to 2 then i is prime
			{
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}
