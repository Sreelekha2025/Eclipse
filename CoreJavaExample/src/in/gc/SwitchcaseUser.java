package in.gc;
import java.util.Scanner;
public class SwitchcaseUser {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        //define the number for  which we want  to display the multiplication table
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                printMultiplicationTable(1);
                break;
            case 2:
                printMultiplicationTable(2);
                break;
            case 3:
                printMultiplicationTable(3);
                break;
            case 4:
                printMultiplicationTable(4);
                break;
            case 5:
                printMultiplicationTable(5);
                break;
            case 6:
                printMultiplicationTable(6);
                break;
            case 7:
                printMultiplicationTable(7);
                break;
            case 8:
                printMultiplicationTable(8);
                break;
            case 9:
                printMultiplicationTable(9);
                break;
            case 10:
                printMultiplicationTable(10);
                break;
            default:
            	//
                System.out.println("Invalid input. Enter a number between 1 and 10.");
        }

        scanner.close();
    }

    // Function to print the multiplication table for a given number
    public static void printMultiplicationTable(int number) {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}


