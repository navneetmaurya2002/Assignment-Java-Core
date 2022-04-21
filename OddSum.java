// write a program to display the sum of n number of odd natural number



import java.util.Scanner;


public class OddSum{
public static void main(String argss[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number to get sum of all odd number in range:");
int n=sc.nextInt();
// calling oddSum method wiht parameter n
oddSum(n);
}

// method to calculate sum
public static void oddSum(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2!=0)
		{	
			sum+=i;
		}
		
	}
	System.out.print("The Sum of the numbers is :"+sum 	);
}
}