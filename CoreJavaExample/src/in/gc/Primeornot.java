//program to print the guven number is prime or not
package in.gc;

public class Primeornot {
	public static void main(String[] args) {
		
			int n=10;//declare and assigning value
			boolean prime =true;//intialize a boolean variable to assume n is prime
			for (int i=2;i<n;i++ )
			{
				if(n%i==0)
				{
				prime = false; //if n is divisible by i prime is false and exits the loop
				break;
				}
			}
			
			System.out.println(prime);
		}

	
	}
	 


