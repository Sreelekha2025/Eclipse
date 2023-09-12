package com.sril;

public class Control {

	public static void main(String[] args) {
		int units=150;
		float price=0.0f;
		if((units>50)&&(units<=1000))
		{
			price=units*1.02f;
			
		}
		else if((units>100)&&(units<200))
		{
			price=units*2.03f;
		}
		else if((units>200)&&(units<=400))
		{
			price=units*4.0f;
			}
		else {
			price=100;
		}
		System.out.println("price value is:"+price);
		

	}

}
