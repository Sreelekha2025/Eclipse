package com.sril;

public class Nestedif {

	public static void main(String[] args) {
		int age=26, weight=71;
		if(age>25)
		{
			System.out.println("eligible");
			if(weight>70)
			{
				System.out.println("weight condition eligible");
			}
			else
			{
				System.out.println("weight should be greater than 70");
				
			}
		}
			else {
			
				System.out.println("age should be greater than 25");
				
			}
			
		}

	}

