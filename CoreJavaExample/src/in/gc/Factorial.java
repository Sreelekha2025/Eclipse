//program for factorial     
package in.gc;

public class Factorial {
	public static void main(String[] args) {
		int n =9;//declaring a variable and assigning value
		
		int fact = 1;// intializing "fact" for storage of factorial result
		for(int i=1;i<=n;i++ )
		{
			//multiplies fact by i in each iteration
			fact *= i;//fact = fact*i
			//loop runs continuosly and uodates 'fact' after fact*i
		
	}
		System.out.println(fact);//prints final factorial result    
	}
}
