/*
write a program to  enter P,T,R and calculate simple interest for 3 times.  formulla of simple interest is: 
si=p*r*t/100
*/

import java.util.Scanner;



public class SimpleInterest
{
	public static void main(String args[])
	{
	for(int i=0;i<3;i++)
	{
	SimpleInterest();	
	}
	}
	// method to calculate SimpleInterest
	public static void SimpleInterest()
	{
		// Scanner object creation
			Scanner sc=new Scanner(System.in);
			// variables for Priciple, RateofInterest,Time Period, SimpleInterest respectively
		double P,R,T,SI;
		
		// input for Principal amount
		System.out.print("Enter the Priciple Amount : ");
		P=sc.nextDouble();
		
		// input for Rate of Interest
		System.out.print("Enter the Rate of Interest : ");
		R=sc.nextDouble();
		
		// input for Period of Time
		System.out.print("Enter the Period of Time :");
		T=sc.nextDouble();
		
		SI=(P*R*T)/100;
		System.out.println("The Simple Interest is: "+SI);
	}
}