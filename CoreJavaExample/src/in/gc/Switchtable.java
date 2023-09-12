package in.gc;

public class Switchtable {
	 public static void main(String[] args) {
	        int number = 1; // Change this number to display a different multiplication table

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
	                printMultiplicationTable(5); // Change this line to match the selected number
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
	                System.out.println("Invalid input. Enter a number between 1 and 10.");
	        }
	    }

	    // Function to print the multiplication table for a given number
	    public static void printMultiplicationTable(int number) {
	        System.out.println("Multiplication table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	    }

}
