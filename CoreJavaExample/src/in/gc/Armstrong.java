//program for armstrong
package in.gc;

public class Armstrong {
	public static void main(String[] args) {
		int n = 270;// declare a variable and assign value
		int r, sum = 0;// intiliaze variable 'r' for digit and sum for for the sum of cubed digits
		int temp = n;// store the given number in temp for comparison
		while (n > 0) {
			r = n % 10; // get the last digit of "n"
			n = n / 10; // remove the last digit from n
			sum = sum + r * r * r; // calculates the sum of cubes of digits
		}

		if (temp == sum) {

			System.out.println("Armstrong number");// if sum is equa to temp, it is armstrong
		} else {
			System.out.println("Not Armstrong Number");// if it is not equal it is not arm strong
		}
	}

}
