//fibonacci program without recursion
package in.gc;

public class Fibonacciprog {
	public static void main(String[] args) {

		int n = 10;// no.of fibnocci nums to generate
		int f = 1, S = 1, t;// initialize the first two fibonacci nums
		// to print first and second fibonacci numbers as 1
		System.out.println(f);
		System.out.println(S);

		for (int i = 3; i < n; i++) {
			t = f + S;// calculates the fibonnacci num
			System.out.println(t);// prints the fibonacci num
			// updates f and s for the next iteration
			f = S;
			S = t;
		}
	}

}

