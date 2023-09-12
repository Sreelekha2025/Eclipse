//program for palindrome
package in.gc;

public class PalindromeorNot {
	
		public static void main(String[] args) {
			int n=878 ;//declare and assign
			int rev=0;//intialize a variale to store the reversed number
			int temp=n;//stores original n  in temp for comparision
			
			while(n>0)
			{
				rev=rev*10;//shifts the digits of "rev" one place left
				rev=rev+n%10;//adds the last digit of n to rev
				n /=10;//n=n/10...//removes the last digit of n
			}
			if (rev==temp)
			{
				System.out.println("Palindrome");//if rev is equals to the temp then it is palindrome
			}
			else
			{
				System.out.println("Not Palindrome");//if it is not equal then it is not palindrome
			}

		}

	

}
