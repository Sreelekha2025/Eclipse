//program to verify given number is even or odd using scanner class(user defined method)
package in.gc;

import java.util.Scanner;

public class EvenorOdd_Scannerclass_1 {

	public static void main(String[] args) {
         // for taking a input from user create an object of scanner class
		Scanner a = new Scanner(System.in);
		System.out.println("enter a number ");
		int b = a.nextInt();

		// checking whether the given num is even or odd
		if (b % 2 == 0)// if the given num is divisible by 2 then it is an even num or if it is odd num
		{
			System.out.println("even " + b);// gets even num if the given num is even
		} else {
			System.out.println("odd " + b);// gets odd num if the given num is odd
		}

	}
}
