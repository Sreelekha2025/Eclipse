//program to print100 using recursion
package in.gc;

public class Print100usingrecursion {
	// Prints numbers from 1 to n
	static void printNos(int n) {
		if (n > 0)// check if n is greater than 0
		{
			printNos(n - 1);// recursively call function with n-1
			System.out.print(n + " ");// print the present value of n
		}
		return;// exits the function when n becomes 0
	}

	// Driver Code
	public static void main(String[] args) {
		printNos(100);// calls the print function with n=100 to print 1 to 100
	}

}
